package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsResult extends js.Object {
  var bucket: String
  var isTruncated: Boolean
  var nextKeyMarker: js.Any
  var nextUploadIdMarker: js.Any
  var res: NormalSuccessResponse
  var uploads: js.Array[Upload]
}

object ListUploadsResult {
  @scala.inline
  def apply(
    bucket: String,
    isTruncated: Boolean,
    nextKeyMarker: js.Any,
    nextUploadIdMarker: js.Any,
    res: NormalSuccessResponse,
    uploads: js.Array[Upload]
  ): ListUploadsResult = {
    val __obj = js.Dynamic.literal(bucket = bucket, isTruncated = isTruncated, nextKeyMarker = nextKeyMarker, nextUploadIdMarker = nextUploadIdMarker, res = res, uploads = uploads)
  
    __obj.asInstanceOf[ListUploadsResult]
  }
}

