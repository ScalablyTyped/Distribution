package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import typings.aliDashOss.aliDashOssMod.StyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataRes extends js.Object {
  var data: StyleData
  var res: NormalSuccessResponse
}

object Anon_DataRes {
  @scala.inline
  def apply(data: StyleData, res: NormalSuccessResponse): Anon_DataRes = {
    val __obj = js.Dynamic.literal(data = data, res = res)
  
    __obj.asInstanceOf[Anon_DataRes]
  }
}

