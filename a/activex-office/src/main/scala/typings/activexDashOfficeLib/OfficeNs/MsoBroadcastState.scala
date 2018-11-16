package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBroadcastState extends js.Object

@JSGlobal("Office.MsoBroadcastState")
@js.native
object MsoBroadcastState extends js.Object {
  @js.native
  sealed trait BroadcastPaused
    extends activexDashOfficeLib.OfficeNs.MsoBroadcastState
  
  @js.native
  sealed trait BroadcastStarted
    extends activexDashOfficeLib.OfficeNs.MsoBroadcastState
  
  @js.native
  sealed trait NoBroadcast
    extends activexDashOfficeLib.OfficeNs.MsoBroadcastState
  
  /* 2 */ val BroadcastPaused: BroadcastPaused with scala.Double = js.native
  /* 1 */ val BroadcastStarted: BroadcastStarted with scala.Double = js.native
  /* 0 */ val NoBroadcast: NoBroadcast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBroadcastState with scala.Double] = js.native
}

