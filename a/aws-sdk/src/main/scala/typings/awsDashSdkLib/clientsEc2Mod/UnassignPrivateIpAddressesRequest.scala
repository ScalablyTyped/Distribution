package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnassignPrivateIpAddressesRequest extends js.Object {
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: String
  /**
    * The secondary private IP addresses to unassign from the network interface. You can specify this option multiple times to unassign more than one IP address.
    */
  var PrivateIpAddresses: PrivateIpAddressStringList
}

object UnassignPrivateIpAddressesRequest {
  @scala.inline
  def apply(NetworkInterfaceId: String, PrivateIpAddresses: PrivateIpAddressStringList): UnassignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId, PrivateIpAddresses = PrivateIpAddresses)
  
    __obj.asInstanceOf[UnassignPrivateIpAddressesRequest]
  }
}

