package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall performance of the model as a single value. A higher value indicates better precision and recall performance. A lower score indicates that precision, recall, or both are performing poorly. 
    */
  var F1Score: js.UndefOr[Float] = js.native
  /**
    * The S3 bucket that contains the training summary.
    */
  var Summary: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Summary] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(F1Score: Int | Double = null, Summary: Summary = null): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (F1Score != null) __obj.updateDynamic("F1Score")(F1Score.asInstanceOf[js.Any])
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
}

