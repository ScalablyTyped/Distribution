package typings.actioncable.ActionCable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelNameWithParams
  extends /* key */ StringDictionary[js.Any] {
  var channel: String
}

object ChannelNameWithParams {
  @scala.inline
  def apply(channel: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): ChannelNameWithParams = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ChannelNameWithParams]
  }
}

