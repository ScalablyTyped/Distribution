package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NatGatewayAddress extends js.Object {
  /**
    * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the network interface associated with the NAT gateway.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The private IP address associated with the Elastic IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.undefined
  /**
    * The Elastic IP address associated with the NAT gateway.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}

object NatGatewayAddress {
  @scala.inline
  def apply(
    AllocationId: String = null,
    NetworkInterfaceId: String = null,
    PrivateIp: String = null,
    PublicIp: String = null
  ): NatGatewayAddress = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (PrivateIp != null) __obj.updateDynamic("PrivateIp")(PrivateIp)
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp)
    __obj.asInstanceOf[NatGatewayAddress]
  }
}

