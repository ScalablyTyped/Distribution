package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListForecastsRequest extends js.Object {
  /**
    * An array of filters. For each filter, you provide a condition and a match statement. The condition is either IS or IS_NOT, which specifies whether to include or exclude, respectively, from the list, the predictors that match the statement. The match statement consists of a key and a value. In this release, Name is the only valid key, which filters on the ForecastName property.    Condition - IS or IS_NOT     Key - Name     Value - the value to match   For example, to list all forecasts named my_forecast, you would specify:  "Filters": [ { "Condition": "IS", "Key": "Name", "Value": "my_forecast" } ] 
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Filters] = js.undefined
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.MaxResults] = js.undefined
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
}

object ListForecastsRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListForecastsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListForecastsRequest]
  }
}

