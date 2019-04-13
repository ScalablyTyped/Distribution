package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMetricDataInput extends js.Object {
  /**
    * The time stamp indicating the latest data to be returned. For better performance, specify StartTime and EndTime values that align with the value of the metric's Period and sync up with the beginning and end of an hour. For example, if the Period of a metric is 5 minutes, specifying 12:05 or 12:30 as EndTime can get a faster response from CloudWatch than setting 12:07 or 12:29 as the EndTime.
    */
  var EndTime: Timestamp
  /**
    * The maximum number of data points the request should return before paginating. If you omit this, the default of 100,800 is used.
    */
  var MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints] = js.undefined
  /**
    * The metric queries to be returned. A single GetMetricData call can include as many as 100 MetricDataQuery structures. Each of these structures can specify either a metric to retrieve, or a math expression to perform on retrieved data. 
    */
  var MetricDataQueries: awsDashSdkLib.clientsCloudwatchMod.MetricDataQueries
  /**
    * Include this value, if it was returned by the previous call, to get the next set of data points.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The order in which data points should be returned. TimestampDescending returns the newest data first and paginates when the MaxDatapoints limit is reached. TimestampAscending returns the oldest data first and paginates when the MaxDatapoints limit is reached.
    */
  var ScanBy: js.UndefOr[ScanBy] = js.undefined
  /**
    * The time stamp indicating the earliest data to be returned. For better performance, specify StartTime and EndTime values that align with the value of the metric's Period and sync up with the beginning and end of an hour. For example, if the Period of a metric is 5 minutes, specifying 12:05 or 12:30 as StartTime can get a faster response from CloudWatch than setting 12:07 or 12:29 as the StartTime.
    */
  var StartTime: Timestamp
}

object GetMetricDataInput {
  @scala.inline
  def apply(
    EndTime: Timestamp,
    MetricDataQueries: MetricDataQueries,
    StartTime: Timestamp,
    MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints] = js.undefined,
    NextToken: NextToken = null,
    ScanBy: ScanBy = null
  ): GetMetricDataInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, MetricDataQueries = MetricDataQueries, StartTime = StartTime)
    if (!js.isUndefined(MaxDatapoints)) __obj.updateDynamic("MaxDatapoints")(MaxDatapoints)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScanBy != null) __obj.updateDynamic("ScanBy")(ScanBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricDataInput]
  }
}

