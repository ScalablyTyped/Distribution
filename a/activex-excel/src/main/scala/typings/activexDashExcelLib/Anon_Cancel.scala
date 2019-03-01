package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: scala.Boolean
  val Pvw: activexDashExcelLib.ExcelNs.ProtectedViewWindow
  val Reason: activexDashExcelLib.ExcelNs.XlProtectedViewCloseReason
}

object Anon_Cancel {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Pvw: activexDashExcelLib.ExcelNs.ProtectedViewWindow,
    Reason: activexDashExcelLib.ExcelNs.XlProtectedViewCloseReason
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Pvw")(Pvw)
    __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

