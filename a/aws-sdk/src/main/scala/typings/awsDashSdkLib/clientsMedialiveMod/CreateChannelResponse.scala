package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelResponse extends js.Object {
  var Channel: js.UndefOr[Channel] = js.undefined
}

object CreateChannelResponse {
  @scala.inline
  def apply(Channel: Channel = null): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (Channel != null) __obj.updateDynamic("Channel")(Channel)
    __obj.asInstanceOf[CreateChannelResponse]
  }
}

