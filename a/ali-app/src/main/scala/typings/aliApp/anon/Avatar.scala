package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avatar extends StObject {
  
  // 账号的邮箱
  var avatar: String = js.native
  
  // 账号对应的手机号码
  var email: String = js.native
  
  // 账号的真实姓名
  var mobile: String = js.native
  
  var realName: String = js.native
  
  // 账号的头像链接
  var userId: String = js.native
}
object Avatar {
  
  @scala.inline
  def apply(avatar: String, email: String, mobile: String, realName: String, userId: String): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], realName = realName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  @scala.inline
  implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealName(value: String): Self = StObject.set(x, "realName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
