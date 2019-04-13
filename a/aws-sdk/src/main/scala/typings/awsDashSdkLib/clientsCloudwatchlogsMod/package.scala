package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudwatchlogsMod {
  type AccessPolicy = java.lang.String
  type Arn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Days = scala.Double
  type DefaultValue = scala.Double
  type Descending = scala.Boolean
  type DescribeLimit = scala.Double
  type DescribeQueriesMaxResults = scala.Double
  type DestinationArn = java.lang.String
  type DestinationName = java.lang.String
  type Destinations = js.Array[Destination]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Random
    - awsDashSdkLib.awsDashSdkLibStrings.ByLogStream
    - java.lang.String
  */
  type Distribution = _Distribution | java.lang.String
  type EventId = java.lang.String
  type EventMessage = java.lang.String
  type EventNumber = scala.Double
  type EventsLimit = scala.Double
  type ExportDestinationBucket = java.lang.String
  type ExportDestinationPrefix = java.lang.String
  type ExportTaskId = java.lang.String
  type ExportTaskName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELLED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_CANCEL
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - java.lang.String
  */
  type ExportTaskStatusCode = _ExportTaskStatusCode | java.lang.String
  type ExportTaskStatusMessage = java.lang.String
  type ExportTasks = js.Array[ExportTask]
  type ExtractedValues = org.scalablytyped.runtime.StringDictionary[Value]
  type Field = java.lang.String
  type FilterCount = scala.Double
  type FilterName = java.lang.String
  type FilterPattern = java.lang.String
  type FilteredLogEvents = js.Array[FilteredLogEvent]
  type InputLogEvents = js.Array[InputLogEvent]
  type InputLogStreamNames = js.Array[LogStreamName]
  type Interleaved = scala.Boolean
  type KmsKeyId = java.lang.String
  type LogEventIndex = scala.Double
  type LogGroupFieldList = js.Array[LogGroupField]
  type LogGroupName = java.lang.String
  type LogGroups = js.Array[LogGroup]
  type LogRecord = org.scalablytyped.runtime.StringDictionary[Value]
  type LogRecordPointer = java.lang.String
  type LogStreamName = java.lang.String
  type LogStreamSearchedCompletely = scala.Boolean
  type LogStreams = js.Array[LogStream]
  type MetricFilterMatches = js.Array[MetricFilterMatchRecord]
  type MetricFilters = js.Array[MetricFilter]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricTransformations = js.Array[MetricTransformation]
  type MetricValue = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LogStreamName
    - awsDashSdkLib.awsDashSdkLibStrings.LastEventTime
    - java.lang.String
  */
  type OrderBy = _OrderBy | java.lang.String
  type OutputLogEvents = js.Array[OutputLogEvent]
  type Percentage = scala.Double
  type PolicyDocument = java.lang.String
  type PolicyName = java.lang.String
  type QueryId = java.lang.String
  type QueryInfoList = js.Array[QueryInfo]
  type QueryResults = js.Array[ResultRows]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Scheduled
    - awsDashSdkLib.awsDashSdkLibStrings.Running
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - java.lang.String
  */
  type QueryStatus = _QueryStatus | java.lang.String
  type QueryString = java.lang.String
  type ResourcePolicies = js.Array[ResourcePolicy]
  type ResultRows = js.Array[ResultField]
  type RoleArn = java.lang.String
  type SearchedLogStreams = js.Array[SearchedLogStream]
  type SequenceToken = java.lang.String
  type StartFromHead = scala.Boolean
  type StatsValue = scala.Double
  type StoredBytes = scala.Double
  type SubscriptionFilters = js.Array[SubscriptionFilter]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TargetArn = java.lang.String
  type TestEventMessages = js.Array[EventMessage]
  type Timestamp = scala.Double
  type Token = java.lang.String
  type Value = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-03-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
