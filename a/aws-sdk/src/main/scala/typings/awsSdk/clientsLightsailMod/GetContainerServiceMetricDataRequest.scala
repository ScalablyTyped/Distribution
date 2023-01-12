package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServiceMetricDataRequest extends StObject {
  
  /**
    * The end time of the time period.
    */
  var endTime: js.Date
  
  /**
    * The metric for which you want to return information. Valid container service metric names are listed below, along with the most useful statistics to include in your request, and the published unit value.    CPUUtilization - The average percentage of compute units that are currently in use across all nodes of the container service. This metric identifies the processing power required to run containers on each node of the container service. Statistics: The most useful statistics are Maximum and Average. Unit: The published unit is Percent.    MemoryUtilization - The average percentage of available memory that is currently in use across all nodes of the container service. This metric identifies the memory required to run containers on each node of the container service. Statistics: The most useful statistics are Maximum and Average. Unit: The published unit is Percent.  
    */
  var metricName: ContainerServiceMetricName
  
  /**
    * The granularity, in seconds, of the returned data points. All container service metric data is available in 5-minute (300 seconds) granularity.
    */
  var period: MetricPeriod
  
  /**
    * The name of the container service for which to get metric data.
    */
  var serviceName: ContainerServiceName
  
  /**
    * The start time of the time period.
    */
  var startTime: js.Date
  
  /**
    * The statistic for the metric. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
    */
  var statistics: MetricStatisticList
}
object GetContainerServiceMetricDataRequest {
  
  inline def apply(
    endTime: js.Date,
    metricName: ContainerServiceMetricName,
    period: MetricPeriod,
    serviceName: ContainerServiceName,
    startTime: js.Date,
    statistics: MetricStatisticList
  ): GetContainerServiceMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerServiceMetricDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContainerServiceMetricDataRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: ContainerServiceMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: MetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: MetricStatisticList): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: MetricStatistic*): Self = StObject.set(x, "statistics", js.Array(value*))
  }
}
