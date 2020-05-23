package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enable extends js.Object {
  var enable: Boolean
  var prefix: String | Null
  var res: NormalSuccessResponse
}

object Enable {
  @scala.inline
  def apply(enable: Boolean, res: NormalSuccessResponse, prefix: String = null): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
}

