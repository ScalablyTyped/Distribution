package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsResponse extends js.Object {
  var Channels: js.UndefOr[__listOfChannelSummary] = js.native
  var NextToken: js.UndefOr[__string] = js.native
}

object ListChannelsResponse {
  @scala.inline
  def apply(Channels: __listOfChannelSummary = null, NextToken: __string = null): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

