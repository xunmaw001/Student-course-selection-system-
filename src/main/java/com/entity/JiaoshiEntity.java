package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 用户表
 *
 * @author 
 * @email
 * @date 2021-04-02
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {

	}

	public JiaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 名称
     */
    @TableField(value = "jsname")

    private String jsname;


    /**
     * 账号
     */
    @TableField(value = "jsusername")

    private String jsusername;


    /**
     * 密码
     */
    @TableField(value = "jspassword")

    private String jspassword;


    /**
     * 头像
     */
    @TableField(value = "jsimg_photo")

    private String jsimgPhoto;


    /**
     * 性别
     */
    @TableField(value = "jssex_types")

    private Integer jssexTypes;


    /**
     * 手机号
     */
    @TableField(value = "jsphone")

    private String jsphone;


    /**
     * 身份证
     */
    @TableField(value = "jsid_number")

    private String jsidNumber;


    /**
     * 身份
     */
    @TableField(value = "jsrole")

    private String jsrole;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：名称
	 */
    public String getJsname() {
        return jsname;
    }


    /**
	 * 获取：名称
	 */

    public void setJsname(String jsname) {
        this.jsname = jsname;
    }
    /**
	 * 设置：账号
	 */
    public String getJsusername() {
        return jsusername;
    }


    /**
	 * 获取：账号
	 */

    public void setJsusername(String jsusername) {
        this.jsusername = jsusername;
    }
    /**
	 * 设置：密码
	 */
    public String getJspassword() {
        return jspassword;
    }


    /**
	 * 获取：密码
	 */

    public void setJspassword(String jspassword) {
        this.jspassword = jspassword;
    }
    /**
	 * 设置：头像
	 */
    public String getJsimgPhoto() {
        return jsimgPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setJsimgPhoto(String jsimgPhoto) {
        this.jsimgPhoto = jsimgPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getJssexTypes() {
        return jssexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setJssexTypes(Integer jssexTypes) {
        this.jssexTypes = jssexTypes;
    }
    /**
	 * 设置：手机号
	 */
    public String getJsphone() {
        return jsphone;
    }


    /**
	 * 获取：手机号
	 */

    public void setJsphone(String jsphone) {
        this.jsphone = jsphone;
    }
    /**
	 * 设置：身份证
	 */
    public String getJsidNumber() {
        return jsidNumber;
    }


    /**
	 * 获取：身份证
	 */

    public void setJsidNumber(String jsidNumber) {
        this.jsidNumber = jsidNumber;
    }
    /**
	 * 设置：身份
	 */
    public String getJsrole() {
        return jsrole;
    }


    /**
	 * 获取：身份
	 */

    public void setJsrole(String jsrole) {
        this.jsrole = jsrole;
    }

    @Override
    public String toString() {
        return "Jiaoshi{" +
            "id=" + id +
            ", jsname=" + jsname +
            ", jsusername=" + jsusername +
            ", jspassword=" + jspassword +
            ", jsimgPhoto=" + jsimgPhoto +
            ", jssexTypes=" + jssexTypes +
            ", jsphone=" + jsphone +
            ", jsidNumber=" + jsidNumber +
            ", jsrole=" + jsrole +
        "}";
    }
}
