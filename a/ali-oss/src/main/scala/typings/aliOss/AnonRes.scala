package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRes extends js.Object {
  var res: NormalSuccessResponse
  var stream: js.Any
}

object AnonRes {
  @scala.inline
  def apply(res: NormalSuccessResponse, stream: js.Any): AnonRes = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRes]
  }
}

