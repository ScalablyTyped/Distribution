package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketMetricDataRequest extends StObject {
  
  /**
    * The name of the bucket for which to get metric data.
    */
  var bucketName: BucketName
  
  /**
    * The timestamp indicating the latest data to be returned.
    */
  var endTime: js.Date
  
  /**
    * The metric for which you want to return information. Valid bucket metric names are listed below, along with the most useful statistics to include in your request, and the published unit value.  These bucket metrics are reported once per day.      BucketSizeBytes  - The amount of data in bytes stored in a bucket. This value is calculated by summing the size of all objects in the bucket (including object versions), including the size of all parts for all incomplete multipart uploads to the bucket. Statistics: The most useful statistic is Maximum. Unit: The published unit is Bytes.     NumberOfObjects  - The total number of objects stored in a bucket. This value is calculated by counting all objects in the bucket (including object versions) and the total number of parts for all incomplete multipart uploads to the bucket. Statistics: The most useful statistic is Average. Unit: The published unit is Count.  
    */
  var metricName: BucketMetricName
  
  /**
    * The granularity, in seconds, of the returned data points.  Bucket storage metrics are reported once per day. Therefore, you should specify a period of 86400 seconds, which is the number of seconds in a day. 
    */
  var period: MetricPeriod
  
  /**
    * The timestamp indicating the earliest data to be returned.
    */
  var startTime: js.Date
  
  /**
    * The statistic for the metric. The following statistics are available:    Minimum - The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum - The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum - The sum of all values submitted for the matching metric. You can use this statistic to determine the total volume of a metric.    Average - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount - The count, or number, of data points used for the statistical calculation.  
    */
  var statistics: MetricStatisticList
  
  /**
    * The unit for the metric data request. Valid units depend on the metric data being requested. For the valid units with each available metric, see the metricName parameter.
    */
  var unit: MetricUnit
}
object GetBucketMetricDataRequest {
  
  inline def apply(
    bucketName: BucketName,
    endTime: js.Date,
    metricName: BucketMetricName,
    period: MetricPeriod,
    startTime: js.Date,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetBucketMetricDataRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketMetricDataRequest]
  }
  
  extension [Self <: GetBucketMetricDataRequest](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: BucketMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: MetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: MetricStatisticList): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: MetricStatistic*): Self = StObject.set(x, "statistics", js.Array(value*))
    
    inline def setUnit(value: MetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
