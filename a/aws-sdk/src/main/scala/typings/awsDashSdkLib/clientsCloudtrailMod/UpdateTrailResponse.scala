package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTrailResponse extends js.Object {
  /**
    * Specifies the Amazon Resource Name (ARN) of the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the trail exists in one region or in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the trail is an organization trail.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether log file integrity validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the name of the trail.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
  /**
    * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
    */
  var SnsTopicARN: js.UndefOr[String] = js.undefined
  /**
    * This field is deprecated. Use SnsTopicARN.
    */
  var SnsTopicName: js.UndefOr[String] = js.undefined
  /**
    * Specifies the ARN of the trail that was updated. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}

object UpdateTrailResponse {
  @scala.inline
  def apply(
    CloudWatchLogsLogGroupArn: String = null,
    CloudWatchLogsRoleArn: String = null,
    IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
    IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
    IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: String = null,
    LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
    Name: String = null,
    S3BucketName: String = null,
    S3KeyPrefix: String = null,
    SnsTopicARN: String = null,
    SnsTopicName: String = null,
    TrailARN: String = null
  ): UpdateTrailResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsLogGroupArn != null) __obj.updateDynamic("CloudWatchLogsLogGroupArn")(CloudWatchLogsLogGroupArn)
    if (CloudWatchLogsRoleArn != null) __obj.updateDynamic("CloudWatchLogsRoleArn")(CloudWatchLogsRoleArn)
    if (!js.isUndefined(IncludeGlobalServiceEvents)) __obj.updateDynamic("IncludeGlobalServiceEvents")(IncludeGlobalServiceEvents)
    if (!js.isUndefined(IsMultiRegionTrail)) __obj.updateDynamic("IsMultiRegionTrail")(IsMultiRegionTrail)
    if (!js.isUndefined(IsOrganizationTrail)) __obj.updateDynamic("IsOrganizationTrail")(IsOrganizationTrail)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(LogFileValidationEnabled)) __obj.updateDynamic("LogFileValidationEnabled")(LogFileValidationEnabled)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix)
    if (SnsTopicARN != null) __obj.updateDynamic("SnsTopicARN")(SnsTopicARN)
    if (SnsTopicName != null) __obj.updateDynamic("SnsTopicName")(SnsTopicName)
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN)
    __obj.asInstanceOf[UpdateTrailResponse]
  }
}

