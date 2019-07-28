package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.ProtectedViewWindow
import typings.activexDashExcel.ExcelNs.XlProtectedViewCloseReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: Boolean
  val Pvw: ProtectedViewWindow
  val Reason: XlProtectedViewCloseReason
}

object Anon_Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow, Reason: XlProtectedViewCloseReason): Anon_Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Pvw = Pvw, Reason = Reason)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

