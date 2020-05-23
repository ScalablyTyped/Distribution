package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdMachineOnlineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDNetworkState")
@js.native
class XDNetworkState protected ()
  extends typings.activexInfopath.InfoPath.XDNetworkState {
  /* CompleteClass */
  @JSName("InfoPath.XDNetworkState_typekey")
  override var InfoPathDotXDNetworkState_typekey: typings.activexInfopath.InfoPath.XDNetworkState = js.native
  /* CompleteClass */
  override val MachineOnlineState: XdMachineOnlineState = js.native
  /* CompleteClass */
  override def IsDestinationReachable(bstrDestination: String): Boolean = js.native
}

