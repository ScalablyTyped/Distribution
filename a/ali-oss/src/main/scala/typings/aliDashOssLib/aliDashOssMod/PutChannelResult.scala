package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutChannelResult extends js.Object {
  var playUrls: js.Array[java.lang.String]
  var publishUrls: js.Array[java.lang.String]
  var res: NormalSuccessResponse
}

object PutChannelResult {
  @scala.inline
  def apply(
    playUrls: js.Array[java.lang.String],
    publishUrls: js.Array[java.lang.String],
    res: NormalSuccessResponse
  ): PutChannelResult = {
    val __obj = js.Dynamic.literal(playUrls = playUrls, publishUrls = publishUrls, res = res)
  
    __obj.asInstanceOf[PutChannelResult]
  }
}

