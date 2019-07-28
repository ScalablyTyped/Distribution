package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChannelRequest extends js.Object {
  /**
    * The name of the channel to delete.
    */
  var channelName: ChannelName
}

object DeleteChannelRequest {
  @scala.inline
  def apply(channelName: ChannelName): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName)
  
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}

