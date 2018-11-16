package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogs
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudWatchLogs: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ClientConfiguration = js.native
  /**
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log group. Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK. After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. Note that it can take up to 5 minutes for this operation to take effect. If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def associateKmsKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log group. Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK. After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. Note that it can take up to 5 minutes for this operation to take effect. If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def associateKmsKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log group. Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK. After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. Note that it can take up to 5 minutes for this operation to take effect. If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def associateKmsKey(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.AssociateKmsKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log group. Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK. After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. Note that it can take up to 5 minutes for this operation to take effect. If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def associateKmsKey(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.AssociateKmsKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
     */
  def cancelExportTask(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
     */
  def cancelExportTask(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
     */
  def cancelExportTask(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CancelExportTaskRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Cancels the specified export task. The task must be in the PENDING or RUNNING state.
     */
  def cancelExportTask(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CancelExportTaskRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket. This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
     */
  def createExportTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket. This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
     */
  def createExportTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket. This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
     */
  def createExportTask(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket. This is an asynchronous call. If all the required information is provided, this operation initiates an export task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to get the status of the export task. Each account can only have one active (RUNNING or PENDING) export task at a time. To cancel an export task, use CancelExportTask. You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
     */
  def createExportTask(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateExportTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a log group with the specified name. You can create up to 5000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a region for an AWS account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def createLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log group with the specified name. You can create up to 5000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a region for an AWS account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def createLogGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log group with the specified name. You can create up to 5000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a region for an AWS account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def createLogGroup(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log group with the specified name. You can create up to 5000 log groups per account. You must use the following guidelines when naming a log group:   Log group names must be unique within a region for an AWS account.   Log group names can be between 1 and 512 characters long.   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested. If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will receive an InvalidParameterException error. 
     */
  def createLogGroup(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateLogGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log stream for the specified log group. There is no limit on the number of log streams that you can create for a log group. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   The ':' (colon) and '*' (asterisk) characters are not allowed.  
     */
  def createLogStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log stream for the specified log group. There is no limit on the number of log streams that you can create for a log group. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   The ':' (colon) and '*' (asterisk) characters are not allowed.  
     */
  def createLogStream(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log stream for the specified log group. There is no limit on the number of log streams that you can create for a log group. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   The ':' (colon) and '*' (asterisk) characters are not allowed.  
     */
  def createLogStream(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateLogStreamRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a log stream for the specified log group. There is no limit on the number of log streams that you can create for a log group. You must use the following guidelines when naming a log stream:   Log stream names must be unique within the log group.   Log stream names can be between 1 and 512 characters long.   The ':' (colon) and '*' (asterisk) characters are not allowed.  
     */
  def createLogStream(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.CreateLogStreamRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
     */
  def deleteDestination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
     */
  def deleteDestination(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
     */
  def deleteDestination(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteDestinationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This operation does not delete the physical resource encapsulated by the destination.
     */
  def deleteDestination(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteDestinationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
     */
  def deleteLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
     */
  def deleteLogGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
     */
  def deleteLogGroup(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log group.
     */
  def deleteLogGroup(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteLogGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
     */
  def deleteLogStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
     */
  def deleteLogStream(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
     */
  def deleteLogStream(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteLogStreamRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log stream.
     */
  def deleteLogStream(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteLogStreamRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified metric filter.
     */
  def deleteMetricFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified metric filter.
     */
  def deleteMetricFilter(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified metric filter.
     */
  def deleteMetricFilter(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteMetricFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified metric filter.
     */
  def deleteMetricFilter(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteMetricFilterRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
     */
  def deleteResourcePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
     */
  def deleteResourcePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
     */
  def deleteResourcePolicy(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log events to this account.
     */
  def deleteResourcePolicy(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
     */
  def deleteRetentionPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
     */
  def deleteRetentionPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
     */
  def deleteRetentionPolicy(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteRetentionPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified retention policy. Log events do not expire if they belong to log groups without a retention policy.
     */
  def deleteRetentionPolicy(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteRetentionPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription filter.
     */
  def deleteSubscriptionFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription filter.
     */
  def deleteSubscriptionFilter(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription filter.
     */
  def deleteSubscriptionFilter(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteSubscriptionFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified subscription filter.
     */
  def deleteSubscriptionFilter(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DeleteSubscriptionFilterRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     */
  def describeDestinations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     */
  def describeDestinations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     */
  def describeDestinations(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     */
  def describeDestinations(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
     */
  def describeExportTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
     */
  def describeExportTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
     */
  def describeExportTasks(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or task status.
     */
  def describeExportTasks(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeExportTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name.
     */
  def describeLogGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name.
     */
  def describeLogGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name.
     */
  def describeLogGroups(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are ASCII-sorted by log group name.
     */
  def describeLogGroups(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. This operation has a limit of five transactions per second, after which transactions are throttled.
     */
  def describeLogStreams(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. This operation has a limit of five transactions per second, after which transactions are throttled.
     */
  def describeLogStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. This operation has a limit of five transactions per second, after which transactions are throttled.
     */
  def describeLogStreams(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by prefix. You can also control how the results are ordered. This operation has a limit of five transactions per second, after which transactions are throttled.
     */
  def describeLogStreams(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeLogStreamsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     */
  def describeMetricFilters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     */
  def describeMetricFilters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     */
  def describeMetricFilters(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name, prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     */
  def describeMetricFilters(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeMetricFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resource policies in this account.
     */
  def describeResourcePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resource policies in this account.
     */
  def describeResourcePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resource policies in this account.
     */
  def describeResourcePolicies(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resource policies in this account.
     */
  def describeResourcePolicies(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeResourcePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
     */
  def describeSubscriptionFilters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
     */
  def describeSubscriptionFilters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
     */
  def describeSubscriptionFilters(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter the results by prefix. The results are ASCII-sorted by filter name.
     */
  def describeSubscriptionFilters(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DescribeSubscriptionFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified log group. After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires permissions for the CMK whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
     */
  def disassociateKmsKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified log group. After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires permissions for the CMK whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
     */
  def disassociateKmsKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified log group. After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires permissions for the CMK whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
     */
  def disassociateKmsKey(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DisassociateKmsKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified log group. After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires permissions for the CMK whenever the encrypted data is requested. Note that it can take up to 5 minutes for this operation to take effect.
     */
  def disassociateKmsKey(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.DisassociateKmsKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the events found within the time range that you specify. If the results include a token, then there are more log events available, and you can get additional results by specifying the token in a subsequent call.
     */
  def filterLogEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the events found within the time range that you specify. If the results include a token, then there are more log events available, and you can get additional results by specifying the token in a subsequent call.
     */
  def filterLogEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the events found within the time range that you specify. If the results include a token, then there are more log events available, and you can get additional results by specifying the token in a subsequent call.
     */
  def filterLogEvents(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log group. You can list all the log events or filter the results using a filter pattern, a time range, and the name of the log stream. By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the events found within the time range that you specify. If the results include a token, then there are more log events available, and you can get additional results by specifying the token in a subsequent call.
     */
  def filterLogEvents(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.FilterLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call.
     */
  def getLogEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call.
     */
  def getLogEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call.
     */
  def getLogEvents(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range. By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log events). You can get additional log events by specifying one of the tokens in a subsequent call.
     */
  def getLogEvents(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.GetLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags for the specified log group.
     */
  def listTagsLogGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags for the specified log group.
     */
  def listTagsLogGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags for the specified log group.
     */
  def listTagsLogGroup(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags for the specified log group.
     */
  def listTagsLogGroup(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.ListTagsLogGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Currently, the only supported physical resource is a Kinesis stream belonging to the same account as the destination. Through an access policy, a destination controls what is written to its Kinesis stream. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination.
     */
  def putDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Currently, the only supported physical resource is a Kinesis stream belonging to the same account as the destination. Through an access policy, a destination controls what is written to its Kinesis stream. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination.
     */
  def putDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Currently, the only supported physical resource is a Kinesis stream belonging to the same account as the destination. Through an access policy, a destination controls what is written to its Kinesis stream. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination.
     */
  def putDestination(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using PutLogEvents. Currently, the only supported physical resource is a Kinesis stream belonging to the same account as the destination. Through an access policy, a destination controls what is written to its Kinesis stream. By default, PutDestination does not set any access policy with the destination, which means a cross-account user cannot call PutSubscriptionFilter against this destination. To enable this, the destination owner must call PutDestinationPolicy after PutDestination.
     */
  def putDestination(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
     */
  def putDestinationPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
     */
  def putDestinationPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
     */
  def putDestinationPolicy(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is used to authorize claims to register a subscription filter against a given destination.
     */
  def putDestinationPolicy(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutDestinationPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Uploads a batch of log events to the specified log stream. You must include the sequence token obtained from the response of the previous call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected. The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be older than 14 days or the retention period of the log group.   The log events in the batch must be in chronological ordered by their time stamp. The time stamp is the time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    The maximum number of log events in a batch is 10,000.   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access key ID or secret key. 
     */
  def putLogEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a batch of log events to the specified log stream. You must include the sequence token obtained from the response of the previous call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected. The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be older than 14 days or the retention period of the log group.   The log events in the batch must be in chronological ordered by their time stamp. The time stamp is the time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    The maximum number of log events in a batch is 10,000.   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access key ID or secret key. 
     */
  def putLogEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a batch of log events to the specified log stream. You must include the sequence token obtained from the response of the previous call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected. The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be older than 14 days or the retention period of the log group.   The log events in the batch must be in chronological ordered by their time stamp. The time stamp is the time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    The maximum number of log events in a batch is 10,000.   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access key ID or secret key. 
     */
  def putLogEvents(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a batch of log events to the specified log stream. You must include the sequence token obtained from the response of the previous call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected. The batch of events must satisfy the following constraints:   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.   None of the log events in the batch can be more than 2 hours in the future.   None of the log events in the batch can be older than 14 days or the retention period of the log group.   The log events in the batch must be in chronological ordered by their time stamp. The time stamp is the time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example, 2017-09-15T13:45:30.)    The maximum number of log events in a batch is 10,000.   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.   If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access key ID or secret key. 
     */
  def putLogEvents(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutLogEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100.
     */
  def putMetricFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100.
     */
  def putMetricFilter(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100.
     */
  def putMetricFilter(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutMetricFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to configure rules to extract metric data from log events ingested through PutLogEvents. The maximum number of metric filters that can be associated with a log group is 100.
     */
  def putMetricFilter(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutMetricFilterRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per region.
     */
  def putResourcePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per region.
     */
  def putResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per region.
     */
  def putResourcePolicy(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as Amazon Route 53. An account can have up to 10 resource policies per region.
     */
  def putResourcePolicy(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for which to retain log events in the specified log group.
     */
  def putRetentionPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for which to retain log events in the specified log group.
     */
  def putRetentionPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for which to retain log events in the specified log group.
     */
  def putRetentionPolicy(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutRetentionPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for which to retain log events in the specified log group.
     */
  def putRetentionPolicy(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutRetentionPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   There can only be one subscription filter associated with a log group. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group.
     */
  def putSubscriptionFilter(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   There can only be one subscription filter associated with a log group. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group.
     */
  def putSubscriptionFilter(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   There can only be one subscription filter associated with a log group. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group.
     */
  def putSubscriptionFilter(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutSubscriptionFilterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them delivered to a specific destination. Currently, the supported destinations are:   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.   A logical destination that belongs to a different account, for cross-account delivery.   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for same-account delivery.   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.   There can only be one subscription filter associated with a log group. If you are updating an existing filter, you must specify the correct name in filterName. Otherwise, the call fails because you cannot associate a second filter with a log group.
     */
  def putSubscriptionFilter(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.PutSubscriptionFilterRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide.
     */
  def tagLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide.
     */
  def tagLogGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide.
     */
  def tagLogGroup(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TagLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the specified tags for the specified log group. To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup. For more information about tags, see Tag Log Groups in Amazon CloudWatch Logs in the Amazon CloudWatch Logs User Guide.
     */
  def tagLogGroup(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TagLogGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
     */
  def testMetricFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
     */
  def testMetricFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
     */
  def testMetricFilter(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to validate the correctness of a metric filter pattern.
     */
  def testMetricFilter(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.TestMetricFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.
     */
  def untagLogGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.
     */
  def untagLogGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.
     */
  def untagLogGroup(params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.UntagLogGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified log group. To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.
     */
  def untagLogGroup(
    params: awsDashSdkLib.clientsCloudwatchlogsMod.CloudWatchLogsNs.UntagLogGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

