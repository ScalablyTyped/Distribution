package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatetimeFunction extends js.Object {
  /**
                   * Default format for datetime.format()
                   */
  var defaultFormat: java.lang.String = js.native
  /**
                   * Default utc format for datetime.format()
                   */
  var defaultFormatUtc: java.lang.String = js.native
  def apply(): Datetime = js.native
  def apply(inp: DatetimeInput): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification, language: java.lang.String): Datetime = js.native
  def apply(
    inp: DatetimeInput,
    format: DatetimeFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: scala.Boolean): Datetime = js.native
  def calendarFormat(m: Datetime, now: Datetime): java.lang.String = js.native
  /**
                   * Defines a new locale
                   */
  def defineLocale(language: java.lang.String): Locale = js.native
  /**
                   * Defines a new locale
                   */
  def defineLocale(language: java.lang.String, localeSpec: LocaleSpecification): Locale = js.native
  /**
                   * Creates a datetime from the given MS-DOS date and time
                   */
  def dos(inp: MSDOSFormat): Datetime = js.native
  /**
                   * Creates a new Duration object
                   */
  def duration(): Duration = js.native
  /**
                   * Creates a new Duration object
                   */
  def duration(inp: DurationInputArg1): Duration = js.native
  /**
                   * Creates a new Duration object
                   */
  def duration(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  /**
                   * Crates an invalid datetime object
                   */
  def invalid(): Datetime = js.native
  /**
                   * Crates an invalid datetime object
                   */
  def invalid(flags: DatetimeParsingFlagsOpt): Datetime = js.native
  /**
                   * Checks whether the given object is a Duration
                   */
  def isDuration(d: js.Any): /* is Duration */scala.Boolean = js.native
  /**
                   * Changes the using locale
                   */
  def locale(): java.lang.String = js.native
  /**
                   * Changes the using locale
                   */
  def locale(language: java.lang.String): java.lang.String = js.native
  /**
                   * Changes the using locale with customization
                   */
  def locale(language: java.lang.String, definition: LocaleSpecification): java.lang.String = js.native
  /**
                   * Changes the using locale, will use the first one it has localizations for.
                   */
  def locale(language: js.Array[java.lang.String]): java.lang.String = js.native
  /**
                   * Returns a locale by the given key or the current locale
                   */
  def localeData(): Locale = js.native
  /**
                   * Returns a locale by the given key or the current locale
                   */
  def localeData(key: java.lang.String): Locale = js.native
  /**
                   * Returns a locale by the given key or the current locale
                   */
  def localeData(key: js.Array[java.lang.String]): Locale = js.native
  /**
                   * Returns a list of the defined locales (lazy-loaded locales are not listed until they are loaded)
                   */
  def locales(): js.Array[java.lang.String] = js.native
  /**
                   * Returns the maximum of the given datetimes
                   */
  def max(datetimes: DatetimeInput*): Datetime = js.native
  /**
                   * Returns the minimum of the given datetimes
                   */
  def min(datetimes: DatetimeInput*): Datetime = js.native
  /**
                   * Returns the months of the current locale
                   */
  def months(): js.Array[java.lang.String] = js.native
  def months(format: java.lang.String): js.Array[java.lang.String] = js.native
  def months(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  /**
                   * Returns a month of the current locale at the given index
                   */
  def months(index: scala.Double): java.lang.String = js.native
  /**
                   * Returns the short form of the months of the current locale
                   */
  def monthsShort(): js.Array[java.lang.String] = js.native
  def monthsShort(format: java.lang.String): js.Array[java.lang.String] = js.native
  def monthsShort(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def monthsShort(index: scala.Double): java.lang.String = js.native
  /**
                   * Returns the original name of the given unit alias
                   */
  def normalizeUnits(unit: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.All): java.lang.String = js.native
  /**
                   * Returns the number of milliseconds since the Unix epoch (January 1, 1970)
                   */
  def now(): scala.Double = js.native
  def parseZone(): Datetime = js.native
  def parseZone(inp: DatetimeInput): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification, language: java.lang.String): Datetime = js.native
  def parseZone(
    inp: DatetimeInput,
    format: DatetimeFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: scala.Boolean): Datetime = js.native
  def relativeTimeRounding(): js.Function1[/* num */ scala.Double, scala.Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ scala.Double, scala.Double]): scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String): scala.Double = js.native
  def relativeTimeThreshold(threshold: java.lang.String, limit: scala.Double): scala.Boolean = js.native
  /**
                   * Creates a datetime from the given UNIX timestamp
                   */
  def unix(timestamp: scala.Double): Datetime = js.native
  /**
                   * Updates an existing locale
                   */
  def updateLocale(language: java.lang.String): Locale = js.native
  /**
                   * Updates an existing locale
                   */
  def updateLocale(language: java.lang.String, localeSpec: LocaleSpecification): Locale = js.native
  /**
                   * Creates a datetime in UTC
                   */
  def utc(): Datetime = js.native
  /**
                   * Creates a datetime in UTC
                   */
  def utc(inp: DatetimeInput): Datetime = js.native
  /**
                   * Creates a datetime in UTC
                   */
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification, language: java.lang.String): Datetime = js.native
  def utc(
    inp: DatetimeInput,
    format: DatetimeFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Datetime = js.native
  /**
                   * Creates a datetime in UTC
                   */
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: scala.Boolean): Datetime = js.native
  /**
                   * Returns the weekdays of the current locale
                   */
  def weekdays(): js.Array[java.lang.String] = js.native
  def weekdays(format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdays(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdays(index: scala.Double): java.lang.String = js.native
  def weekdays(localeSorted: scala.Boolean): js.Array[java.lang.String] = js.native
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdays(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = js.native
  /**
                   * Returns the min form of the weekdays of the current locale
                   */
  def weekdaysMin(): js.Array[java.lang.String] = js.native
  def weekdaysMin(format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysMin(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysMin(index: scala.Double): java.lang.String = js.native
  def weekdaysMin(localeSorted: scala.Boolean): js.Array[java.lang.String] = js.native
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysMin(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = js.native
  /**
                   * Returns the short form of the weekdays of the current locale
                   */
  def weekdaysShort(): js.Array[java.lang.String] = js.native
  def weekdaysShort(format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysShort(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysShort(index: scala.Double): java.lang.String = js.native
  def weekdaysShort(localeSorted: scala.Boolean): js.Array[java.lang.String] = js.native
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysShort(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = js.native
}

