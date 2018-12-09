package typings
package adoneLib.adoneNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datetimeNs {
  type CalendarKey = adoneLib.adoneLibStrings.sameDay | adoneLib.adoneLibStrings.nextDay | adoneLib.adoneLibStrings.lastDay | adoneLib.adoneLibStrings.nextWeek | adoneLib.adoneLibStrings.lastWeek | adoneLib.adoneLibStrings.sameElse
  type CalendarSpecVal = java.lang.String | (js.Function2[/* m */ js.UndefOr[DatetimeInput], /* now */ js.UndefOr[Datetime], java.lang.String])
  type DatetimeFormatSpecification = java.lang.String | js.Array[java.lang.String]
  type DatetimeInput = js.UndefOr[
    java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String]) | DatetimeInputObject | Datetime | stdLib.Date | scala.Null
  ]
  type DurationInputArg1 = js.UndefOr[
    Duration | scala.Double | java.lang.String | FromTo | DurationInputObject | scala.Null
  ]
  type DurationInputArg2 = adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.DurationConstructor
  type LocaleSpecifier = java.lang.String | Datetime | Duration | js.Array[java.lang.String] | scala.Boolean
  type LongDateFormatKey = adoneLib.adoneLibStrings.LTS | adoneLib.adoneLibStrings.LT | adoneLib.adoneLibStrings.L | adoneLib.adoneLibStrings.LL | adoneLib.adoneLibStrings.LLL | adoneLib.adoneLibStrings.LLLL | adoneLib.adoneLibStrings.lts | adoneLib.adoneLibStrings.lt | adoneLib.adoneLibStrings.l | adoneLib.adoneLibStrings.ll | adoneLib.adoneLibStrings.lll | adoneLib.adoneLibStrings.llll
  type MonthWeekdayFn = js.Function2[
    /* datetimeToFormat */ Datetime, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeKey = adoneLib.adoneLibStrings.s | adoneLib.adoneLibStrings.m | adoneLib.adoneLibStrings.mm | adoneLib.adoneLibStrings.h | adoneLib.adoneLibStrings.hh | adoneLib.adoneLibStrings.d | adoneLib.adoneLibStrings.dd | adoneLib.adoneLibStrings.M | adoneLib.adoneLibStrings.MM | adoneLib.adoneLibStrings.y | adoneLib.adoneLibStrings.yy
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* datetimeToFormat */ Datetime, java.lang.String]
}
