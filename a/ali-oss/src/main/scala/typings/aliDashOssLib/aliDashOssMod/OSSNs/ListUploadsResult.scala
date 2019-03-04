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
    val __obj = js.Dynamic.literal(bucket = bucket, isTruncated = isTruncated, nextKeyMarker = nextKeyMarker, nextUploadIdMarker = nextUploadIdMarker, res = res, uploads = uploads)
  
    __obj.asInstanceOf[ListUploadsResult]
  }
}

