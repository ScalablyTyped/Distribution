package typings
package actioncableLib.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelNameWithParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var channel: java.lang.String
}

object ChannelNameWithParams {
  @scala.inline
  def apply(
    channel: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ChannelNameWithParams = {
    val __obj = js.Dynamic.literal(channel = channel)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ChannelNameWithParams]
  }
}

