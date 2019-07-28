package typings.adone.adoneNs.INs.datetimeNs

import typings.adone.adoneNs.INs.datetimeNs.unitOfTimeNs.All
import typings.adone.adoneNs.INs.datetimeNs.unitOfTimeNs.Diff
import typings.adone.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf
import typings.adone.adoneStrings.`()`
import typings.adone.adoneStrings.`(]`
import typings.adone.adoneStrings.`[)`
import typings.adone.adoneStrings.`[]`
import typings.std.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datetime
  extends Object
     with _DatetimeInput
     with _LocaleSpecifier {
  /**
    * Mutates the original moment by adding time, by default milliseconds
    */
  def add(): Datetime = js.native
  def add(amount: DurationInputArg1): Datetime = js.native
  def add(amount: DurationInputArg1, unit: DurationInputArg2): Datetime = js.native
  /**
    * Calendar time displays time relative to a given referenceTime (defaults to now)
    */
  def calendar(): String = js.native
  def calendar(time: DatetimeInput): String = js.native
  def calendar(time: DatetimeInput, formats: CalendarSpec): String = js.native
  /**
    * Returns all the constructor inputs of this datatime object
    */
  def creationData(): DatetimeCreationData = js.native
  /**
    * Gets the day of the month, 1..31
    */
  def date(): Double = js.native
  /**
    * Sets the day of the month, 1..31.
    * If the range is exceeded, it will bubble up to the months.
    */
  def date(d: Double): Datetime = js.native
  /**
    * Sets the day of the month, 1..31.
    * If the range is exceeded, it will bubble up to the months.
    *
    * @deprecated use date()
    */
  def dates(): Double = js.native
  /**
    * Gets the day of the month, 1..31
    *
    * @deprecated use date(d)
    */
  def dates(d: Double): Datetime = js.native
  /**
    * Gets the day of week, 0(Sunday)..6(Saturday)
    */
  def day(): Double = js.native
  def day(d: String): Datetime = js.native
  /**
    * Sets the day of week, 0(Sunday)..6(Saturday).
    * If the range is exceeded, it will bubble up to other weeks
    */
  def day(d: Double): Datetime = js.native
  /**
    * Gets the day of the year, 1..366
    */
  def dayOfYear(): Double = js.native
  /**
    * Sets the day of the year, 1..366.
    * If the range is exceeded, it will bubble up to the years
    */
  def dayOfYear(d: Double): Datetime = js.native
  /**
    * Gets the day of week, 0(Sunday)..6(Saturday)
    */
  def days(): Double = js.native
  def days(d: String): Datetime = js.native
  /**
    * Sets the day of week, 0(Sunday)..6(Saturday).
    * If the range is exceeded, it will bubble up to other weeks
    */
  def days(d: Double): Datetime = js.native
  /**
    * Returns the number of days in the current month
    */
  def daysInMonth(): Double = js.native
  /**
    * Returns the difference in the given unit, default is milliseconds
    */
  def diff(b: DatetimeInput): Double = js.native
  def diff(b: DatetimeInput, unitOfTime: Diff): Double = js.native
  def diff(b: DatetimeInput, unitOfTime: Diff, precise: Boolean): Double = js.native
  /**
    * Mutates the original moment by setting it to the end of a unit of time
    */
  def endOf(unitOfTime: StartOf): Datetime = js.native
  /**
    * Formats the datetime using the given format.
    * It takes a string of tokens and replaces them with their corresponding values
    */
  def format(): String = js.native
  def format(format: String): String = js.native
  /**
    * Displays a datetime in relation to a time other than now
    */
  def from(inp: DatetimeInput): String = js.native
  def from(inp: DatetimeInput, suffix: Boolean): String = js.native
  /**
    * Displays the datatime in relation to now
    */
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  /**
    * Returns the value of the given unit
    */
  def get(unit: All): Double = js.native
  def hasAlignedHourOffset(): Boolean = js.native
  def hasAlignedHourOffset(other: DatetimeInput): Boolean = js.native
  /**
    * Gets the hour, 0..23
    */
  def hour(): Double = js.native
  /**
    * Sets the hour, 0..23.
    * If the range is exceeded, it will bubble up to the day.
    */
  def hour(h: Double): Datetime = js.native
  /**
    * Gets the hour, 0..23
    */
  def hours(): Double = js.native
  /**
    * Sets the hour, 0..23.
    * If the range is exceeded, it will bubble up to the day.
    */
  def hours(h: Double): Datetime = js.native
  /**
    * Returns a machine readable string, that can be evaluated to produce the same datetime
    */
  def inspect(): String = js.native
  /**
    * Returns the index of the first overflowed unit
    *
    * 0 - years
    * 1 - months
    * 2 - days
    * 3 - hours
    * 4 - minutes
    * 5 - seconds
    * 6 - milliseconds
    */
  def invalidAt(): Double = js.native
  /**
    * Check if the datetime is after another datetime.
    */
  def isAfter(): Boolean = js.native
  def isAfter(inp: DatetimeInput): Boolean = js.native
  def isAfter(inp: DatetimeInput, granularity: StartOf): Boolean = js.native
  /**
    * Check if the datetime is before another datetime.
    */
  def isBefore(): Boolean = js.native
  def isBefore(inp: DatetimeInput): Boolean = js.native
  def isBefore(inp: DatetimeInput, granularity: StartOf): Boolean = js.native
  /**
    * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
    * The match is exclusive.
    */
  def isBetween(a: DatetimeInput, b: DatetimeInput): Boolean = js.native
  def isBetween(a: DatetimeInput, b: DatetimeInput, granularity: StartOf): Boolean = js.native
  def isBetween(a: DatetimeInput, b: DatetimeInput, granularity: StartOf, inclusivity: `()`): Boolean = js.native
  def isBetween(a: DatetimeInput, b: DatetimeInput, granularity: StartOf, inclusivity: `(]`): Boolean = js.native
  def isBetween(a: DatetimeInput, b: DatetimeInput, granularity: StartOf, inclusivity: `[)`): Boolean = js.native
  def isBetween(a: DatetimeInput, b: DatetimeInput, granularity: StartOf, inclusivity: `[]`): Boolean = js.native
  /**
    * Checks if the current moment is in daylight saving time
    */
  def isDST(): Boolean = js.native
  /**
    * @deprecated no reliable implementation
    */
  def isDSTShifted(): Boolean = js.native
  /**
    * Returns true if that year is a leap year, and false if it is not.
    */
  def isLeapYear(): Boolean = js.native
  /**
    * Returns true if local flag is set
    */
  def isLocal(): Boolean = js.native
  /**
    * Check if the datetime is the same as another datetime.
    */
  def isSame(): Boolean = js.native
  def isSame(inp: DatetimeInput): Boolean = js.native
  def isSame(inp: DatetimeInput, granularity: StartOf): Boolean = js.native
  /**
    * Check if a datetime is after or the same as another datetime.
    */
  def isSameOrAfter(): Boolean = js.native
  def isSameOrAfter(inp: DatetimeInput): Boolean = js.native
  def isSameOrAfter(inp: DatetimeInput, granularity: StartOf): Boolean = js.native
  /**
    * Check if a datetime is before or the same as another datetime.
    */
  def isSameOrBefore(): Boolean = js.native
  def isSameOrBefore(inp: DatetimeInput): Boolean = js.native
  def isSameOrBefore(inp: DatetimeInput, granularity: StartOf): Boolean = js.native
  /**
    * Return true if utc flag is set
    */
  def isUTC(): Boolean = js.native
  /**
    * Return true if utc flag is set
    */
  def isUtc(): Boolean = js.native
  def isUtcOffset(): Boolean = js.native
  /**
    * Return true if the datetime object is valid
    */
  def isValid(): Boolean = js.native
  /**
    * Gets the ISO week of the year, 1..53
    */
  def isoWeek(): Double = js.native
  /**
    * Sets the ISO week of the year, 1..53
    */
  def isoWeek(d: Double): Datetime = js.native
  /**
    * Gets the ISO week-year
    */
  def isoWeekYear(): Double = js.native
  /**
    * Sets the ISO week-year
    */
  def isoWeekYear(d: Double): Datetime = js.native
  /**
    * Gets the ISO day of the week, 1(Monday)..7(Sunday)
    */
  def isoWeekday(): Double = js.native
  def isoWeekday(d: String): Datetime = js.native
  /**
    * Sets the ISO day of the week, 1(Monday)..7(Sunday)
    * If the range is exceeded, it will bubble up to other weeks.
    */
  def isoWeekday(d: Double): Datetime = js.native
  /**
    * Gets the ISO week of the year, 1..53
    */
  def isoWeeks(): Double = js.native
  /**
    * Sets the ISO week of the year, 1..53
    */
  def isoWeeks(d: Double): Datetime = js.native
  /**
    * Gets the number of weeks in the current datetime's year, according to ISO weeks
    */
  def isoWeeksInYear(): Double = js.native
  /**
    * Sets a flag on the original datetime to use local time to display a datetime instead of the original datetime's time
    */
  def local(): Datetime = js.native
  def local(keepLocalTime: Boolean): Datetime = js.native
  /**
    * Returns the using locale
    */
  def locale(): String = js.native
  /**
    * Sets a new locale
    */
  def locale(locale: LocaleSpecifier): Datetime = js.native
  /**
    * Returns the data of the using locale
    */
  def localeData(): Locale = js.native
  /**
    * Gets the millisecond, 0..999
    */
  def millisecond(): Double = js.native
  /**
    * Sets the millisecond, 0..999.
    * If the range is exceeded, it will bubble up to the seconds.
    */
  def millisecond(ms: Double): Datetime = js.native
  /**
    * Gets the millisecond, 0..999
    */
  def milliseconds(): Double = js.native
  /**
    * Sets the millisecond, 0..999.
    * If the range is exceeded, it will bubble up to the seconds.
    */
  def milliseconds(ms: Double): Datetime = js.native
  /**
    * Gets the minute, 0..59
    */
  def minute(): Double = js.native
  /**
    * Sets the minute, 0..59.
    * If the range is exceeded, it will bubble up to the hour.
    */
  def minute(m: Double): Datetime = js.native
  /**
    * Gets the minute, 0..59
    */
  def minutes(): Double = js.native
  /**
    * Sets the minute, 0..59.
    * If the range is exceeded, it will bubble up to the hour.
    */
  def minutes(m: Double): Datetime = js.native
  /**
    * Gets the month, 0..11
    */
  def month(): Double = js.native
  def month(M: String): Datetime = js.native
  /**
    * Sets the month, 0..11.
    * If the range is exceeded, it will bubble up to the year
    */
  def month(M: Double): Datetime = js.native
  /**
    * Gets the month, 0..11
    *
    * @deprecated use month()
    */
  def months(): Double = js.native
  def months(M: String): Datetime = js.native
  /**
    * Sets the month, 0..11.
    * If the range is exceeded, it will bubble up to the year
    *
    * @deprecated use month(M)
    */
  def months(M: Double): Datetime = js.native
  def parseZone(): Datetime = js.native
  def parsingFlags(): DatetimeParsingFlags = js.native
  /**
    * Gets the quarter, 1..4
    */
  def quarter(): Double = js.native
  /**
    * Sets the quarter, 1..4
    */
  def quarter(q: Double): Datetime = js.native
  /**
    * Gets the quarter, 1..4
    */
  def quarters(): Double = js.native
  /**
    * Sets the quarter, 1..4
    */
  def quarters(q: Double): Datetime = js.native
  /**
    * Gets the second, 0..59
    */
  def second(): Double = js.native
  /**
    * Sets the second, 0..59.
    * If the range is exceeded, it will bubble up to the minutes.
    */
  def second(s: Double): Datetime = js.native
  /**
    * Gets the second, 0..59
    */
  def seconds(): Double = js.native
  /**
    * Sets the second, 0..59.
    * If the range is exceeded, it will bubble up to the minutes.
    */
  def seconds(s: Double): Datetime = js.native
  /**
    * Sets the values of the given units represented as an object
    */
  def set(objectLiteral: DatetimeSetObject): Datetime = js.native
  /**
    * Sets the value of the given unit
    */
  def set(unit: All, value: Double): Datetime = js.native
  /**
    * Mutates the original datetime by setting it to the start of a unit of time
    */
  def startOf(unitOfTime: StartOf): Datetime = js.native
  /**
    * Mutates the original moment by subtracting time, by default milliseconds
    */
  def subtract(): Datetime = js.native
  def subtract(amount: DurationInputArg1): Datetime = js.native
  def subtract(amount: DurationInputArg1, unit: DurationInputArg2): Datetime = js.native
  /**
    * Displays the datetime in relation to a time other than now
    */
  def to(inp: DatetimeInput): String = js.native
  def to(inp: DatetimeInput, suffix: Boolean): String = js.native
  /**
    * Returns an array that mirrors the parameters from new Date()
    */
  def toArray(): js.Array[Double] = js.native
  /**
    * Conver the datetime to MS-DOS date/time format
    */
  def toDOS(): MSDOSFormat = js.native
  /**
    * Returns a copy of the native Date object that the datetime wraps
    */
  def toDate(): typings.std.Date = js.native
  /**
    * Formats a string to the ISO8601 standard
    */
  def toISOString(): String = js.native
  /**
    * When serializing a duration object to JSON, it will be represented as an ISO8601 string
    */
  def toJSON(): String = js.native
  /**
    * Displays the datatime in relation to now
    */
  def toNow(): String = js.native
  def toNow(withoutPrefix: Boolean): String = js.native
  /**
    * Returns an object containing year, month, day-of-month, hour, minute, seconds, milliseconds.
    */
  def toObject(): DatetimeObjectOutput = js.native
  /**
    * Returns a Unix timestamp (the number of seconds since the Unix Epoch)
    */
  def unix(): Double = js.native
  /**
    * Sets a flag on the original datetime to use UTC to display a datetime instead of the original datetime's time
    */
  def utc(): Datetime = js.native
  def utc(keepLocalTime: Boolean): Datetime = js.native
  /**
    * Get the UTC offset in minutes.
    */
  def utcOffset(): Double = js.native
  def utcOffset(b: String): Datetime = js.native
  def utcOffset(b: String, keepLocalTime: Boolean): Datetime = js.native
  /**
    * Sets the UTC offset
    */
  def utcOffset(b: Double): Datetime = js.native
  def utcOffset(b: Double, keepLocalTime: Boolean): Datetime = js.native
  /**
    * Gets the week of the year, 1..53
    */
  def week(): Double = js.native
  /**
    * Sets the week of the year, 1..53
    */
  def week(d: Double): Datetime = js.native
  /**
    * Gets the week-year according to the locale
    */
  def weekYear(): Double = js.native
  /**
    * Gets or sets the week-year according to the locale
    *
    */
  def weekYear(d: Double): Datetime = js.native
  /**
    * Gets the day of the week according to the locale, 0..6.
    * If the locale assigns Monday as the first day of the week, datetime().weekday() will be Monday (0).
    */
  def weekday(): Double = js.native
  /**
    * Sets the day of the week according to the locale, 0..6.
    * If the locale assigns Monday as the first day of the week, datetime().weekday(0) will be Monday.
    * If Sunday is the first day of the week, moment().weekday(0) will be Sunday.
    */
  def weekday(d: Double): Datetime = js.native
  /**
    * Gets the week of the year, 1..53
    */
  def weeks(): Double = js.native
  /**
    * Sets the week of the year, 1..53
    */
  def weeks(d: Double): Datetime = js.native
  /**
    * Gets the number of weeks according to locale in the current datetime's year
    */
  def weeksInYear(): Double = js.native
  /**
    * Gets the year
    */
  def year(): Double = js.native
  /**
    * Sets the year
    */
  def year(y: Double): Datetime = js.native
  /**
    * Sets the year
    * @deprecated use year()
    */
  def years(): Double = js.native
  /**
    * Gets the year
    *
    * @deprecated use year(y)
    */
  def years(y: Double): Datetime = js.native
  /**
    * Returns the zone abbreviation
    */
  def zoneAbbr(): String = js.native
  /**
    * Returns the zone name
    */
  def zoneName(): String = js.native
}

