package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAuditMitigationActionsTaskResponse extends js.Object {
  /**
    * The unique identifier for the audit mitigation task. This matches the taskId that you specified in the request.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.native
}

object StartAuditMitigationActionsTaskResponse {
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId = null): StartAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAuditMitigationActionsTaskResponse]
  }
}

