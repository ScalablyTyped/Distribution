package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTaskRunResponse extends js.Object {
  /**
    * The date and time when this task run was completed.
    */
  var CompletedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The error strings that are associated with the task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.undefined
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ExecutionTime] = js.undefined
  /**
    * The date and time when this task run was last modified.
    */
  var LastModifiedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The names of the log groups that are associated with the task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.undefined
  /**
    * The list of properties that are associated with the task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.undefined
  /**
    * The date and time when this task run started.
    */
  var StartedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status for this task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  /**
    * The unique run identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
  /**
    * The unique identifier of the task run.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}

object GetMLTaskRunResponse {
  @scala.inline
  def apply(
    CompletedOn: Timestamp = null,
    ErrorString: GenericString = null,
    ExecutionTime: js.UndefOr[ExecutionTime] = js.undefined,
    LastModifiedOn: Timestamp = null,
    LogGroupName: GenericString = null,
    Properties: TaskRunProperties = null,
    StartedOn: Timestamp = null,
    Status: TaskStatusType = null,
    TaskRunId: HashString = null,
    TransformId: HashString = null
  ): GetMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn)
    if (ErrorString != null) __obj.updateDynamic("ErrorString")(ErrorString)
    if (!js.isUndefined(ExecutionTime)) __obj.updateDynamic("ExecutionTime")(ExecutionTime)
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn)
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId)
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId)
    __obj.asInstanceOf[GetMLTaskRunResponse]
  }
}

