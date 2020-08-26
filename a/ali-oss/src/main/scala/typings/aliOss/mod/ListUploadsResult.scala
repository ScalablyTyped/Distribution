package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUploadsResult extends js.Object {
  var bucket: String = js.native
  var isTruncated: Boolean = js.native
  var nextKeyMarker: js.Any = js.native
  var nextUploadIdMarker: js.Any = js.native
  var res: NormalSuccessResponse = js.native
  var uploads: js.Array[Upload] = js.native
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
  @scala.inline
  implicit class ListUploadsResultOps[Self <: ListUploadsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("isTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextKeyMarker(value: js.Any): Self = this.set("nextKeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextUploadIdMarker(value: js.Any): Self = this.set("nextUploadIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadsVarargs(value: Upload*): Self = this.set("uploads", js.Array(value :_*))
    @scala.inline
    def setUploads(value: js.Array[Upload]): Self = this.set("uploads", value.asInstanceOf[js.Any])
  }
  
}

