package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMLEvaluationTaskRunRequest extends js.Object {
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object StartMLEvaluationTaskRunRequest {
  @scala.inline
  def apply(TransformId: HashString): StartMLEvaluationTaskRunRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId)
  
    __obj.asInstanceOf[StartMLEvaluationTaskRunRequest]
  }
}

