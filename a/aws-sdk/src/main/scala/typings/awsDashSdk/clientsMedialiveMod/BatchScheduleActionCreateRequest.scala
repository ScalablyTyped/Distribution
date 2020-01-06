package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionCreateRequest extends js.Object {
  /**
    * A list of schedule actions to create.
    */
  var ScheduleActions: __listOfScheduleAction = js.native
}

object BatchScheduleActionCreateRequest {
  @scala.inline
  def apply(ScheduleActions: __listOfScheduleAction): BatchScheduleActionCreateRequest = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchScheduleActionCreateRequest]
  }
}

