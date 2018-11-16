package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCalculationInterruptKey extends js.Object

@JSGlobal("Excel.XlCalculationInterruptKey")
@js.native
object XlCalculationInterruptKey extends js.Object {
  @js.native
  sealed trait xlAnyKey
    extends activexDashExcelLib.ExcelNs.XlCalculationInterruptKey
  
  @js.native
  sealed trait xlEscKey
    extends activexDashExcelLib.ExcelNs.XlCalculationInterruptKey
  
  @js.native
  sealed trait xlNoKey
    extends activexDashExcelLib.ExcelNs.XlCalculationInterruptKey
  
  /* 2 */ val xlAnyKey: xlAnyKey with scala.Double = js.native
  /* 1 */ val xlEscKey: xlEscKey with scala.Double = js.native
  /* 0 */ val xlNoKey: xlNoKey with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCalculationInterruptKey with scala.Double] = js.native
}

