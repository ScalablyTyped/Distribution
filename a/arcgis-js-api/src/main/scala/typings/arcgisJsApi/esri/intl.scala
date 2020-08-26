package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-long-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-long-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-short-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-short-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-date-long-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-date-long-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-date-short-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-date-short-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-date`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-long-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-long-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-short-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-short-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-month-year`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-long-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-long-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-short-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-short-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-month-year`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-time`
import typings.arcgisJsApi.arcgisJsApiStrings.year
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
    * @param format A web map date format string to convert.
    *
    */
  def convertDateFormatToIntlOptions(): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_dayshortmonthyear(format: `day-short-month-year`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_dayshortmonthyearlongtime(format: `day-short-month-year-long-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_dayshortmonthyearlongtime24(format: `day-short-month-year-long-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_dayshortmonthyearshorttime(format: `day-short-month-year-short-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_dayshortmonthyearshorttime24(format: `day-short-month-year-short-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longdate(format: `long-date`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longdatelongtime(format: `long-date-long-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longdatelongtime24(format: `long-date-long-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longdateshorttime(format: `long-date-short-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longdateshorttime24(format: `long-date-short-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longmonthdayyear(format: `long-month-day-year`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longmonthdayyearlongtime(format: `long-month-day-year-long-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longmonthdayyearlongtime24(format: `long-month-day-year-long-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longmonthdayyearshorttime(format: `long-month-day-year-short-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longmonthdayyearshorttime24(format: `long-month-day-year-short-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longmonthyear(format: `long-month-year`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_longtime(format: `long-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shortdate(format: `short-date`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shortdatelongtime(format: `short-date-long-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shortdatelongtime24(format: `short-date-long-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shortdateshorttime(format: `short-date-short-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shortdateshorttime24(format: `short-date-short-time-24`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shortmonthyear(format: `short-month-year`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_shorttime(format: `short-time`): DateTimeFormatOptions = js.native
  @JSName("convertDateFormatToIntlOptions")
  def convertDateFormatToIntlOptions_year(format: year): DateTimeFormatOptions = js.native
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
    * Returns the current locale used by the API. The API reads this information in a specified order. This order is described as follows:  1. What is initialized using the global `esriConfig` variable, which also initializes the `esri/config` module. 2. What is set in `dojoConfig.locale` for [backward compatibility](https://developers.arcgis.com/javascript/3/jshelp/localization.html) 3. What is set [`navigator.language`](https://developer.mozilla.org/en-US/docs/Web/API/NavigatorLanguage/language), the locale defined by the web browser's user's preferences.  The preferred way of setting a locale is via the [`setLocale()`](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#setLocale) method. A callback can be invoked to notify when the locale changes by using [`onLocaleChange()`](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#onLocaleChange).
    * > The locale defaults to `en` (English).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#getLocale)
    *
    *
    */
  def getLocale(): String = js.native
  /**
    * Evokes a callback to notify when the locale changes. This happens when [setLocale()](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#setLocale) is called, or when the web browser locale changes by the user and the current locale is the web browser's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#onLocaleChange)
    *
    * @param listener The function to call when the locale is changed. The function is called with the new locale.
    *
    */
  def onLocaleChange(listener: js.Function): js.Any = js.native
  /**
    * Provides right-to-left preference for input locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#prefersRTL)
    *
    * @param locale The locale string to obtain the right-to-left information. The current locale is used by default.
    *
    */
  def prefersRTL(): Boolean = js.native
  def prefersRTL(locale: String): Boolean = js.native
  /**
    * Sets the locale used by the API. This is the preferred method for setting the API locale.  When the locale changes, the subscribed callbacks for [`onLocaleChange()`](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#onLocaleChange) are called.
    * > The JavaScript API widgets react when the locale changes at runtime. Please note that this is considered experimental.
    * The JavaScript API offers the same level of support for [number](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatNumber), and [date](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatDate) formatting as web browsers' Intl APIs. For translations of widgets, the following set of locales are available: `ar`, `bs`, `ca`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `he`, `hi`, `hr`, `hu`, `id`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-HK`, and `zh-TW`.  If translation messages are not available for the current locale, the language is determined based on the order as described in [getLocale()](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#getLocale); or else it defaults to English messages.  Then it is possible to set the locale to `en-US` or `en-GB`. The widgets are translated using `en` messages, while dates and numbers use their corresponding formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#setLocale)
    *
    * @param locale The new Unicode locale identifier string, similar to the Intl APIs. If this is `undefined`, the locale is reset to its default value described in [`getLocale()`](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#getLocale).
    *
    */
  def setLocale(locale: String): Unit = js.native
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

