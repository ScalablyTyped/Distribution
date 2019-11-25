package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: Boolean
  var prefix: String | Null
  var res: NormalSuccessResponse
}

object Anon_Enable {
  @scala.inline
  def apply(enable: Boolean, res: NormalSuccessResponse, prefix: String = null): Anon_Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enable]
  }
}

