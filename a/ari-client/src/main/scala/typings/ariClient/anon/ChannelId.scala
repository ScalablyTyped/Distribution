package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelId extends js.Object {
  var bridgeId: String
  var channelId: String
}

object ChannelId {
  @scala.inline
  def apply(bridgeId: String, channelId: String): ChannelId = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
}

