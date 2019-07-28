package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerAddress extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address.
    */
  var AllocationId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.AllocationId] = js.undefined
  /**
    * The static IP address.
    */
  var IpAddress: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.IpAddress] = js.undefined
}

object LoadBalancerAddress {
  @scala.inline
  def apply(AllocationId: AllocationId = null, IpAddress: IpAddress = null): LoadBalancerAddress = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    __obj.asInstanceOf[LoadBalancerAddress]
  }
}

