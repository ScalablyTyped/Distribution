package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerManagedChannelS3Storage extends js.Object {
  /**
    * The name of the Amazon S3 bucket in which channel data is stored.
    */
  var bucket: BucketName = js.native
  /**
    * [Optional] The prefix used to create the keys of the channel data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). The prefix must end with a '/'.
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: RoleArn = js.native
}

object CustomerManagedChannelS3Storage {
  @scala.inline
  def apply(bucket: BucketName, roleArn: RoleArn, keyPrefix: S3KeyPrefix = null): CustomerManagedChannelS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedChannelS3Storage]
  }
}

