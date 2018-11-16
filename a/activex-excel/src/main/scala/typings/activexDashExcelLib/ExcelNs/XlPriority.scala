package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPriority extends js.Object

@JSGlobal("Excel.XlPriority")
@js.native
object XlPriority extends js.Object {
  @js.native
  sealed trait xlPriorityHigh
    extends activexDashExcelLib.ExcelNs.XlPriority
  
  @js.native
  sealed trait xlPriorityLow
    extends activexDashExcelLib.ExcelNs.XlPriority
  
  @js.native
  sealed trait xlPriorityNormal
    extends activexDashExcelLib.ExcelNs.XlPriority
  
  /* -4127 */ val xlPriorityHigh: xlPriorityHigh with scala.Double = js.native
  /* -4134 */ val xlPriorityLow: xlPriorityLow with scala.Double = js.native
  /* -4143 */ val xlPriorityNormal: xlPriorityNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPriority with scala.Double] = js.native
}

