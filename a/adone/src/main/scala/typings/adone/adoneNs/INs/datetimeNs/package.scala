package typings.adone.adoneNs.INs

import typings.adone.adoneNs.INs.datetimeNs.unitOfTimeNs.DurationConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datetimeNs {
  type CalendarSpecVal = String | (js.Function2[/* m */ js.UndefOr[DatetimeInput], /* now */ js.UndefOr[Datetime], String])
  type DatetimeFormatSpecification = String | js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typings.adone.adoneNs.INs.datetimeNs.DatetimeInputObject
    - typings.adone.adoneNs.INs.datetimeNs.Datetime
    - typings.std.Date
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type DatetimeInput = js.UndefOr[
    _DatetimeInput | (js.Array[Double | String]) | String | Double | typings.std.Date | Null
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.adone.adoneNs.INs.datetimeNs.Duration
    - scala.Double
    - java.lang.String
    - typings.adone.adoneNs.INs.datetimeNs.FromTo
    - typings.adone.adoneNs.INs.datetimeNs.DurationInputObject
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type DurationInputArg1 = js.UndefOr[_DurationInputArg1 | Double | String | Null]
  type DurationInputArg2 = DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.adone.adoneNs.INs.datetimeNs.Datetime
    - typings.adone.adoneNs.INs.datetimeNs.Duration
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = _LocaleSpecifier | js.Array[String] | String | Boolean
  type MonthWeekdayFn = js.Function2[/* datetimeToFormat */ Datetime, /* format */ js.UndefOr[String], String]
  type RelativeTimeFuturePastVal = String | (js.Function1[/* relTime */ String, String])
  type RelativeTimeSpecVal = String | (js.Function4[
    /* n */ Double, 
    /* withoutSuffix */ Boolean, 
    /* key */ RelativeTimeKey, 
    /* isFuture */ Boolean, 
    String
  ])
  type WeekdaySimpleFn = js.Function1[/* datetimeToFormat */ Datetime, String]
}
