package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlImportDataAs extends js.Object

@JSGlobal("Excel.XlImportDataAs")
@js.native
object XlImportDataAs extends js.Object {
  @js.native
  sealed trait xlPivotTableReport
    extends activexDashExcelLib.ExcelNs.XlImportDataAs
  
  @js.native
  sealed trait xlQueryTable
    extends activexDashExcelLib.ExcelNs.XlImportDataAs
  
  @js.native
  sealed trait xlTable
    extends activexDashExcelLib.ExcelNs.XlImportDataAs
  
  /* 1 */ val xlPivotTableReport: xlPivotTableReport with scala.Double = js.native
  /* 0 */ val xlQueryTable: xlQueryTable with scala.Double = js.native
  /* 2 */ val xlTable: xlTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlImportDataAs with scala.Double] = js.native
}

