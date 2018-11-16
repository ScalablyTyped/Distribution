package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotFieldRepeatLabels extends js.Object

@JSGlobal("Excel.XlPivotFieldRepeatLabels")
@js.native
object XlPivotFieldRepeatLabels extends js.Object {
  @js.native
  sealed trait xlDoNotRepeatLabels
    extends activexDashExcelLib.ExcelNs.XlPivotFieldRepeatLabels
  
  @js.native
  sealed trait xlRepeatLabels
    extends activexDashExcelLib.ExcelNs.XlPivotFieldRepeatLabels
  
  /* 1 */ val xlDoNotRepeatLabels: xlDoNotRepeatLabels with scala.Double = js.native
  /* 2 */ val xlRepeatLabels: xlRepeatLabels with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotFieldRepeatLabels with scala.Double] = js.native
}

