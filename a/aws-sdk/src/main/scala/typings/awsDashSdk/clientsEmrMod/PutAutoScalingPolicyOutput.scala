package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAutoScalingPolicyOutput extends js.Object {
  /**
    * The automatic scaling policy definition.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ClusterId] = js.undefined
  /**
    * Specifies the ID of the instance group to which the scaling policy is applied.
    */
  var InstanceGroupId: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceGroupId] = js.undefined
}

object PutAutoScalingPolicyOutput {
  @scala.inline
  def apply(
    AutoScalingPolicy: AutoScalingPolicyDescription = null,
    ClusterId: ClusterId = null,
    InstanceGroupId: InstanceGroupId = null
  ): PutAutoScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy)
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId)
    __obj.asInstanceOf[PutAutoScalingPolicyOutput]
  }
}

