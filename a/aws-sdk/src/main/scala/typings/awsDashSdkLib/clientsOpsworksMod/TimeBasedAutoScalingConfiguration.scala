package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeBasedAutoScalingConfiguration extends js.Object {
  /**
    * A WeeklyAutoScalingSchedule object with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object TimeBasedAutoScalingConfiguration {
  @scala.inline
  def apply(AutoScalingSchedule: WeeklyAutoScalingSchedule = null, InstanceId: String = null): TimeBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingSchedule != null) __obj.updateDynamic("AutoScalingSchedule")(AutoScalingSchedule)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[TimeBasedAutoScalingConfiguration]
  }
}

