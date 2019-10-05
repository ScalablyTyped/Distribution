package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMaintenanceWindowTaskRequest extends js.Object {
  /**
    * The new task description to specify.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The new logging location in Amazon S3 to specify.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsDashSdk.clientsSsmMod.LoggingInfo] = js.undefined
  /**
    * The new MaxConcurrency value you want to specify. MaxConcurrency is the number of targets that are allowed to run this task in parallel.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The new MaxErrors value to specify. MaxErrors is the maximum number of errors that are allowed before the task stops being scheduled.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The new task name to specify.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The new task priority to specify. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * If True, then all fields that are required by the RegisterTaskWithMaintenanceWndow action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created when you run RegisterTaskWithMaintenanceWindow. For more information, see the following topics in the in the AWS Systems Manager User Guide:    Service-Linked Role Permissions for Systems Manager     Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks?    
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The targets (either instances or tags) to modify. Instances are specified using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are specified using Key=tag_name,Values=tag_value. 
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
  /**
    * The task ARN to modify.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty.
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  /**
    * The parameters to modify.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  The map has the following format: Key: string, between 1 and 255 characters Value: an array of strings, each string is between 1 and 255 characters
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  /**
    * The maintenance window ID that contains the task to modify.
    */
  var WindowId: MaintenanceWindowId
  /**
    * The task ID to modify.
    */
  var WindowTaskId: MaintenanceWindowTaskId
}

object UpdateMaintenanceWindowTaskRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    WindowTaskId: MaintenanceWindowTaskId,
    Description: MaintenanceWindowDescription = null,
    LoggingInfo: LoggingInfo = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: MaintenanceWindowName = null,
    Priority: Int | Double = null,
    Replace: js.UndefOr[scala.Boolean] = js.undefined,
    ServiceRoleArn: ServiceRole = null,
    Targets: Targets = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters = null,
    TaskParameters: MaintenanceWindowTaskParameters = null
  ): UpdateMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId, WindowTaskId = WindowTaskId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    if (TaskInvocationParameters != null) __obj.updateDynamic("TaskInvocationParameters")(TaskInvocationParameters)
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    __obj.asInstanceOf[UpdateMaintenanceWindowTaskRequest]
  }
}

