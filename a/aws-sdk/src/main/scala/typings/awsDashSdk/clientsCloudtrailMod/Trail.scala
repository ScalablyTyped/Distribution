package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trail extends js.Object {
  /**
    * Specifies an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies if the trail has custom event selectors.
    */
  var HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined
  /**
    * The region in which the trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.undefined
  /**
    * Set to True to include AWS API calls from AWS global services such as IAM. Otherwise, False.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the trail belongs only to one region or exists in all regions.
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
    * Specifies whether log file validation is enabled.
    */
  var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the trail set by calling CreateTrail. The maximum length is 128 characters.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * Name of the Amazon S3 bucket into which CloudTrail delivers your trail files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.The maximum length is 200 characters.
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
    * Specifies the ARN of the trail. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}

object Trail {
  @scala.inline
  def apply(
    CloudWatchLogsLogGroupArn: String = null,
    CloudWatchLogsRoleArn: String = null,
    HasCustomEventSelectors: js.UndefOr[scala.Boolean] = js.undefined,
    HomeRegion: String = null,
    IncludeGlobalServiceEvents: js.UndefOr[scala.Boolean] = js.undefined,
    IsMultiRegionTrail: js.UndefOr[scala.Boolean] = js.undefined,
    IsOrganizationTrail: js.UndefOr[scala.Boolean] = js.undefined,
    KmsKeyId: String = null,
    LogFileValidationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    Name: String = null,
    S3BucketName: String = null,
    S3KeyPrefix: String = null,
    SnsTopicARN: String = null,
    SnsTopicName: String = null,
    TrailARN: String = null
  ): Trail = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsLogGroupArn != null) __obj.updateDynamic("CloudWatchLogsLogGroupArn")(CloudWatchLogsLogGroupArn)
    if (CloudWatchLogsRoleArn != null) __obj.updateDynamic("CloudWatchLogsRoleArn")(CloudWatchLogsRoleArn)
    if (!js.isUndefined(HasCustomEventSelectors)) __obj.updateDynamic("HasCustomEventSelectors")(HasCustomEventSelectors)
    if (HomeRegion != null) __obj.updateDynamic("HomeRegion")(HomeRegion)
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
    __obj.asInstanceOf[Trail]
  }
}

