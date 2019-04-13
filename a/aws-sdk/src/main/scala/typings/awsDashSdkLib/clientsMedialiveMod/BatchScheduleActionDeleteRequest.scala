package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchScheduleActionDeleteRequest extends js.Object {
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: __listOf__string
}

object BatchScheduleActionDeleteRequest {
  @scala.inline
  def apply(ActionNames: __listOf__string): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames)
  
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
}

