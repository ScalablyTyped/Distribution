package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeeklyStartTime extends js.Object {
  /**
    * Required. The day of the week.
    */
  var DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  /**
    * Required. The time, in 24-hour format.
    */
  var TimeOfDay: js.UndefOr[__string] = js.undefined
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
    */
  var TimeZone: js.UndefOr[__string] = js.undefined
}

object WeeklyStartTime {
  @scala.inline
  def apply(DayOfWeek: DayOfWeek = null, TimeOfDay: __string = null, TimeZone: __string = null): WeeklyStartTime = {
    val __obj = js.Dynamic.literal()
    if (DayOfWeek != null) __obj.updateDynamic("DayOfWeek")(DayOfWeek.asInstanceOf[js.Any])
    if (TimeOfDay != null) __obj.updateDynamic("TimeOfDay")(TimeOfDay)
    if (TimeZone != null) __obj.updateDynamic("TimeZone")(TimeZone)
    __obj.asInstanceOf[WeeklyStartTime]
  }
}

