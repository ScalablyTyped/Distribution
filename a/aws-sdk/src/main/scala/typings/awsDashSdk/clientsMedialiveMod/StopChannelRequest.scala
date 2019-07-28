package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopChannelRequest extends js.Object {
  /**
    * A request to stop a running channel
    */
  var ChannelId: __string
}

object StopChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): StopChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
  
    __obj.asInstanceOf[StopChannelRequest]
  }
}

