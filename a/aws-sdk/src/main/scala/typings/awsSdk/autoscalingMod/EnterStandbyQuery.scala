package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterStandbyQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceIds] = js.native
  /**
    * Indicates whether to decrement the desired capacity of the Auto Scaling group by the number of instances moved to Standby mode.
    */
  var ShouldDecrementDesiredCapacity: typings.awsSdk.autoscalingMod.ShouldDecrementDesiredCapacity = js.native
}

object EnterStandbyQuery {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity,
    InstanceIds: InstanceIds = null
  ): EnterStandbyQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterStandbyQuery]
  }
}

