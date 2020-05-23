package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelIdValue extends js.Object {
  var channelId: String
  var value: js.UndefOr[String] = js.undefined
  var variable: String
}

object ChannelIdValue {
  @scala.inline
  def apply(channelId: String, variable: String, value: String = null): ChannelIdValue = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdValue]
  }
}

