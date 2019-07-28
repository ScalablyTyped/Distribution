package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationS3Request extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
    */
  var S3BucketArn: typings.awsDashSdk.clientsDatasyncMod.S3BucketArn
  var S3Config: typings.awsDashSdk.clientsDatasyncMod.S3Config
  /**
    * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
    */
  var Subdirectory: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.Subdirectory] = js.undefined
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateLocationS3Request {
  @scala.inline
  def apply(
    S3BucketArn: S3BucketArn,
    S3Config: S3Config,
    Subdirectory: Subdirectory = null,
    Tags: TagList = null
  ): CreateLocationS3Request = {
    val __obj = js.Dynamic.literal(S3BucketArn = S3BucketArn, S3Config = S3Config)
    if (Subdirectory != null) __obj.updateDynamic("Subdirectory")(Subdirectory)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLocationS3Request]
  }
}

