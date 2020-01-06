package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingProcessQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * One or more of the following processes. If you omit this parameter, all processes are specified.    Launch     Terminate     HealthCheck     ReplaceUnhealthy     AZRebalance     AlarmNotification     ScheduledActions     AddToLoadBalancer   
    */
  var ScalingProcesses: js.UndefOr[ProcessNames] = js.native
}

object ScalingProcessQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScalingProcesses: ProcessNames = null): ScalingProcessQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    if (ScalingProcesses != null) __obj.updateDynamic("ScalingProcesses")(ScalingProcesses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingProcessQuery]
  }
}

