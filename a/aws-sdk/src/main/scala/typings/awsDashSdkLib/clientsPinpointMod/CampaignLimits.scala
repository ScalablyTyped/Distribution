package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignLimits extends js.Object {
  /**
    * The maximum number of messages that each campaign can send to a single endpoint in a 24-hour period.
    */
  var Daily: js.UndefOr[__integer] = js.undefined
  /**
    * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
    */
  var MaximumDuration: js.UndefOr[__integer] = js.undefined
  /**
    * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
    */
  var MessagesPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum number of messages that an individual campaign can send to a single endpoint over the course of the campaign.
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

