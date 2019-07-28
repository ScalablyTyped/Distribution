package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMetricDataResponse extends js.Object {
  /**
    * A list of HistoricalMetricResult objects, organized by Dimensions, which is the ID of the resource specified in the Filters used for the request. The metrics are combined with the metrics included in Collections, which is a list of HisotricalMetricData objects. If no Grouping is specified in the request, Collections includes summary data for the HistoricalMetrics.
    */
  var MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined
  /**
    * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must use the same request parameters as the request that generated the token. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
}

object GetMetricDataResponse {
  @scala.inline
  def apply(MetricResults: HistoricalMetricResults = null, NextToken: NextToken = null): GetMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    if (MetricResults != null) __obj.updateDynamic("MetricResults")(MetricResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetMetricDataResponse]
  }
}

