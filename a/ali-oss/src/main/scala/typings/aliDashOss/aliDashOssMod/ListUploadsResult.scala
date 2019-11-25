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
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], nextKeyMarker = nextKeyMarker.asInstanceOf[js.Any], nextUploadIdMarker = nextUploadIdMarker.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListUploadsResult]
  }
}

