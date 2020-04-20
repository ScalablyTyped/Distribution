package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatar extends js.Object {
  var avatar: Boolean
  var paragraph: Boolean
  var title: Boolean
}

object AnonAvatar {
  @scala.inline
  def apply(avatar: Boolean, paragraph: Boolean, title: Boolean): AnonAvatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvatar]
  }
}

