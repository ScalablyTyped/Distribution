package typings.adone.adoneNs.INs.datetimeNs

import typings.adone.adoneNs.INs.datetimeNs.unitOfTimeNs.All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatetimeFunction extends js.Object {
  /**
    * Default format for datetime.format()
    */
  var defaultFormat: String = js.native
  /**
    * Default utc format for datetime.format()
    */
  var defaultFormatUtc: String = js.native
  def apply(): Datetime = js.native
  def apply(inp: DatetimeInput): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String, strict: Boolean): Datetime = js.native
  def apply(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: Boolean): Datetime = js.native
  def calendarFormat(m: Datetime, now: Datetime): String = js.native
  def defineLocale(language: String): Locale = js.native
  /**
    * Defines a new locale
    */
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale = js.native
  /**
    * Creates a datetime from the given MS-DOS date and time
    */
  def dos(inp: MSDOSFormat): Datetime = js.native
  /**
    * Creates a new Duration object
    */
  def duration(): Duration = js.native
  def duration(inp: DurationInputArg1): Duration = js.native
  def duration(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  /**
    * Crates an invalid datetime object
    */
  def invalid(): Datetime = js.native
  def invalid(flags: DatetimeParsingFlagsOpt): Datetime = js.native
  /**
    * Checks whether the given object is a Duration
    */
  def isDuration(d: js.Any): /* is adone.adone.I.datetime.Duration */ Boolean = js.native
  /**
    * Changes the using locale
    */
  def locale(): String = js.native
  def locale(language: String): String = js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  def locale(language: js.Array[String]): String = js.native
  /**
    * Returns a locale by the given key or the current locale
    */
  def localeData(): Locale = js.native
  def localeData(key: String): Locale = js.native
  def localeData(key: js.Array[String]): Locale = js.native
  /**
    * Returns a list of the defined locales (lazy-loaded locales are not listed until they are loaded)
    */
  def locales(): js.Array[String] = js.native
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
  def months(): js.Array[String] = js.native
  def months(format: String): js.Array[String] = js.native
  def months(format: String, index: Double): String = js.native
  /**
    * Returns a month of the current locale at the given index
    */
  def months(index: Double): String = js.native
  /**
    * Returns the short form of the months of the current locale
    */
  def monthsShort(): js.Array[String] = js.native
  def monthsShort(format: String): js.Array[String] = js.native
  def monthsShort(format: String, index: Double): String = js.native
  def monthsShort(index: Double): String = js.native
  /**
    * Returns the original name of the given unit alias
    */
  def normalizeUnits(unit: All): String = js.native
  /**
    * Returns the number of milliseconds since the Unix epoch (January 1, 1970)
    */
  def now(): Double = js.native
  def parseZone(): Datetime = js.native
  def parseZone(inp: DatetimeInput): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String, strict: Boolean): Datetime = js.native
  def parseZone(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: Boolean): Datetime = js.native
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  def relativeTimeThreshold(threshold: String): Double = js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  /**
    * Creates a datetime from the given UNIX timestamp
    */
  def unix(timestamp: Double): Datetime = js.native
  def updateLocale(language: String): Locale = js.native
  /**
    * Updates an existing locale
    */
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale = js.native
  /**
    * Creates a datetime in UTC
    */
  def utc(): Datetime = js.native
  def utc(inp: DatetimeInput): Datetime = js.native
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String): Datetime = js.native
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String, strict: Boolean): Datetime = js.native
  def utc(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: Boolean): Datetime = js.native
  /**
    * Returns the weekdays of the current locale
    */
  def weekdays(): js.Array[String] = js.native
  def weekdays(format: String): js.Array[String] = js.native
  def weekdays(format: String, index: Double): String = js.native
  def weekdays(index: Double): String = js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  /**
    * Returns the min form of the weekdays of the current locale
    */
  def weekdaysMin(): js.Array[String] = js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  def weekdaysMin(index: Double): String = js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  /**
    * Returns the short form of the weekdays of the current locale
    */
  def weekdaysShort(): js.Array[String] = js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  def weekdaysShort(index: Double): String = js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
}

