package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCalculation extends js.Object

@JSGlobal("Excel.XlCalculation")
@js.native
object XlCalculation extends js.Object {
  @js.native
  sealed trait xlCalculationAutomatic
    extends activexDashExcelLib.ExcelNs.XlCalculation
  
  @js.native
  sealed trait xlCalculationManual
    extends activexDashExcelLib.ExcelNs.XlCalculation
  
  @js.native
  sealed trait xlCalculationSemiautomatic
    extends activexDashExcelLib.ExcelNs.XlCalculation
  
  /* -4105 */ val xlCalculationAutomatic: xlCalculationAutomatic with scala.Double = js.native
  /* -4135 */ val xlCalculationManual: xlCalculationManual with scala.Double = js.native
  /* 2 */ val xlCalculationSemiautomatic: xlCalculationSemiautomatic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCalculation with scala.Double] = js.native
}

