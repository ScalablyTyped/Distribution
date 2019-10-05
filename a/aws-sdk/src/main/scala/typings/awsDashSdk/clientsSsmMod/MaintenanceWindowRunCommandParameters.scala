package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowRunCommandParameters extends js.Object {
  /**
    * Information about the commands to run.
    */
  var Comment: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Comment] = js.undefined
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var DocumentHash: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentHash] = js.undefined
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
    */
  var DocumentHashType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentHashType] = js.undefined
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis.
    */
  var NotificationConfig: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NotificationConfig] = js.undefined
  /**
    * The name of the Amazon S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * The Amazon S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * The parameters for the RUN_COMMAND task execution.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameters] = js.undefined
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  /**
    * If this time is reached and the command has not already started running, it doesn't run.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TimeoutSeconds] = js.undefined
}

object MaintenanceWindowRunCommandParameters {
  @scala.inline
  def apply(
    Comment: Comment = null,
    DocumentHash: DocumentHash = null,
    DocumentHashType: DocumentHashType = null,
    NotificationConfig: NotificationConfig = null,
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    Parameters: Parameters = null,
    ServiceRoleArn: ServiceRole = null,
    TimeoutSeconds: Int | Double = null
  ): MaintenanceWindowRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (DocumentHash != null) __obj.updateDynamic("DocumentHash")(DocumentHash)
    if (DocumentHashType != null) __obj.updateDynamic("DocumentHashType")(DocumentHashType.asInstanceOf[js.Any])
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig)
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName)
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (TimeoutSeconds != null) __obj.updateDynamic("TimeoutSeconds")(TimeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
  }
}

