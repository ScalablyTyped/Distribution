package typings.awsSdk.clientsCloudwatchlogsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogs extends Service {
  
  /**
    * Associates the specified KMS key with the specified log group. Associating a KMS key with a log group overrides any existing associations between the log group and a KMS key. After a KMS key is associated with a log group, all newly ingested data for the log group is encrypted using the KMS key. This association is stored as long as the data encrypted with the KMS keyis still within CloudWatch Logs. This enables CloudWatch Logs to decrypt this data whenever it is requested.  CloudWatch Logs supports only symmetric KMS keys. Do not use an associate an asymmetric KMS key with your log group. For more information, see Using Symmetric and Asymmetric Keys.  It can take up to 5 minutes for this operation to take effect. If you attempt to associate a KMS key with a log group but the KMS key does not exist or the KMS key is disabled, you receive an InvalidParameterException error. 
    */
  def associateKmsKey(): Request[js.Object, AWSError] = js.native
  def associateKmsKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates the specified KMS key with the specified log group. Associating a KMS key with a log group overrides any existing associations between the log group and a KMS key. After a KMS key is associated with a log group, all newly ingested data for the log group is encrypted using the KMS key. This association is stored as long as the data encrypted with the KMS keyis still within CloudWatch Logs. This enables CloudWatch Logs to decrypt this data whenever it is requested.  CloudWatch Logs supports only symmetric KMS keys. Do not use an associate an asymmetric KMS key with your log group. For more information, see Using Symmetric and Asymmetric Keys.  It can take up to 5 minutes for this operation to take effect. If you attempt to associate a KMS key with a log group but the KMS key does not exist or the KMS key is disabled, you receive an InvalidParameterException error. 
    */
  def associateKmsKey(params: AssociateKmsKeyRequest): Request[js.Object, AWSError] = js.native
  def associateKmsKey(
    params: AssociateKmsKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
    */
  def cancelExportTask(): Request[js.Object, AWSError] = js.native
  def cancelExportTask(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
    */
  def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object, AWSError] = js.native
  def cancelExportTask(
    params: CancelExportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_CloudWatchLogs: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an export task so that you can efficiently export data from a log group to an Amazon S3 bucket. When you perform a CreateExportTask operation, you must use credentials that have permission to write to the S3 bucket that you specify as the destination. Exporting log data to S3 buckets that are encrypted by KMS is supported. Exporting log data to Amazon S3 buckets that have S3 Object Lock enabled with a retention period is also supported. Exporting to S3 buckets that are encrypted with AES-256 is supported.  This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate log data for each export task, specify a prefix to be used as the Amazon S3 key prefix for all exported objects.  Time-based sorting on chunks of log data inside an exported file is not guaranteed. You can sort the exported log field data by using Linux utilities. 
    */
  def createExportTask(): Request[CreateExportTaskResponse, AWSError] = js.native
  def createExportTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateExportTaskResponse, Unit]): Request[CreateExportTaskResponse, AWSError] = js.native
  /**
    * Creates an export task so that you can efficiently export data from a log group to an Amazon S3 bucket. When you perform a CreateExportTask operation, you must use credentials that have permission to write to the S3 bucket that you specify as the destination. Exporting log data to S3 buckets that are encrypted by KMS is supported. Exporting log data to Amazon S3 buckets that have S3 Object Lock enabled with a retention period is also supported. Exporting to S3 buckets that are encrypted with AES-256 is supported.  This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate log data for each export task, specify a prefix to be used as the Amazon S3 key prefix for all exported objects.  Time-based sorting on chunks of log data inside an exported file is not guaranteed. You can sort the exported log field data by using Linux utilities. 
    */
  def createExportTask(params: CreateExportTaskRequest): Request[CreateExportTaskResponse, AWSError] = js.native
  def createExportTask(
    params: CreateExportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExportTaskResponse, Unit]
  ): Request[CreateExportTaskResponse, AWSError] = js.native
  
  /**
    * Creates a log group with the specified name. You can create up to 20,000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a Region for an Amazon Web Services account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), '.' (period), and '#' (number sign)   When you create a log group, by default the log events in the log group do not expire. To set a retention policy so that events expire and are deleted after a specified time, use PutRetentionPolicy. If you associate an KMS key with the log group, ingested data is encrypted using the KMS key. This association is stored as long as the data encrypted with the KMS key is still within CloudWatch Logs. This enables CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a KMS key with the log group but the KMS keydoes not exist or the KMS key is disabled, you receive an InvalidParameterException error.   CloudWatch Logs supports only symmetric KMS keys. Do not associate an asymmetric KMS key with your log group. For more information, see Using Symmetric and Asymmetric Keys. 
    */
  def createLogGroup(): Request[js.Object, AWSError] = js.native
  def createLogGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a log group with the specified name. You can create up to 20,000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a Region for an Amazon Web Services account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), '.' (period), and '#' (number sign)   When you create a log group, by default the log events in the log group do not expire. To set a retention policy so that events expire and are deleted after a specified time, use PutRetentionPolicy. If you associate an KMS key with the log group, ingested data is encrypted using the KMS key. This association is stored as long as the data encrypted with the KMS key is still within CloudWatch Logs. This enables CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a KMS key with the log group but the KMS keydoes not exist or the KMS key is disabled, you receive an InvalidParameterException error.   CloudWatch Logs supports only symmetric KMS keys. Do not associate an asymmetric KMS key with your log group. For more information, see Using Symmetric and Asymmetric Keys. 
    */
  def createLogGroup(params: CreateLogGroupRequest): Request[js.Object, AWSError] = js.native
  def createLogGroup(
    params: CreateLogGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a log stream for the specified log group. A log stream is a sequence of log events that originate from a single source, such as an application instance or a resource that is being monitored. There is no limit on the number of log streams that you can create for a log group. There is a limit of 50 TPS on CreateLogStream operations, after which transactions are throttled. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   Don't use ':' (colon) or '*' (asterisk) characters.  
    */
  def createLogStream(): Request[js.Object, AWSError] = js.native
  def createLogStream(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a log stream for the specified log group. A log stream is a sequence of log events that originate from a single source, such as an application instance or a resource that is being monitored. There is no limit on the number of log streams that you can create for a log group. There is a limit of 50 TPS on CreateLogStream operations, after which transactions are throttled. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   Don't use ':' (colon) or '*' (asterisk) characters.  
    */
  def createLogStream(params: CreateLogStreamRequest): Request[js.Object, AWSError] = js.native
  def createLogStream(
    params: CreateLogStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the data protection policy from the specified log group.  For more information about data protection policies, see PutDataProtectionPolicy.
    */
  def deleteDataProtectionPolicy(): Request[js.Object, AWSError] = js.native
  def deleteDataProtectionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the data protection policy from the specified log group.  For more information about data protection policies, see PutDataProtectionPolicy.
    */
  def deleteDataProtectionPolicy(params: DeleteDataProtectionPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteDataProtectionPolicy(
    params: DeleteDataProtectionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
    */
  def deleteDestination(): Request[js.Object, AWSError] = js.native
  def deleteDestination(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
    */
  def deleteDestination(params: DeleteDestinationRequest): Request[js.Object, AWSError] = js.native
  def deleteDestination(
    params: DeleteDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
    */
  def deleteLogGroup(): Request[js.Object, AWSError] = js.native
  def deleteLogGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
    */
  def deleteLogGroup(params: DeleteLogGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteLogGroup(
    params: DeleteLogGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
    */
  def deleteLogStream(): Request[js.Object, AWSError] = js.native
  def deleteLogStream(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
    */
  def deleteLogStream(params: DeleteLogStreamRequest): Request[js.Object, AWSError] = js.native
  def deleteLogStream(
    params: DeleteLogStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified metric filter.
    */
  def deleteMetricFilter(): Request[js.Object, AWSError] = js.native
  def deleteMetricFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified metric filter.
    */
  def deleteMetricFilter(params: DeleteMetricFilterRequest): Request[js.Object, AWSError] = js.native
  def deleteMetricFilter(
    params: DeleteMetricFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a saved CloudWatch Logs Insights query definition. A query definition contains details about a saved CloudWatch Logs Insights query. Each DeleteQueryDefinition operation can delete one query definition. You must have the logs:DeleteQueryDefinition permission to be able to perform this operation.
    */
  def deleteQueryDefinition(): Request[DeleteQueryDefinitionResponse, AWSError] = js.native
  def deleteQueryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueryDefinitionResponse, Unit]): Request[DeleteQueryDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a saved CloudWatch Logs Insights query definition. A query definition contains details about a saved CloudWatch Logs Insights query. Each DeleteQueryDefinition operation can delete one query definition. You must have the logs:DeleteQueryDefinition permission to be able to perform this operation.
    */
  def deleteQueryDefinition(params: DeleteQueryDefinitionRequest): Request[DeleteQueryDefinitionResponse, AWSError] = js.native
  def deleteQueryDefinition(
    params: DeleteQueryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueryDefinitionResponse, Unit]
  ): Request[DeleteQueryDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
    */
  def deleteResourcePolicy(): Request[js.Object, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
    */
  def deleteRetentionPolicy(): Request[js.Object, AWSError] = js.native
  def deleteRetentionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
    */
  def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteRetentionPolicy(
    params: DeleteRetentionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified subscription filter.
    */
  def deleteSubscriptionFilter(): Request[js.Object, AWSError] = js.native
  def deleteSubscriptionFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified subscription filter.
    */
  def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest): Request[js.Object, AWSError] = js.native
  def deleteSubscriptionFilter(
    params: DeleteSubscriptionFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Lists all your destinations. The results are ASCII-sorted by destination name.
    */
  def describeDestinations(): Request[DescribeDestinationsResponse, AWSError] = js.native
  def describeDestinations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDestinationsResponse, Unit]): Request[DescribeDestinationsResponse, AWSError] = js.native
  /**
    * Lists all your destinations. The results are ASCII-sorted by destination name.
    */
  def describeDestinations(params: DescribeDestinationsRequest): Request[DescribeDestinationsResponse, AWSError] = js.native
  def describeDestinations(
    params: DescribeDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDestinationsResponse, Unit]
  ): Request[DescribeDestinationsResponse, AWSError] = js.native
  
  /**
    * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
    */
  def describeExportTasks(): Request[DescribeExportTasksResponse, AWSError] = js.native
  def describeExportTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResponse, Unit]): Request[DescribeExportTasksResponse, AWSError] = js.native
  /**
    * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
    */
  def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse, AWSError] = js.native
  def describeExportTasks(
    params: DescribeExportTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResponse, Unit]
  ): Request[DescribeExportTasksResponse, AWSError] = js.native
  
  /**
    * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name. CloudWatch Logs doesn’t support IAM policies that control access to the DescribeLogGroups action by using the aws:ResourceTag/key-name  condition key. Other CloudWatch Logs actions do support the use of the aws:ResourceTag/key-name  condition key to control access. For more information about using tags to control access, see Controlling access to Amazon Web Services resources using tags. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def describeLogGroups(): Request[DescribeLogGroupsResponse, AWSError] = js.native
  def describeLogGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLogGroupsResponse, Unit]): Request[DescribeLogGroupsResponse, AWSError] = js.native
  /**
    * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name. CloudWatch Logs doesn’t support IAM policies that control access to the DescribeLogGroups action by using the aws:ResourceTag/key-name  condition key. Other CloudWatch Logs actions do support the use of the aws:ResourceTag/key-name  condition key to control access. For more information about using tags to control access, see Controlling access to Amazon Web Services resources using tags. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def describeLogGroups(params: DescribeLogGroupsRequest): Request[DescribeLogGroupsResponse, AWSError] = js.native
  def describeLogGroups(
    params: DescribeLogGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLogGroupsResponse, Unit]
  ): Request[DescribeLogGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must include one of these two parameters, but you can't include both.  This operation has a limit of five transactions per second, after which transactions are throttled. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def describeLogStreams(): Request[DescribeLogStreamsResponse, AWSError] = js.native
  def describeLogStreams(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLogStreamsResponse, Unit]): Request[DescribeLogStreamsResponse, AWSError] = js.native
  /**
    * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must include one of these two parameters, but you can't include both.  This operation has a limit of five transactions per second, after which transactions are throttled. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def describeLogStreams(params: DescribeLogStreamsRequest): Request[DescribeLogStreamsResponse, AWSError] = js.native
  def describeLogStreams(
    params: DescribeLogStreamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLogStreamsResponse, Unit]
  ): Request[DescribeLogStreamsResponse, AWSError] = js.native
  
  /**
    * Lists the specified metric filters. You can list all of the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
    */
  def describeMetricFilters(): Request[DescribeMetricFiltersResponse, AWSError] = js.native
  def describeMetricFilters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMetricFiltersResponse, Unit]): Request[DescribeMetricFiltersResponse, AWSError] = js.native
  /**
    * Lists the specified metric filters. You can list all of the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
    */
  def describeMetricFilters(params: DescribeMetricFiltersRequest): Request[DescribeMetricFiltersResponse, AWSError] = js.native
  def describeMetricFilters(
    params: DescribeMetricFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMetricFiltersResponse, Unit]
  ): Request[DescribeMetricFiltersResponse, AWSError] = js.native
  
  /**
    * Returns a list of CloudWatch Logs Insights queries that are scheduled, running, or have been run recently in this account. You can request all queries or limit it to queries of a specific log group or queries with a certain status.
    */
  def describeQueries(): Request[DescribeQueriesResponse, AWSError] = js.native
  def describeQueries(callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueriesResponse, Unit]): Request[DescribeQueriesResponse, AWSError] = js.native
  /**
    * Returns a list of CloudWatch Logs Insights queries that are scheduled, running, or have been run recently in this account. You can request all queries or limit it to queries of a specific log group or queries with a certain status.
    */
  def describeQueries(params: DescribeQueriesRequest): Request[DescribeQueriesResponse, AWSError] = js.native
  def describeQueries(
    params: DescribeQueriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueriesResponse, Unit]
  ): Request[DescribeQueriesResponse, AWSError] = js.native
  
  /**
    * This operation returns a paginated list of your saved CloudWatch Logs Insights query definitions. You can use the queryDefinitionNamePrefix parameter to limit the results to only the query definitions that have names that start with a certain string.
    */
  def describeQueryDefinitions(): Request[DescribeQueryDefinitionsResponse, AWSError] = js.native
  def describeQueryDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueryDefinitionsResponse, Unit]): Request[DescribeQueryDefinitionsResponse, AWSError] = js.native
  /**
    * This operation returns a paginated list of your saved CloudWatch Logs Insights query definitions. You can use the queryDefinitionNamePrefix parameter to limit the results to only the query definitions that have names that start with a certain string.
    */
  def describeQueryDefinitions(params: DescribeQueryDefinitionsRequest): Request[DescribeQueryDefinitionsResponse, AWSError] = js.native
  def describeQueryDefinitions(
    params: DescribeQueryDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueryDefinitionsResponse, Unit]
  ): Request[DescribeQueryDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists the resource policies in this account.
    */
  def describeResourcePolicies(): Request[DescribeResourcePoliciesResponse, AWSError] = js.native
  def describeResourcePolicies(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePoliciesResponse, Unit]): Request[DescribeResourcePoliciesResponse, AWSError] = js.native
  /**
    * Lists the resource policies in this account.
    */
  def describeResourcePolicies(params: DescribeResourcePoliciesRequest): Request[DescribeResourcePoliciesResponse, AWSError] = js.native
  def describeResourcePolicies(
    params: DescribeResourcePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePoliciesResponse, Unit]
  ): Request[DescribeResourcePoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
    */
  def describeSubscriptionFilters(): Request[DescribeSubscriptionFiltersResponse, AWSError] = js.native
  def describeSubscriptionFilters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionFiltersResponse, Unit]): Request[DescribeSubscriptionFiltersResponse, AWSError] = js.native
  /**
    * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
    */
  def describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest): Request[DescribeSubscriptionFiltersResponse, AWSError] = js.native
  def describeSubscriptionFilters(
    params: DescribeSubscriptionFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionFiltersResponse, Unit]
  ): Request[DescribeSubscriptionFiltersResponse, AWSError] = js.native
  
  /**
    * Disassociates the associated KMS key from the specified log group. After the KMS key is disassociated from the log group, CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and CloudWatch Logs requires permissions for the KMS key whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
    */
  def disassociateKmsKey(): Request[js.Object, AWSError] = js.native
  def disassociateKmsKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates the associated KMS key from the specified log group. After the KMS key is disassociated from the log group, CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and CloudWatch Logs requires permissions for the KMS key whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
    */
  def disassociateKmsKey(params: DisassociateKmsKeyRequest): Request[js.Object, AWSError] = js.native
  def disassociateKmsKey(
    params: DisassociateKmsKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. You must have the logs;FilterLogEvents permission to perform this operation. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must include one of these two parameters, but you can't include both.  By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events) or all the events found within the specified time range. If the results include a token, that means there are more log events available. You can get additional results by specifying the token in a subsequent call. This operation can return empty results while there are more log events available through the token. The returned log events are sorted by event timestamp, the timestamp when the event was ingested by CloudWatch Logs, and the ID of the PutLogEvents request. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def filterLogEvents(): Request[FilterLogEventsResponse, AWSError] = js.native
  def filterLogEvents(callback: js.Function2[/* err */ AWSError, /* data */ FilterLogEventsResponse, Unit]): Request[FilterLogEventsResponse, AWSError] = js.native
  /**
    * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. You must have the logs;FilterLogEvents permission to perform this operation. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must include one of these two parameters, but you can't include both.  By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events) or all the events found within the specified time range. If the results include a token, that means there are more log events available. You can get additional results by specifying the token in a subsequent call. This operation can return empty results while there are more log events available through the token. The returned log events are sorted by event timestamp, the timestamp when the event was ingested by CloudWatch Logs, and the ID of the PutLogEvents request. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def filterLogEvents(params: FilterLogEventsRequest): Request[FilterLogEventsResponse, AWSError] = js.native
  def filterLogEvents(
    params: FilterLogEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FilterLogEventsResponse, Unit]
  ): Request[FilterLogEventsResponse, AWSError] = js.native
  
  /**
    * Returns information about a log group data protection policy.
    */
  def getDataProtectionPolicy(): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  def getDataProtectionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetDataProtectionPolicyResponse, Unit]): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  /**
    * Returns information about a log group data protection policy.
    */
  def getDataProtectionPolicy(params: GetDataProtectionPolicyRequest): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  def getDataProtectionPolicy(
    params: GetDataProtectionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataProtectionPolicyResponse, Unit]
  ): Request[GetDataProtectionPolicyResponse, AWSError] = js.native
  
  /**
    * Lists log events from the specified log stream. You can list all of the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call. This operation can return empty results while there are more log events available through the token. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must include one of these two parameters, but you can't include both. 
    */
  def getLogEvents(): Request[GetLogEventsResponse, AWSError] = js.native
  def getLogEvents(callback: js.Function2[/* err */ AWSError, /* data */ GetLogEventsResponse, Unit]): Request[GetLogEventsResponse, AWSError] = js.native
  /**
    * Lists log events from the specified log stream. You can list all of the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call. This operation can return empty results while there are more log events available through the token. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must include one of these two parameters, but you can't include both. 
    */
  def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse, AWSError] = js.native
  def getLogEvents(
    params: GetLogEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLogEventsResponse, Unit]
  ): Request[GetLogEventsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the fields that are included in log events in the specified log group. Includes the percentage of log events that contain each field. The search is limited to a time period that you specify. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must specify one of these parameters, but you can't specify both.  In the results, fields that start with @ are fields generated by CloudWatch Logs. For example, @timestamp is the timestamp of each log event. For more information about the fields that are generated by CloudWatch logs, see Supported Logs and Discovered Fields. The response results are sorted by the frequency percentage, starting with the highest percentage. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def getLogGroupFields(): Request[GetLogGroupFieldsResponse, AWSError] = js.native
  def getLogGroupFields(callback: js.Function2[/* err */ AWSError, /* data */ GetLogGroupFieldsResponse, Unit]): Request[GetLogGroupFieldsResponse, AWSError] = js.native
  /**
    * Returns a list of the fields that are included in log events in the specified log group. Includes the percentage of log events that contain each field. The search is limited to a time period that you specify. You can specify the log group to search by using either logGroupIdentifier or logGroupName. You must specify one of these parameters, but you can't specify both.  In the results, fields that start with @ are fields generated by CloudWatch Logs. For example, @timestamp is the timestamp of each log event. For more information about the fields that are generated by CloudWatch logs, see Supported Logs and Discovered Fields. The response results are sorted by the frequency percentage, starting with the highest percentage. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and view data from the linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def getLogGroupFields(params: GetLogGroupFieldsRequest): Request[GetLogGroupFieldsResponse, AWSError] = js.native
  def getLogGroupFields(
    params: GetLogGroupFieldsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLogGroupFieldsResponse, Unit]
  ): Request[GetLogGroupFieldsResponse, AWSError] = js.native
  
  /**
    * Retrieves all of the fields and values of a single log event. All fields are retrieved, even if the original query that produced the logRecordPointer retrieved only a subset of fields. Fields are returned as field name/field value pairs. The full unparsed log event is returned within @message.
    */
  def getLogRecord(): Request[GetLogRecordResponse, AWSError] = js.native
  def getLogRecord(callback: js.Function2[/* err */ AWSError, /* data */ GetLogRecordResponse, Unit]): Request[GetLogRecordResponse, AWSError] = js.native
  /**
    * Retrieves all of the fields and values of a single log event. All fields are retrieved, even if the original query that produced the logRecordPointer retrieved only a subset of fields. Fields are returned as field name/field value pairs. The full unparsed log event is returned within @message.
    */
  def getLogRecord(params: GetLogRecordRequest): Request[GetLogRecordResponse, AWSError] = js.native
  def getLogRecord(
    params: GetLogRecordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLogRecordResponse, Unit]
  ): Request[GetLogRecordResponse, AWSError] = js.native
  
  /**
    * Returns the results from the specified query. Only the fields requested in the query are returned, along with a @ptr field, which is the identifier for the log record. You can use the value of @ptr in a GetLogRecord operation to get the full log record.  GetQueryResults does not start running a query. To run a query, use StartQuery. If the value of the Status field in the output is Running, this operation returns only partial results. If you see a value of Scheduled or Running for the status, you can retry the operation later to see the final results.  If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account to start queries in linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def getQueryResults(): Request[GetQueryResultsResponse, AWSError] = js.native
  def getQueryResults(callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsResponse, Unit]): Request[GetQueryResultsResponse, AWSError] = js.native
  /**
    * Returns the results from the specified query. Only the fields requested in the query are returned, along with a @ptr field, which is the identifier for the log record. You can use the value of @ptr in a GetLogRecord operation to get the full log record.  GetQueryResults does not start running a query. To run a query, use StartQuery. If the value of the Status field in the output is Running, this operation returns only partial results. If you see a value of Scheduled or Running for the status, you can retry the operation later to see the final results.  If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account to start queries in linked source accounts. For more information, see CloudWatch cross-account observability.
    */
  def getQueryResults(params: GetQueryResultsRequest): Request[GetQueryResultsResponse, AWSError] = js.native
  def getQueryResults(
    params: GetQueryResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQueryResultsResponse, Unit]
  ): Request[GetQueryResultsResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with a CloudWatch Logs resource. Currently, log groups and destinations support tagging.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with a CloudWatch Logs resource. Currently, log groups and destinations support tagging.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  The ListTagsLogGroup operation is on the path to deprecation. We recommend that you use ListTagsForResource instead.  Lists the tags for the specified log group.
    */
  def listTagsLogGroup(): Request[ListTagsLogGroupResponse, AWSError] = js.native
  def listTagsLogGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsLogGroupResponse, Unit]): Request[ListTagsLogGroupResponse, AWSError] = js.native
  /**
    *  The ListTagsLogGroup operation is on the path to deprecation. We recommend that you use ListTagsForResource instead.  Lists the tags for the specified log group.
    */
  def listTagsLogGroup(params: ListTagsLogGroupRequest): Request[ListTagsLogGroupResponse, AWSError] = js.native
  def listTagsLogGroup(
    params: ListTagsLogGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsLogGroupResponse, Unit]
  ): Request[ListTagsLogGroupResponse, AWSError] = js.native
  
  /**
    * Creates a data protection policy for the specified log group. A data protection policy can help safeguard sensitive data that's ingested by the log group by auditing and masking the sensitive log data.  Sensitive data is detected and masked when it is ingested into the log group. When you set a data protection policy, log events ingested into the log group before that time are not masked.  By default, when a user views a log event that includes masked data, the sensitive data is replaced by asterisks. A user who has the logs:Unmask permission can use a GetLogEvents or FilterLogEvents operation with the unmask parameter set to true to view the unmasked log events. Users with the logs:Unmask can also view unmasked data in the CloudWatch Logs console by running a CloudWatch Logs Insights query with the unmask query command. For more information, including a list of types of data that can be audited and masked, see Protect sensitive log data with masking.
    */
  def putDataProtectionPolicy(): Request[PutDataProtectionPolicyResponse, AWSError] = js.native
  def putDataProtectionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutDataProtectionPolicyResponse, Unit]): Request[PutDataProtectionPolicyResponse, AWSError] = js.native
  /**
    * Creates a data protection policy for the specified log group. A data protection policy can help safeguard sensitive data that's ingested by the log group by auditing and masking the sensitive log data.  Sensitive data is detected and masked when it is ingested into the log group. When you set a data protection policy, log events ingested into the log group before that time are not masked.  By default, when a user views a log event that includes masked data, the sensitive data is replaced by asterisks. A user who has the logs:Unmask permission can use a GetLogEvents or FilterLogEvents operation with the unmask parameter set to true to view the unmasked log events. Users with the logs:Unmask can also view unmasked data in the CloudWatch Logs console by running a CloudWatch Logs Insights query with the unmask query command. For more information, including a list of types of data that can be audited and masked, see Protect sensitive log data with masking.
    */
  def putDataProtectionPolicy(params: PutDataProtectionPolicyRequest): Request[PutDataProtectionPolicyResponse, AWSError] = js.native
  def putDataProtectionPolicy(
    params: PutDataProtectionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDataProtectionPolicyResponse, Unit]
  ): Request[PutDataProtectionPolicyResponse, AWSError] = js.native
  
  /**
    * Creates or updates a destination. This operation is used only to create destinations for cross-account subscriptions. A destination encapsulates a physical resource (such as an Amazon Kinesis stream). With a destination, you can subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Through an access policy, a destination controls what is written to it. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination. To perform a PutDestination operation, you must also have the iam:PassRole permission.
    */
  def putDestination(): Request[PutDestinationResponse, AWSError] = js.native
  def putDestination(callback: js.Function2[/* err */ AWSError, /* data */ PutDestinationResponse, Unit]): Request[PutDestinationResponse, AWSError] = js.native
  /**
    * Creates or updates a destination. This operation is used only to create destinations for cross-account subscriptions. A destination encapsulates a physical resource (such as an Amazon Kinesis stream). With a destination, you can subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Through an access policy, a destination controls what is written to it. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination. To perform a PutDestination operation, you must also have the iam:PassRole permission.
    */
  def putDestination(params: PutDestinationRequest): Request[PutDestinationResponse, AWSError] = js.native
  def putDestination(
    params: PutDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDestinationResponse, Unit]
  ): Request[PutDestinationResponse, AWSError] = js.native
  
  /**
    * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
    */
  def putDestinationPolicy(): Request[js.Object, AWSError] = js.native
  def putDestinationPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
    */
  def putDestinationPolicy(params: PutDestinationPolicyRequest): Request[js.Object, AWSError] = js.native
  def putDestinationPolicy(
    params: PutDestinationPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Uploads a batch of log events to the specified log stream.  The sequence token is now ignored in PutLogEvents actions. PutLogEvents actions are always accepted and never return InvalidSequenceTokenException or DataAlreadyAcceptedException even if the sequence token is not valid. You can use parallel PutLogEvents actions on the same log stream.   The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be more than 14 days in the past. Also, none of the log events can be from earlier than the retention period of the log group.   The log events in the batch must be in chronological order by their timestamp. The timestamp is the time that the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In Amazon Web Services Tools for PowerShell and the Amazon Web Services SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   The maximum number of log events in a batch is 10,000.    The quota of five requests per second per log stream has been removed. Instead, PutLogEvents actions are throttled based on a per-second per-account quota. You can request an increase to the per-second throttling quota by using the Service Quotas service.    If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is a non-valid Amazon Web Services access key ID or secret key. 
    */
  def putLogEvents(): Request[PutLogEventsResponse, AWSError] = js.native
  def putLogEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutLogEventsResponse, Unit]): Request[PutLogEventsResponse, AWSError] = js.native
  /**
    * Uploads a batch of log events to the specified log stream.  The sequence token is now ignored in PutLogEvents actions. PutLogEvents actions are always accepted and never return InvalidSequenceTokenException or DataAlreadyAcceptedException even if the sequence token is not valid. You can use parallel PutLogEvents actions on the same log stream.   The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be more than 14 days in the past. Also, none of the log events can be from earlier than the retention period of the log group.   The log events in the batch must be in chronological order by their timestamp. The timestamp is the time that the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In Amazon Web Services Tools for PowerShell and the Amazon Web Services SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   The maximum number of log events in a batch is 10,000.    The quota of five requests per second per log stream has been removed. Instead, PutLogEvents actions are throttled based on a per-second per-account quota. You can request an increase to the per-second throttling quota by using the Service Quotas service.    If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is a non-valid Amazon Web Services access key ID or secret key. 
    */
  def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse, AWSError] = js.native
  def putLogEvents(
    params: PutLogEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLogEventsResponse, Unit]
  ): Request[PutLogEventsResponse, AWSError] = js.native
  
  /**
    * Creates or updates a metric filter and associates it with the specified log group. With metric filters, you can configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100. When you create a metric filter, you can also optionally assign a unit and dimensions to the metric that is created.  Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not specify high-cardinality fields such as IPAddress or requestID as dimensions. Each different value found for a dimension is treated as a separate metric and accrues charges as a separate custom metric.  CloudWatch Logs disables a metric filter if it generates 1,000 different name/value pairs for your specified dimensions within a certain amount of time. This helps to prevent accidental high charges. You can also set up a billing alarm to alert you if your charges are higher than expected. For more information, see  Creating a Billing Alarm to Monitor Your Estimated Amazon Web Services Charges.  
    */
  def putMetricFilter(): Request[js.Object, AWSError] = js.native
  def putMetricFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates a metric filter and associates it with the specified log group. With metric filters, you can configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100. When you create a metric filter, you can also optionally assign a unit and dimensions to the metric that is created.  Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not specify high-cardinality fields such as IPAddress or requestID as dimensions. Each different value found for a dimension is treated as a separate metric and accrues charges as a separate custom metric.  CloudWatch Logs disables a metric filter if it generates 1,000 different name/value pairs for your specified dimensions within a certain amount of time. This helps to prevent accidental high charges. You can also set up a billing alarm to alert you if your charges are higher than expected. For more information, see  Creating a Billing Alarm to Monitor Your Estimated Amazon Web Services Charges.  
    */
  def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object, AWSError] = js.native
  def putMetricFilter(
    params: PutMetricFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates a query definition for CloudWatch Logs Insights. For more information, see Analyzing Log Data with CloudWatch Logs Insights. To update a query definition, specify its queryDefinitionId in your request. The values of name, queryString, and logGroupNames are changed to the values that you specify in your update operation. No current values are retained from the current query definition. For example, imagine updating a current query definition that includes log groups. If you don't specify the logGroupNames parameter in your update operation, the query definition changes to contain no log groups. You must have the logs:PutQueryDefinition permission to be able to perform this operation.
    */
  def putQueryDefinition(): Request[PutQueryDefinitionResponse, AWSError] = js.native
  def putQueryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ PutQueryDefinitionResponse, Unit]): Request[PutQueryDefinitionResponse, AWSError] = js.native
  /**
    * Creates or updates a query definition for CloudWatch Logs Insights. For more information, see Analyzing Log Data with CloudWatch Logs Insights. To update a query definition, specify its queryDefinitionId in your request. The values of name, queryString, and logGroupNames are changed to the values that you specify in your update operation. No current values are retained from the current query definition. For example, imagine updating a current query definition that includes log groups. If you don't specify the logGroupNames parameter in your update operation, the query definition changes to contain no log groups. You must have the logs:PutQueryDefinition permission to be able to perform this operation.
    */
  def putQueryDefinition(params: PutQueryDefinitionRequest): Request[PutQueryDefinitionResponse, AWSError] = js.native
  def putQueryDefinition(
    params: PutQueryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutQueryDefinitionResponse, Unit]
  ): Request[PutQueryDefinitionResponse, AWSError] = js.native
  
  /**
    * Creates or updates a resource policy allowing other Amazon Web Services services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per Amazon Web Services Region.
    */
  def putResourcePolicy(): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]): Request[PutResourcePolicyResponse, AWSError] = js.native
  /**
    * Creates or updates a resource policy allowing other Amazon Web Services services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per Amazon Web Services Region.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyResponse, Unit]
  ): Request[PutResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Sets the retention of the specified log group. With a retention policy, you can configure the number of days for which to retain log events in the specified log group.  CloudWatch Logs doesn’t immediately delete log events when they reach their retention setting. It typically takes up to 72 hours after that before log events are deleted, but in rare situations might take longer. To illustrate, imagine that you change a log group to have a longer retention setting when it contains log events that are past the expiration date, but haven’t been deleted. Those log events will take up to 72 hours to be deleted after the new retention date is reached. To make sure that log data is deleted permanently, keep a log group at its lower retention setting until 72 hours after the previous retention period ends. Alternatively, wait to change the retention setting until you confirm that the earlier log events are deleted.  
    */
  def putRetentionPolicy(): Request[js.Object, AWSError] = js.native
  def putRetentionPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the retention of the specified log group. With a retention policy, you can configure the number of days for which to retain log events in the specified log group.  CloudWatch Logs doesn’t immediately delete log events when they reach their retention setting. It typically takes up to 72 hours after that before log events are deleted, but in rare situations might take longer. To illustrate, imagine that you change a log group to have a longer retention setting when it contains log events that are past the expiration date, but haven’t been deleted. Those log events will take up to 72 hours to be deleted after the new retention date is reached. To make sure that log data is deleted permanently, keep a log group at its lower retention setting until 72 hours after the previous retention period ends. Alternatively, wait to change the retention setting until you confirm that the earlier log events are deleted.  
    */
  def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object, AWSError] = js.native
  def putRetentionPolicy(
    params: PutRetentionPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates a subscription filter and associates it with the specified log group. With subscription filters, you can subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. When log events are sent to the receiving service, they are Base64 encoded and compressed with the GZIP format. The following destinations are supported for subscription filters:   An Amazon Kinesis data stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Data Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   Each log group can have up to two subscription filters associated with it. If you are updating an existing filter, you must specify the correct name in filterName.  To perform a PutSubscriptionFilter operation, you must also have the iam:PassRole permission.
    */
  def putSubscriptionFilter(): Request[js.Object, AWSError] = js.native
  def putSubscriptionFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates a subscription filter and associates it with the specified log group. With subscription filters, you can subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. When log events are sent to the receiving service, they are Base64 encoded and compressed with the GZIP format. The following destinations are supported for subscription filters:   An Amazon Kinesis data stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Data Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   Each log group can have up to two subscription filters associated with it. If you are updating an existing filter, you must specify the correct name in filterName.  To perform a PutSubscriptionFilter operation, you must also have the iam:PassRole permission.
    */
  def putSubscriptionFilter(params: PutSubscriptionFilterRequest): Request[js.Object, AWSError] = js.native
  def putSubscriptionFilter(
    params: PutSubscriptionFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to query and the query string to use. For more information, see CloudWatch Logs Insights Query Syntax. Queries time out after 15 minutes of runtime. If your queries are timing out, reduce the time range being searched or partition your query into a number of queries. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account to start a query in a linked source account. For more information, see CloudWatch cross-account observability. For a cross-account StartQuery operation, the query definition must be defined in the monitoring account. You can have up to 20 concurrent CloudWatch Logs insights queries, including queries that have been added to dashboards. 
    */
  def startQuery(): Request[StartQueryResponse, AWSError] = js.native
  def startQuery(callback: js.Function2[/* err */ AWSError, /* data */ StartQueryResponse, Unit]): Request[StartQueryResponse, AWSError] = js.native
  /**
    * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to query and the query string to use. For more information, see CloudWatch Logs Insights Query Syntax. Queries time out after 15 minutes of runtime. If your queries are timing out, reduce the time range being searched or partition your query into a number of queries. If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account to start a query in a linked source account. For more information, see CloudWatch cross-account observability. For a cross-account StartQuery operation, the query definition must be defined in the monitoring account. You can have up to 20 concurrent CloudWatch Logs insights queries, including queries that have been added to dashboards. 
    */
  def startQuery(params: StartQueryRequest): Request[StartQueryResponse, AWSError] = js.native
  def startQuery(
    params: StartQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartQueryResponse, Unit]
  ): Request[StartQueryResponse, AWSError] = js.native
  
  /**
    * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns an error indicating that the specified query is not running.
    */
  def stopQuery(): Request[StopQueryResponse, AWSError] = js.native
  def stopQuery(callback: js.Function2[/* err */ AWSError, /* data */ StopQueryResponse, Unit]): Request[StopQueryResponse, AWSError] = js.native
  /**
    * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns an error indicating that the specified query is not running.
    */
  def stopQuery(params: StopQueryRequest): Request[StopQueryResponse, AWSError] = js.native
  def stopQuery(
    params: StopQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopQueryResponse, Unit]
  ): Request[StopQueryResponse, AWSError] = js.native
  
  /**
    *  The TagLogGroup operation is on the path to deprecation. We recommend that you use TagResource instead.  Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsForResource. To remove tags, use UntagResource. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide. CloudWatch Logs doesn’t support IAM policies that prevent users from assigning specified tags to log groups using the aws:Resource/key-name  or aws:TagKeys condition keys. For more information about using tags to control access, see Controlling access to Amazon Web Services resources using tags.
    */
  def tagLogGroup(): Request[js.Object, AWSError] = js.native
  def tagLogGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The TagLogGroup operation is on the path to deprecation. We recommend that you use TagResource instead.  Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsForResource. To remove tags, use UntagResource. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide. CloudWatch Logs doesn’t support IAM policies that prevent users from assigning specified tags to log groups using the aws:Resource/key-name  or aws:TagKeys condition keys. For more information about using tags to control access, see Controlling access to Amazon Web Services resources using tags.
    */
  def tagLogGroup(params: TagLogGroupRequest): Request[js.Object, AWSError] = js.native
  def tagLogGroup(params: TagLogGroupRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch Logs resource. Currently, the only CloudWatch Logs resources that can be tagged are log groups and destinations.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the alarm, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a CloudWatch Logs resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch Logs resource. Currently, the only CloudWatch Logs resources that can be tagged are log groups and destinations.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the alarm, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a CloudWatch Logs resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
    */
  def testMetricFilter(): Request[TestMetricFilterResponse, AWSError] = js.native
  def testMetricFilter(callback: js.Function2[/* err */ AWSError, /* data */ TestMetricFilterResponse, Unit]): Request[TestMetricFilterResponse, AWSError] = js.native
  /**
    * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
    */
  def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse, AWSError] = js.native
  def testMetricFilter(
    params: TestMetricFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestMetricFilterResponse, Unit]
  ): Request[TestMetricFilterResponse, AWSError] = js.native
  
  /**
    *  The UntagLogGroup operation is on the path to deprecation. We recommend that you use UntagResource instead.  Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsForResource. To add tags, use TagResource. CloudWatch Logs doesn’t support IAM policies that prevent users from assigning specified tags to log groups using the aws:Resource/key-name  or aws:TagKeys condition keys. 
    */
  def untagLogGroup(): Request[js.Object, AWSError] = js.native
  def untagLogGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The UntagLogGroup operation is on the path to deprecation. We recommend that you use UntagResource instead.  Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsForResource. To add tags, use TagResource. CloudWatch Logs doesn’t support IAM policies that prevent users from assigning specified tags to log groups using the aws:Resource/key-name  or aws:TagKeys condition keys. 
    */
  def untagLogGroup(params: UntagLogGroupRequest): Request[js.Object, AWSError] = js.native
  def untagLogGroup(
    params: UntagLogGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
