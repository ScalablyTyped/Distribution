package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogs
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudWatchLogs: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

