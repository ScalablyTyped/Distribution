package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadCopyResult extends js.Object {
  var bucket: String
  var etag: String
  var name: String
  var res: NormalSuccessResponse
}

object MultipartUploadCopyResult {
  @scala.inline
  def apply(bucket: String, etag: String, name: String, res: NormalSuccessResponse): MultipartUploadCopyResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultipartUploadCopyResult]
  }
}

