package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: String
  var index: String
  var res: NormalSuccessResponse
}

object Error {
  @scala.inline
  def apply(error: String, index: String, res: NormalSuccessResponse): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

