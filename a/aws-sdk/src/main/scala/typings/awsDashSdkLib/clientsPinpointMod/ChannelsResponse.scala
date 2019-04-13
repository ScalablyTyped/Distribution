package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResponse extends js.Object {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  var Channels: js.UndefOr[MapOfChannelResponse] = js.undefined
}

object ChannelsResponse {
  @scala.inline
  def apply(Channels: MapOfChannelResponse = null): ChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    __obj.asInstanceOf[ChannelsResponse]
  }
}

