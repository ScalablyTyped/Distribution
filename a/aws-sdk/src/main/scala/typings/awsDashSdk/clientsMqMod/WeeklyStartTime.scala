package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeeklyStartTime extends js.Object {
  /**
    * Required. The day of the week.
    */
  var DayOfWeek: js.UndefOr[typings.awsDashSdk.clientsMqMod.DayOfWeek] = js.native
  /**
    * Required. The time, in 24-hour format.
    */
  var TimeOfDay: js.UndefOr[__string] = js.native
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
    */
  var TimeZone: js.UndefOr[__string] = js.native
}

object WeeklyStartTime {
  @scala.inline
  def apply(DayOfWeek: DayOfWeek = null, TimeOfDay: __string = null, TimeZone: __string = null): WeeklyStartTime = {
    val __obj = js.Dynamic.literal()
    if (DayOfWeek != null) __obj.updateDynamic("DayOfWeek")(DayOfWeek.asInstanceOf[js.Any])
    if (TimeOfDay != null) __obj.updateDynamic("TimeOfDay")(TimeOfDay.asInstanceOf[js.Any])
    if (TimeZone != null) __obj.updateDynamic("TimeZone")(TimeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeeklyStartTime]
  }
}

