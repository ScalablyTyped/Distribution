package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchScheduleActionCreateRequest extends js.Object {
  /**
    * A list of schedule actions to create.
    */
  var ScheduleActions: __listOfScheduleAction
}

object BatchScheduleActionCreateRequest {
  @scala.inline
  def apply(ScheduleActions: __listOfScheduleAction): BatchScheduleActionCreateRequest = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions)
  
    __obj.asInstanceOf[BatchScheduleActionCreateRequest]
  }
}

