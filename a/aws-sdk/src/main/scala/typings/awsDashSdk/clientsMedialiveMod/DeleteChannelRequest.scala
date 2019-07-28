package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChannelRequest extends js.Object {
  /**
    * Unique ID of the channel.
    */
  var ChannelId: __string
}

object DeleteChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
  
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}

