package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEvaluationInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the Evaluation to delete.
    */
  var EvaluationId: EntityId
}

object DeleteEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId): DeleteEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId)
  
    __obj.asInstanceOf[DeleteEvaluationInput]
  }
}

