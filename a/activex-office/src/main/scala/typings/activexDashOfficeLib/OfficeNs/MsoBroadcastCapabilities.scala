package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBroadcastCapabilities extends js.Object

@JSGlobal("Office.MsoBroadcastCapabilities")
@js.native
object MsoBroadcastCapabilities extends js.Object {
  @js.native
  sealed trait BroadcastCapFileSizeLimited
    extends activexDashOfficeLib.OfficeNs.MsoBroadcastCapabilities
  
  @js.native
  sealed trait BroadcastCapSupportsMeetingNotes
    extends activexDashOfficeLib.OfficeNs.MsoBroadcastCapabilities
  
  @js.native
  sealed trait BroadcastCapSupportsUpdateDoc
    extends activexDashOfficeLib.OfficeNs.MsoBroadcastCapabilities
  
  /* 1 */ val BroadcastCapFileSizeLimited: BroadcastCapFileSizeLimited with scala.Double = js.native
  /* 2 */ val BroadcastCapSupportsMeetingNotes: BroadcastCapSupportsMeetingNotes with scala.Double = js.native
  /* 4 */ val BroadcastCapSupportsUpdateDoc: BroadcastCapSupportsUpdateDoc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBroadcastCapabilities with scala.Double] = js.native
}

