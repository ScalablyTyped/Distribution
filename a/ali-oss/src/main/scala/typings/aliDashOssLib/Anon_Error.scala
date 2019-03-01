package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: java.lang.String
  var index: java.lang.String
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String,
    index: java.lang.String,
    res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Error]
  }
}

