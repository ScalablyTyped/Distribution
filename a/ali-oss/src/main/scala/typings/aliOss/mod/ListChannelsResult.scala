package typings.aliOss.mod

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
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResult]
  }
}

