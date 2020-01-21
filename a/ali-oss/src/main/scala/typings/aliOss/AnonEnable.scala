package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnable extends js.Object {
  var enable: Boolean
  var prefix: String | Null
  var res: NormalSuccessResponse
}

object AnonEnable {
  @scala.inline
  def apply(enable: Boolean, res: NormalSuccessResponse, prefix: String = null): AnonEnable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnable]
  }
}

