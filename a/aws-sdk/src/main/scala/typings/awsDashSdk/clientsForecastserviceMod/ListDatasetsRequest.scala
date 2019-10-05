package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetsRequest extends js.Object {
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.MaxResults] = js.undefined
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.NextToken] = js.undefined
}

object ListDatasetsRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDatasetsRequest]
  }
}

