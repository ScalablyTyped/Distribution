package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowExecutionTaskInvocationIdentity extends js.Object {
  /**
    * The time the invocation finished.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The ID of the action performed in the service that actually handled the task invocation. If the task type is RUN_COMMAND, this value is the command ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined
  /**
    * The ID of the task invocation.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined
  /**
    * User-provided value that was specified when the target was registered with the Maintenance Window. This was also included in any CloudWatch events raised during the task invocation.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The parameters that were provided for the invocation when it was run.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined
  /**
    * The time the invocation started.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the task invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  /**
    * The details explaining the status of the task invocation. Only available for certain Status values. 
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  /**
    * The ID of the specific task execution in the Maintenance Window execution.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  /**
    * The task type.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  /**
    * The ID of the Maintenance Window execution that ran the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  /**
    * The ID of the target definition in this Maintenance Window the invocation was performed for.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
}

object MaintenanceWindowExecutionTaskInvocationIdentity {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    ExecutionId: MaintenanceWindowExecutionTaskExecutionId = null,
    InvocationId: MaintenanceWindowExecutionTaskInvocationId = null,
    OwnerInformation: OwnerInformation = null,
    Parameters: MaintenanceWindowExecutionTaskInvocationParameters = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskExecutionId: MaintenanceWindowExecutionTaskId = null,
    TaskType: MaintenanceWindowTaskType = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null,
    WindowTargetId: MaintenanceWindowTaskTargetId = null
  ): MaintenanceWindowExecutionTaskInvocationIdentity = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId)
    if (InvocationId != null) __obj.updateDynamic("InvocationId")(InvocationId)
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (TaskExecutionId != null) __obj.updateDynamic("TaskExecutionId")(TaskExecutionId)
    if (TaskType != null) __obj.updateDynamic("TaskType")(TaskType.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId)
    if (WindowTargetId != null) __obj.updateDynamic("WindowTargetId")(WindowTargetId)
    __obj.asInstanceOf[MaintenanceWindowExecutionTaskInvocationIdentity]
  }
}

