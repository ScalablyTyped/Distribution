package typings.activexExcel.anon

import typings.activexExcel.Excel.ProtectedViewWindow
import typings.activexExcel.Excel.XlProtectedViewCloseReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel extends js.Object {
  var Cancel: Boolean = js.native
  val Pvw: ProtectedViewWindow = js.native
  val Reason: XlProtectedViewCloseReason = js.native
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow, Reason: XlProtectedViewCloseReason): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
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
    def setPvw(value: ProtectedViewWindow): Self = this.set("Pvw", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: XlProtectedViewCloseReason): Self = this.set("Reason", value.asInstanceOf[js.Any])
  }
  
}

