package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Res extends js.Object {
  var res: NormalSuccessResponse
  var stream: js.Any
}

object Res {
  @scala.inline
  def apply(res: NormalSuccessResponse, stream: js.Any): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
}

