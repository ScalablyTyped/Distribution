package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignPrivateIpAddressesRequest extends js.Object {
  /**
    * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be reassigned to the specified network interface.
    */
  var AllowReassignment: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
  /**
    * One or more IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify this parameter when also specifying a number of secondary IP addresses. If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined
  /**
    * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when also specifying private IP addresses.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
}

object AssignPrivateIpAddressesRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: String,
    AllowReassignment: js.UndefOr[Boolean] = js.undefined,
    PrivateIpAddresses: PrivateIpAddressStringList = null,
    SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
  ): AssignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId)
    if (!js.isUndefined(AllowReassignment)) __obj.updateDynamic("AllowReassignment")(AllowReassignment)
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses)
    if (!js.isUndefined(SecondaryPrivateIpAddressCount)) __obj.updateDynamic("SecondaryPrivateIpAddressCount")(SecondaryPrivateIpAddressCount)
    __obj.asInstanceOf[AssignPrivateIpAddressesRequest]
  }
}

