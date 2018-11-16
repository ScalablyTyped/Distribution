package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFileValidationPivotMode extends js.Object

@JSGlobal("Excel.XlFileValidationPivotMode")
@js.native
object XlFileValidationPivotMode extends js.Object {
  @js.native
  sealed trait xlFileValidationPivotDefault
    extends activexDashExcelLib.ExcelNs.XlFileValidationPivotMode
  
  @js.native
  sealed trait xlFileValidationPivotRun
    extends activexDashExcelLib.ExcelNs.XlFileValidationPivotMode
  
  @js.native
  sealed trait xlFileValidationPivotSkip
    extends activexDashExcelLib.ExcelNs.XlFileValidationPivotMode
  
  /* 0 */ val xlFileValidationPivotDefault: xlFileValidationPivotDefault with scala.Double = js.native
  /* 1 */ val xlFileValidationPivotRun: xlFileValidationPivotRun with scala.Double = js.native
  /* 2 */ val xlFileValidationPivotSkip: xlFileValidationPivotSkip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFileValidationPivotMode with scala.Double] = js.native
}

