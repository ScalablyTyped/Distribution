package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactsDic extends StObject {
  
  /**
    * 账号的头像链接
    */
  var avatar: String
  
  /**
    * 账号的显示名称：也即支付宝设置的备注名称，默认为朋友圈里面的昵称
    */
  var displayName: String
  
  /**
    * 账号对应的手机号码
    */
  var mobile: String
  
  /**
    * 账号的真实姓名
    */
  var realName: String
  
  /**
    * 支付宝账号唯一 userId
    */
  var userId: String
}
object ContactsDic {
  
  inline def apply(avatar: String, displayName: String, mobile: String, realName: String, userId: String): ContactsDic = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], realName = realName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsDic]
  }
  
  extension [Self <: ContactsDic](x: Self) {
    
    inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setRealName(value: String): Self = StObject.set(x, "realName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
