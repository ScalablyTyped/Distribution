package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NickName extends StObject {
  
  // 用户昵称
  var avatar: String
  
  var nickName: String
}
object NickName {
  
  @scala.inline
  def apply(avatar: String, nickName: String): NickName = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NickName]
  }
  
  @scala.inline
  implicit class NickNameMutableBuilder[Self <: NickName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
  }
}
