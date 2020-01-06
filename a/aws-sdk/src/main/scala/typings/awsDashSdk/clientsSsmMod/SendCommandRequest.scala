package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandRequest extends js.Object {
  /**
    * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs. 
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CloudWatchOutputConfig] = js.native
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Comment] = js.native
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var DocumentHash: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentHash] = js.native
  /**
    * Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var DocumentHashType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentHashType] = js.native
  /**
    * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
    */
  var DocumentName: DocumentARN = js.native
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which accepts EC2 tags. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.native
  /**
    * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Using Concurrency Controls in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see Using Error Controls in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.native
  /**
    * Configurations for sending notifications.
    */
  var NotificationConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NotificationConfig] = js.native
  /**
    * The name of the S3 bucket where command execution responses should be stored.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The directory structure within the S3 bucket where the responses should be stored.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  /**
    * The required and optional parameters specified in the document being run.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameters] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for Run Command commands.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.native
  /**
    * If this time is reached and the command has not already started running, it will not run.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TimeoutSeconds] = js.native
}

object SendCommandRequest {
  @scala.inline
  def apply(
    DocumentName: DocumentARN,
    CloudWatchOutputConfig: CloudWatchOutputConfig = null,
    Comment: Comment = null,
    DocumentHash: DocumentHash = null,
    DocumentHashType: DocumentHashType = null,
    DocumentVersion: DocumentVersion = null,
    InstanceIds: InstanceIdList = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    NotificationConfig: NotificationConfig = null,
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    OutputS3Region: S3Region = null,
    Parameters: Parameters = null,
    ServiceRoleArn: ServiceRole = null,
    Targets: Targets = null,
    TimeoutSeconds: Int | Double = null
  ): SendCommandRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (DocumentHash != null) __obj.updateDynamic("DocumentHash")(DocumentHash.asInstanceOf[js.Any])
    if (DocumentHashType != null) __obj.updateDynamic("DocumentHashType")(DocumentHashType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig.asInstanceOf[js.Any])
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName.asInstanceOf[js.Any])
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix.asInstanceOf[js.Any])
    if (OutputS3Region != null) __obj.updateDynamic("OutputS3Region")(OutputS3Region.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    if (TimeoutSeconds != null) __obj.updateDynamic("TimeoutSeconds")(TimeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCommandRequest]
  }
}

