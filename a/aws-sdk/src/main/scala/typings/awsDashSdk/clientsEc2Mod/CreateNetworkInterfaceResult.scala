package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInterfaceResult extends js.Object {
  /**
    * Information about the network interface.
    */
  var NetworkInterface: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NetworkInterface] = js.native
}

object CreateNetworkInterfaceResult {
  @scala.inline
  def apply(NetworkInterface: NetworkInterface = null): CreateNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkInterface != null) __obj.updateDynamic("NetworkInterface")(NetworkInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfaceResult]
  }
}

