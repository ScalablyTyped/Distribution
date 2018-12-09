package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  def abs(): Duration = js.native
  /**
                   * Mutates the original duration by adding time
                   */
  def add(): Duration = js.native
  /**
                   * Mutates the original duration by adding time
                   */
  def add(inp: DurationInputArg1): Duration = js.native
  /**
                   * Mutates the original duration by adding time
                   */
  def add(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  /**
                   * Returns the length of the duration in the given units
                   */
  def as(units: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.Base): scala.Double = js.native
  /**
                   * Returns the length of the duration in days
                   */
  def asDays(): scala.Double = js.native
  /**
                   * Returns the length of the duration in hours
                   */
  def asHours(): scala.Double = js.native
  /**
                   * Returns the length of the duration in milliseconds
                   */
  def asMilliseconds(): scala.Double = js.native
  /**
                   * Returns the length of the duration in minutes
                   */
  def asMinutes(): scala.Double = js.native
  /**
                   * Returns the length of the duration in months
                   */
  def asMonths(): scala.Double = js.native
  /**
                   * Returns the length of the duration in seconds
                   */
  def asSeconds(): scala.Double = js.native
  /**
                   * Returns the length of the duration in weeks
                   */
  def asWeeks(): scala.Double = js.native
  /**
                   * Returns the length of the duration in years
                   */
  def asYears(): scala.Double = js.native
  /**
                   * Returns the number of days in the duration
                   */
  def days(): scala.Double = js.native
  /**
                   * Returns the value of the given unit
                   */
  def get(units: adoneLib.adoneNs.INs.datetimeNs.unitOfTimeNs.Base): scala.Double = js.native
  /**
                   * Returns the number of hours in the duration
                   */
  def hours(): scala.Double = js.native
  /**
                   * Returns a human readable representation
                   */
  def humanize(): java.lang.String = js.native
  /**
                   * Returns a human readable representation
                   */
  def humanize(withSuffix: scala.Boolean): java.lang.String = js.native
  /**
                   * Returns the using locale
                   */
  def locale(): java.lang.String = js.native
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
  def milliseconds(): scala.Double = js.native
  /**
                   * Returns the number of minutes in the duration
                   */
  def minutes(): scala.Double = js.native
  /**
                   * Returns the number of months in the duration
                   */
  def months(): scala.Double = js.native
  /**
                   * Returns the number of seconds in the duration
                   */
  def seconds(): scala.Double = js.native
  /**
                   * Mutates the original duration by subtracting time.
                   */
  def subtract(): Duration = js.native
  /**
                   * Mutates the original duration by subtracting time.
                   */
  def subtract(inp: DurationInputArg1): Duration = js.native
  /**
                   * Mutates the original duration by subtracting time.
                   */
  def subtract(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  /**
                   * Returns duration in string as specified by ISO 8601 standard.
                   */
  def toISOString(): java.lang.String = js.native
  /**
                   * When serializing a duration object to JSON, it will be represented as an ISO8601 string.
                   */
  def toJSON(): java.lang.String = js.native
  /**
                   * Returns the number of weeks in the duration
                   */
  def weeks(): scala.Double = js.native
  /**
                   * Returns the number of years in the duration
                   */
  def years(): scala.Double = js.native
}

