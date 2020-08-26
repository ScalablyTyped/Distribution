package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewView extends js.Object {
  var Cancel: Boolean = js.native
  val NewView: js.Any = js.native
}

object NewView {
  @scala.inline
  def apply(Cancel: Boolean, NewView: js.Any): NewView = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewView = NewView.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewView]
  }
  @scala.inline
  implicit class NewViewOps[Self <: NewView] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewView(value: js.Any): Self = this.set("NewView", value.asInstanceOf[js.Any])
  }
  
}

