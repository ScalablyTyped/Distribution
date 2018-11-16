package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPageBreak extends js.Object

@JSGlobal("Excel.XlPageBreak")
@js.native
object XlPageBreak extends js.Object {
  @js.native
  sealed trait xlPageBreakAutomatic
    extends activexDashExcelLib.ExcelNs.XlPageBreak
  
  @js.native
  sealed trait xlPageBreakManual
    extends activexDashExcelLib.ExcelNs.XlPageBreak
  
  @js.native
  sealed trait xlPageBreakNone
    extends activexDashExcelLib.ExcelNs.XlPageBreak
  
  /* -4105 */ val xlPageBreakAutomatic: xlPageBreakAutomatic with scala.Double = js.native
  /* -4135 */ val xlPageBreakManual: xlPageBreakManual with scala.Double = js.native
  /* -4142 */ val xlPageBreakNone: xlPageBreakNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPageBreak with scala.Double] = js.native
}

