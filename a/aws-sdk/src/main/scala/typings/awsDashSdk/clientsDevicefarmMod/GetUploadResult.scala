package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUploadResult extends js.Object {
  /**
    * An app or a set of one or more tests to upload or that have been uploaded.
    */
  var upload: js.UndefOr[Upload] = js.undefined
}

object GetUploadResult {
  @scala.inline
  def apply(upload: Upload = null): GetUploadResult = {
    val __obj = js.Dynamic.literal()
    if (upload != null) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[GetUploadResult]
  }
}

