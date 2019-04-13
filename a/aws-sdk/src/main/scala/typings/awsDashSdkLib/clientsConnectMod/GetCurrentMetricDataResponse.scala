package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCurrentMetricDataResponse extends js.Object {
  /**
    * The time at which CurrentMetricData was retrieved and cached for pagination.
    */
  var DataSnapshotTime: js.UndefOr[timestamp] = js.undefined
  /**
    * A list of CurrentMetricResult objects organized by Dimensions combining with CurrentMetricDataCollections.  Dimensions is the resourceId specified in the Filters of the request.   Collections is a list of CurrentMetricData objects with corresponding values to the CurrentMetrics specified in the request. If no Grouping is specified in the request, Collections is a summary for the CurrentMetric returned.
    */
  var MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined
  /**
    * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must use the same request parameters as the request that generated the token. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetCurrentMetricDataResponse {
  @scala.inline
  def apply(
    DataSnapshotTime: timestamp = null,
    MetricResults: CurrentMetricResults = null,
    NextToken: NextToken = null
  ): GetCurrentMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSnapshotTime != null) __obj.updateDynamic("DataSnapshotTime")(DataSnapshotTime)
    if (MetricResults != null) __obj.updateDynamic("MetricResults")(MetricResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetCurrentMetricDataResponse]
  }
}

