package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPredictorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
  /**
    * An array of objects that summarize each predictor's properties.
    */
  var Predictors: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Predictors] = js.undefined
}

object ListPredictorsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Predictors: Predictors = null): ListPredictorsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Predictors != null) __obj.updateDynamic("Predictors")(Predictors)
    __obj.asInstanceOf[ListPredictorsResponse]
  }
}

