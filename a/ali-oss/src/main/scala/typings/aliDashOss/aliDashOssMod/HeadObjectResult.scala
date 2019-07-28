package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadObjectResult extends js.Object {
   // response status, maybe 200 or 304
  var meta: UserMeta
  var res: NormalSuccessResponse
  var status: Double
}

object HeadObjectResult {
  @scala.inline
  def apply(meta: UserMeta, res: NormalSuccessResponse, status: Double): HeadObjectResult = {
    val __obj = js.Dynamic.literal(meta = meta, res = res, status = status)
  
    __obj.asInstanceOf[HeadObjectResult]
  }
}

