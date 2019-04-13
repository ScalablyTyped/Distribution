package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeeklyAutoScalingSchedule extends js.Object {
  /**
    * The schedule for Friday.
    */
  var Friday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  /**
    * The schedule for Monday.
    */
  var Monday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  /**
    * The schedule for Saturday.
    */
  var Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  /**
    * The schedule for Sunday.
    */
  var Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  /**
    * The schedule for Thursday.
    */
  var Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  /**
    * The schedule for Tuesday.
    */
  var Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
  /**
    * The schedule for Wednesday.
    */
  var Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
}

object WeeklyAutoScalingSchedule {
  @scala.inline
  def apply(
    Friday: DailyAutoScalingSchedule = null,
    Monday: DailyAutoScalingSchedule = null,
    Saturday: DailyAutoScalingSchedule = null,
    Sunday: DailyAutoScalingSchedule = null,
    Thursday: DailyAutoScalingSchedule = null,
    Tuesday: DailyAutoScalingSchedule = null,
    Wednesday: DailyAutoScalingSchedule = null
  ): WeeklyAutoScalingSchedule = {
    val __obj = js.Dynamic.literal()
    if (Friday != null) __obj.updateDynamic("Friday")(Friday)
    if (Monday != null) __obj.updateDynamic("Monday")(Monday)
    if (Saturday != null) __obj.updateDynamic("Saturday")(Saturday)
    if (Sunday != null) __obj.updateDynamic("Sunday")(Sunday)
    if (Thursday != null) __obj.updateDynamic("Thursday")(Thursday)
    if (Tuesday != null) __obj.updateDynamic("Tuesday")(Tuesday)
    if (Wednesday != null) __obj.updateDynamic("Wednesday")(Wednesday)
    __obj.asInstanceOf[WeeklyAutoScalingSchedule]
  }
}

