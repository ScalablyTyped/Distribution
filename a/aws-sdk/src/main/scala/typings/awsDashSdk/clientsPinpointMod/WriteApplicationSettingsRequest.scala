package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteApplicationSettingsRequest extends js.Object {
  /**
    * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application. To override these settings for a specific campaign, use the Campaign resource to define custom Lambda function settings for the campaign.
    */
  var CampaignHook: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.CampaignHook] = js.undefined
  /**
    * Specifies whether to enable application-related alarms in Amazon CloudWatch.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[__boolean] = js.undefined
  /**
    * The default sending limits for campaigns in the application. To override these limits for a specific campaign, use the Campaign resource to define custom limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The default quiet time for campaigns in the application. Quiet time is a specific time range when campaigns don't send messages to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the application (or a campaign that has custom quiet time settings). The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the application (or a campaign that has custom quiet time settings). If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if quiet time is enabled. To override the default quiet time settings for a specific campaign, use the Campaign resource to define a custom quiet time for the campaign.
    */
  var QuietTime: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.QuietTime] = js.undefined
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

