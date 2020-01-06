package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutScheduledUpdateGroupActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * One or more scheduled actions. The maximum number allowed is 50.
    */
  var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests = js.native
}

object BatchPutScheduledUpdateGroupActionType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  ): BatchPutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledUpdateGroupActions = ScheduledUpdateGroupActions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
  }
}

