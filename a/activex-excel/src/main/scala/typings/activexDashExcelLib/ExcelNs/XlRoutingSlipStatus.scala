package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRoutingSlipStatus extends js.Object

@JSGlobal("Excel.XlRoutingSlipStatus")
@js.native
object XlRoutingSlipStatus extends js.Object {
  @js.native
  sealed trait xlNotYetRouted
    extends activexDashExcelLib.ExcelNs.XlRoutingSlipStatus
  
  @js.native
  sealed trait xlRoutingComplete
    extends activexDashExcelLib.ExcelNs.XlRoutingSlipStatus
  
  @js.native
  sealed trait xlRoutingInProgress
    extends activexDashExcelLib.ExcelNs.XlRoutingSlipStatus
  
  /* 0 */ val xlNotYetRouted: xlNotYetRouted with scala.Double = js.native
  /* 2 */ val xlRoutingComplete: xlRoutingComplete with scala.Double = js.native
  /* 1 */ val xlRoutingInProgress: xlRoutingInProgress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlRoutingSlipStatus with scala.Double] = js.native
}

