package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionCreateResult extends js.Object {
  /**
    * List of actions that have been created in the schedule.
    */
  var ScheduleActions: __listOfScheduleAction = js.native
}

object BatchScheduleActionCreateResult {
  @scala.inline
  def apply(ScheduleActions: __listOfScheduleAction): BatchScheduleActionCreateResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchScheduleActionCreateResult]
  }
}

