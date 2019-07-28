package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPutScheduledUpdateGroupActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * One or more scheduled actions. The maximum number allowed is 50. 
    */
  var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
}

object BatchPutScheduledUpdateGroupActionType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  ): BatchPutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, ScheduledUpdateGroupActions = ScheduledUpdateGroupActions)
  
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
  }
}

