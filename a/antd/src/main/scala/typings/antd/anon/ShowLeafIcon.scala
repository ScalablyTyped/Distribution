package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowLeafIcon extends js.Object {
  var showLeafIcon: Boolean = js.native
}

object ShowLeafIcon {
  @scala.inline
  def apply(showLeafIcon: Boolean): ShowLeafIcon = {
    val __obj = js.Dynamic.literal(showLeafIcon = showLeafIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowLeafIcon]
  }
  @scala.inline
  implicit class ShowLeafIconOps[Self <: ShowLeafIcon] (val x: Self) extends AnyVal {
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
    def setShowLeafIcon(value: Boolean): Self = this.set("showLeafIcon", value.asInstanceOf[js.Any])
  }
  
}

