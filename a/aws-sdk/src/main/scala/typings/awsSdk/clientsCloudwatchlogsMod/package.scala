package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPolicy = String

type AmazonResourceName = String

type Arn = String

type Days = Double

type DefaultValue = Double

type Descending = Boolean

type DescribeLimit = Double

type DescribeQueriesMaxResults = Double

type DestinationArn = String

type DestinationName = String

type Destinations = js.Array[Destination]

type Dimensions = StringDictionary[DimensionsValue]

type DimensionsKey = String

type DimensionsValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Random_
  - typings.awsSdk.awsSdkStrings.ByLogStream
  - java.lang.String
*/
type Distribution = _Distribution | String

type EventId = String

type EventMessage = String

type EventNumber = Double

type EventsLimit = Double

type ExportDestinationBucket = String

type ExportDestinationPrefix = String

type ExportTaskId = String

type ExportTaskName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.PENDING_CANCEL
  - typings.awsSdk.awsSdkStrings.RUNNING
  - java.lang.String
*/
type ExportTaskStatusCode = _ExportTaskStatusCode | String

type ExportTaskStatusMessage = String

type ExportTasks = js.Array[ExportTask]

type ExtractedValues = StringDictionary[Value]

type Field = String

type FilterCount = Double

type FilterName = String

type FilterPattern = String

type FilteredLogEvents = js.Array[FilteredLogEvent]

type ForceUpdate = Boolean

type InputLogEvents = js.Array[InputLogEvent]

type InputLogStreamNames = js.Array[LogStreamName]

type Interleaved = Boolean

type KmsKeyId = String

type LogEventIndex = Double

type LogGroupFieldList = js.Array[LogGroupField]

type LogGroupName = String

type LogGroupNames = js.Array[LogGroupName]

type LogGroups = js.Array[LogGroup]

type LogRecord = StringDictionary[Value]

type LogRecordPointer = String

type LogStreamName = String

type LogStreamSearchedCompletely = Boolean

type LogStreams = js.Array[LogStream]

type MetricFilterMatches = js.Array[MetricFilterMatchRecord]

type MetricFilters = js.Array[MetricFilter]

type MetricName = String

type MetricNamespace = String

type MetricTransformations = js.Array[MetricTransformation]

type MetricValue = String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LogStreamName
  - typings.awsSdk.awsSdkStrings.LastEventTime
  - java.lang.String
*/
type OrderBy = _OrderBy | String

type OutputLogEvents = js.Array[OutputLogEvent]

type Percentage = Double

type PolicyDocument = String

type PolicyName = String

type QueryDefinitionList = js.Array[QueryDefinition]

type QueryDefinitionName = String

type QueryDefinitionString = String

type QueryId = String

type QueryInfoList = js.Array[QueryInfo]

type QueryListMaxResults = Double

type QueryResults = js.Array[ResultRows]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Scheduled_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Complete_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Timeout_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type QueryStatus = _QueryStatus | String

type QueryString = String

type ResourcePolicies = js.Array[ResourcePolicy]

type ResultRows = js.Array[ResultField]

type RoleArn = String

type SearchedLogStreams = js.Array[SearchedLogStream]

type SequenceToken = String

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

type StartFromHead = Boolean

type StatsValue = Double

type StoredBytes = Double

type SubscriptionFilters = js.Array[SubscriptionFilter]

type Success = Boolean

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[TagKey]

type TagValue = String

type Tags = StringDictionary[TagValue]

type TargetArn = String

type TestEventMessages = js.Array[EventMessage]

type Timestamp = Double

type Token = String

type Value = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-03-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
