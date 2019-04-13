package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScheduledActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The name of the action to delete.
    */
  var ScheduledActionName: ResourceName
}

object DeleteScheduledActionType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionName: ResourceName): DeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, ScheduledActionName = ScheduledActionName)
  
    __obj.asInstanceOf[DeleteScheduledActionType]
  }
}

