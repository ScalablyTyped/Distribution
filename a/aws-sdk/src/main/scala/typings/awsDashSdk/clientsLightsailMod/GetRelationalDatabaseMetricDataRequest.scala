package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMetricDataRequest extends js.Object {
  /**
    * The end of the time interval from which to get metric data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: IsoDate = js.native
  /**
    * The name of the metric data to return.
    */
  var metricName: RelationalDatabaseMetricName = js.native
  /**
    * The granularity, in seconds, of the returned data points.
    */
  var period: MetricPeriod = js.native
  /**
    * The name of your database from which to get metric data.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * The start of the time interval from which to get metric data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: IsoDate = js.native
  /**
    * The array of statistics for your metric data request.
    */
  var statistics: MetricStatisticList = js.native
  /**
    * The unit for the metric data request.
    */
  var unit: MetricUnit = js.native
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
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataRequest]
  }
}

