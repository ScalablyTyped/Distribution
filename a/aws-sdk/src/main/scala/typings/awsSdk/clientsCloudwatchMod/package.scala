package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.PT3H
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionPrefix = String

type ActionsEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WaitPeriod
  - typings.awsSdk.awsSdkStrings.ExtensionPeriod
  - typings.awsSdk.awsSdkStrings.Alarm_
  - java.lang.String
*/
type ActionsSuppressedBy = _ActionsSuppressedBy | String

type ActionsSuppressedReason = String

type AlarmArn = String

type AlarmDescription = String

type AlarmHistoryItems = js.Array[AlarmHistoryItem]

type AlarmName = String

type AlarmNamePrefix = String

type AlarmNames = js.Array[AlarmName]

type AlarmRule = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CompositeAlarm
  - typings.awsSdk.awsSdkStrings.MetricAlarm
  - java.lang.String
*/
type AlarmType = _AlarmType | String

type AlarmTypes = js.Array[AlarmType]

type AmazonResourceName = String

type AnomalyDetectorExcludedTimeRanges = js.Array[Range]

type AnomalyDetectorMetricStat = String

type AnomalyDetectorMetricTimezone = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_TRAINING
  - typings.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA
  - typings.awsSdk.awsSdkStrings.TRAINED
  - java.lang.String
*/
type AnomalyDetectorStateValue = _AnomalyDetectorStateValue | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE_METRIC
  - typings.awsSdk.awsSdkStrings.METRIC_MATH
  - java.lang.String
*/
type AnomalyDetectorType = _AnomalyDetectorType | String

type AnomalyDetectorTypes = js.Array[AnomalyDetectorType]

type AnomalyDetectors = js.Array[AnomalyDetector]

type BatchFailures = js.Array[PartialFailure]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualToThreshold
  - typings.awsSdk.awsSdkStrings.GreaterThanThreshold
  - typings.awsSdk.awsSdkStrings.LessThanThreshold
  - typings.awsSdk.awsSdkStrings.LessThanOrEqualToThreshold
  - typings.awsSdk.awsSdkStrings.LessThanLowerOrGreaterThanUpperThreshold
  - typings.awsSdk.awsSdkStrings.LessThanLowerThreshold
  - typings.awsSdk.awsSdkStrings.GreaterThanUpperThreshold
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type CompositeAlarms = js.Array[CompositeAlarm]

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

type ExceptionType = String

type ExtendedStatistic = String

type ExtendedStatistics = js.Array[ExtendedStatistic]

type FailureCode = String

type FailureDescription = String

type FailureResource = String

type GetMetricDataLabelTimezone = String

type GetMetricDataMaxDatapoints = Double

type HistoryData = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ConfigurationUpdate
  - typings.awsSdk.awsSdkStrings.StateUpdate
  - typings.awsSdk.awsSdkStrings.Action_
  - java.lang.String
*/
type HistoryItemType = _HistoryItemType | String

type HistorySummary = String

type InsightRuleAggregationStatistic = String

type InsightRuleContributorDatapoints = js.Array[InsightRuleContributorDatapoint]

type InsightRuleContributorKey = String

type InsightRuleContributorKeyLabel = String

type InsightRuleContributorKeyLabels = js.Array[InsightRuleContributorKeyLabel]

type InsightRuleContributorKeys = js.Array[InsightRuleContributorKey]

type InsightRuleContributors = js.Array[InsightRuleContributor]

type InsightRuleDefinition = String

type InsightRuleIsManaged = Boolean

type InsightRuleMaxResults = Double

type InsightRuleMetricDatapoints = js.Array[InsightRuleMetricDatapoint]

type InsightRuleMetricList = js.Array[InsightRuleMetricName]

type InsightRuleMetricName = String

type InsightRuleName = String

type InsightRuleNames = js.Array[InsightRuleName]

type InsightRuleOrderBy = String

type InsightRuleSchema = String

type InsightRuleState = String

type InsightRuleUnboundDouble = Double

type InsightRuleUnboundInteger = Double

type InsightRuleUnboundLong = Double

type InsightRules = js.Array[InsightRule]

type LastModified = js.Date

type ListMetricStreamsMaxResults = Double

type ManagedRuleDescriptions = js.Array[ManagedRuleDescription]

type ManagedRules = js.Array[ManagedRule]

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

type MetricStreamEntries = js.Array[MetricStreamEntry]

type MetricStreamFilters = js.Array[MetricStreamFilter]

type MetricStreamName = String

type MetricStreamNames = js.Array[MetricStreamName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.json__
  - typings.awsSdk.awsSdkStrings.opentelemetry0Dot7
  - java.lang.String
*/
type MetricStreamOutputFormat = _MetricStreamOutputFormat | String

type MetricStreamState = String

type MetricStreamStatistic = String

type MetricStreamStatisticsAdditionalStatistics = js.Array[MetricStreamStatistic]

type MetricStreamStatisticsConfigurations = js.Array[MetricStreamStatisticsConfiguration]

type MetricStreamStatisticsIncludeMetrics = js.Array[MetricStreamStatisticsMetric]

type MetricWidget = String

type MetricWidgetImage = Buffer | js.typedarray.Uint8Array | Blob | String

type Metrics = js.Array[Metric]

type Namespace = String

type NextToken = String

type OutputFormat = String

type Period = Double

type RecentlyActive = PT3H | String

type ResourceList = js.Array[ResourceName]

type ResourceName = String

type ReturnData = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TimestampDescending
  - typings.awsSdk.awsSdkStrings.TimestampAscending
  - java.lang.String
*/
type ScanBy = _ScanBy | String

type Size = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Seconds_
  - typings.awsSdk.awsSdkStrings.Microseconds_
  - typings.awsSdk.awsSdkStrings.Milliseconds_
  - typings.awsSdk.awsSdkStrings.Bytes_
  - typings.awsSdk.awsSdkStrings.Kilobytes
  - typings.awsSdk.awsSdkStrings.Megabytes
  - typings.awsSdk.awsSdkStrings.Gigabytes
  - typings.awsSdk.awsSdkStrings.Terabytes_
  - typings.awsSdk.awsSdkStrings.Bits_
  - typings.awsSdk.awsSdkStrings.Kilobits
  - typings.awsSdk.awsSdkStrings.Megabits
  - typings.awsSdk.awsSdkStrings.Gigabits
  - typings.awsSdk.awsSdkStrings.Terabits
  - typings.awsSdk.awsSdkStrings.Percent_
  - typings.awsSdk.awsSdkStrings.Count_
  - typings.awsSdk.awsSdkStrings.BytesSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typings.awsSdk.awsSdkStrings.BitsSlashSecond
  - typings.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typings.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typings.awsSdk.awsSdkStrings.CountSlashSecond
  - typings.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type StandardUnit = _StandardUnit | String

type Stat = String

type StateReason = String

type StateReasonData = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.ALARM
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type StateValue = _StateValue | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SampleCount
  - typings.awsSdk.awsSdkStrings.Average_
  - typings.awsSdk.awsSdkStrings.Sum_
  - typings.awsSdk.awsSdkStrings.Minimum_
  - typings.awsSdk.awsSdkStrings.Maximum_
  - java.lang.String
*/
type Statistic = _Statistic | String

type Statistics = js.Array[Statistic]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Complete_
  - typings.awsSdk.awsSdkStrings.InternalError
  - typings.awsSdk.awsSdkStrings.PartialData
  - java.lang.String
*/
type StatusCode = _StatusCode | String

type StorageResolution = Double

type SuppressorPeriod = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TemplateName = String

type Threshold = Double

type Timestamp = js.Date

type Timestamps = js.Array[js.Date]

type TreatMissingData = String

type Values = js.Array[DatapointValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2010-08-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
