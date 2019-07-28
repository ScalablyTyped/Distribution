package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Res extends js.Object {
  var res: NormalSuccessResponse
  var stream: js.Any
}

object Anon_Res {
  @scala.inline
  def apply(res: NormalSuccessResponse, stream: js.Any): Anon_Res = {
    val __obj = js.Dynamic.literal(res = res, stream = stream)
  
    __obj.asInstanceOf[Anon_Res]
  }
}

