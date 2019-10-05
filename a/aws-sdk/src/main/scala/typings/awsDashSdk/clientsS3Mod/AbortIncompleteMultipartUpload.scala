package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DaysAfterInitiation] = js.undefined
}

object AbortIncompleteMultipartUpload {
  @scala.inline
  def apply(DaysAfterInitiation: Int | Double = null): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (DaysAfterInitiation != null) __obj.updateDynamic("DaysAfterInitiation")(DaysAfterInitiation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
}

