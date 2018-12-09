package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datetime
  extends stdLib.Object {
  /**
                   * Mutates the original moment by adding time, by default milliseconds
                   */
  def add(): Datetime = js.native
  /**
                   * Mutates the original moment by adding time, by default milliseconds
                   */
  def add(amount: DurationInputArg1): Datetime = js.native
  /**
                   * Mutates the original moment by adding time, by default milliseconds
                   */
  def add(amount: DurationInputArg1, unit: DurationInputArg2): Datetime = js.native
  /**
                   * Calendar time displays time relative to a given referenceTime (defaults to now)
                   */
  def calendar(): java.lang.String = js.native
  /**
                   * Calendar time displays time relative to a given referenceTime (defaults to now)
                   */
  def calendar(time: DatetimeInput): java.lang.String = js.native
  /**
                   * Calendar time displays time relative to a given referenceTime (defaults to now)
                   */
  def calendar(time: DatetimeInput, formats: CalendarSpec): java.lang.String = js.native
  /**
                   * Returns all the constructor inputs of this datatime object
                   */
  def creationData(): DatetimeCreationData = js.native
  /**
                   * Gets the day of the month, 1..31
                   */
  def date(): scala.Double = js.native
  /**
                   * Sets the day of the month, 1..31.
                   * If the range is exceeded, it will bubble up to the months.
                   */
  def date(d: scala.Double): Datetime = js.native
  /**
                   * Sets the day of the month, 1..31.
                   * If the range is exceeded, it will bubble up to the months.
                   *
                   * @deprecated use date()
                   */
  def dates(): scala.Double = js.native
  /**
                   * Gets the day of the month, 1..31
                   *
                   * @deprecated use date(d)
                   */
  def dates(d: scala.Double): Datetime = js.native
  /**
                   * Gets the day of week, 0(Sunday)..6(Saturday)
                   */
  def day(): scala.Double = js.native
  /**
                   * Sets the day of week, 0(Sunday)..6(Saturday).
                   * If the range is exceeded, it will bubble up to other weeks
                   */
  def day(d: java.lang.String): Datetime = js.native
  /**
                   * Sets the day of week, 0(Sunday)..6(Saturday).
                   * If the range is exceeded, it will bubble up to other weeks
                   */
  def day(d: scala.Double): Datetime = js.native
  /**
                   * Gets the day of the year, 1..366
                   */
  def dayOfYear(): scala.Double = js.native
  /**
                   * Sets the day of the year, 1..366.
                   * If the range is exceeded, it will bubble up to the years
                   */
  def dayOfYear(d: scala.Double): Datetime = js.native
  /**
                   * Gets the day of week, 0(Sunday)..6(Saturday)
                   */
  def days(): scala.Double = js.native
  /**
                   * Sets the day of week, 0(Sunday)..6(Saturday).
                   * If the range is exceeded, it will bubble up to other weeks
                   */
  def days(d: java.lang.String): Datetime = js.native
  /**
                   * Sets the day of week, 0(Sunday)..6(Saturday).
                   * If the range is exceeded, it will bubble up to other weeks
                   */
  def days(d: scala.Double): Datetime = js.native
  /**
                   * Returns the number of days in the current month
                   */
  def daysInMonth(): scala.Double = js.native
  /**
                   * Returns the difference in the given unit, default is milliseconds
                   */
  def diff(b: DatetimeInput): scala.Double = js.native
  /**
                   * Returns the difference in the given unit, default is milliseconds
                   */
  def diff(b: DatetimeInput, unitOfTime: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.Diff): scala.Double = js.native
  /**
                   * Returns the difference in the given unit, default is milliseconds
                   */
  def diff(
    b: DatetimeInput,
    unitOfTime: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.Diff,
    precise: scala.Boolean
  ): scala.Double = js.native
  /**
                   * Mutates the original moment by setting it to the end of a unit of time
                   */
  def endOf(unitOfTime: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): Datetime = js.native
  /**
                   * Formats the datetime using the given format.
                   * It takes a string of tokens and replaces them with their corresponding values
                   */
  def format(): java.lang.String = js.native
  /**
                   * Formats the datetime using the given format.
                   * It takes a string of tokens and replaces them with their corresponding values
                   */
  def format(format: java.lang.String): java.lang.String = js.native
  /**
                   * Displays a datetime in relation to a time other than now
                   */
  def from(inp: DatetimeInput): java.lang.String = js.native
  /**
                   * Displays a datetime in relation to a time other than now
                   */
  def from(inp: DatetimeInput, suffix: scala.Boolean): java.lang.String = js.native
  /**
                   * Displays the datatime in relation to now
                   */
  def fromNow(): java.lang.String = js.native
  /**
                   * Displays the datatime in relation to now
                   */
  def fromNow(withoutSuffix: scala.Boolean): java.lang.String = js.native
  /**
                   * Returns the value of the given unit
                   */
  def get(unit: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.All): scala.Double = js.native
  def hasAlignedHourOffset(): scala.Boolean = js.native
  def hasAlignedHourOffset(other: DatetimeInput): scala.Boolean = js.native
  /**
                   * Gets the hour, 0..23
                   */
  def hour(): scala.Double = js.native
  /**
                   * Sets the hour, 0..23.
                   * If the range is exceeded, it will bubble up to the day.
                   */
  def hour(h: scala.Double): Datetime = js.native
  /**
                   * Gets the hour, 0..23
                   */
  def hours(): scala.Double = js.native
  /**
                   * Sets the hour, 0..23.
                   * If the range is exceeded, it will bubble up to the day.
                   */
  def hours(h: scala.Double): Datetime = js.native
  /**
                   * Returns a machine readable string, that can be evaluated to produce the same datetime
                   */
  def inspect(): java.lang.String = js.native
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
  def invalidAt(): scala.Double = js.native
  /**
                   * Check if the datetime is after another datetime.
                   */
  def isAfter(): scala.Boolean = js.native
  /**
                   * Check if the datetime is after another datetime.
                   */
  def isAfter(inp: DatetimeInput): scala.Boolean = js.native
  /**
                   * Check if the datetime is after another datetime.
                   */
  def isAfter(inp: DatetimeInput, granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): scala.Boolean = js.native
  /**
                   * Check if the datetime is before another datetime.
                   */
  def isBefore(): scala.Boolean = js.native
  /**
                   * Check if the datetime is before another datetime.
                   */
  def isBefore(inp: DatetimeInput): scala.Boolean = js.native
  /**
                   * Check if the datetime is before another datetime.
                   */
  def isBefore(inp: DatetimeInput, granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): scala.Boolean = js.native
  /**
                   * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
                   * The match is exclusive.
                   */
  def isBetween(a: DatetimeInput, b: DatetimeInput): scala.Boolean = js.native
  /**
                   * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
                   * The match is exclusive.
                   */
  def isBetween(
    a: DatetimeInput,
    b: DatetimeInput,
    granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf
  ): scala.Boolean = js.native
  /**
                   * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
                   * The match is exclusive.
                   */
  @JSName("isBetween")
  def `isBetween_()`(
    a: DatetimeInput,
    b: DatetimeInput,
    granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf,
    inclusivity: adoneLib.adoneLibStrings.`()`
  ): scala.Boolean = js.native
  /**
                   * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
                   * The match is exclusive.
                   */
  @JSName("isBetween")
  def `isBetween_(]`(
    a: DatetimeInput,
    b: DatetimeInput,
    granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf,
    inclusivity: adoneLib.adoneLibStrings.`(]`
  ): scala.Boolean = js.native
  /**
                   * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
                   * The match is exclusive.
                   */
  @JSName("isBetween")
  def `isBetween_[)`(
    a: DatetimeInput,
    b: DatetimeInput,
    granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf,
    inclusivity: adoneLib.adoneLibStrings.`[)`
  ): scala.Boolean = js.native
  /**
                   * Check if a datetime is between two other datetimes, optionally looking at unit scale (minutes, hours, days, etc).
                   * The match is exclusive.
                   */
  @JSName("isBetween")
  def `isBetween_[]`(
    a: DatetimeInput,
    b: DatetimeInput,
    granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf,
    inclusivity: adoneLib.adoneLibStrings.`[]`
  ): scala.Boolean = js.native
  /**
                   * Checks if the current moment is in daylight saving time
                   */
  def isDST(): scala.Boolean = js.native
  /**
                   * @deprecated no reliable implementation
                   */
  def isDSTShifted(): scala.Boolean = js.native
  /**
                   * Returns true if that year is a leap year, and false if it is not.
                   */
  def isLeapYear(): scala.Boolean = js.native
  /**
                   * Returns true if local flag is set
                   */
  def isLocal(): scala.Boolean = js.native
  /**
                   * Check if the datetime is the same as another datetime.
                   */
  def isSame(): scala.Boolean = js.native
  /**
                   * Check if the datetime is the same as another datetime.
                   */
  def isSame(inp: DatetimeInput): scala.Boolean = js.native
  /**
                   * Check if the datetime is the same as another datetime.
                   */
  def isSame(inp: DatetimeInput, granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): scala.Boolean = js.native
  /**
                   * Check if a datetime is after or the same as another datetime.
                   */
  def isSameOrAfter(): scala.Boolean = js.native
  /**
                   * Check if a datetime is after or the same as another datetime.
                   */
  def isSameOrAfter(inp: DatetimeInput): scala.Boolean = js.native
  /**
                   * Check if a datetime is after or the same as another datetime.
                   */
  def isSameOrAfter(inp: DatetimeInput, granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): scala.Boolean = js.native
  /**
                   * Check if a datetime is before or the same as another datetime.
                   */
  def isSameOrBefore(): scala.Boolean = js.native
  /**
                   * Check if a datetime is before or the same as another datetime.
                   */
  def isSameOrBefore(inp: DatetimeInput): scala.Boolean = js.native
  /**
                   * Check if a datetime is before or the same as another datetime.
                   */
  def isSameOrBefore(inp: DatetimeInput, granularity: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): scala.Boolean = js.native
  /**
                   * Return true if utc flag is set
                   */
  def isUTC(): scala.Boolean = js.native
  /**
                   * Return true if utc flag is set
                   */
  def isUtc(): scala.Boolean = js.native
  def isUtcOffset(): scala.Boolean = js.native
  /**
                   * Return true if the datetime object is valid
                   */
  def isValid(): scala.Boolean = js.native
  /**
                   * Gets the ISO week of the year, 1..53
                   */
  def isoWeek(): scala.Double = js.native
  /**
                   * Sets the ISO week of the year, 1..53
                   */
  def isoWeek(d: scala.Double): Datetime = js.native
  /**
                   * Gets the ISO week-year
                   */
  def isoWeekYear(): scala.Double = js.native
  /**
                   * Sets the ISO week-year
                   */
  def isoWeekYear(d: scala.Double): Datetime = js.native
  /**
                   * Gets the ISO day of the week, 1(Monday)..7(Sunday)
                   */
  def isoWeekday(): scala.Double = js.native
  /**
                   * Sets the ISO day of the week, 1(Monday)..7(Sunday)
                   * If the range is exceeded, it will bubble up to other weeks.
                   */
  def isoWeekday(d: java.lang.String): Datetime = js.native
  /**
                   * Sets the ISO day of the week, 1(Monday)..7(Sunday)
                   * If the range is exceeded, it will bubble up to other weeks.
                   */
  def isoWeekday(d: scala.Double): Datetime = js.native
  /**
                   * Gets the ISO week of the year, 1..53
                   */
  def isoWeeks(): scala.Double = js.native
  /**
                   * Sets the ISO week of the year, 1..53
                   */
  def isoWeeks(d: scala.Double): Datetime = js.native
  /**
                   * Gets the number of weeks in the current datetime's year, according to ISO weeks
                   */
  def isoWeeksInYear(): scala.Double = js.native
  /**
                   * Sets a flag on the original datetime to use local time to display a datetime instead of the original datetime's time
                   */
  def local(): Datetime = js.native
  /**
                   * Sets a flag on the original datetime to use local time to display a datetime instead of the original datetime's time
                   */
  def local(keepLocalTime: scala.Boolean): Datetime = js.native
  /**
                   * Returns the using locale
                   */
  def locale(): java.lang.String = js.native
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
  def millisecond(): scala.Double = js.native
  /**
                   * Sets the millisecond, 0..999.
                   * If the range is exceeded, it will bubble up to the seconds.
                   */
  def millisecond(ms: scala.Double): Datetime = js.native
  /**
                   * Gets the millisecond, 0..999
                   */
  def milliseconds(): scala.Double = js.native
  /**
                   * Sets the millisecond, 0..999.
                   * If the range is exceeded, it will bubble up to the seconds.
                   */
  def milliseconds(ms: scala.Double): Datetime = js.native
  /**
                   * Gets the minute, 0..59
                   */
  def minute(): scala.Double = js.native
  /**
                   * Sets the minute, 0..59.
                   * If the range is exceeded, it will bubble up to the hour.
                   */
  def minute(m: scala.Double): Datetime = js.native
  /**
                   * Gets the minute, 0..59
                   */
  def minutes(): scala.Double = js.native
  /**
                   * Sets the minute, 0..59.
                   * If the range is exceeded, it will bubble up to the hour.
                   */
  def minutes(m: scala.Double): Datetime = js.native
  /**
                   * Gets the month, 0..11
                   */
  def month(): scala.Double = js.native
  /**
                   * Sets the month, 0..11.
                   * If the range is exceeded, it will bubble up to the year
                   */
  def month(M: java.lang.String): Datetime = js.native
  /**
                   * Sets the month, 0..11.
                   * If the range is exceeded, it will bubble up to the year
                   */
  def month(M: scala.Double): Datetime = js.native
  /**
                   * Gets the month, 0..11
                   *
                   * @deprecated use month()
                   */
  def months(): scala.Double = js.native
  /**
                   * Sets the month, 0..11.
                   * If the range is exceeded, it will bubble up to the year
                   *
                   * @deprecated use month(M)
                   */
  def months(M: java.lang.String): Datetime = js.native
  /**
                   * Sets the month, 0..11.
                   * If the range is exceeded, it will bubble up to the year
                   *
                   * @deprecated use month(M)
                   */
  def months(M: scala.Double): Datetime = js.native
  def parseZone(): Datetime = js.native
  def parsingFlags(): DatetimeParsingFlags = js.native
  /**
                   * Gets the quarter, 1..4
                   */
  def quarter(): scala.Double = js.native
  /**
                   * Sets the quarter, 1..4
                   */
  def quarter(q: scala.Double): Datetime = js.native
  /**
                   * Gets the quarter, 1..4
                   */
  def quarters(): scala.Double = js.native
  /**
                   * Sets the quarter, 1..4
                   */
  def quarters(q: scala.Double): Datetime = js.native
  /**
                   * Gets the second, 0..59
                   */
  def second(): scala.Double = js.native
  /**
                   * Sets the second, 0..59.
                   * If the range is exceeded, it will bubble up to the minutes.
                   */
  def second(s: scala.Double): Datetime = js.native
  /**
                   * Gets the second, 0..59
                   */
  def seconds(): scala.Double = js.native
  /**
                   * Sets the second, 0..59.
                   * If the range is exceeded, it will bubble up to the minutes.
                   */
  def seconds(s: scala.Double): Datetime = js.native
  /**
                   * Sets the values of the given units represented as an object
                   */
  def set(objectLiteral: DatetimeSetObject): Datetime = js.native
  /**
                   * Sets the value of the given unit
                   */
  def set(unit: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.All, value: scala.Double): Datetime = js.native
  /**
                   * Mutates the original datetime by setting it to the start of a unit of time
                   */
  def startOf(unitOfTime: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.StartOf): Datetime = js.native
  /**
                   * Mutates the original moment by subtracting time, by default milliseconds
                   */
  def subtract(): Datetime = js.native
  /**
                   * Mutates the original moment by subtracting time, by default milliseconds
                   */
  def subtract(amount: DurationInputArg1): Datetime = js.native
  /**
                   * Mutates the original moment by subtracting time, by default milliseconds
                   */
  def subtract(amount: DurationInputArg1, unit: DurationInputArg2): Datetime = js.native
  /**
                   * Displays the datetime in relation to a time other than now
                   */
  def to(inp: DatetimeInput): java.lang.String = js.native
  /**
                   * Displays the datetime in relation to a time other than now
                   */
  def to(inp: DatetimeInput, suffix: scala.Boolean): java.lang.String = js.native
  /**
                   * Returns an array that mirrors the parameters from new Date()
                   */
  def toArray(): js.Array[scala.Double] = js.native
  /**
                   * Conver the datetime to MS-DOS date/time format
                   */
  def toDOS(): MSDOSFormat = js.native
  /**
                   * Returns a copy of the native Date object that the datetime wraps
                   */
  def toDate(): stdLib.Date = js.native
  /**
                   * Formats a string to the ISO8601 standard
                   */
  def toISOString(): java.lang.String = js.native
  /**
                   * When serializing a duration object to JSON, it will be represented as an ISO8601 string
                   */
  def toJSON(): java.lang.String = js.native
  /**
                   * Displays the datatime in relation to now
                   */
  def toNow(): java.lang.String = js.native
  /**
                   * Displays the datatime in relation to now
                   */
  def toNow(withoutPrefix: scala.Boolean): java.lang.String = js.native
  /**
                   * Returns an object containing year, month, day-of-month, hour, minute, seconds, milliseconds.
                   */
  def toObject(): DatetimeObjectOutput = js.native
  /**
                   * Returns a Unix timestamp (the number of seconds since the Unix Epoch)
                   */
  def unix(): scala.Double = js.native
  /**
                   * Sets a flag on the original datetime to use UTC to display a datetime instead of the original datetime's time
                   */
  def utc(): Datetime = js.native
  /**
                   * Sets a flag on the original datetime to use UTC to display a datetime instead of the original datetime's time
                   */
  def utc(keepLocalTime: scala.Boolean): Datetime = js.native
  /**
                   * Get the UTC offset in minutes.
                   */
  def utcOffset(): scala.Double = js.native
  /**
                   * Sets the UTC offset
                   */
  def utcOffset(b: java.lang.String): Datetime = js.native
  /**
                   * Sets the UTC offset
                   */
  def utcOffset(b: java.lang.String, keepLocalTime: scala.Boolean): Datetime = js.native
  /**
                   * Sets the UTC offset
                   */
  def utcOffset(b: scala.Double): Datetime = js.native
  /**
                   * Sets the UTC offset
                   */
  def utcOffset(b: scala.Double, keepLocalTime: scala.Boolean): Datetime = js.native
  /**
                   * Gets the week of the year, 1..53
                   */
  def week(): scala.Double = js.native
  /**
                   * Sets the week of the year, 1..53
                   */
  def week(d: scala.Double): Datetime = js.native
  /**
                   * Gets the week-year according to the locale
                   */
  def weekYear(): scala.Double = js.native
  /**
                   * Gets or sets the week-year according to the locale
                   *
                   */
  def weekYear(d: scala.Double): Datetime = js.native
  /**
                   * Gets the day of the week according to the locale, 0..6.
                   * If the locale assigns Monday as the first day of the week, datetime().weekday() will be Monday (0).
                   */
  def weekday(): scala.Double = js.native
  /**
                   * Sets the day of the week according to the locale, 0..6.
                   * If the locale assigns Monday as the first day of the week, datetime().weekday(0) will be Monday.
                   * If Sunday is the first day of the week, moment().weekday(0) will be Sunday.
                   */
  def weekday(d: scala.Double): Datetime = js.native
  /**
                   * Gets the week of the year, 1..53
                   */
  def weeks(): scala.Double = js.native
  /**
                   * Sets the week of the year, 1..53
                   */
  def weeks(d: scala.Double): Datetime = js.native
  /**
                   * Gets the number of weeks according to locale in the current datetime's year
                   */
  def weeksInYear(): scala.Double = js.native
  /**
                   * Gets the year
                   */
  def year(): scala.Double = js.native
  /**
                   * Sets the year
                   */
  def year(y: scala.Double): Datetime = js.native
  /**
                   * Sets the year
                   * @deprecated use year()
                   */
  def years(): scala.Double = js.native
  /**
                   * Gets the year
                   *
                   * @deprecated use year(y)
                   */
  def years(y: scala.Double): Datetime = js.native
  /**
                   * Returns the zone abbreviation
                   */
  def zoneAbbr(): java.lang.String = js.native
  /**
                   * Returns the zone name
                   */
  def zoneName(): java.lang.String = js.native
}

