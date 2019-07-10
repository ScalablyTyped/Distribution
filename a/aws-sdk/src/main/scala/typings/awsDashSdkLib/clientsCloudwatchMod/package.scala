package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudwatchMod {
  type ActionPrefix = java.lang.String
  type ActionsEnabled = scala.Boolean
  type AlarmArn = java.lang.String
  type AlarmDescription = java.lang.String
  type AlarmHistoryItems = js.Array[AlarmHistoryItem]
  type AlarmName = java.lang.String
  type AlarmNamePrefix = java.lang.String
  type AlarmNames = js.Array[AlarmName]
  type AmazonResourceName = java.lang.String
  type AnomalyDetectorExcludedTimeRanges = js.Array[Range]
  type AnomalyDetectorMetricTimezone = java.lang.String
  type AnomalyDetectors = js.Array[AnomalyDetector]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanOrEqualToThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanOrEqualToThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanLowerOrGreaterThanUpperThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanLowerThreshold
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanUpperThreshold
    - java.lang.String
  */
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
  type DatapointValueMap = org.scalablytyped.runtime.StringDictionary[DatapointValue]
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ConfigurationUpdate
    - awsDashSdkLib.awsDashSdkLibStrings.StateUpdate
    - awsDashSdkLib.awsDashSdkLibStrings.Action
    - java.lang.String
  */
  type HistoryItemType = _HistoryItemType | java.lang.String
  type HistorySummary = java.lang.String
  type LastModified = stdLib.Date
  type MaxRecords = scala.Double
  type MaxReturnedResultsCount = scala.Double
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
  type MetricWidgetImage = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type Metrics = js.Array[Metric]
  type Namespace = java.lang.String
  type NextToken = java.lang.String
  type OutputFormat = java.lang.String
  type Period = scala.Double
  type ResourceList = js.Array[ResourceName]
  type ResourceName = java.lang.String
  type ReturnData = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TimestampDescending
    - awsDashSdkLib.awsDashSdkLibStrings.TimestampAscending
    - java.lang.String
  */
  type ScanBy = _ScanBy | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Seconds
    - awsDashSdkLib.awsDashSdkLibStrings.Microseconds
    - awsDashSdkLib.awsDashSdkLibStrings.Milliseconds
    - awsDashSdkLib.awsDashSdkLibStrings.Bytes
    - awsDashSdkLib.awsDashSdkLibStrings.Kilobytes
    - awsDashSdkLib.awsDashSdkLibStrings.Megabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Gigabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Terabytes
    - awsDashSdkLib.awsDashSdkLibStrings.Bits
    - awsDashSdkLib.awsDashSdkLibStrings.Kilobits
    - awsDashSdkLib.awsDashSdkLibStrings.Megabits
    - awsDashSdkLib.awsDashSdkLibStrings.Gigabits
    - awsDashSdkLib.awsDashSdkLibStrings.Terabits
    - awsDashSdkLib.awsDashSdkLibStrings.Percent
    - awsDashSdkLib.awsDashSdkLibStrings.Count
    - awsDashSdkLib.awsDashSdkLibStrings.`Bytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Kilobytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Megabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Gigabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terabytes/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Bits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Kilobits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Megabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Gigabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terabits/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.`Count/Second`
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - java.lang.String
  */
  type StandardUnit = _StandardUnit | java.lang.String
  type Stat = java.lang.String
  type StateReason = java.lang.String
  type StateReasonData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OK
    - awsDashSdkLib.awsDashSdkLibStrings.ALARM
    - awsDashSdkLib.awsDashSdkLibStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type StateValue = _StateValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SampleCount
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.Sum
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - java.lang.String
  */
  type Statistic = _Statistic | java.lang.String
  type Statistics = js.Array[Statistic]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
    - awsDashSdkLib.awsDashSdkLibStrings.InternalError
    - awsDashSdkLib.awsDashSdkLibStrings.PartialData
    - java.lang.String
  */
  type StatusCode = _StatusCode | java.lang.String
  type StorageResolution = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Threshold = scala.Double
  type Timestamp = stdLib.Date
  type Timestamps = js.Array[Timestamp]
  type TreatMissingData = java.lang.String
  type Values = js.Array[DatapointValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2010-08-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
