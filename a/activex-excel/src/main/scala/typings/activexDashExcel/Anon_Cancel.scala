package typings.activexDashExcel

import typings.activexDashExcel.Excel.ProtectedViewWindow
import typings.activexDashExcel.Excel.XlProtectedViewCloseReason
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
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

