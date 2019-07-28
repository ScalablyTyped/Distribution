package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import typings.aliDashOss.aliDashOssMod.PutChannelConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataResNormalSuccessResponse extends js.Object {
  var data: PutChannelConf
  var res: NormalSuccessResponse
}

object Anon_DataResNormalSuccessResponse {
  @scala.inline
  def apply(data: PutChannelConf, res: NormalSuccessResponse): Anon_DataResNormalSuccessResponse = {
    val __obj = js.Dynamic.literal(data = data, res = res)
  
    __obj.asInstanceOf[Anon_DataResNormalSuccessResponse]
  }
}

