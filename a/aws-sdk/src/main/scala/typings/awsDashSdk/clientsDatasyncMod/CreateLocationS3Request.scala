package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationS3Request extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
    */
  var S3BucketArn: typings.awsDashSdk.clientsDatasyncMod.S3BucketArn = js.native
  var S3Config: typings.awsDashSdk.clientsDatasyncMod.S3Config = js.native
  /**
    * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. For more information about S3 storage classes, see Amazon S3 Storage Classes in the Amazon Simple Storage Service Developer Guide. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes.
    */
  var S3StorageClass: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.S3StorageClass] = js.native
  /**
    * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
    */
  var Subdirectory: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.Subdirectory] = js.native
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateLocationS3Request {
  @scala.inline
  def apply(
    S3BucketArn: S3BucketArn,
    S3Config: S3Config,
    S3StorageClass: S3StorageClass = null,
    Subdirectory: Subdirectory = null,
    Tags: TagList = null
  ): CreateLocationS3Request = {
    val __obj = js.Dynamic.literal(S3BucketArn = S3BucketArn.asInstanceOf[js.Any], S3Config = S3Config.asInstanceOf[js.Any])
    if (S3StorageClass != null) __obj.updateDynamic("S3StorageClass")(S3StorageClass.asInstanceOf[js.Any])
    if (Subdirectory != null) __obj.updateDynamic("Subdirectory")(Subdirectory.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationS3Request]
  }
}

