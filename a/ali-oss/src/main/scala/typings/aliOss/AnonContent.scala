package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: js.Any
  var res: NormalSuccessResponse
}

object AnonContent {
  @scala.inline
  def apply(content: js.Any, res: NormalSuccessResponse): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

