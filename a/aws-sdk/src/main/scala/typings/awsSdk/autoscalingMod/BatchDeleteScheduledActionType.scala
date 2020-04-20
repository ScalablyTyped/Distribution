package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteScheduledActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The names of the scheduled actions to delete. The maximum number allowed is 50. 
    */
  var ScheduledActionNames: typings.awsSdk.autoscalingMod.ScheduledActionNames = js.native
}

object BatchDeleteScheduledActionType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionNames: ScheduledActionNames): BatchDeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionNames = ScheduledActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteScheduledActionType]
  }
}

