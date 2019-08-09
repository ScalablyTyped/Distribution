package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelMLTaskRunResponse extends js.Object {
  /**
    * The status for this run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}

object CancelMLTaskRunResponse {
  @scala.inline
  def apply(Status: TaskStatusType = null, TaskRunId: HashString = null, TransformId: HashString = null): CancelMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TaskRunId != null) __obj.updateDynamic("TaskRunId")(TaskRunId)
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId)
    __obj.asInstanceOf[CancelMLTaskRunResponse]
  }
}

