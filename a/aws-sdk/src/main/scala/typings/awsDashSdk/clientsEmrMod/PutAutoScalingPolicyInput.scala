package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAutoScalingPolicyInput extends js.Object {
  /**
    * Specifies the definition of the automatic scaling policy.
    */
  var AutoScalingPolicy: typings.awsDashSdk.clientsEmrMod.AutoScalingPolicy
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId
  /**
    * Specifies the ID of the instance group to which the automatic scaling policy is applied.
    */
  var InstanceGroupId: typings.awsDashSdk.clientsEmrMod.InstanceGroupId
}

object PutAutoScalingPolicyInput {
  @scala.inline
  def apply(AutoScalingPolicy: AutoScalingPolicy, ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): PutAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(AutoScalingPolicy = AutoScalingPolicy, ClusterId = ClusterId, InstanceGroupId = InstanceGroupId)
  
    __obj.asInstanceOf[PutAutoScalingPolicyInput]
  }
}

