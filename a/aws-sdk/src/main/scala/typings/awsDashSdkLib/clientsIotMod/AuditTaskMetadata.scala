package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditTaskMetadata extends js.Object {
  /**
    * The ID of this audit.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
  /**
    * The status of this audit: one of "IN_PROGRESS", "COMPLETED", "FAILED" or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
  /**
    * The type of this audit: one of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.undefined
}

object AuditTaskMetadata {
  @scala.inline
  def apply(taskId: AuditTaskId = null, taskStatus: AuditTaskStatus = null, taskType: AuditTaskType = null): AuditTaskMetadata = {
    val __obj = js.Dynamic.literal()
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditTaskMetadata]
  }
}

