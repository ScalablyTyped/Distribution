package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSettingsResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * Default campaign hook.
    */
  var CampaignHook: js.UndefOr[CampaignHook] = js.undefined
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
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

object ApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CampaignHook: CampaignHook = null,
    LastModifiedDate: __string = null,
    Limits: CampaignLimits = null,
    QuietTime: QuietTime = null
  ): ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    __obj.asInstanceOf[ApplicationSettingsResource]
  }
}

