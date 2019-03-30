package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatch
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudWatch: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ClientConfiguration = js.native
  /**
    * Deletes the specified alarms. In the event of an error, no alarms are deleted.
    */
  def deleteAlarms(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlarms(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified alarms. In the event of an error, no alarms are deleted.
    */
  def deleteAlarms(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteAlarmsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlarms(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteAlarmsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all dashboards that you specify. You may specify up to 100 dashboards to delete. If there is an error during this call, no dashboards are deleted.
    */
  def deleteDashboards(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDashboards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes all dashboards that you specify. You may specify up to 100 dashboards to delete. If there is an error during this call, no dashboards are deleted.
    */
  def deleteDashboards(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDashboards(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DeleteDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm name is not specified, the histories for all alarms are returned. CloudWatch retains the history of an alarm even if you delete the alarm.
    */
  def describeAlarmHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlarmHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm name is not specified, the histories for all alarms are returned. CloudWatch retains the history of an alarm even if you delete the alarm.
    */
  def describeAlarmHistory(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlarmHistory(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the specified alarms. If no alarms are specified, all alarms are returned. Alarms can be retrieved by using only a prefix for the alarm name, the alarm state, or a prefix for any action.
    */
  def describeAlarms(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlarms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the specified alarms. If no alarms are specified, all alarms are returned. Alarms can be retrieved by using only a prefix for the alarm name, the alarm state, or a prefix for any action.
    */
  def describeAlarms(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlarms(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
    */
  def describeAlarmsForMetric(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlarmsForMetric(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
    */
  def describeAlarmsForMetric(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlarmsForMetric(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsForMetricOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the actions for the specified alarms. When an alarm's actions are disabled, the alarm actions do not execute when the alarm state changes.
    */
  def disableAlarmActions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAlarmActions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the actions for the specified alarms. When an alarm's actions are disabled, the alarm actions do not execute when the alarm state changes.
    */
  def disableAlarmActions(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DisableAlarmActionsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAlarmActions(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DisableAlarmActionsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the actions for the specified alarms.
    */
  def enableAlarmActions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAlarmActions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the actions for the specified alarms.
    */
  def enableAlarmActions(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.EnableAlarmActionsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAlarmActions(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.EnableAlarmActionsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays the details of the dashboard that you specify. To copy an existing dashboard, use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard to create the copy.
    */
  def getDashboard(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDashboard(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the details of the dashboard that you specify. To copy an existing dashboard, use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard to create the copy.
    */
  def getDashboard(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDashboard(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can use the GetMetricData API to retrieve as many as 100 different metrics in a single request, with a total of as many as 100,800 datapoints. You can also optionally perform math expressions on the values of the returned statistics, to create new time series that represent new insights into your data. For example, using Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Calls to the GetMetricData API have a different pricing structure than calls to GetMetricStatistics. For more information about pricing, see Amazon CloudWatch Pricing. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
    */
  def getMetricData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can use the GetMetricData API to retrieve as many as 100 different metrics in a single request, with a total of as many as 100,800 datapoints. You can also optionally perform math expressions on the values of the returned statistics, to create new time series that represent new insights into your data. For example, using Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Calls to the GetMetricData API have a different pricing structure than calls to GetMetricStatistics. For more information about pricing, see Amazon CloudWatch Pricing. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
    */
  def getMetricData(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMetricData(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricDataOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets statistics for the specified metric. The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are not returned in chronological order. CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data points returned. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1.   The Min and the Max values of the statistic set are equal.   Percentile statistics are not available for metrics when any of the metric values are negative numbers. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour. CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016. For information about metrics and dimensions supported by AWS services, see the Amazon CloudWatch Metrics and Dimensions Reference in the Amazon CloudWatch User Guide.
    */
  def getMetricStatistics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMetricStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets statistics for the specified metric. The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are not returned in chronological order. CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data points returned. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1.   The Min and the Max values of the statistic set are equal.   Percentile statistics are not available for metrics when any of the metric values are negative numbers. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour. CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016. For information about metrics and dimensions supported by AWS services, see the Amazon CloudWatch Metrics and Dimensions Reference in the Amazon CloudWatch User Guide.
    */
  def getMetricStatistics(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMetricStatistics(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricStatisticsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can use the GetMetricWidgetImage API to retrieve a snapshot graph of one or more Amazon CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your own custom live dashboard. The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and vertical annotations. There is a limit of 20 transactions per second for this API. Each GetMetricWidgetImage action has the following limits:   As many as 100 metrics in the graph.   Up to 100 KB uncompressed payload.  
    */
  def getMetricWidgetImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMetricWidgetImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can use the GetMetricWidgetImage API to retrieve a snapshot graph of one or more Amazon CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your own custom live dashboard. The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and vertical annotations. There is a limit of 20 transactions per second for this API. Each GetMetricWidgetImage action has the following limits:   As many as 100 metrics in the graph.   Up to 100 KB uncompressed payload.  
    */
  def getMetricWidgetImage(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMetricWidgetImage(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.GetMetricWidgetImageOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the dashboards for your account. If you include DashboardNamePrefix, only those dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.   ListDashboards returns up to 1000 results on one page. If there are more than 1000 dashboards, you can call ListDashboards again and include the value you received for NextToken in the first call, to receive the next 1000 results.
    */
  def listDashboards(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDashboards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of the dashboards for your account. If you include DashboardNamePrefix, only those dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.   ListDashboards returns up to 1000 results on one page. If there are more than 1000 dashboards, you can call ListDashboards again and include the value you received for NextToken in the first call, to receive the next 1000 results.
    */
  def listDashboards(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDashboards(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListDashboardsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the specified metrics. You can use the returned metrics with GetMetricData or GetMetricStatistics to obtain statistical data. Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with subsequent calls. After you create a metric, allow up to fifteen minutes before the metric appears. Statistics about the metric, however, are available sooner using GetMetricData or GetMetricStatistics.
    */
  def listMetrics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMetrics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the specified metrics. You can use the returned metrics with GetMetricData or GetMetricStatistics to obtain statistical data. Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with subsequent calls. After you create a metric, allow up to fifteen minutes before the metric appears. Statistics about the metric, however, are available sooner using GetMetricData or GetMetricStatistics.
    */
  def listMetrics(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMetrics(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListMetricsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the tags associated with a CloudWatch resource. Alarms support tagging.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the tags associated with a CloudWatch resource. Alarms support tagging.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ListTagsForResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard, the entire contents are replaced with what you specify here. There is no limit to the number of dashboards in your account. All dashboards in your account are global, not region-specific. A simple way to create a dashboard using PutDashboard is to copy an existing dashboard. To copy an existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard. When you create a dashboard with PutDashboard, a good practice is to add a text widget at the top of the dashboard with a message that the dashboard was created by script and should not be changed in the console. This message could also point console users to the location of the DashboardBody script or the CloudFormation template used to create the dashboard.
    */
  def putDashboard(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putDashboard(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard, the entire contents are replaced with what you specify here. There is no limit to the number of dashboards in your account. All dashboards in your account are global, not region-specific. A simple way to create a dashboard using PutDashboard is to copy an existing dashboard. To copy an existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard. When you create a dashboard with PutDashboard, a good practice is to add a text widget at the top of the dashboard with a message that the dashboard was created by script and should not be changed in the console. This message could also point console users to the location of the DashboardBody script or the CloudFormation template used to create the dashboard.
    */
  def putDashboard(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putDashboard(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutDashboardOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or updates an alarm and associates it with the specified metric or metric math expression. When this operation creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then executed. When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous configuration of the alarm. If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:    iam:CreateServiceLinkedRole for all alarms with EC2 actions    ec2:DescribeInstanceStatus and ec2:DescribeInstances for all alarms on EC2 instance status metrics    ec2:StopInstances for alarms with stop actions    ec2:TerminateInstances for alarms with terminate actions   No specific permissions are needed for alarms with recover actions   If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm, but the stop or terminate actions are not performed. However, if you are later granted the required permissions, the alarm actions that you created earlier are performed. If you are using an IAM role (for example, an EC2 instance profile), you cannot stop or terminate the instance using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS notifications or Auto Scaling policies. If you are using temporary security credentials granted using AWS STS, you cannot stop or terminate an EC2 instance using alarm actions. The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API, CloudWatch creates the necessary service-linked role for you. The service-linked role is called AWSServiceRoleForCloudWatchEvents. For more information, see AWS service-linked role.
    */
  def putMetricAlarm(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMetricAlarm(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates an alarm and associates it with the specified metric or metric math expression. When this operation creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then executed. When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous configuration of the alarm. If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:    iam:CreateServiceLinkedRole for all alarms with EC2 actions    ec2:DescribeInstanceStatus and ec2:DescribeInstances for all alarms on EC2 instance status metrics    ec2:StopInstances for alarms with stop actions    ec2:TerminateInstances for alarms with terminate actions   No specific permissions are needed for alarms with recover actions   If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm, but the stop or terminate actions are not performed. However, if you are later granted the required permissions, the alarm actions that you created earlier are performed. If you are using an IAM role (for example, an EC2 instance profile), you cannot stop or terminate the instance using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS notifications or Auto Scaling policies. If you are using temporary security credentials granted using AWS STS, you cannot stop or terminate an EC2 instance using alarm actions. The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API, CloudWatch creates the necessary service-linked role for you. The service-linked role is called AWSServiceRoleForCloudWatchEvents. For more information, see AWS service-linked role.
    */
  def putMetricAlarm(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutMetricAlarmInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMetricAlarm(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutMetricAlarmInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric, it can take up to fifteen minutes for the metric to appear in calls to ListMetrics. You can publish either individual data points in the Value field, or arrays of values and the number of times each value occurred during the period by using the Values and Counts fields in the MetricDatum structure. Using the Values and Counts method enables you to publish up to 150 values per metric with one PutMetricData request, and supports retrieving percentile statistics on this data. Each PutMetricData request is limited to 40 KB in size for HTTP POST requests. You can send a payload compressed by gzip. Each request is also limited to no more than 20 different metrics. Although the Value parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported. You can use up to 10 dimensions per metric to further clarify what data the metric collects. Each dimension consists of a Name and Value pair. For more information about specifying dimensions, see Publishing Metrics in the Amazon CloudWatch User Guide. Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for GetMetricData or GetMetricStatistics from the time they are submitted. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1 and Min, Max, and Sum are all equal.   The Min and Max are equal, and Sum is equal to Min multiplied by SampleCount.  
    */
  def putMetricData(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMetricData(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric, it can take up to fifteen minutes for the metric to appear in calls to ListMetrics. You can publish either individual data points in the Value field, or arrays of values and the number of times each value occurred during the period by using the Values and Counts fields in the MetricDatum structure. Using the Values and Counts method enables you to publish up to 150 values per metric with one PutMetricData request, and supports retrieving percentile statistics on this data. Each PutMetricData request is limited to 40 KB in size for HTTP POST requests. You can send a payload compressed by gzip. Each request is also limited to no more than 20 different metrics. Although the Value parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported. You can use up to 10 dimensions per metric to further clarify what data the metric collects. Each dimension consists of a Name and Value pair. For more information about specifying dimensions, see Publishing Metrics in the Amazon CloudWatch User Guide. Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for GetMetricData or GetMetricStatistics from the time they are submitted. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1 and Min, Max, and Sum are all equal.   The Min and Max are equal, and Sum is equal to Min multiplied by SampleCount.  
    */
  def putMetricData(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutMetricDataInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMetricData(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.PutMetricDataInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Temporarily sets the state of an alarm for testing purposes. When the updated state differs from the previous value, the action configured for the appropriate state is invoked. For example, if your alarm is configured to send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm state to ALARM sends an SNS message. The alarm returns to its actual state (often within seconds). Because the alarm state change happens quickly, it is typically only visible in the alarm's History tab in the Amazon CloudWatch console or through DescribeAlarmHistory.
    */
  def setAlarmState(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setAlarmState(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Temporarily sets the state of an alarm for testing purposes. When the updated state differs from the previous value, the action configured for the appropriate state is invoked. For example, if your alarm is configured to send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm state to ALARM sends an SNS message. The alarm returns to its actual state (often within seconds). Because the alarm state change happens quickly, it is typically only visible in the alarm's History tab in the Amazon CloudWatch console or through DescribeAlarmHistory.
    */
  def setAlarmState(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.SetAlarmStateInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setAlarmState(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.SetAlarmStateInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch resource. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. In CloudWatch, alarms can be tagged. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch resource. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. In CloudWatch, alarms can be tagged. Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource.
    */
  def tagResource(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.TagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.UntagResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the alarmExists state by periodically calling the underlying CloudWatch.describeAlarmsoperation every 5 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_alarmExists(state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_alarmExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the alarmExists state by periodically calling the underlying CloudWatch.describeAlarmsoperation every 5 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_alarmExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists,
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_alarmExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists,
    params: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DescribeAlarmsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

