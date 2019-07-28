package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachInstancesQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.InstanceIds] = js.undefined
  /**
    * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances detached.
    */
  var ShouldDecrementDesiredCapacity: typings.awsDashSdk.clientsAutoscalingMod.ShouldDecrementDesiredCapacity
}

object DetachInstancesQuery {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
    InstanceIds: InstanceIds = null
  ): DetachInstancesQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    __obj.asInstanceOf[DetachInstancesQuery]
  }
}

