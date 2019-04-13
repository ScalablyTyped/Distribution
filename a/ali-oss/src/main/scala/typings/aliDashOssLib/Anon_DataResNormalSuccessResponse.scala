package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataResNormalSuccessResponse extends js.Object {
  var data: aliDashOssLib.aliDashOssMod.PutChannelConf
  var res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
}

object Anon_DataResNormalSuccessResponse {
  @scala.inline
  def apply(
    data: aliDashOssLib.aliDashOssMod.PutChannelConf,
    res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
  ): Anon_DataResNormalSuccessResponse = {
    val __obj = js.Dynamic.literal(data = data, res = res)
  
    __obj.asInstanceOf[Anon_DataResNormalSuccessResponse]
  }
}

