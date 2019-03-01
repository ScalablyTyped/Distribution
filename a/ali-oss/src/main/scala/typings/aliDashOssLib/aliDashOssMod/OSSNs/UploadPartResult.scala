package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPartResult extends js.Object {
  var etag: java.lang.String
  var name: java.lang.String
  var res: NormalSuccessResponse
}

object UploadPartResult {
  @scala.inline
  def apply(etag: java.lang.String, name: java.lang.String, res: NormalSuccessResponse): UploadPartResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[UploadPartResult]
  }
}

