package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignPrivateIpAddressesResult extends js.Object {
  /**
    * The private IP addresses assigned to the network interface.
    */
  var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}

object AssignPrivateIpAddressesResult {
  @scala.inline
  def apply(AssignedPrivateIpAddresses: AssignedPrivateIpAddressList = null, NetworkInterfaceId: String = null): AssignPrivateIpAddressesResult = {
    val __obj = js.Dynamic.literal()
    if (AssignedPrivateIpAddresses != null) __obj.updateDynamic("AssignedPrivateIpAddresses")(AssignedPrivateIpAddresses.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignPrivateIpAddressesResult]
  }
}

