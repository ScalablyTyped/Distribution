package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricStatisticsInput extends StObject {
  
  /**
    * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension. CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that were used when the metrics were created. For an example, see Dimension Combinations in the Amazon CloudWatch User Guide. For more information about specifying dimensions, see Publishing Metrics in the Amazon CloudWatch User Guide.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The time stamp that determines the last data point to return. The value specified is exclusive; results include data points up to the specified time stamp. In a raw HTTP query, the time stamp must be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
    */
  var EndTime: js.Date
  
  /**
    * The percentile statistics. Specify values between p0.0 and p100. When calling GetMetricStatistics, you must specify either Statistics or ExtendedStatistics, but not both. Percentile statistics are not available for metrics when any of the metric values are negative numbers.
    */
  var ExtendedStatistics: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ExtendedStatistics] = js.undefined
  
  /**
    * The name of the metric, with or without spaces.
    */
  var MetricName: typings.awsSdk.clientsCloudwatchMod.MetricName
  
  /**
    * The namespace of the metric, with or without spaces.
    */
  var Namespace: typings.awsSdk.clientsCloudwatchMod.Namespace
  
  /**
    * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a PutMetricData call that includes a StorageResolution of 1 second. If the StartTime parameter specifies a time stamp that is greater than 3 hours ago, you must specify the period as follows or no data points in that time range is returned:   Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).   Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).   Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).  
    */
  var Period: typings.awsSdk.clientsCloudwatchMod.Period
  
  /**
    * The time stamp that determines the first data point to return. Start times are evaluated relative to the time that CloudWatch receives the request. The value specified is inclusive; results include data points with the specified time stamp. In a raw HTTP query, the time stamp must be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z). CloudWatch rounds the specified time stamp as follows:   Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down to 12:32:00.   Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34 is rounded down to 12:30:00.   Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is rounded down to 12:00:00.   If you set Period to 5, 10, or 30, the start time of your request is rounded down to the nearest time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15. 
    */
  var StartTime: js.Date
  
  /**
    * The metric statistics, other than percentile. For percentile statistics, use ExtendedStatistics. When calling GetMetricStatistics, you must specify either Statistics or ExtendedStatistics, but not both.
    */
  var Statistics: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Statistics] = js.undefined
  
  /**
    * The unit for a given metric. If you omit Unit, all data that was collected with any unit is returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you specify a unit, the operation returns only data that was collected with that unit specified. If you specify a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform unit conversions.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}
object GetMetricStatisticsInput {
  
  inline def apply(EndTime: js.Date, MetricName: MetricName, Namespace: Namespace, Period: Period, StartTime: js.Date): GetMetricStatisticsInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricStatisticsInput]
  }
  
  extension [Self <: GetMetricStatisticsInput](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatistics(value: ExtendedStatistics): Self = StObject.set(x, "ExtendedStatistics", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatisticsUndefined: Self = StObject.set(x, "ExtendedStatistics", js.undefined)
    
    inline def setExtendedStatisticsVarargs(value: ExtendedStatistic*): Self = StObject.set(x, "ExtendedStatistics", js.Array(value*))
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: Statistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatisticsVarargs(value: Statistic*): Self = StObject.set(x, "Statistics", js.Array(value*))
    
    inline def setUnit(value: StandardUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
