package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDNetworkState")
@js.native
class XDNetworkState protected () extends js.Object {
  @JSName("InfoPath.XDNetworkState_typekey")
  var InfoPathDotXDNetworkState_typekey: XDNetworkState = js.native
  val MachineOnlineState: XdMachineOnlineState = js.native
  def IsDestinationReachable(bstrDestination: String): Boolean = js.native
}

