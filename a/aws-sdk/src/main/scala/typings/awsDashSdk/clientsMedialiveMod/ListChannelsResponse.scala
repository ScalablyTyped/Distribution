package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsResponse extends js.Object {
  var Channels: js.UndefOr[__listOfChannelSummary] = js.undefined
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListChannelsResponse {
  @scala.inline
  def apply(Channels: __listOfChannelSummary = null, NextToken: __string = null): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

