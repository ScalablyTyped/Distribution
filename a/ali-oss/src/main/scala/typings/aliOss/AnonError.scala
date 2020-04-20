package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: String
  var index: String
  var res: NormalSuccessResponse
}

object AnonError {
  @scala.inline
  def apply(error: String, index: String, res: NormalSuccessResponse): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

