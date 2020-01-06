package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccuracyMetricsResponse extends js.Object {
  /**
    * An array of results from evaluating the predictor.
    */
  var PredictorEvaluationResults: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.PredictorEvaluationResults] = js.native
}

object GetAccuracyMetricsResponse {
  @scala.inline
  def apply(PredictorEvaluationResults: PredictorEvaluationResults = null): GetAccuracyMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (PredictorEvaluationResults != null) __obj.updateDynamic("PredictorEvaluationResults")(PredictorEvaluationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccuracyMetricsResponse]
  }
}

