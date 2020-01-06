package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowRunCommandParameters extends js.Object {
  var CloudWatchOutputConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CloudWatchOutputConfig] = js.native
  /**
    * Information about the commands to run.
    */
  var Comment: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Comment] = js.native
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var DocumentHash: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentHash] = js.native
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
    */
  var DocumentHashType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentHashType] = js.native
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis.
    */
  var NotificationConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NotificationConfig] = js.native
  /**
    * The name of the Amazon S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The Amazon S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameters] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * If this time is reached and the command has not already started running, it doesn't run.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TimeoutSeconds] = js.native
}

object MaintenanceWindowRunCommandParameters {
  @scala.inline
  def apply(
    CloudWatchOutputConfig: CloudWatchOutputConfig = null,
    Comment: Comment = null,
    DocumentHash: DocumentHash = null,
    DocumentHashType: DocumentHashType = null,
    DocumentVersion: DocumentVersion = null,
    NotificationConfig: NotificationConfig = null,
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    Parameters: Parameters = null,
    ServiceRoleArn: ServiceRole = null,
    TimeoutSeconds: Int | Double = null
  ): MaintenanceWindowRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (DocumentHash != null) __obj.updateDynamic("DocumentHash")(DocumentHash.asInstanceOf[js.Any])
    if (DocumentHashType != null) __obj.updateDynamic("DocumentHashType")(DocumentHashType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig.asInstanceOf[js.Any])
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName.asInstanceOf[js.Any])
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn.asInstanceOf[js.Any])
    if (TimeoutSeconds != null) __obj.updateDynamic("TimeoutSeconds")(TimeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
  }
}

