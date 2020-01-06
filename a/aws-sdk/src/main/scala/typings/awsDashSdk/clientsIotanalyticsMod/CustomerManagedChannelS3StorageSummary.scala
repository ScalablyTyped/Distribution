package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerManagedChannelS3StorageSummary extends js.Object {
  /**
    * The name of the Amazon S3 bucket in which channel data is stored.
    */
  var bucket: js.UndefOr[BucketName] = js.native
  /**
    * [Optional] The prefix used to create the keys of the channel data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). The prefix must end with a '/'.
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object CustomerManagedChannelS3StorageSummary {
  @scala.inline
  def apply(bucket: BucketName = null, keyPrefix: S3KeyPrefix = null, roleArn: RoleArn = null): CustomerManagedChannelS3StorageSummary = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedChannelS3StorageSummary]
  }
}

