package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsResult extends js.Object {
  var channels: js.Array[Channel]
  var isTruncated: scala.Boolean
  var nextMarker: java.lang.String | scala.Null
  var res: NormalSuccessResponse
}

object ListChannelsResult {
  @scala.inline
  def apply(
    channels: js.Array[Channel],
    isTruncated: scala.Boolean,
    res: NormalSuccessResponse,
    nextMarker: java.lang.String = null
  ): ListChannelsResult = {
    val __obj = js.Dynamic.literal(channels = channels, isTruncated = isTruncated, res = res)
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.asInstanceOf[ListChannelsResult]
  }
}

