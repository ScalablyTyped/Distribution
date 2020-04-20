package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadResult extends js.Object {
  var bucket: String
  var data: js.Object
  var etag: String
  var name: String
  var res: NormalSuccessResponse
}

object MultipartUploadResult {
  @scala.inline
  def apply(bucket: String, data: js.Object, etag: String, name: String, res: NormalSuccessResponse): MultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadResult]
  }
}

