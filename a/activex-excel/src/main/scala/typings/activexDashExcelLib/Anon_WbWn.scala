package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WbWn extends js.Object {
  val Wb: activexDashExcelLib.ExcelNs.Workbook
  val Wn: activexDashExcelLib.ExcelNs.Window
}

object Anon_WbWn {
  @scala.inline
  def apply(Wb: activexDashExcelLib.ExcelNs.Workbook, Wn: activexDashExcelLib.ExcelNs.Window): Anon_WbWn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Wb")(Wb)
    __obj.updateDynamic("Wn")(Wn)
    __obj.asInstanceOf[Anon_WbWn]
  }
}

