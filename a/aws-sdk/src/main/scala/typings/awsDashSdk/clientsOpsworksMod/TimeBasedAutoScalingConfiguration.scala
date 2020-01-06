package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedAutoScalingConfiguration extends js.Object {
  /**
    * A WeeklyAutoScalingSchedule object with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object TimeBasedAutoScalingConfiguration {
  @scala.inline
  def apply(AutoScalingSchedule: WeeklyAutoScalingSchedule = null, InstanceId: String = null): TimeBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingSchedule != null) __obj.updateDynamic("AutoScalingSchedule")(AutoScalingSchedule.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBasedAutoScalingConfiguration]
  }
}

