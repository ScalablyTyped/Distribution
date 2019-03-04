package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmpty extends js.Object {
  var allowEmpty: scala.Boolean
  var referers: js.Array[java.lang.String]
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_AllowEmpty {
  @scala.inline
  def apply(
    allowEmpty: scala.Boolean,
    referers: js.Array[java.lang.String],
    res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
  ): Anon_AllowEmpty = {
    val __obj = js.Dynamic.literal(allowEmpty = allowEmpty, referers = referers, res = res)
  
    __obj.asInstanceOf[Anon_AllowEmpty]
  }
}

