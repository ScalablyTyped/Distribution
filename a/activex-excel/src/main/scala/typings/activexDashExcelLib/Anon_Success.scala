package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Success extends js.Object {
  val Success: scala.Boolean
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_Success {
  @scala.inline
  def apply(Success: scala.Boolean, Wb: activexDashExcelLib.ExcelNs.Workbook): Anon_Success = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Success")(Success)
    __obj.updateDynamic("Wb")(Wb)
    __obj.asInstanceOf[Anon_Success]
  }
}

