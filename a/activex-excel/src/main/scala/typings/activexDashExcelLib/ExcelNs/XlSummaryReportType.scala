package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSummaryReportType extends js.Object

@JSGlobal("Excel.XlSummaryReportType")
@js.native
object XlSummaryReportType extends js.Object {
  @js.native
  sealed trait xlStandardSummary
    extends activexDashExcelLib.ExcelNs.XlSummaryReportType
  
  @js.native
  sealed trait xlSummaryPivotTable
    extends activexDashExcelLib.ExcelNs.XlSummaryReportType
  
  /* 1 */ val xlStandardSummary: xlStandardSummary with scala.Double = js.native
  /* -4148 */ val xlSummaryPivotTable: xlSummaryPivotTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSummaryReportType with scala.Double] = js.native
}

