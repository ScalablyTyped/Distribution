package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudwatchlogsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccessPolicy = String
  type Arn = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Days = Double
  type DefaultValue = Double
  type Descending = Boolean
  type DescribeLimit = Double
  type DescribeQueriesMaxResults = Double
  type DestinationArn = String
  type DestinationName = String
  type Destinations = js.Array[Destination]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Random
    - typings.awsDashSdk.awsDashSdkStrings.ByLogStream
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
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_CANCEL
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
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
    - typings.awsDashSdk.awsDashSdkStrings.LogStreamName
    - typings.awsDashSdk.awsDashSdkStrings.LastEventTime
    - java.lang.String
  */
  type OrderBy = _OrderBy | String
  type OutputLogEvents = js.Array[OutputLogEvent]
  type Percentage = Double
  type PolicyDocument = String
  type PolicyName = String
  type QueryId = String
  type QueryInfoList = js.Array[QueryInfo]
  type QueryResults = js.Array[ResultRows]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Scheduled_
    - typings.awsDashSdk.awsDashSdkStrings.Running_
    - typings.awsDashSdk.awsDashSdkStrings.Complete_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled_
    - java.lang.String
  */
  type QueryStatus = _QueryStatus | String
  type QueryString = String
  type ResourcePolicies = js.Array[ResourcePolicy]
  type ResultRows = js.Array[ResultField]
  type RoleArn = String
  type SearchedLogStreams = js.Array[SearchedLogStream]
  type SequenceToken = String
  type StartFromHead = Boolean
  type StatsValue = Double
  type StoredBytes = Double
  type SubscriptionFilters = js.Array[SubscriptionFilter]
  type Success = Boolean
  type TagKey = String
  type TagList = js.Array[TagKey]
  type TagValue = String
  type Tags = StringDictionary[TagValue]
  type TargetArn = String
  type TestEventMessages = js.Array[EventMessage]
  type Timestamp = Double
  type Token = String
  type Value = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-03-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
