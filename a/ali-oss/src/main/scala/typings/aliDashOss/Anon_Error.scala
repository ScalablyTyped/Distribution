package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: String
  var index: String
  var res: NormalSuccessResponse
}

object Anon_Error {
  @scala.inline
  def apply(error: String, index: String, res: NormalSuccessResponse): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, index = index, res = res)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

