package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3OutputLocation extends js.Object {
  /**
    * The name of the Amazon S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * The Amazon S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.undefined
}

object S3OutputLocation {
  @scala.inline
  def apply(
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    OutputS3Region: S3Region = null
  ): S3OutputLocation = {
    val __obj = js.Dynamic.literal()
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName)
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix)
    if (OutputS3Region != null) __obj.updateDynamic("OutputS3Region")(OutputS3Region)
    __obj.asInstanceOf[S3OutputLocation]
  }
}

