package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CloudWatchOutputConfig] = js.undefined
  /**
    * A unique identifier for this command.
    */
  var CommandId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CommandId] = js.undefined
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Comment] = js.undefined
  /**
    * The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
    */
  var CompletedCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CompletedCount] = js.undefined
  /**
    * The number of targets for which the status is Delivery Timed Out.
    */
  var DeliveryTimedOutCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DeliveryTimedOutCount] = js.undefined
  /**
    * The name of the document requested for execution.
    */
  var DocumentName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentName] = js.undefined
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The number of targets for which the status is Failed or Execution Timed Out.
    */
  var ErrorCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ErrorCount] = js.undefined
  /**
    * If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.
    */
  var ExpiresAfter: js.UndefOr[DateTime] = js.undefined
  /**
    * The instance IDs against which this command was requested.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  /**
    * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Running Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see Running Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * Configurations for sending notifications about command status changes. 
    */
  var NotificationConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NotificationConfig] = js.undefined
  /**
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.undefined
  /**
    * The parameter values to be inserted in the document when running the command.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameters] = js.undefined
  /**
    * The date and time the command was requested.
    */
  var RequestedDateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. 
    */
  var ServiceRole: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ServiceRole] = js.undefined
  /**
    * The status of the command.
    */
  var Status: js.UndefOr[CommandStatus] = js.undefined
  /**
    * A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to any instances.   In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.   Success: The command successfully ran on all invocations. This is a terminal state.   Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.   Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.   Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.   Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsDashSdk.clientsSsmMod.StatusDetails] = js.undefined
  /**
    * The number of targets for the command.
    */
  var TargetCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetCount] = js.undefined
  /**
    * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    CloudWatchOutputConfig: CloudWatchOutputConfig = null,
    CommandId: CommandId = null,
    Comment: Comment = null,
    CompletedCount: Int | Double = null,
    DeliveryTimedOutCount: Int | Double = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    ErrorCount: Int | Double = null,
    ExpiresAfter: DateTime = null,
    InstanceIds: InstanceIdList = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    NotificationConfig: NotificationConfig = null,
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    OutputS3Region: S3Region = null,
    Parameters: Parameters = null,
    RequestedDateTime: DateTime = null,
    ServiceRole: ServiceRole = null,
    Status: CommandStatus = null,
    StatusDetails: StatusDetails = null,
    TargetCount: Int | Double = null,
    Targets: Targets = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig)
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (CompletedCount != null) __obj.updateDynamic("CompletedCount")(CompletedCount.asInstanceOf[js.Any])
    if (DeliveryTimedOutCount != null) __obj.updateDynamic("DeliveryTimedOutCount")(DeliveryTimedOutCount.asInstanceOf[js.Any])
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (ErrorCount != null) __obj.updateDynamic("ErrorCount")(ErrorCount.asInstanceOf[js.Any])
    if (ExpiresAfter != null) __obj.updateDynamic("ExpiresAfter")(ExpiresAfter)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig)
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName)
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix)
    if (OutputS3Region != null) __obj.updateDynamic("OutputS3Region")(OutputS3Region)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (RequestedDateTime != null) __obj.updateDynamic("RequestedDateTime")(RequestedDateTime)
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (TargetCount != null) __obj.updateDynamic("TargetCount")(TargetCount.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[Command]
  }
}

