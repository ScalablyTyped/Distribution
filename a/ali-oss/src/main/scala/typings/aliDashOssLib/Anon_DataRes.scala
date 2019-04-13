package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataRes extends js.Object {
  var data: aliDashOssLib.aliDashOssMod.StyleData
  var res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
}

object Anon_DataRes {
  @scala.inline
  def apply(
    data: aliDashOssLib.aliDashOssMod.StyleData,
    res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
  ): Anon_DataRes = {
    val __obj = js.Dynamic.literal(data = data, res = res)
  
    __obj.asInstanceOf[Anon_DataRes]
  }
}

