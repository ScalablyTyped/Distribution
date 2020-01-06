package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetMapping extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.AllocationId] = js.native
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PrivateIPv4Address] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SubnetId] = js.native
}

object SubnetMapping {
  @scala.inline
  def apply(
    AllocationId: AllocationId = null,
    PrivateIPv4Address: PrivateIPv4Address = null,
    SubnetId: SubnetId = null
  ): SubnetMapping = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (PrivateIPv4Address != null) __obj.updateDynamic("PrivateIPv4Address")(PrivateIPv4Address.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetMapping]
  }
}

