package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneySchedule extends js.Object {
  /**
    * The scheduled time, in ISO 8601 format, when the journey ended or will end.
    */
  var EndTime: js.UndefOr[__timestampIso8601] = js.native
  /**
    * The scheduled time, in ISO 8601 format, when the journey began or will begin.
    */
  var StartTime: js.UndefOr[__timestampIso8601] = js.native
  /**
    * The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is true. Valid values are: UTC,
    UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
    UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30,
    UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02,
    UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09,
    UTC-09:30, UTC-10, and UTC-11.
    */
  var Timezone: js.UndefOr[__string] = js.native
}

object JourneySchedule {
  @scala.inline
  def apply(
    EndTime: __timestampIso8601 = null,
    StartTime: __timestampIso8601 = null,
    Timezone: __string = null
  ): JourneySchedule = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneySchedule]
  }
}

