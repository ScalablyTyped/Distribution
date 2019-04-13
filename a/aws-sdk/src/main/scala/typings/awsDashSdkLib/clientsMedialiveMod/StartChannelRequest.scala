package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartChannelRequest extends js.Object {
  /**
    * A request to start a channel
    */
  var ChannelId: __string
}

object StartChannelRequest {
  @scala.inline
  def apply(ChannelId: __string): StartChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
  
    __obj.asInstanceOf[StartChannelRequest]
  }
}

