package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChannelRequest extends js.Object {
  /**
    * Unique ID of the channel.
    */
  var ChannelId: __string = js.native
}

object DeleteChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}

