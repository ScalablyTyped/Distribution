package typings.activexExcel.anon

import typings.activexExcel.Excel.ProtectedViewWindow
import typings.activexExcel.Excel.XlProtectedViewCloseReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var Cancel: Boolean
  val Pvw: ProtectedViewWindow
  val Reason: XlProtectedViewCloseReason
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow, Reason: XlProtectedViewCloseReason): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

