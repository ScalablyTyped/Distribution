package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceMetricDataRequest extends js.Object {
  /**
    * The end time of the time period.
    */
  var endTime: timestamp
  /**
    * The name of the instance for which you want to get metrics data.
    */
  var instanceName: ResourceName
  /**
    * The metric name to get data about. 
    */
  var metricName: InstanceMetricName
  /**
    * The granularity, in seconds, of the returned data points.
    */
  var period: MetricPeriod
  /**
    * The start time of the time period.
    */
  var startTime: timestamp
  /**
    * The instance statistics. 
    */
  var statistics: MetricStatisticList
  /**
    * The unit. The list of valid values is below.
    */
  var unit: MetricUnit
}

object GetInstanceMetricDataRequest {
  @scala.inline
  def apply(
    endTime: timestamp,
    instanceName: ResourceName,
    metricName: InstanceMetricName,
    period: MetricPeriod,
    startTime: timestamp,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetInstanceMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, instanceName = instanceName, metricName = metricName.asInstanceOf[js.Any], period = period, startTime = startTime, statistics = statistics, unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceMetricDataRequest]
  }
}

