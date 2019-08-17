package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudwatchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ActionPrefix = String
  type ActionsEnabled = Boolean
  type AlarmArn = String
  type AlarmDescription = String
  type AlarmHistoryItems = js.Array[AlarmHistoryItem]
  type AlarmName = String
  type AlarmNamePrefix = String
  type AlarmNames = js.Array[AlarmName]
  type AmazonResourceName = String
  type AnomalyDetectorExcludedTimeRanges = js.Array[Range]
  type AnomalyDetectorMetricTimezone = String
  type AnomalyDetectors = js.Array[AnomalyDetector]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanOrEqualToThreshold
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanOrEqualToThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanLowerOrGreaterThanUpperThreshold
    - typings.awsDashSdk.awsDashSdkStrings.LessThanLowerThreshold
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanUpperThreshold
    - java.lang.String
  */
  type ComparisonOperator = _ComparisonOperator | String
  type Counts = js.Array[DatapointValue]
  type DashboardArn = String
  type DashboardBody = String
  type DashboardEntries = js.Array[DashboardEntry]
  type DashboardName = String
  type DashboardNamePrefix = String
  type DashboardNames = js.Array[DashboardName]
  type DashboardValidationMessages = js.Array[DashboardValidationMessage]
  type DataPath = String
  type DatapointValue = Double
  type DatapointValueMap = StringDictionary[DatapointValue]
  type DatapointValues = js.Array[DatapointValue]
  type Datapoints = js.Array[Datapoint]
  type DatapointsToAlarm = Double
  type DimensionFilters = js.Array[DimensionFilter]
  type DimensionName = String
  type DimensionValue = String
  type Dimensions = js.Array[Dimension]
  type EvaluateLowSampleCountPercentile = String
  type EvaluationPeriods = Double
  type ExtendedStatistic = String
  type ExtendedStatistics = js.Array[ExtendedStatistic]
  type GetMetricDataMaxDatapoints = Double
  type HistoryData = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationUpdate
    - typings.awsDashSdk.awsDashSdkStrings.StateUpdate
    - typings.awsDashSdk.awsDashSdkStrings.Action
    - java.lang.String
  */
  type HistoryItemType = _HistoryItemType | String
  type HistorySummary = String
  type LastModified = Date
  type MaxRecords = Double
  type MaxReturnedResultsCount = Double
  type Message = String
  type MessageDataCode = String
  type MessageDataValue = String
  type MetricAlarms = js.Array[MetricAlarm]
  type MetricData = js.Array[MetricDatum]
  type MetricDataQueries = js.Array[MetricDataQuery]
  type MetricDataResultMessages = js.Array[MessageData]
  type MetricDataResults = js.Array[MetricDataResult]
  type MetricExpression = String
  type MetricId = String
  type MetricLabel = String
  type MetricName = String
  type MetricWidget = String
  type MetricWidgetImage = Buffer | Uint8Array | Blob | String
  type Metrics = js.Array[Metric]
  type Namespace = String
  type NextToken = String
  type OutputFormat = String
  type Period = Double
  type ResourceList = js.Array[ResourceName]
  type ResourceName = String
  type ReturnData = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TimestampDescending
    - typings.awsDashSdk.awsDashSdkStrings.TimestampAscending
    - java.lang.String
  */
  type ScanBy = _ScanBy | String
  type Size = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Seconds
    - typings.awsDashSdk.awsDashSdkStrings.Microseconds
    - typings.awsDashSdk.awsDashSdkStrings.Milliseconds
    - typings.awsDashSdk.awsDashSdkStrings.Bytes
    - typings.awsDashSdk.awsDashSdkStrings.Kilobytes
    - typings.awsDashSdk.awsDashSdkStrings.Megabytes
    - typings.awsDashSdk.awsDashSdkStrings.Gigabytes
    - typings.awsDashSdk.awsDashSdkStrings.Terabytes
    - typings.awsDashSdk.awsDashSdkStrings.Bits
    - typings.awsDashSdk.awsDashSdkStrings.Kilobits
    - typings.awsDashSdk.awsDashSdkStrings.Megabits
    - typings.awsDashSdk.awsDashSdkStrings.Gigabits
    - typings.awsDashSdk.awsDashSdkStrings.Terabits
    - typings.awsDashSdk.awsDashSdkStrings.Percent
    - typings.awsDashSdk.awsDashSdkStrings.Count
    - typings.awsDashSdk.awsDashSdkStrings.`Bytes/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Kilobytes/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Megabytes/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Gigabytes/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Terabytes/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Bits/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Kilobits/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Megabits/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Gigabits/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Terabits/Second`
    - typings.awsDashSdk.awsDashSdkStrings.`Count/Second`
    - typings.awsDashSdk.awsDashSdkStrings.None
    - java.lang.String
  */
  type StandardUnit = _StandardUnit | String
  type Stat = String
  type StateReason = String
  type StateReasonData = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OK
    - typings.awsDashSdk.awsDashSdkStrings.ALARM
    - typings.awsDashSdk.awsDashSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type StateValue = _StateValue | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - typings.awsDashSdk.awsDashSdkStrings.Average
    - typings.awsDashSdk.awsDashSdkStrings.Sum
    - typings.awsDashSdk.awsDashSdkStrings.Minimum
    - typings.awsDashSdk.awsDashSdkStrings.Maximum
    - java.lang.String
  */
  type Statistic = _Statistic | String
  type Statistics = js.Array[Statistic]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Complete
    - typings.awsDashSdk.awsDashSdkStrings.InternalError
    - typings.awsDashSdk.awsDashSdkStrings.PartialData
    - java.lang.String
  */
  type StatusCode = _StatusCode | String
  type StorageResolution = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Threshold = Double
  type Timestamp = Date
  type Timestamps = js.Array[Timestamp]
  type TreatMissingData = String
  type Values = js.Array[DatapointValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-08-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
