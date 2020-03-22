package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNickName extends js.Object {
  	// 用户昵称
  var avatar: String
  var nickName: String
}

object AnonNickName {
  @scala.inline
  def apply(avatar: String, nickName: String): AnonNickName = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNickName]
  }
}

