package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchScheduleActionDeleteResult extends js.Object {
  /**
    * List of actions that have been deleted from the schedule.
    */
  var ScheduleActions: __listOfScheduleAction
}

object BatchScheduleActionDeleteResult {
  @scala.inline
  def apply(ScheduleActions: __listOfScheduleAction): BatchScheduleActionDeleteResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions)
  
    __obj.asInstanceOf[BatchScheduleActionDeleteResult]
  }
}

