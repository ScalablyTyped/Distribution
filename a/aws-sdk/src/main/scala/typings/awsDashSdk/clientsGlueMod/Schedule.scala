package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  /**
    * A cron expression used to specify the schedule. For more information, see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, specify cron(15 12 * * ? *).
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
  /**
    * The state of the schedule.
    */
  var State: js.UndefOr[ScheduleState] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(ScheduleExpression: CronExpression = null, State: ScheduleState = null): Schedule = {
    val __obj = js.Dynamic.literal()
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

