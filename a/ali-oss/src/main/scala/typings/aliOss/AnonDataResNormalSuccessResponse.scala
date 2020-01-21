package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import typings.aliOss.mod.PutChannelConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataResNormalSuccessResponse extends js.Object {
  var data: PutChannelConf
  var res: NormalSuccessResponse
}

object AnonDataResNormalSuccessResponse {
  @scala.inline
  def apply(data: PutChannelConf, res: NormalSuccessResponse): AnonDataResNormalSuccessResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataResNormalSuccessResponse]
  }
}

