package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResponse extends js.Object {
  /**
    * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the key and the Channel is the value.
    */
  var Channels: MapOfChannelResponse
}

object ChannelsResponse {
  @scala.inline
  def apply(Channels: MapOfChannelResponse): ChannelsResponse = {
    val __obj = js.Dynamic.literal(Channels = Channels)
  
    __obj.asInstanceOf[ChannelsResponse]
  }
}

