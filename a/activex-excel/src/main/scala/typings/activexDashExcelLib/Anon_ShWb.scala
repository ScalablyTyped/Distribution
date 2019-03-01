package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShWb extends js.Object {
  val Sh: activexDashExcelLib.ExcelNs.Worksheet
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_ShWb {
  @scala.inline
  def apply(Sh: activexDashExcelLib.ExcelNs.Worksheet, Wb: activexDashExcelLib.ExcelNs.Workbook): Anon_ShWb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Sh")(Sh)
    __obj.updateDynamic("Wb")(Wb)
    __obj.asInstanceOf[Anon_ShWb]
  }
}

