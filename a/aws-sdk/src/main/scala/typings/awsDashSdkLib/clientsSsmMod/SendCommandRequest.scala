package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendCommandRequest extends js.Object {
  /**
    * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs. 
    */
  var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[Comment] = js.undefined
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var DocumentHash: js.UndefOr[DocumentHash] = js.undefined
  /**
    * Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var DocumentHashType: js.UndefOr[DocumentHashType] = js.undefined
  /**
    * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
    */
  var DocumentName: DocumentARN
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which accepts EC2 tags. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  /**
    * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Using Concurrency Controls in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  /**
    * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see Using Error Controls in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
  /**
    * Configurations for sending notifications.
    */
  var NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  /**
    * The name of the S3 bucket where command execution responses should be stored.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * The directory structure within the S3 bucket where the responses should be stored.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.undefined
  /**
    * The required and optional parameters specified in the document being run.
    */
  var Parameters: js.UndefOr[Parameters] = js.undefined
  /**
    * The IAM role that Systems Manager uses to send notifications. 
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var Targets: js.UndefOr[Targets] = js.undefined
  /**
    * If this time is reached and the command has not already started running, it will not run.
    */
  var TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
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
    TimeoutSeconds: js.UndefOr[TimeoutSeconds] = js.undefined
  ): SendCommandRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName)
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (DocumentHash != null) __obj.updateDynamic("DocumentHash")(DocumentHash)
    if (DocumentHashType != null) __obj.updateDynamic("DocumentHashType")(DocumentHashType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig)
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName)
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix)
    if (OutputS3Region != null) __obj.updateDynamic("OutputS3Region")(OutputS3Region)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (!js.isUndefined(TimeoutSeconds)) __obj.updateDynamic("TimeoutSeconds")(TimeoutSeconds)
    __obj.asInstanceOf[SendCommandRequest]
  }
}

