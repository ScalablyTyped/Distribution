package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChannelResult extends js.Object {
  var Audio: js.UndefOr[js.Object] = js.undefined
  var ConnectedTime: js.UndefOr[String] = js.undefined
  var RemoteAddr: js.UndefOr[String] = js.undefined
  var Status: String
  var Video: js.UndefOr[js.Object] = js.undefined
  var res: NormalSuccessResponse
}

object GetChannelResult {
  @scala.inline
  def apply(
    Status: String,
    res: NormalSuccessResponse,
    Audio: js.Object = null,
    ConnectedTime: String = null,
    RemoteAddr: String = null,
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

