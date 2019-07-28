package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingProcessQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * One or more of the following processes. If you omit this parameter, all processes are specified.    Launch     Terminate     HealthCheck     ReplaceUnhealthy     AZRebalance     AlarmNotification     ScheduledActions     AddToLoadBalancer   
    */
  var ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined
}

object ScalingProcessQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScalingProcesses: ProcessNames = null): ScalingProcessQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName)
    if (ScalingProcesses != null) __obj.updateDynamic("ScalingProcesses")(ScalingProcesses)
    __obj.asInstanceOf[ScalingProcessQuery]
  }
}

