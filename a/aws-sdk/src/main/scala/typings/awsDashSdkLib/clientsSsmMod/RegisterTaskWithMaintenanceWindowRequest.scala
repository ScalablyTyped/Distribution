package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterTaskWithMaintenanceWindowRequest extends js.Object {
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[ClientToken] = js.undefined
  /**
    * An optional description for the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to.    LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  var MaxConcurrency: awsDashSdkLib.clientsSsmMod.MaxConcurrency
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: awsDashSdkLib.clientsSsmMod.MaxErrors
  /**
    * An optional name for the task.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * The role to assume when running the Maintenance Window task. If you do not specify a service role ARN, Systems Manager will use your account's service-linked role for Systems Manager by default. If no service-linked role for Systems Manager exists in your account, it will be created when you run RegisterTaskWithMaintenanceWindow without specifying a service role ARN. For more information, see Service-Linked Role Permissions for Systems Manager and Should I Use a Service-Linked Role or a Custom Service Role to Run Maintenance Window Tasks?  in the AWS Systems Manager User Guide.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The targets (either instances or Maintenance Window targets). Specify instances using the following format:   Key=InstanceIds,Values=&lt;instance-id-1&gt;,&lt;instance-id-2&gt;  Specify Maintenance Window targets using the following format:  Key=&lt;WindowTargetIds&gt;,Values=&lt;window-target-id-1&gt;,&lt;window-target-id-2&gt; 
    */
  var Targets: awsDashSdkLib.clientsSsmMod.Targets
  /**
    * The ARN of the task to run.
    */
  var TaskArn: MaintenanceWindowTaskArn
  /**
    * The parameters that the task should use during execution. Populate only the fields that match the task type. All other fields should be empty. 
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  /**
    * The type of task being registered.
    */
  var TaskType: MaintenanceWindowTaskType
  /**
    * The ID of the Maintenance Window the task should be added to.
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
    Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
    ServiceRoleArn: ServiceRole = null,
    TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters = null,
    TaskParameters: MaintenanceWindowTaskParameters = null
  ): RegisterTaskWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(MaxConcurrency = MaxConcurrency, MaxErrors = MaxErrors, Targets = Targets, TaskArn = TaskArn, TaskType = TaskType.asInstanceOf[js.Any], WindowId = WindowId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (TaskInvocationParameters != null) __obj.updateDynamic("TaskInvocationParameters")(TaskInvocationParameters)
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowRequest]
  }
}

