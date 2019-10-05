package typings.awsDashSdk.clientsComprehendMod

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
    Accuracy: Int | scala.Double = null,
    F1Score: Int | scala.Double = null,
    Precision: Int | scala.Double = null,
    Recall: Int | scala.Double = null
  ): ClassifierEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (Accuracy != null) __obj.updateDynamic("Accuracy")(Accuracy.asInstanceOf[js.Any])
    if (F1Score != null) __obj.updateDynamic("F1Score")(F1Score.asInstanceOf[js.Any])
    if (Precision != null) __obj.updateDynamic("Precision")(Precision.asInstanceOf[js.Any])
    if (Recall != null) __obj.updateDynamic("Recall")(Recall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierEvaluationMetrics]
  }
}

