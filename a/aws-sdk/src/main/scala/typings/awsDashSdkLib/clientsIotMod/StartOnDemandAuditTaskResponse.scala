package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOnDemandAuditTaskResponse extends js.Object {
  /**
    * The ID of the on-demand audit you started.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
}

object StartOnDemandAuditTaskResponse {
  @scala.inline
  def apply(taskId: AuditTaskId = null): StartOnDemandAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[StartOnDemandAuditTaskResponse]
  }
}

