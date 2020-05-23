package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var avatar: Boolean
  var paragraph: Boolean
  var title: Boolean
}

object Avatar {
  @scala.inline
  def apply(avatar: Boolean, paragraph: Boolean, title: Boolean): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
}

