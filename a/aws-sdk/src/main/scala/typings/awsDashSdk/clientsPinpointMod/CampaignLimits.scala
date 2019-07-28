package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum value is 100.
    */
  var Daily: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled start time for the campaign. The minimum value is 60 seconds.
    */
  var MaximumDuration: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value is 20,000.
    */
  var MessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign. The maximum value is 100.
    */
  var Total: js.UndefOr[__integer] = js.undefined
}

object CampaignLimits {
  @scala.inline
  def apply(
    Daily: js.UndefOr[__integer] = js.undefined,
    MaximumDuration: js.UndefOr[__integer] = js.undefined,
    MessagesPerSecond: js.UndefOr[__integer] = js.undefined,
    Total: js.UndefOr[__integer] = js.undefined
  ): CampaignLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Daily)) __obj.updateDynamic("Daily")(Daily)
    if (!js.isUndefined(MaximumDuration)) __obj.updateDynamic("MaximumDuration")(MaximumDuration)
    if (!js.isUndefined(MessagesPerSecond)) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond)
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[CampaignLimits]
  }
}

