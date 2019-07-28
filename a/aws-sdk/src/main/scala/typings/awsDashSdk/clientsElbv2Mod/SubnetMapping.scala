package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetMapping extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address.
    */
  var AllocationId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.AllocationId] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SubnetId] = js.undefined
}

object SubnetMapping {
  @scala.inline
  def apply(AllocationId: AllocationId = null, SubnetId: SubnetId = null): SubnetMapping = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[SubnetMapping]
  }
}

