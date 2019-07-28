package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEvaluationOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
}

object DeleteEvaluationOutput {
  @scala.inline
  def apply(EvaluationId: EntityId = null): DeleteEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    if (EvaluationId != null) __obj.updateDynamic("EvaluationId")(EvaluationId)
    __obj.asInstanceOf[DeleteEvaluationOutput]
  }
}

