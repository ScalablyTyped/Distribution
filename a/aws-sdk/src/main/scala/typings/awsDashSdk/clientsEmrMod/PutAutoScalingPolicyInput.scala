package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAutoScalingPolicyInput extends js.Object {
  /**
    * Specifies the definition of the automatic scaling policy.
    */
  var AutoScalingPolicy: typings.awsDashSdk.clientsEmrMod.AutoScalingPolicy = js.native
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId = js.native
  /**
    * Specifies the ID of the instance group to which the automatic scaling policy is applied.
    */
  var InstanceGroupId: typings.awsDashSdk.clientsEmrMod.InstanceGroupId = js.native
}

object PutAutoScalingPolicyInput {
  @scala.inline
  def apply(AutoScalingPolicy: AutoScalingPolicy, ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): PutAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(AutoScalingPolicy = AutoScalingPolicy.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any], InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutAutoScalingPolicyInput]
  }
}

