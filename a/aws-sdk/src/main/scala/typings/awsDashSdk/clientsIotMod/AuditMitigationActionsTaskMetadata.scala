package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditMitigationActionsTaskMetadata extends js.Object {
  /**
    * The time at which the audit mitigation actions task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The unique identifier for the task.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined
  /**
    * The current state of the audit mitigation actions task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
}

object AuditMitigationActionsTaskMetadata {
  @scala.inline
  def apply(
    startTime: Timestamp = null,
    taskId: AuditMitigationActionsTaskId = null,
    taskStatus: AuditMitigationActionsTaskStatus = null
  ): AuditMitigationActionsTaskMetadata = {
    val __obj = js.Dynamic.literal()
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    if (taskStatus != null) __obj.updateDynamic("taskStatus")(taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditMitigationActionsTaskMetadata]
  }
}

