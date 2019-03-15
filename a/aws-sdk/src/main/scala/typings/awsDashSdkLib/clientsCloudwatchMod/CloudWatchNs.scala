package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudwatch", "CloudWatch")
@js.native
object CloudWatchNs extends js.Object {
  trait AlarmHistoryItem extends js.Object {
    /**
      * The descriptive name for the alarm.
      */
    var AlarmName: js.UndefOr[AlarmName] = js.undefined
    /**
      * Data about the alarm, in JSON format.
      */
    var HistoryData: js.UndefOr[HistoryData] = js.undefined
    /**
      * The type of alarm history item.
      */
    var HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined
    /**
      * A summary of the alarm history, in text format.
      */
    var HistorySummary: js.UndefOr[HistorySummary] = js.undefined
    /**
      * The time stamp for the alarm history item.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DashboardEntry extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the dashboard.
      */
    var DashboardArn: js.UndefOr[DashboardArn] = js.undefined
    /**
      * The name of the dashboard.
      */
    var DashboardName: js.UndefOr[DashboardName] = js.undefined
    /**
      * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    /**
      * The size of the dashboard, in bytes.
      */
    var Size: js.UndefOr[Size] = js.undefined
  }
  
  trait DashboardValidationMessage extends js.Object {
    /**
      * The data path related to the message.
      */
    var DataPath: js.UndefOr[DataPath] = js.undefined
    /**
      * A message describing the error or warning.
      */
    var Message: js.UndefOr[Message] = js.undefined
  }
  
  trait Datapoint extends js.Object {
    /**
      * The average of the metric values that correspond to the data point.
      */
    var Average: js.UndefOr[DatapointValue] = js.undefined
    /**
      * The percentile statistic for the data point.
      */
    var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.undefined
    /**
      * The maximum metric value for the data point.
      */
    var Maximum: js.UndefOr[DatapointValue] = js.undefined
    /**
      * The minimum metric value for the data point.
      */
    var Minimum: js.UndefOr[DatapointValue] = js.undefined
    /**
      * The number of metric values that contributed to the aggregate value of this data point.
      */
    var SampleCount: js.UndefOr[DatapointValue] = js.undefined
    /**
      * The sum of the metric values for the data point.
      */
    var Sum: js.UndefOr[DatapointValue] = js.undefined
    /**
      * The time stamp used for the data point.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The standard unit for the data point.
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
  }
  
  trait DatapointValueMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DatapointValue]
  
  trait DeleteAlarmsInput extends js.Object {
    /**
      * The alarms to be deleted.
      */
    var AlarmNames: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.AlarmNames
  }
  
  trait DeleteDashboardsInput extends js.Object {
    /**
      * The dashboards to be deleted. This parameter is required.
      */
    var DashboardNames: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DashboardNames
  }
  
  trait DeleteDashboardsOutput extends js.Object
  
  trait DescribeAlarmHistoryInput extends js.Object {
    /**
      * The name of the alarm.
      */
    var AlarmName: js.UndefOr[AlarmName] = js.undefined
    /**
      * The ending date to retrieve alarm history.
      */
    var EndDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The type of alarm histories to retrieve.
      */
    var HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined
    /**
      * The maximum number of alarm history records to retrieve.
      */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
      * The token returned by a previous call to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The starting date to retrieve alarm history.
      */
    var StartDate: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait DescribeAlarmHistoryOutput extends js.Object {
    /**
      * The alarm histories, in JSON format.
      */
    var AlarmHistoryItems: js.UndefOr[AlarmHistoryItems] = js.undefined
    /**
      * The token that marks the start of the next batch of returned results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAlarmsForMetricInput extends js.Object {
    /**
      * The dimensions associated with the metric. If the metric has any associated dimensions, you must specify them in order for the call to succeed.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
    /**
      * The percentile statistic for the metric. Specify a value between p0.0 and p100.
      */
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined
    /**
      * The name of the metric.
      */
    var MetricName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.MetricName
    /**
      * The namespace of the metric.
      */
    var Namespace: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Namespace
    /**
      * The period, in seconds, over which the statistic is applied.
      */
    var Period: js.UndefOr[Period] = js.undefined
    /**
      * The statistic for the metric, other than percentiles. For percentile statistics, use ExtendedStatistics.
      */
    var Statistic: js.UndefOr[Statistic] = js.undefined
    /**
      * The unit for the metric.
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
  }
  
  trait DescribeAlarmsForMetricOutput extends js.Object {
    /**
      * The information for each alarm with the specified metric.
      */
    var MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined
  }
  
  trait DescribeAlarmsInput extends js.Object {
    /**
      * The action name prefix.
      */
    var ActionPrefix: js.UndefOr[ActionPrefix] = js.undefined
    /**
      * The alarm name prefix. If this parameter is specified, you cannot specify AlarmNames.
      */
    var AlarmNamePrefix: js.UndefOr[AlarmNamePrefix] = js.undefined
    /**
      * The names of the alarms.
      */
    var AlarmNames: js.UndefOr[AlarmNames] = js.undefined
    /**
      * The maximum number of alarm descriptions to retrieve.
      */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
      * The token returned by a previous call to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The state value to be used in matching alarms.
      */
    var StateValue: js.UndefOr[StateValue] = js.undefined
  }
  
  trait DescribeAlarmsOutput extends js.Object {
    /**
      * The information for the specified alarms.
      */
    var MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined
    /**
      * The token that marks the start of the next batch of returned results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait Dimension extends js.Object {
    /**
      * The name of the dimension.
      */
    var Name: DimensionName
    /**
      * The value representing the dimension measurement.
      */
    var Value: DimensionValue
  }
  
  trait DimensionFilter extends js.Object {
    /**
      * The dimension name to be matched.
      */
    var Name: DimensionName
    /**
      * The value of the dimension to be matched.
      */
    var Value: js.UndefOr[DimensionValue] = js.undefined
  }
  
  trait DisableAlarmActionsInput extends js.Object {
    /**
      * The names of the alarms.
      */
    var AlarmNames: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.AlarmNames
  }
  
  trait EnableAlarmActionsInput extends js.Object {
    /**
      * The names of the alarms.
      */
    var AlarmNames: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.AlarmNames
  }
  
  trait GetDashboardInput extends js.Object {
    /**
      * The name of the dashboard to be described.
      */
    var DashboardName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DashboardName
  }
  
  trait GetDashboardOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the dashboard.
      */
    var DashboardArn: js.UndefOr[DashboardArn] = js.undefined
    /**
      * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. For more information about the DashboardBody syntax, see CloudWatch-Dashboard-Body-Structure. 
      */
    var DashboardBody: js.UndefOr[DashboardBody] = js.undefined
    /**
      * The name of the dashboard.
      */
    var DashboardName: js.UndefOr[DashboardName] = js.undefined
  }
  
  trait GetMetricDataInput extends js.Object {
    /**
      * The time stamp indicating the latest data to be returned. For better performance, specify StartTime and EndTime values that align with the value of the metric's Period and sync up with the beginning and end of an hour. For example, if the Period of a metric is 5 minutes, specifying 12:05 or 12:30 as EndTime can get a faster response from CloudWatch then setting 12:07 or 12:29 as the EndTime.
      */
    var EndTime: Timestamp
    /**
      * The maximum number of data points the request should return before paginating. If you omit this, the default of 100,800 is used.
      */
    var MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints] = js.undefined
    /**
      * The metric queries to be returned. A single GetMetricData call can include as many as 100 MetricDataQuery structures. Each of these structures can specify either a metric to retrieve, or a math expression to perform on retrieved data. 
      */
    var MetricDataQueries: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.MetricDataQueries
    /**
      * Include this value, if it was returned by the previous call, to get the next set of data points.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The order in which data points should be returned. TimestampDescending returns the newest data first and paginates when the MaxDatapoints limit is reached. TimestampAscending returns the oldest data first and paginates when the MaxDatapoints limit is reached.
      */
    var ScanBy: js.UndefOr[ScanBy] = js.undefined
    /**
      * The time stamp indicating the earliest data to be returned. For better performance, specify StartTime and EndTime values that align with the value of the metric's Period and sync up with the beginning and end of an hour. For example, if the Period of a metric is 5 minutes, specifying 12:05 or 12:30 as StartTime can get a faster response from CloudWatch then setting 12:07 or 12:29 as the StartTime.
      */
    var StartTime: Timestamp
  }
  
  trait GetMetricDataOutput extends js.Object {
    /**
      * Contains a message about the operation or the results, if the operation results in such a message. Examples of messages that may be returned include Maximum number of allowed metrics exceeded and You are not authorized to search one or more metrics. If there is a message, as much of the operation as possible is still executed.
      */
    var Messages: js.UndefOr[MetricDataResultMessages] = js.undefined
    /**
      * The metrics that are returned, including the metric name, namespace, and dimensions.
      */
    var MetricDataResults: js.UndefOr[MetricDataResults] = js.undefined
    /**
      * A token that marks the next batch of returned results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetMetricStatisticsInput extends js.Object {
    /**
      * The dimensions. If the metric contains multiple dimensions, you must include a value for each dimension. CloudWatch treats each unique combination of dimensions as a separate metric. If a specific combination of dimensions was not published, you can't retrieve statistics for it. You must specify the same dimensions that were used when the metrics were created. For an example, see Dimension Combinations in the Amazon CloudWatch User Guide. For more information about specifying dimensions, see Publishing Metrics in the Amazon CloudWatch User Guide.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
    /**
      * The time stamp that determines the last data point to return. The value specified is exclusive; results include data points up to the specified time stamp. The time stamp must be in ISO 8601 UTC format (for example, 2016-10-10T23:00:00Z).
      */
    var EndTime: Timestamp
    /**
      * The percentile statistics. Specify values between p0.0 and p100. When calling GetMetricStatistics, you must specify either Statistics or ExtendedStatistics, but not both. Percentile statistics are not available for metrics when any of the metric values are negative numbers.
      */
    var ExtendedStatistics: js.UndefOr[ExtendedStatistics] = js.undefined
    /**
      * The name of the metric, with or without spaces.
      */
    var MetricName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.MetricName
    /**
      * The namespace of the metric, with or without spaces.
      */
    var Namespace: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Namespace
    /**
      * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a PutMetricData call that includes a StorageResolution of 1 second. If the StartTime parameter specifies a time stamp that is greater than 3 hours ago, you must specify the period as follows or no data points in that time range is returned:   Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).   Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).   Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).  
      */
    var Period: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Period
    /**
      * The time stamp that determines the first data point to return. Start times are evaluated relative to the time that CloudWatch receives the request. The value specified is inclusive; results include data points with the specified time stamp. The time stamp must be in ISO 8601 UTC format (for example, 2016-10-03T23:00:00Z). CloudWatch rounds the specified time stamp as follows:   Start time less than 15 days ago - Round down to the nearest whole minute. For example, 12:32:34 is rounded down to 12:32:00.   Start time between 15 and 63 days ago - Round down to the nearest 5-minute clock interval. For example, 12:32:34 is rounded down to 12:30:00.   Start time greater than 63 days ago - Round down to the nearest 1-hour clock interval. For example, 12:32:34 is rounded down to 12:00:00.   If you set Period to 5, 10, or 30, the start time of your request is rounded down to the nearest time that corresponds to even 5-, 10-, or 30-second divisions of a minute. For example, if you make a query at (HH:mm:ss) 01:05:23 for the previous 10-second period, the start time of your request is rounded down and you receive data from 01:05:10 to 01:05:20. If you make a query at 15:07:17 for the previous 5 minutes of data, using a period of 5 seconds, you receive data timestamped between 15:02:15 and 15:07:15. 
      */
    var StartTime: Timestamp
    /**
      * The metric statistics, other than percentile. For percentile statistics, use ExtendedStatistics. When calling GetMetricStatistics, you must specify either Statistics or ExtendedStatistics, but not both.
      */
    var Statistics: js.UndefOr[Statistics] = js.undefined
    /**
      * The unit for a given metric. Metrics may be reported in multiple units. Not supplying a unit results in all units being returned. If you specify only a unit that the metric does not report, the results of the call are null.
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
  }
  
  trait GetMetricStatisticsOutput extends js.Object {
    /**
      * The data points for the specified metric.
      */
    var Datapoints: js.UndefOr[Datapoints] = js.undefined
    /**
      * A label for the specified metric.
      */
    var Label: js.UndefOr[MetricLabel] = js.undefined
  }
  
  trait GetMetricWidgetImageInput extends js.Object {
    /**
      * A JSON string that defines the bitmap graph to be retrieved. The string includes the metrics to include in the graph, statistics, annotations, title, axis limits, and so on. You can include only one MetricWidget parameter in each GetMetricWidgetImage call. For more information about the syntax of MetricWidget see CloudWatch-Metric-Widget-Structure. If any metric on the graph could not load all the requested data points, an orange triangle with an exclamation point appears next to the graph legend.
      */
    var MetricWidget: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.MetricWidget
    /**
      * The format of the resulting image. Only PNG images are supported. The default is png. If you specify png, the API returns an HTTP response with the content-type set to text/xml. The image data is in a MetricWidgetImage field. For example:   &lt;GetMetricWidgetImageResponse xmlns="http://monitoring.amazonaws.com/doc/2010-08-01/"&gt;    &lt;GetMetricWidgetImageResult&gt;    &lt;MetricWidgetImage&gt;    iVBORw0KGgoAAAANSUhEUgAAAlgAAAGQEAYAAAAip...    &lt;/MetricWidgetImage&gt;    &lt;/GetMetricWidgetImageResult&gt;    &lt;ResponseMetadata&gt;    &lt;RequestId&gt;6f0d4192-4d42-11e8-82c1-f539a07e0e3b&lt;/RequestId&gt;    &lt;/ResponseMetadata&gt;   &lt;/GetMetricWidgetImageResponse&gt;  The image/png setting is intended only for custom HTTP requests. For most use cases, and all actions using an AWS SDK, you should use png. If you specify image/png, the HTTP response has a content-type set to image/png, and the body of the response is a PNG image. 
      */
    var OutputFormat: js.UndefOr[OutputFormat] = js.undefined
  }
  
  trait GetMetricWidgetImageOutput extends js.Object {
    /**
      * The image of the graph, in the output format specified.
      */
    var MetricWidgetImage: js.UndefOr[MetricWidgetImage] = js.undefined
  }
  
  trait ListDashboardsInput extends js.Object {
    /**
      * If you specify this parameter, only the dashboards with names starting with the specified string are listed. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, ".", "-", and "_". 
      */
    var DashboardNamePrefix: js.UndefOr[DashboardNamePrefix] = js.undefined
    /**
      * The token returned by a previous call to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDashboardsOutput extends js.Object {
    /**
      * The list of matching dashboards.
      */
    var DashboardEntries: js.UndefOr[DashboardEntries] = js.undefined
    /**
      * The token that marks the start of the next batch of returned results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListMetricsInput extends js.Object {
    /**
      * The dimensions to filter against.
      */
    var Dimensions: js.UndefOr[DimensionFilters] = js.undefined
    /**
      * The name of the metric to filter against.
      */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
      * The namespace to filter against.
      */
    var Namespace: js.UndefOr[Namespace] = js.undefined
    /**
      * The token returned by a previous call to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListMetricsOutput extends js.Object {
    /**
      * The metrics.
      */
    var Metrics: js.UndefOr[Metrics] = js.undefined
    /**
      * The token that marks the start of the next batch of returned results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait MessageData extends js.Object {
    /**
      * The error code or status code associated with the message.
      */
    var Code: js.UndefOr[MessageDataCode] = js.undefined
    /**
      * The message text.
      */
    var Value: js.UndefOr[MessageDataValue] = js.undefined
  }
  
  trait Metric extends js.Object {
    /**
      * The dimensions for the metric.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
    /**
      * The name of the metric. This is a required field.
      */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
      * The namespace of the metric.
      */
    var Namespace: js.UndefOr[Namespace] = js.undefined
  }
  
  trait MetricAlarm extends js.Object {
    /**
      * Indicates whether actions should be executed during any changes to the alarm state.
      */
    var ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined
    /**
      * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    var AlarmActions: js.UndefOr[ResourceList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the alarm.
      */
    var AlarmArn: js.UndefOr[AlarmArn] = js.undefined
    /**
      * The time stamp of the last update to the alarm configuration.
      */
    var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description of the alarm.
      */
    var AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined
    /**
      * The name of the alarm.
      */
    var AlarmName: js.UndefOr[AlarmName] = js.undefined
    /**
      * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand.
      */
    var ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
    /**
      * The number of datapoints that must be breaching to trigger the alarm.
      */
    var DatapointsToAlarm: js.UndefOr[DatapointsToAlarm] = js.undefined
    /**
      * The dimensions for the metric associated with the alarm.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
    /**
      * Used only for alarms based on percentiles. If ignore, the alarm state does not change during periods with too few data points to be statistically significant. If evaluate or this parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data points are available.
      */
    var EvaluateLowSampleCountPercentile: js.UndefOr[EvaluateLowSampleCountPercentile] = js.undefined
    /**
      * The number of periods over which data is compared to the specified threshold.
      */
    var EvaluationPeriods: js.UndefOr[EvaluationPeriods] = js.undefined
    /**
      * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
      */
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined
    /**
      * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
    /**
      * The name of the metric associated with the alarm.
      */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
      * 
      */
    var Metrics: js.UndefOr[MetricDataQueries] = js.undefined
    /**
      * The namespace of the metric associated with the alarm.
      */
    var Namespace: js.UndefOr[Namespace] = js.undefined
    /**
      * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
      */
    var OKActions: js.UndefOr[ResourceList] = js.undefined
    /**
      * The period, in seconds, over which the statistic is applied.
      */
    var Period: js.UndefOr[Period] = js.undefined
    /**
      * An explanation for the alarm state, in text format.
      */
    var StateReason: js.UndefOr[StateReason] = js.undefined
    /**
      * An explanation for the alarm state, in JSON format.
      */
    var StateReasonData: js.UndefOr[StateReasonData] = js.undefined
    /**
      * The time stamp of the last update to the alarm state.
      */
    var StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The state value for the alarm.
      */
    var StateValue: js.UndefOr[StateValue] = js.undefined
    /**
      * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use ExtendedStatistic.
      */
    var Statistic: js.UndefOr[Statistic] = js.undefined
    /**
      * The value to compare with the specified statistic.
      */
    var Threshold: js.UndefOr[Threshold] = js.undefined
    /**
      * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of missing is used.
      */
    var TreatMissingData: js.UndefOr[TreatMissingData] = js.undefined
    /**
      * The unit of the metric associated with the alarm.
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
  }
  
  trait MetricDataQuery extends js.Object {
    /**
      * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the Id of the other metrics to refer to those metrics, and can also use the Id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Within each MetricDataQuery object, you must specify either Expression or MetricStat but not both.
      */
    var Expression: js.UndefOr[MetricExpression] = js.undefined
    /**
      * A short name used to tie this object to the results in the response. This name must be unique within a single call to GetMetricData. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
      */
    var Id: MetricId
    /**
      * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label is shown. If Label is omitted, CloudWatch generates a default.
      */
    var Label: js.UndefOr[MetricLabel] = js.undefined
    /**
      * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data. Within one MetricDataQuery object, you must specify either Expression or MetricStat but not both.
      */
    var MetricStat: js.UndefOr[MetricStat] = js.undefined
    /**
      * When used in GetMetricData, this option indicates whether to return the timestamps and raw data values of this metric. If you are performing this call just to do math expressions and do not also need the raw data returned, you can specify False. If you omit this, the default of True is used. When used in PutMetricAlarm, specify True for the one expression result to use as the alarm. For all other metrics and expressions in the same PutMetricAlarm operation, specify ReturnData as False.
      */
    var ReturnData: js.UndefOr[ReturnData] = js.undefined
  }
  
  trait MetricDataResult extends js.Object {
    /**
      * The short name you specified to represent this metric.
      */
    var Id: js.UndefOr[MetricId] = js.undefined
    /**
      * The human-readable label associated with the data.
      */
    var Label: js.UndefOr[MetricLabel] = js.undefined
    /**
      * A list of messages with additional information about the data returned.
      */
    var Messages: js.UndefOr[MetricDataResultMessages] = js.undefined
    /**
      * The status of the returned data. Complete indicates that all data points in the requested time range were returned. PartialData means that an incomplete set of data points were returned. You can use the NextToken value that was returned and repeat your request to get more data points. NextToken is not returned if you are performing a math expression. InternalError indicates that an error occurred. Retry your request using NextToken, if present.
      */
    var StatusCode: js.UndefOr[StatusCode] = js.undefined
    /**
      * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches the number of values and the value for Timestamps[x] is Values[x].
      */
    var Timestamps: js.UndefOr[Timestamps] = js.undefined
    /**
      * The data points for the metric corresponding to Timestamps. The number of values always matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
      */
    var Values: js.UndefOr[DatapointValues] = js.undefined
  }
  
  trait MetricDatum extends js.Object {
    /**
      * Array of numbers that is used along with the Values array. Each number in the Count array is the number of times the corresponding value in the Values array occurred during the period.  If you omit the Counts array, the default of 1 is used as the value for each count. If you include a Counts array, it must include the same amount of values as the Values array.
      */
    var Counts: js.UndefOr[Counts] = js.undefined
    /**
      * The dimensions associated with the metric.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
    /**
      * The name of the metric.
      */
    var MetricName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.MetricName
    /**
      * The statistical values for the metric.
      */
    var StatisticValues: js.UndefOr[StatisticSet] = js.undefined
    /**
      * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution is available only for custom metrics. For more information about high-resolution metrics, see High-Resolution Metrics in the Amazon CloudWatch User Guide.  This field is optional, if you do not specify it the default of 60 is used.
      */
    var StorageResolution: js.UndefOr[StorageResolution] = js.undefined
    /**
      * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The unit of the metric.
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
    /**
      * The value for the metric. Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
      */
    var Value: js.UndefOr[DatapointValue] = js.undefined
    /**
      * Array of numbers representing the values for the metric during the period. Each unique value is listed just once in this array, and the corresponding number in the Counts array specifies the number of times that value occurred during the period. You can include up to 150 unique values in each PutMetricData action that specifies a Values array. Although the Values array accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
      */
    var Values: js.UndefOr[Values] = js.undefined
  }
  
  trait MetricStat extends js.Object {
    /**
      * The metric to return, including the metric name, namespace, and dimensions.
      */
    var Metric: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Metric
    /**
      * The period, in seconds, to use when retrieving the metric.
      */
    var Period: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Period
    /**
      * The statistic to return. It can include any CloudWatch statistic or extended statistic.
      */
    var Stat: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Stat
    /**
      * The unit to use for the returned data points.
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
  }
  
  trait PutDashboardInput extends js.Object {
    /**
      * The detailed information about the dashboard in JSON format, including the widgets to include and their location on the dashboard. This parameter is required. For more information about the syntax, see CloudWatch-Dashboard-Body-Structure.
      */
    var DashboardBody: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DashboardBody
    /**
      * The name of the dashboard. If a dashboard with this name already exists, this call modifies that dashboard, replacing its current contents. Otherwise, a new dashboard is created. The maximum length is 255, and valid characters are A-Z, a-z, 0-9, "-", and "_". This parameter is required.
      */
    var DashboardName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.DashboardName
  }
  
  trait PutDashboardOutput extends js.Object {
    /**
      * If the input for PutDashboard was correct and the dashboard was successfully created or modified, this result is empty. If this result includes only warning messages, then the input was valid enough for the dashboard to be created or modified, but some elements of the dashboard may not render. If this result includes error messages, the input was not valid and the operation failed.
      */
    var DashboardValidationMessages: js.UndefOr[DashboardValidationMessages] = js.undefined
  }
  
  trait PutMetricAlarmInput extends js.Object {
    /**
      * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
      */
    var ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined
    /**
      * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-idautoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
      */
    var AlarmActions: js.UndefOr[ResourceList] = js.undefined
    /**
      * The description for the alarm.
      */
    var AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined
    /**
      * The name for the alarm. This name must be unique within your AWS account.
      */
    var AlarmName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.AlarmName
    /**
      *  The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand.
      */
    var ComparisonOperator: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.ComparisonOperator
    /**
      * The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting an "M out of N" alarm. In that case, this value is the M. For more information, see Evaluating an Alarm in the Amazon CloudWatch User Guide.
      */
    var DatapointsToAlarm: js.UndefOr[DatapointsToAlarm] = js.undefined
    /**
      * The dimensions for the metric specified in MetricName.
      */
    var Dimensions: js.UndefOr[Dimensions] = js.undefined
    /**
      *  Used only for alarms based on percentiles. If you specify ignore, the alarm state does not change during periods with too few data points to be statistically significant. If you specify evaluate or omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are available. For more information, see Percentile-Based CloudWatch Alarms and Low Data Samples. Valid Values: evaluate | ignore 
      */
    var EvaluateLowSampleCountPercentile: js.UndefOr[EvaluateLowSampleCountPercentile] = js.undefined
    /**
      * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that number. If you are setting an "M out of N" alarm, this value is the N. An alarm's total current evaluation period can be no longer than one day, so this number multiplied by Period cannot be more than 86,400 seconds.
      */
    var EvaluationPeriods: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.EvaluationPeriods
    /**
      * The percentile statistic for the metric specified in MetricName. Specify a value between p0.0 and p100. When you call PutMetricAlarm and specify a MetricName, you must specify either Statistic or ExtendedStatistic, but not both.
      */
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined
    /**
      * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-idautoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): &gt;arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
      */
    var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
    /**
      * The name for the metric associated with the alarm. If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the Dimensions, Period, Namespace, Statistic, or ExtendedStatistic parameters. Instead, you specify all this information in the Metrics array.
      */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
      * An array of MetricDataQuery structures that enable you to create an alarm based on the result of a metric math expression. Each item in the Metrics array either retrieves a metric or performs a math expression. If you use the Metrics parameter, you cannot include the MetricName, Dimensions, Period, Namespace, Statistic, or ExtendedStatistic parameters of PutMetricAlarm in the same operation. Instead, you retrieve the metrics you are using in your math expression as part of the Metrics array.
      */
    var Metrics: js.UndefOr[MetricDataQueries] = js.undefined
    /**
      * The namespace for the metric associated specified in MetricName.
      */
    var Namespace: js.UndefOr[Namespace] = js.undefined
    /**
      * The actions to execute when this alarm transitions to an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:automate:region:ec2:stop | arn:aws:automate:region:ec2:terminate | arn:aws:automate:region:ec2:recover | arn:aws:automate:region:ec2:reboot | arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:autoscaling:region:account-id:scalingPolicy:policy-idautoScalingGroupName/group-friendly-name:policyName/policy-friendly-name   Valid Values (for use with IAM roles): arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Stop/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Terminate/1.0 | arn:aws:swf:region:account-id:action/actions/AWS_EC2.InstanceId.Reboot/1.0 
      */
    var OKActions: js.UndefOr[ResourceList] = js.undefined
    /**
      * The length, in seconds, used each time the metric specified in MetricName is evaluated. Valid values are 10, 30, and any multiple of 60. Be sure to specify 10 or 30 only for metrics that are stored by a PutMetricData call with a StorageResolution of 1. If you specify a period of 10 or 30 for a metric that does not have sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case, it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution alarm, which has a higher charge than other alarms. For more information about pricing, see Amazon CloudWatch Pricing. An alarm's total current evaluation period can be no longer than one day, so Period multiplied by EvaluationPeriods cannot be more than 86,400 seconds.
      */
    var Period: js.UndefOr[Period] = js.undefined
    /**
      * The statistic for the metric specified in MetricName, other than percentile. For percentile statistics, use ExtendedStatistic. When you call PutMetricAlarm and specify a MetricName, you must specify either Statistic or ExtendedStatistic, but not both.
      */
    var Statistic: js.UndefOr[Statistic] = js.undefined
    /**
      * The value against which the specified statistic is compared.
      */
    var Threshold: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Threshold
    /**
      *  Sets how this alarm is to handle missing data points. If TreatMissingData is omitted, the default behavior of missing is used. For more information, see Configuring How CloudWatch Alarms Treats Missing Data. Valid Values: breaching | notBreaching | ignore | missing 
      */
    var TreatMissingData: js.UndefOr[TreatMissingData] = js.undefined
    /**
      * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately. If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm can get stuck in the INSUFFICIENT DATA state. 
      */
    var Unit: js.UndefOr[StandardUnit] = js.undefined
  }
  
  trait PutMetricDataInput extends js.Object {
    /**
      * The data for the metric. The array can include no more than 20 metrics per call.
      */
    var MetricData: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.MetricData
    /**
      * The namespace for the metric data. You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for use by Amazon Web Services products.
      */
    var Namespace: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.Namespace
  }
  
  trait SetAlarmStateInput extends js.Object {
    /**
      * The name for the alarm. This name must be unique within the AWS account. The maximum length is 255 characters.
      */
    var AlarmName: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.AlarmName
    /**
      * The reason that this alarm is set to this specific state, in text format.
      */
    var StateReason: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.StateReason
    /**
      * The reason that this alarm is set to this specific state, in JSON format.
      */
    var StateReasonData: js.UndefOr[StateReasonData] = js.undefined
    /**
      * The value of the state.
      */
    var StateValue: awsDashSdkLib.clientsCloudwatchMod.CloudWatchNs.StateValue
  }
  
  trait StatisticSet extends js.Object {
    /**
      * The maximum value of the sample set.
      */
    var Maximum: DatapointValue
    /**
      * The minimum value of the sample set.
      */
    var Minimum: DatapointValue
    /**
      * The number of samples used for the statistic set.
      */
    var SampleCount: DatapointValue
    /**
      * The sum of values for the sample set.
      */
    var Sum: DatapointValue
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    def deleteAlarms(params: DeleteAlarmsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlarms(
      params: DeleteAlarmsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all dashboards that you specify. You may specify up to 100 dashboards to delete. If there is an error during this call, no dashboards are deleted.
      */
    def deleteDashboards(): awsDashSdkLib.libRequestMod.Request[DeleteDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDashboards(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDashboardsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all dashboards that you specify. You may specify up to 100 dashboards to delete. If there is an error during this call, no dashboards are deleted.
      */
    def deleteDashboards(params: DeleteDashboardsInput): awsDashSdkLib.libRequestMod.Request[DeleteDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDashboards(
      params: DeleteDashboardsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDashboardsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm name is not specified, the histories for all alarms are returned. CloudWatch retains the history of an alarm even if you delete the alarm.
      */
    def describeAlarmHistory(): awsDashSdkLib.libRequestMod.Request[DescribeAlarmHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlarmHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmHistoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm name is not specified, the histories for all alarms are returned. CloudWatch retains the history of an alarm even if you delete the alarm.
      */
    def describeAlarmHistory(params: DescribeAlarmHistoryInput): awsDashSdkLib.libRequestMod.Request[DescribeAlarmHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlarmHistory(
      params: DescribeAlarmHistoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmHistoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified alarms. If no alarms are specified, all alarms are returned. Alarms can be retrieved by using only a prefix for the alarm name, the alarm state, or a prefix for any action.
      */
    def describeAlarms(): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlarms(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the specified alarms. If no alarms are specified, all alarms are returned. Alarms can be retrieved by using only a prefix for the alarm name, the alarm state, or a prefix for any action.
      */
    def describeAlarms(params: DescribeAlarmsInput): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlarms(
      params: DescribeAlarmsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
      */
    def describeAlarmsForMetric(): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsForMetricOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlarmsForMetric(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmsForMetricOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsForMetricOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.
      */
    def describeAlarmsForMetric(params: DescribeAlarmsForMetricInput): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsForMetricOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlarmsForMetric(
      params: DescribeAlarmsForMetricInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmsForMetricOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsForMetricOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def disableAlarmActions(params: DisableAlarmActionsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableAlarmActions(
      params: DisableAlarmActionsInput,
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
    def enableAlarmActions(params: EnableAlarmActionsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableAlarmActions(
      params: EnableAlarmActionsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays the details of the dashboard that you specify. To copy an existing dashboard, use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard to create the copy.
      */
    def getDashboard(): awsDashSdkLib.libRequestMod.Request[GetDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDashboard(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDashboardOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays the details of the dashboard that you specify. To copy an existing dashboard, use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard to create the copy.
      */
    def getDashboard(params: GetDashboardInput): awsDashSdkLib.libRequestMod.Request[GetDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDashboard(
      params: GetDashboardInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDashboardOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You can use the GetMetricData API to retrieve as many as 100 different metrics in a single request, with a total of as many as 100,800 datapoints. You can also optionally perform math expressions on the values of the returned statistics, to create new time series that represent new insights into your data. For example, using Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Calls to the GetMetricData API have a different pricing structure than calls to GetMetricStatistics. For more information about pricing, see Amazon CloudWatch Pricing. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
      */
    def getMetricData(): awsDashSdkLib.libRequestMod.Request[GetMetricDataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricData(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricDataOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricDataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You can use the GetMetricData API to retrieve as many as 100 different metrics in a single request, with a total of as many as 100,800 datapoints. You can also optionally perform math expressions on the values of the returned statistics, to create new time series that represent new insights into your data. For example, using Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Calls to the GetMetricData API have a different pricing structure than calls to GetMetricStatistics. For more information about pricing, see Amazon CloudWatch Pricing. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.
      */
    def getMetricData(params: GetMetricDataInput): awsDashSdkLib.libRequestMod.Request[GetMetricDataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricData(
      params: GetMetricDataInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricDataOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricDataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets statistics for the specified metric. The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are not returned in chronological order. CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data points returned. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1.   The Min and the Max values of the statistic set are equal.   Percentile statistics are not available for metrics when any of the metric values are negative numbers. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour. CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016. For information about metrics and dimensions supported by AWS services, see the Amazon CloudWatch Metrics and Dimensions Reference in the Amazon CloudWatch User Guide.
      */
    def getMetricStatistics(): awsDashSdkLib.libRequestMod.Request[GetMetricStatisticsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricStatistics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricStatisticsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricStatisticsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets statistics for the specified metric. The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are not returned in chronological order. CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data points returned. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1.   The Min and the Max values of the statistic set are equal.   Percentile statistics are not available for metrics when any of the metric values are negative numbers. Amazon CloudWatch retains metric data as follows:   Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution metrics and are available only for custom metrics that have been defined with a StorageResolution of 1.   Data points with a period of 60 seconds (1-minute) are available for 15 days.   Data points with a period of 300 seconds (5-minute) are available for 63 days.   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).   Data points that are initially published with a shorter period are aggregated together for long-term storage. For example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour. CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016. For information about metrics and dimensions supported by AWS services, see the Amazon CloudWatch Metrics and Dimensions Reference in the Amazon CloudWatch User Guide.
      */
    def getMetricStatistics(params: GetMetricStatisticsInput): awsDashSdkLib.libRequestMod.Request[GetMetricStatisticsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricStatistics(
      params: GetMetricStatisticsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricStatisticsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricStatisticsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You can use the GetMetricWidgetImage API to retrieve a snapshot graph of one or more Amazon CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your own custom live dashboard. The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and vertical annotations. There is a limit of 20 transactions per second for this API. Each GetMetricWidgetImage action has the following limits:   As many as 100 metrics in the graph.   Up to 100 KB uncompressed payload.  
      */
    def getMetricWidgetImage(): awsDashSdkLib.libRequestMod.Request[GetMetricWidgetImageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricWidgetImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricWidgetImageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricWidgetImageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You can use the GetMetricWidgetImage API to retrieve a snapshot graph of one or more Amazon CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your own custom live dashboard. The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and vertical annotations. There is a limit of 20 transactions per second for this API. Each GetMetricWidgetImage action has the following limits:   As many as 100 metrics in the graph.   Up to 100 KB uncompressed payload.  
      */
    def getMetricWidgetImage(params: GetMetricWidgetImageInput): awsDashSdkLib.libRequestMod.Request[GetMetricWidgetImageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMetricWidgetImage(
      params: GetMetricWidgetImageInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMetricWidgetImageOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMetricWidgetImageOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the dashboards for your account. If you include DashboardNamePrefix, only those dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.   ListDashboards returns up to 1000 results on one page. If there are more than 1000 dashboards, you can call ListDashboards again and include the value you received for NextToken in the first call, to receive the next 1000 results.
      */
    def listDashboards(): awsDashSdkLib.libRequestMod.Request[ListDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDashboards(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDashboardsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the dashboards for your account. If you include DashboardNamePrefix, only those dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.   ListDashboards returns up to 1000 results on one page. If there are more than 1000 dashboards, you can call ListDashboards again and include the value you received for NextToken in the first call, to receive the next 1000 results.
      */
    def listDashboards(params: ListDashboardsInput): awsDashSdkLib.libRequestMod.Request[ListDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDashboards(
      params: ListDashboardsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDashboardsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDashboardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the specified metrics. You can use the returned metrics with GetMetricData or GetMetricStatistics to obtain statistical data. Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with subsequent calls. After you create a metric, allow up to fifteen minutes before the metric appears. Statistics about the metric, however, are available sooner using GetMetricData or GetMetricStatistics.
      */
    def listMetrics(): awsDashSdkLib.libRequestMod.Request[ListMetricsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMetrics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMetricsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMetricsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the specified metrics. You can use the returned metrics with GetMetricData or GetMetricStatistics to obtain statistical data. Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with subsequent calls. After you create a metric, allow up to fifteen minutes before the metric appears. Statistics about the metric, however, are available sooner using GetMetricData or GetMetricStatistics.
      */
    def listMetrics(params: ListMetricsInput): awsDashSdkLib.libRequestMod.Request[ListMetricsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMetrics(
      params: ListMetricsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMetricsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMetricsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard, the entire contents are replaced with what you specify here. There is no limit to the number of dashboards in your account. All dashboards in your account are global, not region-specific. A simple way to create a dashboard using PutDashboard is to copy an existing dashboard. To copy an existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard. When you create a dashboard with PutDashboard, a good practice is to add a text widget at the top of the dashboard with a message that the dashboard was created by script and should not be changed in the console. This message could also point console users to the location of the DashboardBody script or the CloudFormation template used to create the dashboard.
      */
    def putDashboard(): awsDashSdkLib.libRequestMod.Request[PutDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDashboard(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDashboardOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard, the entire contents are replaced with what you specify here. There is no limit to the number of dashboards in your account. All dashboards in your account are global, not region-specific. A simple way to create a dashboard using PutDashboard is to copy an existing dashboard. To copy an existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use GetDashboard, and then use the data returned within DashboardBody as the template for the new dashboard when you call PutDashboard. When you create a dashboard with PutDashboard, a good practice is to add a text widget at the top of the dashboard with a message that the dashboard was created by script and should not be changed in the console. This message could also point console users to the location of the DashboardBody script or the CloudFormation template used to create the dashboard.
      */
    def putDashboard(params: PutDashboardInput): awsDashSdkLib.libRequestMod.Request[PutDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDashboard(
      params: PutDashboardInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDashboardOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDashboardOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an alarm and associates it with the specified metric or metric math expression. When this operation creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then executed. When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous configuration of the alarm. If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:    iam:CreateServiceLinkedRole for all alarms with EC2 actions    ec2:DescribeInstanceStatus and ec2:DescribeInstances for all alarms on EC2 instance status metrics    ec2:StopInstances for alarms with stop actions    ec2:TerminateInstances for alarms with terminate actions    ec2:DescribeInstanceRecoveryAttribute and ec2:RecoverInstances for alarms with recover actions   If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm, but the stop or terminate actions are not performed. However, if you are later granted the required permissions, the alarm actions that you created earlier are performed. If you are using an IAM role (for example, an EC2 instance profile), you cannot stop or terminate the instance using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS notifications or Auto Scaling policies. If you are using temporary security credentials granted using AWS STS, you cannot stop or terminate an EC2 instance using alarm actions. The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API, CloudWatch creates the necessary service-linked role for you. The service-linked role is called AWSServiceRoleForCloudWatchEvents. For more information, see AWS service-linked role.
      */
    def putMetricAlarm(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putMetricAlarm(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an alarm and associates it with the specified metric or metric math expression. When this operation creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then executed. When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous configuration of the alarm. If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:    iam:CreateServiceLinkedRole for all alarms with EC2 actions    ec2:DescribeInstanceStatus and ec2:DescribeInstances for all alarms on EC2 instance status metrics    ec2:StopInstances for alarms with stop actions    ec2:TerminateInstances for alarms with terminate actions    ec2:DescribeInstanceRecoveryAttribute and ec2:RecoverInstances for alarms with recover actions   If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm, but the stop or terminate actions are not performed. However, if you are later granted the required permissions, the alarm actions that you created earlier are performed. If you are using an IAM role (for example, an EC2 instance profile), you cannot stop or terminate the instance using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS notifications or Auto Scaling policies. If you are using temporary security credentials granted using AWS STS, you cannot stop or terminate an EC2 instance using alarm actions. The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API, CloudWatch creates the necessary service-linked role for you. The service-linked role is called AWSServiceRoleForCloudWatchEvents. For more information, see AWS service-linked role.
      */
    def putMetricAlarm(params: PutMetricAlarmInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putMetricAlarm(
      params: PutMetricAlarmInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric, it can take up to fifteen minutes for the metric to appear in calls to ListMetrics. You can publish either individual data points in the Value field, or arrays of values and the number of times each value occurred during the period by using the Values and Counts fields in the MetricDatum structure. Using the Values and Counts method enables you to publish up to 150 values per metric with one PutMetricData request, and supports retrieving percentile statistics on this data. Each PutMetricData request is limited to 40 KB in size for HTTP POST requests. You can send a payload compressed by gzip. Each request is also limited to no more than 20 different metrics. Although the Value parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported. You can use up to 10 dimensions per metric to further clarify what data the metric collects. For more information about specifying dimensions, see Publishing Metrics in the Amazon CloudWatch User Guide. Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for GetMetricData or GetMetricStatistics from the time they are submitted. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1 and Min, Max, and Sum are all equal.   The Min and Max are equal, and Sum is equal to Min multiplied by SampleCount.  
      */
    def putMetricData(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putMetricData(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric, it can take up to fifteen minutes for the metric to appear in calls to ListMetrics. You can publish either individual data points in the Value field, or arrays of values and the number of times each value occurred during the period by using the Values and Counts fields in the MetricDatum structure. Using the Values and Counts method enables you to publish up to 150 values per metric with one PutMetricData request, and supports retrieving percentile statistics on this data. Each PutMetricData request is limited to 40 KB in size for HTTP POST requests. You can send a payload compressed by gzip. Each request is also limited to no more than 20 different metrics. Although the Value parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported. You can use up to 10 dimensions per metric to further clarify what data the metric collects. For more information about specifying dimensions, see Publishing Metrics in the Amazon CloudWatch User Guide. Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for GetMetricData or GetMetricStatistics from the time they are submitted. CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:   The SampleCount value of the statistic set is 1 and Min, Max, and Sum are all equal.   The Min and Max are equal, and Sum is equal to Min multiplied by SampleCount.  
      */
    def putMetricData(params: PutMetricDataInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putMetricData(
      params: PutMetricDataInput,
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
    def setAlarmState(params: SetAlarmStateInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setAlarmState(
      params: SetAlarmStateInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the alarmExists state by periodically calling the underlying CloudWatch.describeAlarmsoperation every 5 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_alarmExists(state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_alarmExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the alarmExists state by periodically calling the underlying CloudWatch.describeAlarmsoperation every 5 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_alarmExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists,
      params: DescribeAlarmsInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_alarmExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.alarmExists,
      params: DescribeAlarmsInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAlarmsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAlarmsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _ComparisonOperator extends js.Object
  
  trait _HistoryItemType extends js.Object
  
  trait _ScanBy extends js.Object
  
  trait _StandardUnit extends js.Object
  
  trait _StateValue extends js.Object
  
  trait _Statistic extends js.Object
  
  trait _StatusCode extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ActionPrefix = java.lang.String
  type ActionsEnabled = scala.Boolean
  type AlarmArn = java.lang.String
  type AlarmDescription = java.lang.String
  type AlarmHistoryItems = js.Array[AlarmHistoryItem]
  type AlarmName = java.lang.String
  type AlarmNamePrefix = java.lang.String
  type AlarmNames = js.Array[AlarmName]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = _ComparisonOperator | java.lang.String
  type Counts = js.Array[DatapointValue]
  type DashboardArn = java.lang.String
  type DashboardBody = java.lang.String
  type DashboardEntries = js.Array[DashboardEntry]
  type DashboardName = java.lang.String
  type DashboardNamePrefix = java.lang.String
  type DashboardNames = js.Array[DashboardName]
  type DashboardValidationMessages = js.Array[DashboardValidationMessage]
  type DataPath = java.lang.String
  type DatapointValue = scala.Double
  type DatapointValues = js.Array[DatapointValue]
  type Datapoints = js.Array[Datapoint]
  type DatapointsToAlarm = scala.Double
  type DimensionFilters = js.Array[DimensionFilter]
  type DimensionName = java.lang.String
  type DimensionValue = java.lang.String
  type Dimensions = js.Array[Dimension]
  type EvaluateLowSampleCountPercentile = java.lang.String
  type EvaluationPeriods = scala.Double
  type ExtendedStatistic = java.lang.String
  type ExtendedStatistics = js.Array[ExtendedStatistic]
  type GetMetricDataMaxDatapoints = scala.Double
  type HistoryData = java.lang.String
  type HistoryItemType = _HistoryItemType | java.lang.String
  type HistorySummary = java.lang.String
  type LastModified = stdLib.Date
  type MaxRecords = scala.Double
  type Message = java.lang.String
  type MessageDataCode = java.lang.String
  type MessageDataValue = java.lang.String
  type MetricAlarms = js.Array[MetricAlarm]
  type MetricData = js.Array[MetricDatum]
  type MetricDataQueries = js.Array[MetricDataQuery]
  type MetricDataResultMessages = js.Array[MessageData]
  type MetricDataResults = js.Array[MetricDataResult]
  type MetricExpression = java.lang.String
  type MetricId = java.lang.String
  type MetricLabel = java.lang.String
  type MetricName = java.lang.String
  type MetricWidget = java.lang.String
  type MetricWidgetImage = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsCloudwatchMod.Blob | java.lang.String
  type Metrics = js.Array[Metric]
  type Namespace = java.lang.String
  type NextToken = java.lang.String
  type OutputFormat = java.lang.String
  type Period = scala.Double
  type ResourceList = js.Array[ResourceName]
  type ResourceName = java.lang.String
  type ReturnData = scala.Boolean
  type ScanBy = _ScanBy | java.lang.String
  type Size = scala.Double
  type StandardUnit = _StandardUnit | java.lang.String
  type Stat = java.lang.String
  type StateReason = java.lang.String
  type StateReasonData = java.lang.String
  type StateValue = _StateValue | java.lang.String
  type Statistic = _Statistic | java.lang.String
  type Statistics = js.Array[Statistic]
  type StatusCode = _StatusCode | java.lang.String
  type StorageResolution = scala.Double
  type Threshold = scala.Double
  type Timestamp = stdLib.Date
  type Timestamps = js.Array[Timestamp]
  type TreatMissingData = java.lang.String
  type Values = js.Array[DatapointValue]
  type apiVersion = _apiVersion | java.lang.String
}

