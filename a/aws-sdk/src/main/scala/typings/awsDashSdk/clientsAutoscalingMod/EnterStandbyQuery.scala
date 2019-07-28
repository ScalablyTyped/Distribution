package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterStandbyQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.InstanceIds] = js.undefined
  /**
    * Indicates whether to decrement the desired capacity of the Auto Scaling group by the number of instances moved to Standby mode.
    */
  var ShouldDecrementDesiredCapacity: typings.awsDashSdk.clientsAutoscalingMod.ShouldDecrementDesiredCapacity
}

object EnterStandbyQuery {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
    InstanceIds: InstanceIds = null
  ): EnterStandbyQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    __obj.asInstanceOf[EnterStandbyQuery]
  }
}

