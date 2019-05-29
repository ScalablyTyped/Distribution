package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationInputObject
  extends DatetimeInputObject
     with _DurationInputArg1 {
  /**
    * Quarter, 1..4
    */
  var Q: js.UndefOr[scala.Double] = js.undefined
  /**
    * Quarter, 1..4
    */
  var quarter: js.UndefOr[scala.Double] = js.undefined
  /**
    * Quarter, 1..4
    */
  var quarters: js.UndefOr[scala.Double] = js.undefined
  /**
    * Week of the year, 1..53
    */
  var w: js.UndefOr[scala.Double] = js.undefined
  /**
    * Week of the year, 1..53
    */
  var week: js.UndefOr[scala.Double] = js.undefined
  /**
    * Week of the year, 1..53
    */
  var weeks: js.UndefOr[scala.Double] = js.undefined
}

object DurationInputObject {
  @scala.inline
  def apply(
    D: scala.Int | scala.Double = null,
    M: scala.Int | scala.Double = null,
    Q: scala.Int | scala.Double = null,
    d: scala.Int | scala.Double = null,
    date: scala.Int | scala.Double = null,
    dates: scala.Int | scala.Double = null,
    day: scala.Int | scala.Double = null,
    days: scala.Int | scala.Double = null,
    h: scala.Int | scala.Double = null,
    hour: scala.Int | scala.Double = null,
    hours: scala.Int | scala.Double = null,
    m: scala.Int | scala.Double = null,
    millisecond: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    months: scala.Int | scala.Double = null,
    ms: scala.Int | scala.Double = null,
    quarter: scala.Int | scala.Double = null,
    quarters: scala.Int | scala.Double = null,
    s: scala.Int | scala.Double = null,
    second: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null,
    w: scala.Int | scala.Double = null,
    week: scala.Int | scala.Double = null,
    weeks: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null,
    years: scala.Int | scala.Double = null
  ): DurationInputObject = {
    val __obj = js.Dynamic.literal()
    if (D != null) __obj.updateDynamic("D")(D.asInstanceOf[js.Any])
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (Q != null) __obj.updateDynamic("Q")(Q.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dates != null) __obj.updateDynamic("dates")(dates.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (ms != null) __obj.updateDynamic("ms")(ms.asInstanceOf[js.Any])
    if (quarter != null) __obj.updateDynamic("quarter")(quarter.asInstanceOf[js.Any])
    if (quarters != null) __obj.updateDynamic("quarters")(quarters.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationInputObject]
  }
}

