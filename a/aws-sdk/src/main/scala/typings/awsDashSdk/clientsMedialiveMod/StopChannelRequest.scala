package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopChannelRequest extends js.Object {
  /**
    * A request to stop a running channel
    */
  var ChannelId: __string = js.native
}

object StopChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopChannelRequest]
  }
}

