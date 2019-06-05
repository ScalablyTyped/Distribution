package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined
}

object AbortIncompleteMultipartUpload {
  @scala.inline
  def apply(DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DaysAfterInitiation)) __obj.updateDynamic("DaysAfterInitiation")(DaysAfterInitiation)
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
}

