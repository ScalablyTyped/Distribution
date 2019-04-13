package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierEvaluationMetrics extends js.Object {
  /**
    * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the test documents that were correctly recognized by the total number of labels in the test documents.
    */
  var Accuracy: js.UndefOr[Double] = js.undefined
  /**
    * A measure of how accurate the classifier results are for the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.undefined
  /**
    * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier returned substantially more relevant results than irrelevant ones.
    */
  var Precision: js.UndefOr[Double] = js.undefined
  /**
    * A measure of how complete the classifier results are for the test data. High recall means that the classifier returned most of the relevant results. 
    */
  var Recall: js.UndefOr[Double] = js.undefined
}

object ClassifierEvaluationMetrics {
  @scala.inline
  def apply(
    Accuracy: js.UndefOr[Double] = js.undefined,
    F1Score: js.UndefOr[Double] = js.undefined,
    Precision: js.UndefOr[Double] = js.undefined,
    Recall: js.UndefOr[Double] = js.undefined
  ): ClassifierEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Accuracy)) __obj.updateDynamic("Accuracy")(Accuracy)
    if (!js.isUndefined(F1Score)) __obj.updateDynamic("F1Score")(F1Score)
    if (!js.isUndefined(Precision)) __obj.updateDynamic("Precision")(Precision)
    if (!js.isUndefined(Recall)) __obj.updateDynamic("Recall")(Recall)
    __obj.asInstanceOf[ClassifierEvaluationMetrics]
  }
}

