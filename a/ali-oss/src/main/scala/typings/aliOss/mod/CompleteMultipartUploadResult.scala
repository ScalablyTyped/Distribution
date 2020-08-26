package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMultipartUploadResult extends js.Object {
  var bucket: String = js.native
  var data: js.Object = js.native
  var etag: String = js.native
  var name: String = js.native
  var res: NormalSuccessResponse = js.native
}

object CompleteMultipartUploadResult {
  @scala.inline
  def apply(bucket: String, data: js.Object, etag: String, name: String, res: NormalSuccessResponse): CompleteMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadResult]
  }
  @scala.inline
  implicit class CompleteMultipartUploadResultOps[Self <: CompleteMultipartUploadResult] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}

