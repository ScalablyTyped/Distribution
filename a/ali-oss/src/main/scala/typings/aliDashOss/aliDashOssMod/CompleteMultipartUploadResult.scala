package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadResult extends js.Object {
  var bucket: String
  var data: js.Object
  var etag: String
  var name: String
  var res: NormalSuccessResponse
}

object CompleteMultipartUploadResult {
  @scala.inline
  def apply(bucket: String, data: js.Object, etag: String, name: String, res: NormalSuccessResponse): CompleteMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket, data = data, etag = etag, name = name, res = res)
  
    __obj.asInstanceOf[CompleteMultipartUploadResult]
  }
}

