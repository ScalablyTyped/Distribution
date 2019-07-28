package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSettingsResource extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application.
    */
  var CampaignHook: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.CampaignHook] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the application's settings were last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The default sending limits for campaigns in the application.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The default quiet time for campaigns in the application. Quiet time is a specific time range when campaigns don't send messages to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the application (or a campaign that has custom quiet time settings). The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the application (or a campaign that has custom quiet time settings). If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.QuietTime] = js.undefined
}

object ApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CampaignHook: CampaignHook = null,
    LastModifiedDate: __string = null,
    Limits: CampaignLimits = null,
    QuietTime: QuietTime = null
  ): ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    __obj.asInstanceOf[ApplicationSettingsResource]
  }
}

