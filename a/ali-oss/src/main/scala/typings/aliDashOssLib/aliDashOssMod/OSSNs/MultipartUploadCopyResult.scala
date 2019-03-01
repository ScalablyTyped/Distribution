package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadCopyResult extends js.Object {
  var bucket: java.lang.String
  var etag: java.lang.String
  var name: java.lang.String
  var res: NormalSuccessResponse
}

object MultipartUploadCopyResult {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    etag: java.lang.String,
    name: java.lang.String,
    res: NormalSuccessResponse
  ): MultipartUploadCopyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[MultipartUploadCopyResult]
  }
}

