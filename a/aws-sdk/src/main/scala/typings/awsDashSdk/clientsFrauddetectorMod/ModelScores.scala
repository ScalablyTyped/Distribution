package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelScores extends js.Object {
  /**
    * The model version.
    */
  var modelVersion: js.UndefOr[ModelVersion] = js.native
  /**
    * The model's fraud prediction scores.
    */
  var scores: js.UndefOr[ModelPredictionMap] = js.native
}

object ModelScores {
  @scala.inline
  def apply(modelVersion: ModelVersion = null, scores: ModelPredictionMap = null): ModelScores = {
    val __obj = js.Dynamic.literal()
    if (modelVersion != null) __obj.updateDynamic("modelVersion")(modelVersion.asInstanceOf[js.Any])
    if (scores != null) __obj.updateDynamic("scores")(scores.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelScores]
  }
}

