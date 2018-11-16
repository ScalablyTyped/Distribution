package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAllocation extends js.Object

@JSGlobal("Excel.XlAllocation")
@js.native
object XlAllocation extends js.Object {
  @js.native
  sealed trait xlAutomaticAllocation
    extends activexDashExcelLib.ExcelNs.XlAllocation
  
  @js.native
  sealed trait xlManualAllocation
    extends activexDashExcelLib.ExcelNs.XlAllocation
  
  /* 2 */ val xlAutomaticAllocation: xlAutomaticAllocation with scala.Double = js.native
  /* 1 */ val xlManualAllocation: xlManualAllocation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAllocation with scala.Double] = js.native
}

