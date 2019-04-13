package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteScheduledActionAnswer extends js.Object {
  /**
    * The names of the scheduled actions that could not be deleted, including an error message. 
    */
  var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
}

object BatchDeleteScheduledActionAnswer {
  @scala.inline
  def apply(FailedScheduledActions: FailedScheduledUpdateGroupActionRequests = null): BatchDeleteScheduledActionAnswer = {
    val __obj = js.Dynamic.literal()
    if (FailedScheduledActions != null) __obj.updateDynamic("FailedScheduledActions")(FailedScheduledActions)
    __obj.asInstanceOf[BatchDeleteScheduledActionAnswer]
  }
}

