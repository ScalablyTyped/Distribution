package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSaveAsUI extends js.Object {
  var Cancel: Boolean = js.native
  val SaveAsUI: Boolean = js.native
}

object CancelSaveAsUI {
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean): CancelSaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSaveAsUI]
  }
  @scala.inline
  implicit class CancelSaveAsUIOps[Self <: CancelSaveAsUI] (val x: Self) extends AnyVal {
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
    def setSaveAsUI(value: Boolean): Self = this.set("SaveAsUI", value.asInstanceOf[js.Any])
  }
  
}

