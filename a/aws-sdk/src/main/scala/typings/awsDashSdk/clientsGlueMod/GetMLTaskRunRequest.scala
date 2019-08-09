package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTaskRunRequest extends js.Object {
  /**
    * The unique identifier of the task run.
    */
  var TaskRunId: HashString
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object GetMLTaskRunRequest {
  @scala.inline
  def apply(TaskRunId: HashString, TransformId: HashString): GetMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId, TransformId = TransformId)
  
    __obj.asInstanceOf[GetMLTaskRunRequest]
  }
}

