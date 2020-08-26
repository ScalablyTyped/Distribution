package typings.activexExcel.anon

import typings.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelPvw extends js.Object {
  var Cancel: Boolean = js.native
  val Pvw: ProtectedViewWindow = js.native
}

object CancelPvw {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow): CancelPvw = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvw]
  }
  @scala.inline
  implicit class CancelPvwOps[Self <: CancelPvw] (val x: Self) extends AnyVal {
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
  }
  
}

