package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ch extends js.Object {
  val Ch: activexDashExcelLib.ExcelNs.Chart
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_Ch {
  @scala.inline
  def apply(Ch: activexDashExcelLib.ExcelNs.Chart, Wb: activexDashExcelLib.ExcelNs.Workbook): Anon_Ch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Ch")(Ch)
    __obj.updateDynamic("Wb")(Wb)
    __obj.asInstanceOf[Anon_Ch]
  }
}

