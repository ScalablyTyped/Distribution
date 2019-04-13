package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadResult extends js.Object {
  var bucket: java.lang.String
  var data: js.Object
  var etag: java.lang.String
  var name: java.lang.String
  var res: NormalSuccessResponse
}

object CompleteMultipartUploadResult {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    data: js.Object,
    etag: java.lang.String,
    name: java.lang.String,
    res: NormalSuccessResponse
  ): CompleteMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket, data = data, etag = etag, name = name, res = res)
  
    __obj.asInstanceOf[CompleteMultipartUploadResult]
  }
}

