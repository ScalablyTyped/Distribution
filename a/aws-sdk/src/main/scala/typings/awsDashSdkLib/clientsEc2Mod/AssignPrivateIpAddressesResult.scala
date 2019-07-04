package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignPrivateIpAddressesResult extends js.Object {
  /**
    * The private IP addresses assigned to the network interface.
    */
  var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
}

object AssignPrivateIpAddressesResult {
  @scala.inline
  def apply(AssignedPrivateIpAddresses: AssignedPrivateIpAddressList = null, NetworkInterfaceId: String = null): AssignPrivateIpAddressesResult = {
    val __obj = js.Dynamic.literal()
    if (AssignedPrivateIpAddresses != null) __obj.updateDynamic("AssignedPrivateIpAddresses")(AssignedPrivateIpAddresses)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    __obj.asInstanceOf[AssignPrivateIpAddressesResult]
  }
}

