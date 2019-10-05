package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRun extends js.Object {
  /**
    * The last point in time that the requested task run was completed.
    */
  var CompletedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The list of error strings associated with this task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.undefined
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ExecutionTime] = js.undefined
  /**
    * The last point in time that the requested task run was updated.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The names of the log group for secure logging, associated with this task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.undefined
  /**
    * Specifies configuration properties associated with this task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.undefined
  /**
    * The date and time that this task run started.
    */
  var StartedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The current status of the requested task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  /**
    * The unique identifier for this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
  /**
    * The unique identifier for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}

object TaskRun {
  @scala.inline
  def apply(
    CompletedOn: Timestamp = null,
    ErrorString: GenericString = null,
    ExecutionTime: Int | Double = null,
    LastModifiedOn: Timestamp = null,
    LogGroupName: GenericString = null,
    Properties: TaskRunProperties = null,
    StartedOn: Timestamp = null,
    Status: TaskStatusType = null,
    TaskRunId: HashString = null,
    TransformId: HashString = null
  ): TaskRun = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn)
    if (ErrorString != null) __obj.updateDynamic("ErrorString")(ErrorString)
    if (ExecutionTime != null) __obj.updateDynamic("ExecutionTime")(ExecutionTime.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn)
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId)
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId)
    __obj.asInstanceOf[TaskRun]
  }
}

