package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Object
  var res: NormalSuccessResponse
}

object AnonData {
  @scala.inline
  def apply(data: js.Object, res: NormalSuccessResponse): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

