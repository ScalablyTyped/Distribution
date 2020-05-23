package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var res: NormalSuccessResponse
}

object Name {
  @scala.inline
  def apply(name: String, res: NormalSuccessResponse): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

