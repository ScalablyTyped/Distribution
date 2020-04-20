package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var res: NormalSuccessResponse
}

object AnonName {
  @scala.inline
  def apply(name: String, res: NormalSuccessResponse): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

