package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prediction extends js.Object {
  var details: js.UndefOr[DetailsMap] = js.native
  /**
    * The prediction label for either a BINARY or MULTICLASS MLModel.
    */
  var predictedLabel: js.UndefOr[Label] = js.native
  var predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.native
  /**
    * The prediction value for REGRESSION MLModel.
    */
  var predictedValue: js.UndefOr[floatLabel] = js.native
}

object Prediction {
  @scala.inline
  def apply(
    details: DetailsMap = null,
    predictedLabel: Label = null,
    predictedScores: ScoreValuePerLabelMap = null,
    predictedValue: Int | Double = null
  ): Prediction = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (predictedLabel != null) __obj.updateDynamic("predictedLabel")(predictedLabel.asInstanceOf[js.Any])
    if (predictedScores != null) __obj.updateDynamic("predictedScores")(predictedScores.asInstanceOf[js.Any])
    if (predictedValue != null) __obj.updateDynamic("predictedValue")(predictedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prediction]
  }
}

