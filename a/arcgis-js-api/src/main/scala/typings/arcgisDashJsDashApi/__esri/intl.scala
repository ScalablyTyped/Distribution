package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This module provides date and number formatting methods and supporting utilities.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html)
  */
@js.native
trait intl extends js.Object {
  /**
    * Converts a [web map date format string](https://developers.arcgis.com/web-map-specification/objects/format/) to an [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat#Parameters) options object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#convertDateFormatToIntlOptions)
    *
    * @param format A web map date format string to convert.  **Possible Values**: short-date | short-date-short-time | short-date-short-time-24 | short-date-long-time | short-date-long-time-24 | short-date-le | short-date-le-short-time | short-date-le-short-time-24 | short-date-le-long-time | short-date-le-long-time-24 | long-month-day-year | long-month-day-year-short-time | long-month-day-year-short-time-24 | long-month-day-year-long-time | long-month-day-year-long-time-24 | day-short-month-year | day-short-month-year-short-time | day-short-month-year-short-time-24 | day-short-month-year-long-time | day-short-month-year-long-time-24 | long-date | long-date-short-time | long-date-short-time-24 | long-date-long-time | long-date-long-time-24 | long-month-year | short-month-year | year | short-time | long-time
    *
    */
  def convertDateFormatToIntlOptions(): DateTimeFormatOptions = js.native
  def convertDateFormatToIntlOptions(format: String): DateTimeFormatOptions = js.native
  /**
    * Converts a [NumberFormat](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat) to an [Intl.NumberFormatOptions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat#Parameters) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#convertNumberFormatToIntlOptions)
    *
    * @param format The [NumberFormat](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat) to convert.
    *
    */
  def convertNumberFormatToIntlOptions(): NumberFormatOptions = js.native
  def convertNumberFormatToIntlOptions(format: NumberFormat): NumberFormatOptions = js.native
  def formatDate(value: Double): String = js.native
  def formatDate(value: Double, formatOptions: DateTimeFormatOptions): String = js.native
  /**
    * Formats a `Date` or `Number` value to a string in the current locale.
    * > Internally `formatDate` creates [Intl formatter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) instances for the current locale. The formatters are cached using their `options` as a cache key. Reuse the same `options` objects for best performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatDate)
    *
    * @param value The [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) object, or the number of milliseconds elapsed since January 1, 1970 00:00:00 UTC, to be formatted.
    * @param formatOptions Date format options.
    *
    */
  def formatDate(value: Date): String = js.native
  def formatDate(value: Date, formatOptions: DateTimeFormatOptions): String = js.native
  /**
    * Formats a `Number` value to a string in the current locale.
    * > Internally `formatNumber` creates [Intl formatter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) instances for the current locale. The formatters are cached using their `options` as a cache key. Reuse the same `options` objects for best performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatNumber)
    *
    * @param value Number to be formatted.
    * @param formatOptions Number format options.
    *
    */
  def formatNumber(value: Double): String = js.native
  def formatNumber(value: Double, formatOptions: NumberFormatOptions): String = js.native
  /**
    * Use this to substitute keys in a `template` string with values from the argument `data`. `null` or `undefined` values aren't printed in the output result.  The formatting of the values from `data` can be specified. By default the values will be formatted based on their native JavaScript type.
    * > Internally `substitute` creates [Intl formatter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) instances for the current locale. The formatters are cached using the `options` as a cache key. Reuse the same `options` objects for best performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#substitute)
    *
    * @param template Template string to use for substitution.
    * @param data Data object to be substituted.
    * @param options Options for determining how to substitute keys in the template string.
    *
    */
  def substitute(template: String, data: js.Any): String = js.native
  def substitute(template: String, data: js.Any, options: SubstituteOptions): String = js.native
}

@JSGlobal("__esri.intl")
@js.native
object intl extends TopLevel[intl]

