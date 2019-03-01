package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: scala.Boolean
  var prefix: java.lang.String | scala.Null
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Enable {
  @scala.inline
  def apply(
    enable: scala.Boolean,
    res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse,
    prefix: java.lang.String = null
  ): Anon_Enable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("res")(res)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Enable]
  }
}

