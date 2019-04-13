package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvaluationInput extends js.Object {
  /**
    * The ID assigned to the Evaluation during creation.
    */
  var EvaluationId: EntityId
  /**
    * A new user-supplied name or description of the Evaluation that will replace the current content. 
    */
  var EvaluationName: EntityName
}

object UpdateEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId, EvaluationName: EntityName): UpdateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId, EvaluationName = EvaluationName)
  
    __obj.asInstanceOf[UpdateEvaluationInput]
  }
}

