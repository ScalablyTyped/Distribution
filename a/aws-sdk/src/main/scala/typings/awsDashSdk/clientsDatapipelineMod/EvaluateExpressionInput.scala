package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateExpressionInput extends js.Object {
  /**
    * The expression to evaluate.
    */
  var expression: longString
  /**
    * The ID of the object.
    */
  var objectId: id
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}

object EvaluateExpressionInput {
  @scala.inline
  def apply(expression: longString, objectId: id, pipelineId: id): EvaluateExpressionInput = {
    val __obj = js.Dynamic.literal(expression = expression, objectId = objectId, pipelineId = pipelineId)
  
    __obj.asInstanceOf[EvaluateExpressionInput]
  }
}

