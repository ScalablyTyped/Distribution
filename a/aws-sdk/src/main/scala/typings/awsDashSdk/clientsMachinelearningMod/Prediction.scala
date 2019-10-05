package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prediction extends js.Object {
  var details: js.UndefOr[DetailsMap] = js.undefined
  /**
    * The prediction label for either a BINARY or MULTICLASS MLModel.
    */
  var predictedLabel: js.UndefOr[Label] = js.undefined
  var predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.undefined
  /**
    * The prediction value for REGRESSION MLModel.
    */
  var predictedValue: js.UndefOr[floatLabel] = js.undefined
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
    if (details != null) __obj.updateDynamic("details")(details)
    if (predictedLabel != null) __obj.updateDynamic("predictedLabel")(predictedLabel)
    if (predictedScores != null) __obj.updateDynamic("predictedScores")(predictedScores)
    if (predictedValue != null) __obj.updateDynamic("predictedValue")(predictedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prediction]
  }
}

