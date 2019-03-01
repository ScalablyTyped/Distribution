package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsResult extends js.Object {
  var bucket: java.lang.String
  var isTruncated: scala.Boolean
  var nextKeyMarker: js.Any
  var nextUploadIdMarker: js.Any
  var res: NormalSuccessResponse
  var uploads: js.Array[Upload]
}

object ListUploadsResult {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    isTruncated: scala.Boolean,
    nextKeyMarker: js.Any,
    nextUploadIdMarker: js.Any,
    res: NormalSuccessResponse,
    uploads: js.Array[Upload]
  ): ListUploadsResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("isTruncated")(isTruncated)
    __obj.updateDynamic("nextKeyMarker")(nextKeyMarker)
    __obj.updateDynamic("nextUploadIdMarker")(nextUploadIdMarker)
    __obj.updateDynamic("res")(res)
    __obj.updateDynamic("uploads")(uploads)
    __obj.asInstanceOf[ListUploadsResult]
  }
}

