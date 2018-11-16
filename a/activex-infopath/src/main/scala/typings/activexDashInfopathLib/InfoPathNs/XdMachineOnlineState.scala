package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdMachineOnlineState extends js.Object

@JSGlobal("InfoPath.XdMachineOnlineState")
@js.native
object XdMachineOnlineState extends js.Object {
  @js.native
  sealed trait xdIEIsInOfflineMode
    extends activexDashInfopathLib.InfoPathNs.XdMachineOnlineState
  
  @js.native
  sealed trait xdOffline
    extends activexDashInfopathLib.InfoPathNs.XdMachineOnlineState
  
  @js.native
  sealed trait xdOnline
    extends activexDashInfopathLib.InfoPathNs.XdMachineOnlineState
  
  /* 2 */ val xdIEIsInOfflineMode: xdIEIsInOfflineMode with scala.Double = js.native
  /* 0 */ val xdOffline: xdOffline with scala.Double = js.native
  /* 1 */ val xdOnline: xdOnline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdMachineOnlineState with scala.Double] = js.native
}

