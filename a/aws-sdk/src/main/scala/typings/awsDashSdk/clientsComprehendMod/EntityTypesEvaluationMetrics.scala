package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityTypesEvaluationMetrics extends js.Object {
  /**
    * A measure of how accurate the recognizer results are for for a specific entity type in the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.undefined
  /**
    * A measure of the usefulness of the recognizer results for a specific entity type in the test data. High precision means that the recognizer returned substantially more relevant results than irrelevant ones. 
    */
  var Precision: js.UndefOr[Double] = js.undefined
  /**
    * A measure of how complete the recognizer results are for a specific entity type in the test data. High recall means that the recognizer returned most of the relevant results.
    */
  var Recall: js.UndefOr[Double] = js.undefined
}

object EntityTypesEvaluationMetrics {
  @scala.inline
  def apply(
    F1Score: js.UndefOr[Double] = js.undefined,
    Precision: js.UndefOr[Double] = js.undefined,
    Recall: js.UndefOr[Double] = js.undefined
  ): EntityTypesEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(F1Score)) __obj.updateDynamic("F1Score")(F1Score)
    if (!js.isUndefined(Precision)) __obj.updateDynamic("Precision")(Precision)
    if (!js.isUndefined(Recall)) __obj.updateDynamic("Recall")(Recall)
    __obj.asInstanceOf[EntityTypesEvaluationMetrics]
  }
}

