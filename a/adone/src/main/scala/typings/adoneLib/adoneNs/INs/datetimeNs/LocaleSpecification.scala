package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleSpecification
  extends // Allow anything: in general any property that is passed as locale spec is
// put in the locale object so it can be used by locale functions
/* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var calendar: js.UndefOr[CalendarSpec] = js.undefined
  var invalidDate: js.UndefOr[java.lang.String] = js.undefined
  var isPM: js.UndefOr[js.Function1[/* input */ java.lang.String, scala.Boolean]] = js.undefined
  var longDateFormat: js.UndefOr[LongDateFormatSpec] = js.undefined
  var meridiem: js.UndefOr[
    js.Function3[
      /* hour */ scala.Double, 
      /* minute */ scala.Double, 
      /* isLower */ scala.Boolean, 
      java.lang.String
    ]
  ] = js.undefined
  var meridiemParse: js.UndefOr[stdLib.RegExp] = js.undefined
  var months: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var monthsShort: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var ordinal: js.UndefOr[js.Function1[/* n */ scala.Double, java.lang.String]] = js.undefined
  var ordinalParse: js.UndefOr[stdLib.RegExp] = js.undefined
  var relativeTime: js.UndefOr[RelativeTimeSpec] = js.undefined
  var week: js.UndefOr[WeekSpec] = js.undefined
  var weekdays: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | MonthWeekdayFn] = js.undefined
  var weekdaysMin: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[java.lang.String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.undefined
}

