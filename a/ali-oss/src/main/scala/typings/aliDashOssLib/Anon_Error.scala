package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: java.lang.String
  var index: java.lang.String
  var res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String,
    index: java.lang.String,
    res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, index = index, res = res)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

