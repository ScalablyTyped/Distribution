package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRoutingSlipStatus extends js.Object

@JSGlobal("Word.WdRoutingSlipStatus")
@js.native
object WdRoutingSlipStatus extends js.Object {
  @js.native
  sealed trait wdNotYetRouted
    extends activexDashWordLib.WordNs.WdRoutingSlipStatus
  
  @js.native
  sealed trait wdRouteComplete
    extends activexDashWordLib.WordNs.WdRoutingSlipStatus
  
  @js.native
  sealed trait wdRouteInProgress
    extends activexDashWordLib.WordNs.WdRoutingSlipStatus
  
  /* 0 */ val wdNotYetRouted: wdNotYetRouted with scala.Double = js.native
  /* 2 */ val wdRouteComplete: wdRouteComplete with scala.Double = js.native
  /* 1 */ val wdRouteInProgress: wdRouteInProgress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRoutingSlipStatus with scala.Double] = js.native
}

