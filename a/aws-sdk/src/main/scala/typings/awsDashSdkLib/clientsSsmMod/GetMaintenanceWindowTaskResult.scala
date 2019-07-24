package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMaintenanceWindowTaskResult extends js.Object {
  /**
    * The retrieved task description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  /**
    * The location in Amazon S3 where the task results are logged.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[LoggingInfo] = js.undefined
  /**
    * The maximum number of targets allowed to run this task in parallel.
    */
  var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  /**
    * The maximum number of errors allowed before the task stops being scheduled.
    */
  var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
  /**
    * The retrieved task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  /**
    * The priority of the task when it runs. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The targets where the task should run.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * The resource that the task used during execution. For RUN_COMMAND and AUTOMATION task types, the TaskArn is the Systems Manager Document name/ARN. For LAMBDA tasks, the value is the function name/ARN. For STEP_FUNCTIONS tasks, the value is the state machine ARN.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  /**
    * The parameters to pass to the task when it runs.
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  /**
    * The parameters to pass to the task when it runs.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  /**
    * The type of task to run.
    */
  var TaskType: js.UndefOr[MaintenanceWindowTaskType] = js.undefined
  /**
    * The retrieved maintenance window ID.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  /**
    * The retrieved maintenance window task ID.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}

object GetMaintenanceWindowTaskResult {
  @scala.inline
  def apply(
    Description: MaintenanceWindowDescription = null,
    LoggingInfo: LoggingInfo = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: MaintenanceWindowName = null,
    Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined,
    ServiceRoleArn: ServiceRole = null,
    Targets: Targets = null,
    TaskArn: MaintenanceWindowTaskArn = null,
    TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters = null,
    TaskParameters: MaintenanceWindowTaskParameters = null,
    TaskType: MaintenanceWindowTaskType = null,
    WindowId: MaintenanceWindowId = null,
    WindowTaskId: MaintenanceWindowTaskId = null
  ): GetMaintenanceWindowTaskResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (TaskArn != null) __obj.updateDynamic("TaskArn")(TaskArn)
    if (TaskInvocationParameters != null) __obj.updateDynamic("TaskInvocationParameters")(TaskInvocationParameters)
    if (TaskParameters != null) __obj.updateDynamic("TaskParameters")(TaskParameters)
    if (TaskType != null) __obj.updateDynamic("TaskType")(TaskType.asInstanceOf[js.Any])
    if (WindowId != null) __obj.updateDynamic("WindowId")(WindowId)
    if (WindowTaskId != null) __obj.updateDynamic("WindowTaskId")(WindowTaskId)
    __obj.asInstanceOf[GetMaintenanceWindowTaskResult]
  }
}

