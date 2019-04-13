package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkInterfaceResult extends js.Object {
  /**
    * Information about the network interface.
    */
  var NetworkInterface: js.UndefOr[NetworkInterface] = js.undefined
}

object CreateNetworkInterfaceResult {
  @scala.inline
  def apply(NetworkInterface: NetworkInterface = null): CreateNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkInterface != null) __obj.updateDynamic("NetworkInterface")(NetworkInterface)
    __obj.asInstanceOf[CreateNetworkInterfaceResult]
  }
}

