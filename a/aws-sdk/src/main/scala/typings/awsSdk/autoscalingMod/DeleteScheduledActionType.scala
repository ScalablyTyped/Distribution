package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScheduledActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The name of the action to delete.
    */
  var ScheduledActionName: ResourceName = js.native
}

object DeleteScheduledActionType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionName: ResourceName): DeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteScheduledActionType]
  }
}

