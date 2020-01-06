package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOnDemandAuditTaskResponse extends js.Object {
  /**
    * The ID of the on-demand audit you started.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
}

object StartOnDemandAuditTaskResponse {
  @scala.inline
  def apply(taskId: AuditTaskId = null): StartOnDemandAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandAuditTaskResponse]
  }
}

