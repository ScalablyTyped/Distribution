package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelIdEndpoint extends js.Object {
  var channelId: String
  var endpoint: String
}

object ChannelIdEndpoint {
  @scala.inline
  def apply(channelId: String, endpoint: String): ChannelIdEndpoint = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdEndpoint]
  }
}

