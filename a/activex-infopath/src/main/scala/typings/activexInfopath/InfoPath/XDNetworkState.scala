package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDNetworkState extends js.Object {
  @JSName("InfoPath.XDNetworkState_typekey")
  var InfoPathDotXDNetworkState_typekey: XDNetworkState
  val MachineOnlineState: XdMachineOnlineState
  def IsDestinationReachable(bstrDestination: String): Boolean
}

object XDNetworkState {
  @scala.inline
  def apply(
    InfoPathDotXDNetworkState_typekey: XDNetworkState,
    IsDestinationReachable: String => Boolean,
    MachineOnlineState: XdMachineOnlineState
  ): XDNetworkState = {
    val __obj = js.Dynamic.literal(IsDestinationReachable = js.Any.fromFunction1(IsDestinationReachable), MachineOnlineState = MachineOnlineState.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XDNetworkState_typekey")(InfoPathDotXDNetworkState_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDNetworkState]
  }
}

