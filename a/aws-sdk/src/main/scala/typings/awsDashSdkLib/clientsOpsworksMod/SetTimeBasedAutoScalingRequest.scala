package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTimeBasedAutoScalingRequest extends js.Object {
  /**
    * An AutoScalingSchedule with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: String
}

object SetTimeBasedAutoScalingRequest {
  @scala.inline
  def apply(InstanceId: String, AutoScalingSchedule: WeeklyAutoScalingSchedule = null): SetTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (AutoScalingSchedule != null) __obj.updateDynamic("AutoScalingSchedule")(AutoScalingSchedule)
    __obj.asInstanceOf[SetTimeBasedAutoScalingRequest]
  }
}

