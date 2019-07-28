package typings.aliDashOss.aliDashOssMod

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
    val __obj = js.Dynamic.literal(bucket = bucket, data = data, etag = etag, name = name, res = res)
  
    __obj.asInstanceOf[MultipartUploadResult]
  }
}

