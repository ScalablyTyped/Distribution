package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChannelResponse extends js.Object {
  var Channel: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Channel] = js.undefined
}

object UpdateChannelResponse {
  @scala.inline
  def apply(Channel: Channel = null): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (Channel != null) __obj.updateDynamic("Channel")(Channel)
    __obj.asInstanceOf[UpdateChannelResponse]
  }
}

