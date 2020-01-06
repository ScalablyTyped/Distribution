package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUploadResult extends js.Object {
  /**
    * A test spec uploaded to Device Farm.
    */
  var upload: js.UndefOr[Upload] = js.native
}

object UpdateUploadResult {
  @scala.inline
  def apply(upload: Upload = null): UpdateUploadResult = {
    val __obj = js.Dynamic.literal()
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUploadResult]
  }
}

