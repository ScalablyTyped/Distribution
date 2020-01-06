package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLModelInput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
  /**
    * A user-supplied name or description of the MLModel.
    */
  var MLModelName: js.UndefOr[EntityName] = js.native
  /**
    * The ScoreThreshold used in binary classification MLModel that marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the ScoreThreshold receive a positive result from the MLModel, such as true. Output values less than the ScoreThreshold receive a negative response from the MLModel, such as false.
    */
  var ScoreThreshold: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.ScoreThreshold] = js.native
}

object UpdateMLModelInput {
  @scala.inline
  def apply(MLModelId: EntityId, MLModelName: EntityName = null, ScoreThreshold: Int | Double = null): UpdateMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    if (MLModelName != null) __obj.updateDynamic("MLModelName")(MLModelName.asInstanceOf[js.Any])
    if (ScoreThreshold != null) __obj.updateDynamic("ScoreThreshold")(ScoreThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLModelInput]
  }
}

