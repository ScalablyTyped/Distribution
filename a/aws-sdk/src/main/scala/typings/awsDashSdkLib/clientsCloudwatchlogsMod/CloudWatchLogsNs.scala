package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudwatchlogs", "CloudWatchLogs")
@js.native
object CloudWatchLogsNs extends js.Object {
  trait AssociateKmsKeyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS).
      */
    var kmsKeyId: KmsKeyId
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait CancelExportTaskRequest extends js.Object {
    /**
      * The ID of the export task.
      */
    var taskId: ExportTaskId
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateExportTaskRequest extends js.Object {
    /**
      * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
      */
    var destination: ExportDestinationBucket
    /**
      * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is exportedlogs.
      */
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined
    /**
      * The start time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
      */
    var from: Timestamp
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is applied.
      */
    var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
    /**
      * The name of the export task.
      */
    var taskName: js.UndefOr[ExportTaskName] = js.undefined
    /**
      * The end time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
      */
    var to: Timestamp
  }
  
  trait CreateExportTaskResponse extends js.Object {
    /**
      * The ID of the export task.
      */
    var taskId: js.UndefOr[ExportTaskId] = js.undefined
  }
  
  trait CreateLogGroupRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS).
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The key-value pairs to use for the tags.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateLogStreamRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The name of the log stream.
      */
    var logStreamName: LogStreamName
  }
  
  trait DeleteDestinationRequest extends js.Object {
    /**
      * The name of the destination.
      */
    var destinationName: DestinationName
  }
  
  trait DeleteLogGroupRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait DeleteLogStreamRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The name of the log stream.
      */
    var logStreamName: LogStreamName
  }
  
  trait DeleteMetricFilterRequest extends js.Object {
    /**
      * The name of the metric filter.
      */
    var filterName: FilterName
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait DeleteResourcePolicyRequest extends js.Object {
    /**
      * The name of the policy to be revoked. This parameter is required.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait DeleteRetentionPolicyRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait DeleteSubscriptionFilterRequest extends js.Object {
    /**
      * The name of the subscription filter.
      */
    var filterName: FilterName
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait DescribeDestinationsRequest extends js.Object {
    /**
      * The prefix to match. If you don't specify a value, no prefix filter is applied.
      */
    var DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined
    /**
      * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeDestinationsResponse extends js.Object {
    /**
      * The destinations.
      */
    var destinations: js.UndefOr[Destinations] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeExportTasksRequest extends js.Object {
    /**
      * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
      */
    var statusCode: js.UndefOr[ExportTaskStatusCode] = js.undefined
    /**
      * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
      */
    var taskId: js.UndefOr[ExportTaskId] = js.undefined
  }
  
  trait DescribeExportTasksResponse extends js.Object {
    /**
      * The export tasks.
      */
    var exportTasks: js.UndefOr[ExportTasks] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeLogGroupsRequest extends js.Object {
    /**
      * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    /**
      * The prefix to match.
      */
    var logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeLogGroupsResponse extends js.Object {
    /**
      * The log groups.
      */
    var logGroups: js.UndefOr[LogGroups] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeLogStreamsRequest extends js.Object {
    /**
      * If the value is true, results are returned in descending order. If the value is to false, results are returned in ascending order. The default value is false.
      */
    var descending: js.UndefOr[Descending] = js.undefined
    /**
      * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The prefix to match. If orderBy is LastEventTime,you cannot specify this parameter.
      */
    var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * If the value is LogStreamName, the results are ordered by log stream name. If the value is LastEventTime, the results are ordered by the event time. The default value is LogStreamName. If you order the results by event time, you cannot specify the logStreamNamePrefix parameter. lastEventTimestamp represents the time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but may take longer in some rare situations.
      */
    var orderBy: js.UndefOr[OrderBy] = js.undefined
  }
  
  trait DescribeLogStreamsResponse extends js.Object {
    /**
      * The log streams.
      */
    var logStreams: js.UndefOr[LogStreams] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeMetricFiltersRequest extends js.Object {
    /**
      * The prefix to match.
      */
    var filterNamePrefix: js.UndefOr[FilterName] = js.undefined
    /**
      * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * Filters results to include only those with the specified metric name. If you include this parameter in your request, you must also include the metricNamespace parameter.
      */
    var metricName: js.UndefOr[MetricName] = js.undefined
    /**
      * Filters results to include only those in the specified namespace. If you include this parameter in your request, you must also include the metricName parameter.
      */
    var metricNamespace: js.UndefOr[MetricNamespace] = js.undefined
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeMetricFiltersResponse extends js.Object {
    /**
      * The metric filters.
      */
    var metricFilters: js.UndefOr[MetricFilters] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeQueriesRequest extends js.Object {
    /**
      * Limits the returned queries to only those for the specified log group.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * Limits the number of returned queries to the specified number.
      */
    var maxResults: js.UndefOr[DescribeQueriesMaxResults] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Limits the returned queries to only those that have the specified status. Valid values are Cancelled, Complete, Failed, Running, and Scheduled.
      */
    var status: js.UndefOr[QueryStatus] = js.undefined
  }
  
  trait DescribeQueriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of queries that match the request.
      */
    var queries: js.UndefOr[QueryInfoList] = js.undefined
  }
  
  trait DescribeResourcePoliciesRequest extends js.Object {
    /**
      * The maximum number of resource policies to be displayed with one call of this API.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The resource policies that exist in this account.
      */
    var resourcePolicies: js.UndefOr[ResourcePolicies] = js.undefined
  }
  
  trait DescribeSubscriptionFiltersRequest extends js.Object {
    /**
      * The prefix to match. If you don't specify a value, no prefix filter is applied.
      */
    var filterNamePrefix: js.UndefOr[FilterName] = js.undefined
    /**
      * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
      */
    var limit: js.UndefOr[DescribeLimit] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeSubscriptionFiltersResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The subscription filters.
      */
    var subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined
  }
  
  trait Destination extends js.Object {
    /**
      * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
      */
    var accessPolicy: js.UndefOr[AccessPolicy] = js.undefined
    /**
      * The ARN of this destination.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the destination.
      */
    var destinationName: js.UndefOr[DestinationName] = js.undefined
    /**
      * A role for impersonation, used when delivering log events to the target.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a Kinesis stream).
      */
    var targetArn: js.UndefOr[TargetArn] = js.undefined
  }
  
  trait DisassociateKmsKeyRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait ExportTask extends js.Object {
    /**
      * The name of Amazon S3 bucket to which the log data was exported.
      */
    var destination: js.UndefOr[ExportDestinationBucket] = js.undefined
    /**
      * The prefix that was used as the start of Amazon S3 key for every object exported.
      */
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined
    /**
      * Execution info about the export task.
      */
    var executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.undefined
    /**
      * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not exported.
      */
    var from: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the log group from which logs data was exported.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * The status of the export task.
      */
    var status: js.UndefOr[ExportTaskStatus] = js.undefined
    /**
      * The ID of the export task.
      */
    var taskId: js.UndefOr[ExportTaskId] = js.undefined
    /**
      * The name of the export task.
      */
    var taskName: js.UndefOr[ExportTaskName] = js.undefined
    /**
      * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
      */
    var to: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ExportTaskExecutionInfo extends js.Object {
    /**
      * The completion time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var completionTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The creation time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ExportTaskStatus extends js.Object {
    /**
      * The status code of the export task.
      */
    var code: js.UndefOr[ExportTaskStatusCode] = js.undefined
    /**
      * The status message related to the status code.
      */
    var message: js.UndefOr[ExportTaskStatusMessage] = js.undefined
  }
  
  trait ExtractedValues
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Value]
  
  trait FilterLogEventsRequest extends js.Object {
    /**
      * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not returned.
      */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The filter pattern to use. For more information, see Filter and Pattern Syntax. If not provided, all the events are matched.
      */
    var filterPattern: js.UndefOr[FilterPattern] = js.undefined
    /**
      * If the value is true, the operation makes a best effort to provide responses that contain events from multiple log streams within the log group, interleaved in a single response. If the value is false, all the matched log events in the first log stream are searched first, then those in the next log stream, and so on. The default is false.
      */
    var interleaved: js.UndefOr[Interleaved] = js.undefined
    /**
      * The maximum number of events to return. The default is 10,000 events.
      */
    var limit: js.UndefOr[EventsLimit] = js.undefined
    /**
      * The name of the log group to search.
      */
    var logGroupName: LogGroupName
    /**
      * Filters the results to include only events from log streams that have names starting with this prefix. If you specify a value for both logStreamNamePrefix and logStreamNames, but the value for logStreamNamePrefix does not match any log stream names specified in logStreamNames, the action returns an InvalidParameterException error.
      */
    var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
    /**
      * Filters the results to only logs from the log streams in this list. If you specify a value for both logStreamNamePrefix and logStreamNames, the action returns an InvalidParameterException error.
      */
    var logStreamNames: js.UndefOr[InputLogStreamNames] = js.undefined
    /**
      * The token for the next set of events to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not returned.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait FilterLogEventsResponse extends js.Object {
    /**
      * The matched events.
      */
    var events: js.UndefOr[FilteredLogEvents] = js.undefined
    /**
      * The token to use when requesting the next set of items. The token expires after 24 hours.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Indicates which log streams have been searched and whether each has been searched completely.
      */
    var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined
  }
  
  trait FilteredLogEvent extends js.Object {
    /**
      * The ID of the event.
      */
    var eventId: js.UndefOr[EventId] = js.undefined
    /**
      * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var ingestionTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the log stream to which this event belongs.
      */
    var logStreamName: js.UndefOr[LogStreamName] = js.undefined
    /**
      * The data contained in the log event.
      */
    var message: js.UndefOr[EventMessage] = js.undefined
    /**
      * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetLogEventsRequest extends js.Object {
    /**
      * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp equal to or later than this time are not included.
      */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The maximum number of log events returned. If you don't specify a value, the maximum is as many log events as can fit in a response size of 1 MB, up to 10,000 log events.
      */
    var limit: js.UndefOr[EventsLimit] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The name of the log stream.
      */
    var logStreamName: LogStreamName
    /**
      * The token for the next set of items to return. (You received this token from a previous call.)
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * If the value is true, the earliest log events are returned first. If the value is false, the latest log events are returned first. The default value is false.
      */
    var startFromHead: js.UndefOr[StartFromHead] = js.undefined
    /**
      * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this time are not included.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetLogEventsResponse extends js.Object {
    /**
      * The events.
      */
    var events: js.UndefOr[OutputLogEvents] = js.undefined
    /**
      * The token for the next set of items in the backward direction. The token expires after 24 hours. This token will never be null. If you have reached the end of the stream, it will return the same token you passed in.
      */
    var nextBackwardToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The token for the next set of items in the forward direction. The token expires after 24 hours. If you have reached the end of the stream, it will return the same token you passed in.
      */
    var nextForwardToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetLogGroupFieldsRequest extends js.Object {
    /**
      * The name of the log group to search.
      */
    var logGroupName: LogGroupName
    /**
      * The time to set as the center of the query. If you specify time, the 8 minutes before and 8 minutes after this time are searched. If you omit time, the past 15 minutes are queried. The time value is specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
      */
    var time: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetLogGroupFieldsResponse extends js.Object {
    /**
      * The array of fields found in the query. Each object in the array contains the name of the field, along with the percentage of time it appeared in the log events that were queried.
      */
    var logGroupFields: js.UndefOr[LogGroupFieldList] = js.undefined
  }
  
  trait GetLogRecordRequest extends js.Object {
    /**
      * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a GetQueryResults operation. In that response, the value of the @ptr field for a log event is the value to use as logRecordPointer to retrieve that complete log event record.
      */
    var logRecordPointer: LogRecordPointer
  }
  
  trait GetLogRecordResponse extends js.Object {
    /**
      * The requested log event, as a JSON string.
      */
    var logRecord: js.UndefOr[LogRecord] = js.undefined
  }
  
  trait GetQueryResultsRequest extends js.Object {
    /**
      * The ID number of the query.
      */
    var queryId: QueryId
  }
  
  trait GetQueryResultsResponse extends js.Object {
    /**
      * The log events that matched the query criteria during the most recent time it ran. The results value is an array of arrays. Each log event is one object in the top-level array. Each of these log event objects is an array of field/value pairs.
      */
    var results: js.UndefOr[QueryResults] = js.undefined
    /**
      * Includes the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
      */
    var statistics: js.UndefOr[QueryStatistics] = js.undefined
    /**
      * The status of the most recent running of the query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, and Unknown.
      */
    var status: js.UndefOr[QueryStatus] = js.undefined
  }
  
  trait InputLogEvent extends js.Object {
    /**
      * The raw event message.
      */
    var message: EventMessage
    /**
      * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var timestamp: Timestamp
  }
  
  trait ListTagsLogGroupRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
  }
  
  trait ListTagsLogGroupResponse extends js.Object {
    /**
      * The tags for the log group.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait LogGroup extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the log group.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * The number of metric filters.
      */
    var metricFilterCount: js.UndefOr[FilterCount] = js.undefined
    var retentionInDays: js.UndefOr[Days] = js.undefined
    /**
      * The number of bytes stored.
      */
    var storedBytes: js.UndefOr[StoredBytes] = js.undefined
  }
  
  trait LogGroupField extends js.Object {
    /**
      * The name of a log field.
      */
    var name: js.UndefOr[Field] = js.undefined
    /**
      * The percentage of log events queried that contained the field.
      */
    var percent: js.UndefOr[Percentage] = js.undefined
  }
  
  trait LogRecord
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Value]
  
  trait LogStream extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the log stream.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The creation time of the stream, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time of the first event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var firstEventTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. The lastEventTime value updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but may take longer in some rare situations.
      */
    var lastEventTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The ingestion time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var lastIngestionTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the log stream.
      */
    var logStreamName: js.UndefOr[LogStreamName] = js.undefined
    /**
      * The number of bytes stored.
      */
    var storedBytes: js.UndefOr[StoredBytes] = js.undefined
    /**
      * The sequence token.
      */
    var uploadSequenceToken: js.UndefOr[SequenceToken] = js.undefined
  }
  
  trait MetricFilter extends js.Object {
    /**
      * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the metric filter.
      */
    var filterName: js.UndefOr[FilterName] = js.undefined
    var filterPattern: js.UndefOr[FilterPattern] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * The metric transformations.
      */
    var metricTransformations: js.UndefOr[MetricTransformations] = js.undefined
  }
  
  trait MetricFilterMatchRecord extends js.Object {
    /**
      * The raw event data.
      */
    var eventMessage: js.UndefOr[EventMessage] = js.undefined
    /**
      * The event number.
      */
    var eventNumber: js.UndefOr[EventNumber] = js.undefined
    /**
      * The values extracted from the event data by the filter.
      */
    var extractedValues: js.UndefOr[ExtractedValues] = js.undefined
  }
  
  trait MetricTransformation extends js.Object {
    /**
      * (Optional) The value to emit when a filter pattern does not match a log event. This value can be null.
      */
    var defaultValue: js.UndefOr[DefaultValue] = js.undefined
    /**
      * The name of the CloudWatch metric.
      */
    var metricName: MetricName
    /**
      * The namespace of the CloudWatch metric.
      */
    var metricNamespace: MetricNamespace
    /**
      * The value to publish to the CloudWatch metric when a filter pattern matches a log event.
      */
    var metricValue: MetricValue
  }
  
  trait OutputLogEvent extends js.Object {
    /**
      * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var ingestionTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The data contained in the log event.
      */
    var message: js.UndefOr[EventMessage] = js.undefined
    /**
      * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait PutDestinationPolicyRequest extends js.Object {
    /**
      * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination.
      */
    var accessPolicy: AccessPolicy
    /**
      * A name for an existing destination.
      */
    var destinationName: DestinationName
  }
  
  trait PutDestinationRequest extends js.Object {
    /**
      * A name for the destination.
      */
    var destinationName: DestinationName
    /**
      * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis PutRecord operation on the destination stream.
      */
    var roleArn: RoleArn
    /**
      * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
      */
    var targetArn: TargetArn
  }
  
  trait PutDestinationResponse extends js.Object {
    /**
      * The destination.
      */
    var destination: js.UndefOr[Destination] = js.undefined
  }
  
  trait PutLogEventsRequest extends js.Object {
    /**
      * The log events.
      */
    var logEvents: InputLogEvents
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The name of the log stream.
      */
    var logStreamName: LogStreamName
    /**
      * The sequence token obtained from the response of the previous PutLogEvents call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected.
      */
    var sequenceToken: js.UndefOr[SequenceToken] = js.undefined
  }
  
  trait PutLogEventsResponse extends js.Object {
    /**
      * The next sequence token.
      */
    var nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined
    /**
      * The rejected events.
      */
    var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined
  }
  
  trait PutMetricFilterRequest extends js.Object {
    /**
      * A name for the metric filter.
      */
    var filterName: FilterName
    /**
      * A filter pattern for extracting metric data out of ingested log events.
      */
    var filterPattern: FilterPattern
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * A collection of information that defines how metric data gets emitted.
      */
    var metricTransformations: MetricTransformations
  }
  
  trait PutResourcePolicyRequest extends js.Object {
    /**
      * Details of the new policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log stream.  { "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] }  
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * Name of the new policy. This parameter is required.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait PutResourcePolicyResponse extends js.Object {
    /**
      * The new policy.
      */
    var resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined
  }
  
  trait PutRetentionPolicyRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    var retentionInDays: Days
  }
  
  trait PutSubscriptionFilterRequest extends js.Object {
    /**
      * The ARN of the destination to deliver matching log events to. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination (specified using an ARN) belonging to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream belonging to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.  
      */
    var destinationArn: DestinationArn
    /**
      * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. 
      */
    var distribution: js.UndefOr[Distribution] = js.undefined
    /**
      * A name for the subscription filter. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group. To find the name of the filter currently associated with a log group, use DescribeSubscriptionFilters.
      */
    var filterName: FilterName
    /**
      * A filter pattern for subscribing to a filtered stream of log events.
      */
    var filterPattern: FilterPattern
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events to the destination stream. You don't need to provide the ARN when you are working with a logical destination for cross-account delivery.
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait QueryInfo extends js.Object {
    /**
      * The date and time that this query was created.
      */
    var createTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the log group scanned by this query.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * The unique ID number of this query.
      */
    var queryId: js.UndefOr[QueryId] = js.undefined
    /**
      * The query string used in this query.
      */
    var queryString: js.UndefOr[QueryString] = js.undefined
    /**
      * The status of this query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, and Unknown.
      */
    var status: js.UndefOr[QueryStatus] = js.undefined
  }
  
  trait QueryStatistics extends js.Object {
    /**
      * The total number of bytes in the log events scanned during the query.
      */
    var bytesScanned: js.UndefOr[StatsValue] = js.undefined
    /**
      * The number of log events that matched the query string.
      */
    var recordsMatched: js.UndefOr[StatsValue] = js.undefined
    /**
      * The total number of log events scanned during the query.
      */
    var recordsScanned: js.UndefOr[StatsValue] = js.undefined
  }
  
  trait RejectedLogEventsInfo extends js.Object {
    /**
      * The expired log events.
      */
    var expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
    /**
      * The log events that are too new.
      */
    var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined
    /**
      * The log events that are too old.
      */
    var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
  }
  
  trait ResourcePolicy extends js.Object {
    /**
      * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The details of the policy.
      */
    var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
    /**
      * The name of the resource policy.
      */
    var policyName: js.UndefOr[PolicyName] = js.undefined
  }
  
  trait ResultField extends js.Object {
    /**
      * The log event field.
      */
    var field: js.UndefOr[Field] = js.undefined
    /**
      * The value of this field.
      */
    var value: js.UndefOr[Value] = js.undefined
  }
  
  trait SearchedLogStream extends js.Object {
    /**
      * The name of the log stream.
      */
    var logStreamName: js.UndefOr[LogStreamName] = js.undefined
    /**
      * Indicates whether all the events in this log stream were searched.
      */
    var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.undefined
  }
  
  trait StartQueryRequest extends js.Object {
    /**
      * The end of the time range to query. The range is inclusive, so the specified end time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
      */
    var endTime: Timestamp
    /**
      * The maximum number of log events to return in the query. If the query string uses the fields command, only the specified fields and their values are returned.
      */
    var limit: js.UndefOr[EventsLimit] = js.undefined
    /**
      * The log group on which to perform the query.
      */
    var logGroupName: LogGroupName
    /**
      * The query string to use. For more information, see CloudWatch Logs Insights Query Syntax.
      */
    var queryString: QueryString
    /**
      * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
      */
    var startTime: Timestamp
  }
  
  trait StartQueryResponse extends js.Object {
    /**
      * The unique ID of the query. 
      */
    var queryId: js.UndefOr[QueryId] = js.undefined
  }
  
  trait StopQueryRequest extends js.Object {
    /**
      * The ID number of the query to stop. If necessary, you can use DescribeQueries to find this ID number.
      */
    var queryId: QueryId
  }
  
  trait StopQueryResponse extends js.Object {
    /**
      * This is true if the query was stopped by the StopQuery operation.
      */
    var success: js.UndefOr[Success] = js.undefined
  }
  
  trait SubscriptionFilter extends js.Object {
    /**
      * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the destination.
      */
    var destinationArn: js.UndefOr[DestinationArn] = js.undefined
    var distribution: js.UndefOr[Distribution] = js.undefined
    /**
      * The name of the subscription filter.
      */
    var filterName: js.UndefOr[FilterName] = js.undefined
    var filterPattern: js.UndefOr[FilterPattern] = js.undefined
    /**
      * The name of the log group.
      */
    var logGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * 
      */
    var roleArn: js.UndefOr[RoleArn] = js.undefined
  }
  
  trait TagLogGroupRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The key-value pairs to use for the tags.
      */
    var tags: Tags
  }
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  trait TestMetricFilterRequest extends js.Object {
    var filterPattern: FilterPattern
    /**
      * The log event messages to test.
      */
    var logEventMessages: TestEventMessages
  }
  
  trait TestMetricFilterResponse extends js.Object {
    /**
      * The matched events.
      */
    var matches: js.UndefOr[MetricFilterMatches] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log group. Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK. After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. Note that it can take up to 5 minutes for this operation to take effect. If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
      */
    def associateKmsKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateKmsKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log group. Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK. After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. Note that it can take up to 5 minutes for this operation to take effect. If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
      */
    def associateKmsKey(params: AssociateKmsKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateKmsKey(
      params: AssociateKmsKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
      */
    def cancelExportTask(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelExportTask(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
      */
    def cancelExportTask(params: CancelExportTaskRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelExportTask(
      params: CancelExportTaskRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket. This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
      */
    def createExportTask(): awsDashSdkLib.libRequestMod.Request[CreateExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createExportTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateExportTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket. This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
      */
    def createExportTask(params: CreateExportTaskRequest): awsDashSdkLib.libRequestMod.Request[CreateExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createExportTask(
      params: CreateExportTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateExportTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateExportTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a log group with the specified name. You can create up to 5000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a region for an AWS account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
      */
    def createLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLogGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a log group with the specified name. You can create up to 5000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a region for an AWS account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
      */
    def createLogGroup(params: CreateLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLogGroup(
      params: CreateLogGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a log stream for the specified log group. There is no limit on the number of log streams that you can create for a log group. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   The ':' (colon) and '*' (asterisk) characters are not allowed.  
      */
    def createLogStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLogStream(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a log stream for the specified log group. There is no limit on the number of log streams that you can create for a log group. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   The ':' (colon) and '*' (asterisk) characters are not allowed.  
      */
    def createLogStream(params: CreateLogStreamRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLogStream(
      params: CreateLogStreamRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
      */
    def deleteDestination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDestination(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
      */
    def deleteDestination(params: DeleteDestinationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDestination(
      params: DeleteDestinationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
      */
    def deleteLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLogGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
      */
    def deleteLogGroup(params: DeleteLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLogGroup(
      params: DeleteLogGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
      */
    def deleteLogStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLogStream(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
      */
    def deleteLogStream(params: DeleteLogStreamRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLogStream(
      params: DeleteLogStreamRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified metric filter.
      */
    def deleteMetricFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMetricFilter(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified metric filter.
      */
    def deleteMetricFilter(params: DeleteMetricFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMetricFilter(
      params: DeleteMetricFilterRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
      */
    def deleteResourcePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResourcePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
      */
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResourcePolicy(
      params: DeleteResourcePolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
      */
    def deleteRetentionPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRetentionPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
      */
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRetentionPolicy(
      params: DeleteRetentionPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified subscription filter.
      */
    def deleteSubscriptionFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSubscriptionFilter(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified subscription filter.
      */
    def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSubscriptionFilter(
      params: DeleteSubscriptionFilterRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all your destinations. The results are ASCII-sorted by destination name.
      */
    def describeDestinations(): awsDashSdkLib.libRequestMod.Request[DescribeDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDestinations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDestinationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all your destinations. The results are ASCII-sorted by destination name.
      */
    def describeDestinations(params: DescribeDestinationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDestinations(
      params: DescribeDestinationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDestinationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
      */
    def describeExportTasks(): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExportTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExportTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
      */
    def describeExportTasks(params: DescribeExportTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExportTasks(
      params: DescribeExportTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExportTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExportTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name.
      */
    def describeLogGroups(): awsDashSdkLib.libRequestMod.Request[DescribeLogGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLogGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLogGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLogGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name.
      */
    def describeLogGroups(params: DescribeLogGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLogGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLogGroups(
      params: DescribeLogGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLogGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLogGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. This operation has a limit of five transactions per second, after which transactions are throttled.
      */
    def describeLogStreams(): awsDashSdkLib.libRequestMod.Request[DescribeLogStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLogStreams(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLogStreamsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLogStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. This operation has a limit of five transactions per second, after which transactions are throttled.
      */
    def describeLogStreams(params: DescribeLogStreamsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLogStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLogStreams(
      params: DescribeLogStreamsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLogStreamsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLogStreamsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified metric filters. You can list all the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
      */
    def describeMetricFilters(): awsDashSdkLib.libRequestMod.Request[DescribeMetricFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMetricFilters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMetricFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMetricFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the specified metric filters. You can list all the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
      */
    def describeMetricFilters(params: DescribeMetricFiltersRequest): awsDashSdkLib.libRequestMod.Request[DescribeMetricFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMetricFilters(
      params: DescribeMetricFiltersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMetricFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMetricFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently in this account. You can request all queries, or limit it to queries of a specific log group or queries with a certain status.
      */
    def describeQueries(): awsDashSdkLib.libRequestMod.Request[DescribeQueriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeQueries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeQueriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeQueriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently in this account. You can request all queries, or limit it to queries of a specific log group or queries with a certain status.
      */
    def describeQueries(params: DescribeQueriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeQueriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeQueries(
      params: DescribeQueriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeQueriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeQueriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the resource policies in this account.
      */
    def describeResourcePolicies(): awsDashSdkLib.libRequestMod.Request[DescribeResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeResourcePolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourcePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the resource policies in this account.
      */
    def describeResourcePolicies(params: DescribeResourcePoliciesRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeResourcePolicies(
      params: DescribeResourcePoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourcePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourcePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
      */
    def describeSubscriptionFilters(): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSubscriptionFilters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSubscriptionFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
      */
    def describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSubscriptionFilters(
      params: DescribeSubscriptionFiltersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSubscriptionFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSubscriptionFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified log group. After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires permissions for the CMK whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
      */
    def disassociateKmsKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateKmsKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified log group. After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires permissions for the CMK whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
      */
    def disassociateKmsKey(params: DisassociateKmsKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateKmsKey(
      params: DisassociateKmsKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the events found within the time range that you specify. If the results include a token, then there are more log events available, and you can get additional results by specifying the token in a subsequent call.
      */
    def filterLogEvents(): awsDashSdkLib.libRequestMod.Request[FilterLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def filterLogEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FilterLogEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FilterLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the events found within the time range that you specify. If the results include a token, then there are more log events available, and you can get additional results by specifying the token in a subsequent call.
      */
    def filterLogEvents(params: FilterLogEventsRequest): awsDashSdkLib.libRequestMod.Request[FilterLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def filterLogEvents(
      params: FilterLogEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FilterLogEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FilterLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists log events from the specified log stream. You can list all the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call.
      */
    def getLogEvents(): awsDashSdkLib.libRequestMod.Request[GetLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLogEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLogEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists log events from the specified log stream. You can list all the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call.
      */
    def getLogEvents(params: GetLogEventsRequest): awsDashSdkLib.libRequestMod.Request[GetLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLogEvents(
      params: GetLogEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLogEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the fields that are included in log events in the specified log group, along with the percentage of log events that contain each field. The search is limited to a time period that you specify. In the results, fields that start with @ are fields generated by CloudWatch Logs. For example, @timestamp is the timestamp of each log event. The response results are sorted by the frequency percentage, starting with the highest percentage.
      */
    def getLogGroupFields(): awsDashSdkLib.libRequestMod.Request[GetLogGroupFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLogGroupFields(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLogGroupFieldsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLogGroupFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the fields that are included in log events in the specified log group, along with the percentage of log events that contain each field. The search is limited to a time period that you specify. In the results, fields that start with @ are fields generated by CloudWatch Logs. For example, @timestamp is the timestamp of each log event. The response results are sorted by the frequency percentage, starting with the highest percentage.
      */
    def getLogGroupFields(params: GetLogGroupFieldsRequest): awsDashSdkLib.libRequestMod.Request[GetLogGroupFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLogGroupFields(
      params: GetLogGroupFieldsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLogGroupFieldsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLogGroupFieldsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query that produced the logRecordPointer retrieved only a subset of fields. Fields are returned as field name/field value pairs. Additionally, the entire unparsed log event is returned within @message.
      */
    def getLogRecord(): awsDashSdkLib.libRequestMod.Request[GetLogRecordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLogRecord(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLogRecordResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLogRecordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query that produced the logRecordPointer retrieved only a subset of fields. Fields are returned as field name/field value pairs. Additionally, the entire unparsed log event is returned within @message.
      */
    def getLogRecord(params: GetLogRecordRequest): awsDashSdkLib.libRequestMod.Request[GetLogRecordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLogRecord(
      params: GetLogRecordRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLogRecordResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLogRecordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the results from the specified query. If the query is in progress, partial results of that current execution are returned. Only the fields requested in the query are returned.  GetQueryResults does not start a query execution. To run a query, use .
      */
    def getQueryResults(): awsDashSdkLib.libRequestMod.Request[GetQueryResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the results from the specified query. If the query is in progress, partial results of that current execution are returned. Only the fields requested in the query are returned.  GetQueryResults does not start a query execution. To run a query, use .
      */
    def getQueryResults(params: GetQueryResultsRequest): awsDashSdkLib.libRequestMod.Request[GetQueryResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQueryResults(
      params: GetQueryResultsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueryResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags for the specified log group.
      */
    def listTagsLogGroup(): awsDashSdkLib.libRequestMod.Request[ListTagsLogGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsLogGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsLogGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsLogGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags for the specified log group.
      */
    def listTagsLogGroup(params: ListTagsLogGroupRequest): awsDashSdkLib.libRequestMod.Request[ListTagsLogGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsLogGroup(
      params: ListTagsLogGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsLogGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsLogGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Currently, the only supported physical resource is a Kinesis stream belonging to the same account as the destination. Through an access policy, a destination controls what is written to its Kinesis stream. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination.
      */
    def putDestination(): awsDashSdkLib.libRequestMod.Request[PutDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Currently, the only supported physical resource is a Kinesis stream belonging to the same account as the destination. Through an access policy, a destination controls what is written to its Kinesis stream. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination.
      */
    def putDestination(params: PutDestinationRequest): awsDashSdkLib.libRequestMod.Request[PutDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDestination(
      params: PutDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
      */
    def putDestinationPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDestinationPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
      */
    def putDestinationPolicy(params: PutDestinationPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putDestinationPolicy(
      params: PutDestinationPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a batch of log events to the specified log stream. You must include the sequence token obtained from the response of the previous call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected. The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be older than 14 days or the retention period of the log group.   The log events in the batch must be in chronological ordered by their timestamp. The timestamp is the time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    The maximum number of log events in a batch is 10,000.   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access key ID or secret key. 
      */
    def putLogEvents(): awsDashSdkLib.libRequestMod.Request[PutLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLogEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLogEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a batch of log events to the specified log stream. You must include the sequence token obtained from the response of the previous call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected. The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be older than 14 days or the retention period of the log group.   The log events in the batch must be in chronological ordered by their timestamp. The timestamp is the time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    The maximum number of log events in a batch is 10,000.   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access key ID or secret key. 
      */
    def putLogEvents(params: PutLogEventsRequest): awsDashSdkLib.libRequestMod.Request[PutLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLogEvents(
      params: PutLogEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLogEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLogEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100.
      */
    def putMetricFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putMetricFilter(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100.
      */
    def putMetricFilter(params: PutMetricFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putMetricFilter(
      params: PutMetricFilterRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per region.
      */
    def putResourcePolicy(): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putResourcePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per region.
      */
    def putResourcePolicy(params: PutResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putResourcePolicy(
      params: PutResourcePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutResourcePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for which to retain log events in the specified log group.
      */
    def putRetentionPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRetentionPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for which to retain log events in the specified log group.
      */
    def putRetentionPolicy(params: PutRetentionPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRetentionPolicy(
      params: PutRetentionPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   There can only be one subscription filter associated with a log group. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group.
      */
    def putSubscriptionFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putSubscriptionFilter(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   There can only be one subscription filter associated with a log group. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group.
      */
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putSubscriptionFilter(
      params: PutSubscriptionFilterRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to query, and the query string to use. For more information, see CloudWatch Logs Insights Query Syntax.
      */
    def startQuery(): awsDashSdkLib.libRequestMod.Request[StartQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartQueryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to query, and the query string to use. For more information, see CloudWatch Logs Insights Query Syntax.
      */
    def startQuery(params: StartQueryRequest): awsDashSdkLib.libRequestMod.Request[StartQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startQuery(
      params: StartQueryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartQueryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns an error indicating that the specified query is not running.
      */
    def stopQuery(): awsDashSdkLib.libRequestMod.Request[StopQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopQuery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopQueryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns an error indicating that the specified query is not running.
      */
    def stopQuery(params: StopQueryRequest): awsDashSdkLib.libRequestMod.Request[StopQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopQuery(
      params: StopQueryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopQueryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopQueryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide.
      */
    def tagLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagLogGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide.
      */
    def tagLogGroup(params: TagLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagLogGroup(
      params: TagLogGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
      */
    def testMetricFilter(): awsDashSdkLib.libRequestMod.Request[TestMetricFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testMetricFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestMetricFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestMetricFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
      */
    def testMetricFilter(params: TestMetricFilterRequest): awsDashSdkLib.libRequestMod.Request[TestMetricFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testMetricFilter(
      params: TestMetricFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestMetricFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestMetricFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.
      */
    def untagLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagLogGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.
      */
    def untagLogGroup(params: UntagLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagLogGroup(
      params: UntagLogGroupRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagLogGroupRequest extends js.Object {
    /**
      * The name of the log group.
      */
    var logGroupName: LogGroupName
    /**
      * The tag keys. The corresponding tags are removed from the log group.
      */
    var tags: TagList
  }
  
  trait _Distribution extends js.Object
  
  trait _ExportTaskStatusCode extends js.Object
  
  trait _OrderBy extends js.Object
  
  trait _QueryStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
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

