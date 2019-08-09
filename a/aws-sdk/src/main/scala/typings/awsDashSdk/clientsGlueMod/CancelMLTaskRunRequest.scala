package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelMLTaskRunRequest extends js.Object {
  /**
    * A unique identifier for the task run.
    */
  var TaskRunId: HashString
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object CancelMLTaskRunRequest {
  @scala.inline
  def apply(TaskRunId: HashString, TransformId: HashString): CancelMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId, TransformId = TransformId)
  
    __obj.asInstanceOf[CancelMLTaskRunRequest]
  }
}

