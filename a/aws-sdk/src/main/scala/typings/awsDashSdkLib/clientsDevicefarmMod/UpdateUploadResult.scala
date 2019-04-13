package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUploadResult extends js.Object {
  /**
    * A test spec uploaded to Device Farm.
    */
  var upload: js.UndefOr[Upload] = js.undefined
}

object UpdateUploadResult {
  @scala.inline
  def apply(upload: Upload = null): UpdateUploadResult = {
    val __obj = js.Dynamic.literal()
    if (upload != null) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[UpdateUploadResult]
  }
}

