package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  /**
    * The scheduled time, in ISO 8601 format, for the campaign to end.
    */
  var EndTime: js.UndefOr[__string] = js.undefined
  /**
    * The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
    */
  var EventFilter: js.UndefOr[CampaignEventFilter] = js.undefined
  /**
    * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
    */
  var Frequency: js.UndefOr[Frequency] = js.undefined
  /**
    * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the schedule on each recipient's local time, set this value to true.
    */
  var IsLocalTime: js.UndefOr[__boolean] = js.undefined
  /**
    * The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the campaign. The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the campaign. If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[QuietTime] = js.undefined
  /**
    * The scheduled time, in ISO 8601 format, for the campaign to begin.
    */
  var StartTime: __string
  /**
    * The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
    UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30,
    UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06,
    UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
    */
  var Timezone: js.UndefOr[__string] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(
    StartTime: __string,
    EndTime: __string = null,
    EventFilter: CampaignEventFilter = null,
    Frequency: Frequency = null,
    IsLocalTime: js.UndefOr[__boolean] = js.undefined,
    QuietTime: QuietTime = null,
    Timezone: __string = null
  ): Schedule = {
    val __obj = js.Dynamic.literal(StartTime = StartTime)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (EventFilter != null) __obj.updateDynamic("EventFilter")(EventFilter)
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLocalTime)) __obj.updateDynamic("IsLocalTime")(IsLocalTime)
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[Schedule]
  }
}

