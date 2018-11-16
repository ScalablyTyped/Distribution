package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCalculationState extends js.Object

@JSGlobal("Excel.XlCalculationState")
@js.native
object XlCalculationState extends js.Object {
  @js.native
  sealed trait xlCalculating
    extends activexDashExcelLib.ExcelNs.XlCalculationState
  
  @js.native
  sealed trait xlDone
    extends activexDashExcelLib.ExcelNs.XlCalculationState
  
  @js.native
  sealed trait xlPending
    extends activexDashExcelLib.ExcelNs.XlCalculationState
  
  /* 1 */ val xlCalculating: xlCalculating with scala.Double = js.native
  /* 0 */ val xlDone: xlDone with scala.Double = js.native
  /* 2 */ val xlPending: xlPending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCalculationState with scala.Double] = js.native
}

