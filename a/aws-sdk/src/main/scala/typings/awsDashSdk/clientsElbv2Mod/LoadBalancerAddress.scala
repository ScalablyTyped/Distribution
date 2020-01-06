package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAddress extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.AllocationId] = js.native
  /**
    * The static IP address.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.IpAddress] = js.native
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PrivateIPv4Address] = js.native
}

object LoadBalancerAddress {
  @scala.inline
  def apply(
    AllocationId: AllocationId = null,
    IpAddress: IpAddress = null,
    PrivateIPv4Address: PrivateIPv4Address = null
  ): LoadBalancerAddress = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (PrivateIPv4Address != null) __obj.updateDynamic("PrivateIPv4Address")(PrivateIPv4Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAddress]
  }
}

