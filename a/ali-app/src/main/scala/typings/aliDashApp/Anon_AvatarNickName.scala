package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvatarNickName extends js.Object {
  	// 用户昵称
  var avatar: String
  var nickName: String
}

object Anon_AvatarNickName {
  @scala.inline
  def apply(avatar: String, nickName: String): Anon_AvatarNickName = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AvatarNickName]
  }
}

