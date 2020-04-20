package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalSuccessResponse extends js.Object {
  // response headers
  var headers: js.Object
  //  request total use time (ms)
  var rt: Double
   // todo the object in detail
  // response size
  var size: Double
  // response status
  var status: Double
}

object NormalSuccessResponse {
  @scala.inline
  def apply(headers: js.Object, rt: Double, size: Double, status: Double): NormalSuccessResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalSuccessResponse]
  }
}

