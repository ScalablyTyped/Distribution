package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTimeSeriesServiceStatisticsResult extends js.Object {
  /**
    * A flag indicating whether or not a group's filter expression has been consistent, or if a returned aggregation may show statistics from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The collection of statistics.
    */
  var TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList] = js.undefined
}

object GetTimeSeriesServiceStatisticsResult {
  @scala.inline
  def apply(
    ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined,
    NextToken: String = null,
    TimeSeriesServiceStatistics: TimeSeriesServiceStatisticsList = null
  ): GetTimeSeriesServiceStatisticsResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ContainsOldGroupVersions)) __obj.updateDynamic("ContainsOldGroupVersions")(ContainsOldGroupVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TimeSeriesServiceStatistics != null) __obj.updateDynamic("TimeSeriesServiceStatistics")(TimeSeriesServiceStatistics)
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsResult]
  }
}

