package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipeline extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the pipeline.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline. If you use either s3 or s3-aws-kms as your Encryption:Mode, you don't need to provide a key with your job because a default key, known as an AWS-KMS key, is created for you automatically. You need to provide an AWS-KMS key only if you want to use a non-default AWS-KMS key, or if you are using an Encryption:Mode of aes-cbc-pkcs7, aes-ctr, or aes-gcm.
    */
  var AwsKmsKeyArn: js.UndefOr[KeyArn] = js.undefined
  /**
    * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. Either you specify both ContentConfig and ThumbnailConfig, or you specify OutputBucket.    Bucket: The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.    Permissions: A list of the users and/or predefined Amazon S3 groups you want to have access to transcoded files and playlists, and the type of access that you want them to have.    GranteeType: The type of value that appears in the Grantee object:     Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.    Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.      Grantee: The AWS user or group that you want to have access to transcoded files and playlists.    Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:    READ: The grantee can read the objects and metadata for objects that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for objects that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the objects that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the objects that Elastic Transcoder adds to the Amazon S3 bucket.        StorageClass: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.   
    */
  var ContentConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
  /**
    * The identifier for the pipeline. You use this value to identify the pipeline in which you want to perform a variety of operations, such as creating a job or a preset.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Id] = js.undefined
  /**
    * The Amazon S3 bucket from which Elastic Transcoder gets media files for transcoding and the graphics files, if any, that you want to use for watermarks.
    */
  var InputBucket: js.UndefOr[BucketName] = js.undefined
  /**
    * The name of the pipeline. We recommend that the name be unique within the AWS account, but uniqueness is not enforced. Constraints: Maximum 40 characters
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Name] = js.undefined
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.  To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.     Progressing (optional): The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.    Complete (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.    Warning (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.    Error (optional): The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.  
    */
  var Notifications: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Notifications] = js.undefined
  /**
    * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files, thumbnails, and playlists. Either you specify this value, or you specify both ContentConfig and ThumbnailConfig.
    */
  var OutputBucket: js.UndefOr[BucketName] = js.undefined
  /**
    * The IAM Amazon Resource Name (ARN) for the role that Elastic Transcoder uses to transcode jobs for this pipeline.
    */
  var Role: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Role] = js.undefined
  /**
    * The current status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: js.UndefOr[PipelineStatus] = js.undefined
  /**
    * Information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. Either you specify both ContentConfig and ThumbnailConfig, or you specify OutputBucket.    Bucket: The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.     Permissions: A list of the users and/or predefined Amazon S3 groups you want to have access to thumbnail files, and the type of access that you want them to have.    GranteeType: The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.      Grantee: The AWS user or group that you want to have access to thumbnail files.   Access: The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.        StorageClass: The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.  
    */
  var ThumbnailConfig: js.UndefOr[PipelineOutputConfig] = js.undefined
}

object Pipeline {
  @scala.inline
  def apply(
    Arn: String = null,
    AwsKmsKeyArn: KeyArn = null,
    ContentConfig: PipelineOutputConfig = null,
    Id: Id = null,
    InputBucket: BucketName = null,
    Name: Name = null,
    Notifications: Notifications = null,
    OutputBucket: BucketName = null,
    Role: Role = null,
    Status: PipelineStatus = null,
    ThumbnailConfig: PipelineOutputConfig = null
  ): Pipeline = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (AwsKmsKeyArn != null) __obj.updateDynamic("AwsKmsKeyArn")(AwsKmsKeyArn)
    if (ContentConfig != null) __obj.updateDynamic("ContentConfig")(ContentConfig)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InputBucket != null) __obj.updateDynamic("InputBucket")(InputBucket)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications)
    if (OutputBucket != null) __obj.updateDynamic("OutputBucket")(OutputBucket)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (ThumbnailConfig != null) __obj.updateDynamic("ThumbnailConfig")(ThumbnailConfig)
    __obj.asInstanceOf[Pipeline]
  }
}

