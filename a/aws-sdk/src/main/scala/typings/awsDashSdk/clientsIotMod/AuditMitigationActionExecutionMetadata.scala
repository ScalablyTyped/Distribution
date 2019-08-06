package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditMitigationActionExecutionMetadata extends js.Object {
  /**
    * The unique identifier for the mitigation action being applied by the task.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.undefined
  /**
    * The friendly name of the mitigation action being applied by the task.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  /**
    * The date and time when the task was completed or canceled. Blank if the task is still running.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If an error occurred, the code that indicates which type of error occurred.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The unique identifier for the findings to which the task and associated mitigation action are applied.
    */
  var findingId: js.UndefOr[FindingId] = js.undefined
  /**
    * If an error occurred, a message that describes the error.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current status of the task being executed.
    */
  var status: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.undefined
  /**
    * The unique identifier for the task that applies the mitigation action.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.undefined
}

object AuditMitigationActionExecutionMetadata {
  @scala.inline
  def apply(
    actionId: MitigationActionId = null,
    actionName: MitigationActionName = null,
    endTime: Timestamp = null,
    errorCode: ErrorCode = null,
    findingId: FindingId = null,
    message: ErrorMessage = null,
    startTime: Timestamp = null,
    status: AuditMitigationActionsExecutionStatus = null,
    taskId: AuditMitigationActionsTaskId = null
  ): AuditMitigationActionExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    if (actionId != null) __obj.updateDynamic("actionId")(actionId)
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (findingId != null) __obj.updateDynamic("findingId")(findingId)
    if (message != null) __obj.updateDynamic("message")(message)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[AuditMitigationActionExecutionMetadata]
  }
}

