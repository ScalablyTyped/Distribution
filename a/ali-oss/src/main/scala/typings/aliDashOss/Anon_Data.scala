package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Object
  var res: NormalSuccessResponse
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Object, res: NormalSuccessResponse): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, res = res)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

