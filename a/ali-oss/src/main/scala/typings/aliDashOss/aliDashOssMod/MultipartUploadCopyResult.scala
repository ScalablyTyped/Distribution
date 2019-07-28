package typings.aliDashOss.aliDashOssMod

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
    val __obj = js.Dynamic.literal(bucket = bucket, etag = etag, name = name, res = res)
  
    __obj.asInstanceOf[MultipartUploadCopyResult]
  }
}

