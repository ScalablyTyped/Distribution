package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionDeleteRequest extends js.Object {
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: __listOf__string = js.native
}

object BatchScheduleActionDeleteRequest {
  @scala.inline
  def apply(ActionNames: __listOf__string): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
}

