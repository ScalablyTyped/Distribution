package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ClientToken] = js.undefined
  /**
    * An optional description for the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to.    LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsDashSdk.clientsSsmMod.LoggingInfo] = js.undefined
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  var MaxConcurrency: typings.awsDashSdk.clientsSsmMod.MaxConcurrency
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: typings.awsDashSdk.clientsSsmMod.MaxErrors
  /**
    * An optional name for the task.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The priority of the task in the maintenance window, the lower the number the higher the priority. Tasks in a maintenance window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * The ARN of the IAM service role for Systems Manager to assume when running a maintenance window task. If you do not specify a service role ARN, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created when you run RegisterTaskWithMaintenanceWindow. For more information, see the following topics in the in the AWS Systems Manager User Guide:    Service-Linked Role Permissions for Systems Manager     Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks?    
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The targets (either instances or maintenance window targets). Specify instances using the following format:   Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify maintenance window targets using the following format:  Key=WindowTargetIds;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt; 
    */
  var Targets: typings.awsDashSdk.clientsSsmMod.Targets
  /**
    * The ARN of the task to run.
    */
  var TaskArn: MaintenanceWindowTaskArn
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty. 
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  /**
    * The type of task being registered.
    */
  var TaskType: MaintenanceWindowTaskType
  /**
    * The ID of the maintenance window the task should be added to.
    */
  var WindowId: MaintenanceWindowId
}

object RegisterTaskWithMaintenanceWindowRequest {
  @scala.inline
  def apply(
    MaxConcurrency: MaxConcurrency,
    MaxErrors: MaxErrors,
    Targets: Targets,
    TaskArn: MaintenanceWindowTaskArn,
    TaskType: MaintenanceWindowTaskType,
    WindowId: MaintenanceWindowId,
    ClientToken: ClientToken = null,
    Description: MaintenanceWindowDescription = null,
    LoggingInfo: LoggingInfo = null,
    Name: MaintenanceWindowName = null,
    Priority: Int | Double = null,
    ServiceRoleArn: ServiceRole = null,
    TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters = null,
    TaskParameters: MaintenanceWindowTaskParameters = null
  ): RegisterTaskWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(MaxConcurrency = MaxConcurrency, MaxErrors = MaxErrors, Targets = Targets, TaskArn = TaskArn, TaskType = TaskType.asInstanceOf[js.Any], WindowId = WindowId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (TaskInvocationParameters != null) __obj.updateDynamic("TaskInvocationParameters")(TaskInvocationParameters)
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
  }
}

