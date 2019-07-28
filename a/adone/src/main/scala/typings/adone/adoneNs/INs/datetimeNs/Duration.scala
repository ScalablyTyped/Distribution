package typings.adone.adoneNs.INs.datetimeNs

import typings.adone.adoneNs.INs.datetimeNs.unitOfTimeNs.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration
  extends _DurationInputArg1
     with _LocaleSpecifier {
  def abs(): Duration = js.native
  /**
    * Mutates the original duration by adding time
    */
  def add(): Duration = js.native
  def add(inp: DurationInputArg1): Duration = js.native
  def add(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  /**
    * Returns the length of the duration in the given units
    */
  def as(units: Base): Double = js.native
  /**
    * Returns the length of the duration in days
    */
  def asDays(): Double = js.native
  /**
    * Returns the length of the duration in hours
    */
  def asHours(): Double = js.native
  /**
    * Returns the length of the duration in milliseconds
    */
  def asMilliseconds(): Double = js.native
  /**
    * Returns the length of the duration in minutes
    */
  def asMinutes(): Double = js.native
  /**
    * Returns the length of the duration in months
    */
  def asMonths(): Double = js.native
  /**
    * Returns the length of the duration in seconds
    */
  def asSeconds(): Double = js.native
  /**
    * Returns the length of the duration in weeks
    */
  def asWeeks(): Double = js.native
  /**
    * Returns the length of the duration in years
    */
  def asYears(): Double = js.native
  /**
    * Returns the number of days in the duration
    */
  def days(): Double = js.native
  /**
    * Returns the value of the given unit
    */
  def get(units: Base): Double = js.native
  /**
    * Returns the number of hours in the duration
    */
  def hours(): Double = js.native
  /**
    * Returns a human readable representation
    */
  def humanize(): String = js.native
  def humanize(withSuffix: Boolean): String = js.native
  /**
    * Returns the using locale
    */
  def locale(): String = js.native
  /**
    * Sets a new locale
    */
  def locale(locale: LocaleSpecifier): Duration = js.native
  /**
    * Returns the data of the using locale
    */
  def localeData(): Locale = js.native
  /**
    * Returns the number of milliseconds in the duration
    */
  def milliseconds(): Double = js.native
  /**
    * Returns the number of minutes in the duration
    */
  def minutes(): Double = js.native
  /**
    * Returns the number of months in the duration
    */
  def months(): Double = js.native
  /**
    * Returns the number of seconds in the duration
    */
  def seconds(): Double = js.native
  /**
    * Mutates the original duration by subtracting time.
    */
  def subtract(): Duration = js.native
  def subtract(inp: DurationInputArg1): Duration = js.native
  def subtract(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  /**
    * Returns duration in string as specified by ISO 8601 standard.
    */
  def toISOString(): String = js.native
  /**
    * When serializing a duration object to JSON, it will be represented as an ISO8601 string.
    */
  def toJSON(): String = js.native
  /**
    * Returns the number of weeks in the duration
    */
  def weeks(): Double = js.native
  /**
    * Returns the number of years in the duration
    */
  def years(): Double = js.native
}

