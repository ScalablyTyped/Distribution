package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadResult extends js.Object {
  var bucket: java.lang.String
  var data: js.Object
  var etag: java.lang.String
  var name: java.lang.String
  var res: NormalSuccessResponse
}

object MultipartUploadResult {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    data: js.Object,
    etag: java.lang.String,
    name: java.lang.String,
    res: NormalSuccessResponse
  ): MultipartUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[MultipartUploadResult]
  }
}

