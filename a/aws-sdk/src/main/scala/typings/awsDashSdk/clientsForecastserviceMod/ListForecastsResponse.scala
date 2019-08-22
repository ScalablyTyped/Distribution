package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListForecastsResponse extends js.Object {
  /**
    * An array of objects that summarize each forecast's properties.
    */
  var Forecasts: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Forecasts] = js.undefined
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
}

object ListForecastsResponse {
  @scala.inline
  def apply(Forecasts: Forecasts = null, NextToken: NextToken = null): ListForecastsResponse = {
    val __obj = js.Dynamic.literal()
    if (Forecasts != null) __obj.updateDynamic("Forecasts")(Forecasts)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListForecastsResponse]
  }
}

