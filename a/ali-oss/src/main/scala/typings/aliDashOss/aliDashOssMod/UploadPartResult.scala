package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPartResult extends js.Object {
  var etag: String
  var name: String
  var res: NormalSuccessResponse
}

object UploadPartResult {
  @scala.inline
  def apply(etag: String, name: String, res: NormalSuccessResponse): UploadPartResult = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadPartResult]
  }
}

