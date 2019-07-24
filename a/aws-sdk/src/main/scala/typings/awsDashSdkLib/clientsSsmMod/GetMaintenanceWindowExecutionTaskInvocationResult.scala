package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowExecutionTaskInvocationResult extends js.Object {
  /**
    * The time that the task finished running on the target.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskExecutionId] = js.undefined
  /**
    * The invocation ID.
    */
  var InvocationId: js.UndefOr[MaintenanceWindowExecutionTaskInvocationId] = js.undefined
  /**
    * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this maintenance window. 
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The parameters used at the time that the task ran.
    */
  var Parameters: js.UndefOr[MaintenanceWindowExecutionTaskInvocationParameters] = js.undefined
  /**
    * The time that the task started running on the target.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The task status for an invocation.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  /**
    * The details explaining the status. Details are only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  /**
    * The task execution ID.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  /**
    * Retrieves the task type for a maintenance window. Task types include the following: LAMBDA, STEP_FUNCTIONS, AUTOMATION, RUN_COMMAND.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  /**
    * The maintenance window execution ID.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
  /**
    * The maintenance window target ID.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTaskTargetId] = js.undefined
}

object GetMaintenanceWindowExecutionTaskInvocationResult {
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
  ): GetMaintenanceWindowExecutionTaskInvocationResult = {
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
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskInvocationResult]
  }
}

