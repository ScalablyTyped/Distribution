package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsResult extends js.Object {
  var channels: js.Array[Channel]
  var isTruncated: Boolean
  var nextMarker: String | Null
  var res: NormalSuccessResponse
}

object ListChannelsResult {
  @scala.inline
  def apply(
    channels: js.Array[Channel],
    isTruncated: Boolean,
    res: NormalSuccessResponse,
    nextMarker: String = null
  ): ListChannelsResult = {
    val __obj = js.Dynamic.literal(channels = channels, isTruncated = isTruncated, res = res)
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.asInstanceOf[ListChannelsResult]
  }
}

