package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseMetricDataRequest extends js.Object {
  /**
    * The end of the time interval from which to get metric data. Constraints:   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: IsoDate
  /**
    * The name of the metric data to return.
    */
  var metricName: RelationalDatabaseMetricName
  /**
    * The granularity, in seconds, of the returned data points.
    */
  var period: MetricPeriod
  /**
    * The name of your database from which to get metric data.
    */
  var relationalDatabaseName: ResourceName
  /**
    * The start of the time interval from which to get metric data. Constraints:   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: IsoDate
  /**
    * The array of statistics for your metric data request.
    */
  var statistics: MetricStatisticList
  /**
    * The unit for the metric data request.
    */
  var unit: MetricUnit
}

object GetRelationalDatabaseMetricDataRequest {
  @scala.inline
  def apply(
    endTime: IsoDate,
    metricName: RelationalDatabaseMetricName,
    period: MetricPeriod,
    relationalDatabaseName: ResourceName,
    startTime: IsoDate,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetRelationalDatabaseMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, metricName = metricName.asInstanceOf[js.Any], period = period, relationalDatabaseName = relationalDatabaseName, startTime = startTime, statistics = statistics, unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataRequest]
  }
}

