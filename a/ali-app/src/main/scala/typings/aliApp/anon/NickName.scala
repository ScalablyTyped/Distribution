package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NickName extends js.Object {
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
}

