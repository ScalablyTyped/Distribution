package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelPvw extends js.Object {
  var Cancel: scala.Boolean
  val Pvw: activexDashExcelLib.ExcelNs.ProtectedViewWindow
}

object Anon_CancelPvw {
  @scala.inline
  def apply(Cancel: scala.Boolean, Pvw: activexDashExcelLib.ExcelNs.ProtectedViewWindow): Anon_CancelPvw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Pvw")(Pvw)
    __obj.asInstanceOf[Anon_CancelPvw]
  }
}

