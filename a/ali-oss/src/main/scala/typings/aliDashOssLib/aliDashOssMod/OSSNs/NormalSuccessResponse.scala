package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalSuccessResponse extends js.Object {
  // response headers
  var headers: js.Object
  //  request total use time (ms)
  var rt: scala.Double
   // todo the object in detail
  // response size
  var size: scala.Double
  // response status
  var status: scala.Double
}

object NormalSuccessResponse {
  @scala.inline
  def apply(headers: js.Object, rt: scala.Double, size: scala.Double, status: scala.Double): NormalSuccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("rt")(rt)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[NormalSuccessResponse]
  }
}

