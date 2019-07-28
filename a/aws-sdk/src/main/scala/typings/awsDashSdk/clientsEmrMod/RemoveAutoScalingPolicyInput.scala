package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAutoScalingPolicyInput extends js.Object {
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: typings.awsDashSdk.clientsEmrMod.InstanceGroupId
}

object RemoveAutoScalingPolicyInput {
  @scala.inline
  def apply(ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): RemoveAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId, InstanceGroupId = InstanceGroupId)
  
    __obj.asInstanceOf[RemoveAutoScalingPolicyInput]
  }
}

