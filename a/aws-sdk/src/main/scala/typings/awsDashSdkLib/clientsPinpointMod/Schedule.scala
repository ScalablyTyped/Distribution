package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  /**
    * The scheduled time that the campaign ends in ISO 8601 format.
    */
  var EndTime: js.UndefOr[__string] = js.undefined
  /**
    * Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
    */
  var EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined
  /**
    * How often the campaign delivers messages.
  Valid values:
  ONCE
  HOURLY
  DAILY
  WEEKLY
  MONTHLY
  EVENT
    */
  var Frequency: js.UndefOr[Frequency] = js.undefined
  /**
    * Indicates whether the campaign schedule takes effect according to each user's local time.
    */
  var IsLocalTime: js.UndefOr[__boolean] = js.undefined
  /**
    * The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet time.
  Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet time for your campaign. If your endpoints don't include this attribute, they'll receive the messages that you send them, even if quiet time is enabled.
  When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you specified, as long as all of the following are true:
  - The endpoint includes a valid Demographic.Timezone attribute.
  - The current time in the endpoint's time zone is later than or equal to the time specified in the QuietTime.Start attribute for the campaign.
  - The current time in the endpoint's time zone is earlier than or equal to the time specified in the QuietTime.End attribute for the campaign.
    */
  var QuietTime: js.UndefOr[QuietTime] = js.undefined
  /**
    * The scheduled time that the campaign begins in ISO 8601 format.
    */
  var StartTime: js.UndefOr[__string] = js.undefined
  /**
    * The starting UTC offset for the schedule if the value for isLocalTime is true
  Valid values: 
  UTC
  UTC+01
  UTC+02
  UTC+03
  UTC+03:30
  UTC+04
  UTC+04:30
  UTC+05
  UTC+05:30
  UTC+05:45
  UTC+06
  UTC+06:30
  UTC+07
  UTC+08
  UTC+09
  UTC+09:30
  UTC+10
  UTC+10:30
  UTC+11
  UTC+12
  UTC+13
  UTC-02
  UTC-03
  UTC-04
  UTC-05
  UTC-06
  UTC-07
  UTC-08
  UTC-09
  UTC-10
  UTC-11
    */
  var Timezone: js.UndefOr[__string] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(
    EndTime: __string = null,
    EventFilter: CampaignEventFilter = null,
    Frequency: Frequency = null,
    IsLocalTime: js.UndefOr[__boolean] = js.undefined,
    QuietTime: QuietTime = null,
    StartTime: __string = null,
    Timezone: __string = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (EventFilter != null) __obj.updateDynamic("EventFilter")(EventFilter)
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLocalTime)) __obj.updateDynamic("IsLocalTime")(IsLocalTime)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[Schedule]
  }
}

