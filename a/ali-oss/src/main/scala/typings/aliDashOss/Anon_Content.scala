package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Any
  var res: NormalSuccessResponse
}

object Anon_Content {
  @scala.inline
  def apply(content: js.Any, res: NormalSuccessResponse): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

