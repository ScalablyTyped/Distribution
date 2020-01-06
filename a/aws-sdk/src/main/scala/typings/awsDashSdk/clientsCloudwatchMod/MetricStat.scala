package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricStat extends js.Object {
  /**
    * The metric to return, including the metric name, namespace, and dimensions.
    */
  var Metric: typings.awsDashSdk.clientsCloudwatchMod.Metric = js.native
  /**
    * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a PutMetricData call that includes a StorageResolution of 1 second. If the StartTime parameter specifies a time stamp that is greater than 3 hours ago, you must specify the period as follows or no data points in that time range is returned:   Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).   Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).   Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).  
    */
  var Period: typings.awsDashSdk.clientsCloudwatchMod.Period = js.native
  /**
    * The statistic to return. It can include any CloudWatch statistic or extended statistic.
    */
  var Stat: typings.awsDashSdk.clientsCloudwatchMod.Stat = js.native
  /**
    * When you are using a Put operation, this defines what unit you want to use when storing the metric. In a Get operation, if you omit Unit then all data that was collected with any unit is returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you specify a unit, the operation returns only data data that was collected with that unit specified. If you specify a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform unit conversions.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object MetricStat {
  @scala.inline
  def apply(Metric: Metric, Period: Period, Stat: Stat, Unit: StandardUnit = null): MetricStat = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStat]
  }
}

