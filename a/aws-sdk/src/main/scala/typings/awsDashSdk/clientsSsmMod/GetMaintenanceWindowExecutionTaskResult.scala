package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowExecutionTaskResult extends js.Object {
  /**
    * The time the task execution completed.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The defined maximum number of task executions that could be run in parallel.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The defined maximum number of task execution errors allowed before scheduling of the task execution would have been stopped.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The priority of the task.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * The role that was assumed when running the task.
    */
  var ServiceRole: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ServiceRole] = js.undefined
  /**
    * The time the task execution started.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of the task.
    */
  var Status: js.UndefOr[MaintenanceWindowExecutionStatus] = js.undefined
  /**
    * The details explaining the Status. Only available for certain status values.
    */
  var StatusDetails: js.UndefOr[MaintenanceWindowExecutionStatusDetails] = js.undefined
  /**
    * The ARN of the task that ran.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  /**
    * The ID of the specific task execution in the maintenance window task that was retrieved.
    */
  var TaskExecutionId: js.UndefOr[MaintenanceWindowExecutionTaskId] = js.undefined
  /**
    * The parameters passed to the task when it was run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParametersList] = js.undefined
  /**
    * The type of task that was run.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: js.UndefOr[MaintenanceWindowExecutionId] = js.undefined
}

object GetMaintenanceWindowExecutionTaskResult {
  @scala.inline
  def apply(
    EndTime: DateTime = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Priority: Int | Double = null,
    ServiceRole: ServiceRole = null,
    StartTime: DateTime = null,
    Status: MaintenanceWindowExecutionStatus = null,
    StatusDetails: MaintenanceWindowExecutionStatusDetails = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskExecutionId: MaintenanceWindowExecutionTaskId = null,
    TaskParameters: MaintenanceWindowTaskParametersList = null,
    Type: MaintenanceWindowTaskType = null,
    WindowExecutionId: MaintenanceWindowExecutionId = null
  ): GetMaintenanceWindowExecutionTaskResult = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    if (TaskExecutionId != null) __obj.updateDynamic("TaskExecutionId")(TaskExecutionId)
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WindowExecutionId != null) __obj.updateDynamic("WindowExecutionId")(WindowExecutionId)
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskResult]
  }
}

