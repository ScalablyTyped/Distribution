package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataRes extends js.Object {
  var data: aliDashOssLib.aliDashOssMod.OSSNs.StyleData
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_DataRes {
  @scala.inline
  def apply(
    data: aliDashOssLib.aliDashOssMod.OSSNs.StyleData,
    res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
  ): Anon_DataRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_DataRes]
  }
}

