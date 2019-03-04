package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChannelResult extends js.Object {
  var Audio: js.UndefOr[js.Object] = js.undefined
  var ConnectedTime: js.UndefOr[java.lang.String] = js.undefined
  var RemoteAddr: js.UndefOr[java.lang.String] = js.undefined
  var Status: java.lang.String
  var Video: js.UndefOr[js.Object] = js.undefined
  var res: NormalSuccessResponse
}

object GetChannelResult {
  @scala.inline
  def apply(
    Status: java.lang.String,
    res: NormalSuccessResponse,
    Audio: js.Object = null,
    ConnectedTime: java.lang.String = null,
    RemoteAddr: java.lang.String = null,
    Video: js.Object = null
  ): GetChannelResult = {
    val __obj = js.Dynamic.literal(Status = Status, res = res)
    if (Audio != null) __obj.updateDynamic("Audio")(Audio)
    if (ConnectedTime != null) __obj.updateDynamic("ConnectedTime")(ConnectedTime)
    if (RemoteAddr != null) __obj.updateDynamic("RemoteAddr")(RemoteAddr)
    if (Video != null) __obj.updateDynamic("Video")(Video)
    __obj.asInstanceOf[GetChannelResult]
  }
}

