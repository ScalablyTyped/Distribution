package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPropertyDisplayedIn extends js.Object

@JSGlobal("Excel.XlPropertyDisplayedIn")
@js.native
object XlPropertyDisplayedIn extends js.Object {
  @js.native
  sealed trait xlDisplayPropertyInPivotTable
    extends activexDashExcelLib.ExcelNs.XlPropertyDisplayedIn
  
  @js.native
  sealed trait xlDisplayPropertyInPivotTableAndTooltip
    extends activexDashExcelLib.ExcelNs.XlPropertyDisplayedIn
  
  @js.native
  sealed trait xlDisplayPropertyInTooltip
    extends activexDashExcelLib.ExcelNs.XlPropertyDisplayedIn
  
  /* 1 */ val xlDisplayPropertyInPivotTable: xlDisplayPropertyInPivotTable with scala.Double = js.native
  /* 3 */ val xlDisplayPropertyInPivotTableAndTooltip: xlDisplayPropertyInPivotTableAndTooltip with scala.Double = js.native
  /* 2 */ val xlDisplayPropertyInTooltip: xlDisplayPropertyInTooltip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPropertyDisplayedIn with scala.Double] = js.native
}

