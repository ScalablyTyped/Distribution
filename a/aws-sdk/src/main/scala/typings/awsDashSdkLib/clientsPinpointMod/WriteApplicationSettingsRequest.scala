package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteApplicationSettingsRequest extends js.Object {
  /**
    * Default campaign hook information.
    */
  var CampaignHook: js.UndefOr[CampaignHook] = js.undefined
  /**
    * The CloudWatchMetrics settings for the app.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Campaigns in the app don't send messages to endpoints during the quiet time.
  Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet time for your app. If your endpoints don't include this attribute, they'll receive the messages that you send them, even if quiet time is enabled.
  When you set up an app to use quiet time, campaigns in that app don't send messages during the time range you specified, as long as all of the following are true:
  - The endpoint includes a valid Demographic.Timezone attribute.
  - The current time in the endpoint's time zone is later than or equal to the time specified in the QuietTime.Start attribute for the app (or campaign, if applicable).
  - The current time in the endpoint's time zone is earlier than or equal to the time specified in the QuietTime.End attribute for the app (or campaign, if applicable).
  Individual campaigns within the app can have their own quiet time settings, which override the quiet time settings at the app level.
    */
  var QuietTime: js.UndefOr[QuietTime] = js.undefined
}

object WriteApplicationSettingsRequest {
  @scala.inline
  def apply(
    CampaignHook: CampaignHook = null,
    CloudWatchMetricsEnabled: js.UndefOr[__boolean] = js.undefined,
    Limits: CampaignLimits = null,
    QuietTime: QuietTime = null
  ): WriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook)
    if (!js.isUndefined(CloudWatchMetricsEnabled)) __obj.updateDynamic("CloudWatchMetricsEnabled")(CloudWatchMetricsEnabled)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    __obj.asInstanceOf[WriteApplicationSettingsRequest]
  }
}

