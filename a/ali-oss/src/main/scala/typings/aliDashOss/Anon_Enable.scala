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
    val __obj = js.Dynamic.literal(enable = enable, res = res)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Enable]
  }
}

