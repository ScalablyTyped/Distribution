package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.
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

