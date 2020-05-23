package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelIdVariable extends js.Object {
  var channelId: String
  var variable: String
}

object ChannelIdVariable {
  @scala.inline
  def apply(channelId: String, variable: String): ChannelIdVariable = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdVariable]
  }
}

