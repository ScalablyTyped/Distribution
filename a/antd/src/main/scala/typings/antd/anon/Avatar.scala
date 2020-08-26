package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  var avatar: Boolean = js.native
  var paragraph: Boolean = js.native
  var title: Boolean = js.native
}

object Avatar {
  @scala.inline
  def apply(avatar: Boolean, paragraph: Boolean, title: Boolean): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  @scala.inline
  implicit class AvatarOps[Self <: Avatar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvatar(value: Boolean): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraph(value: Boolean): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

