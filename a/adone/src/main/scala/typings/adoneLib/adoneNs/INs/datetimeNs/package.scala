package typings
package adoneLib.adoneNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datetimeNs {
  type CalendarSpecVal = java.lang.String | (js.Function2[/* m */ js.UndefOr[DatetimeInput], /* now */ js.UndefOr[Datetime], java.lang.String])
  type DatetimeFormatSpecification = java.lang.String | js.Array[java.lang.String]
  type DatetimeInput = js.UndefOr[
    java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String]) | DatetimeInputObject | Datetime | stdLib.Date | scala.Null
  ]
  type DurationInputArg1 = js.UndefOr[
    Duration | scala.Double | java.lang.String | FromTo | DurationInputObject | scala.Null
  ]
  type DurationInputArg2 = adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - Datetime
    - Duration
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = _LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MonthWeekdayFn = js.Function2[
    /* datetimeToFormat */ Datetime, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* datetimeToFormat */ Datetime, java.lang.String]
}
