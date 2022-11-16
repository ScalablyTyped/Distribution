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
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module provides date and number formatting methods and supporting utilities.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html)
  */
@js.native
trait intl extends StObject {
  
  /**
    * Converts a [web map date format string](https://developers.arcgis.com/web-map-specification/objects/format/) to an [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat#Parameters) options object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#convertDateFormatToIntlOptions)
    */
  def convertDateFormatToIntlOptions(): DateTimeFormatOptions = js.native
  def convertDateFormatToIntlOptions(
    format: `short-date` | `short-date-short-time` | `short-date-short-time-24` | `short-date-long-time` | `short-date-long-time-24` | `long-month-day-year` | `long-month-day-year-short-time` | `long-month-day-year-short-time-24` | `long-month-day-year-long-time` | `long-month-day-year-long-time-24` | `day-short-month-year` | `day-short-month-year-short-time` | `day-short-month-year-short-time-24` | `day-short-month-year-long-time` | `day-short-month-year-long-time-24` | `long-date` | `long-date-short-time` | `long-date-short-time-24` | `long-date-long-time` | `long-date-long-time-24` | `long-month-year` | `short-month-year` | year | `short-time` | `long-time`
  ): DateTimeFormatOptions = js.native
  
  /**
    * Converts a [NumberFormat](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat) to an [Intl.NumberFormatOptions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat#Parameters) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#convertNumberFormatToIntlOptions)
    */
  def convertNumberFormatToIntlOptions(): NumberFormatOptions = js.native
  def convertNumberFormatToIntlOptions(format: NumberFormat): NumberFormatOptions = js.native
  
  /**
    * Creates a message bundle loader specialized in loading translation files as JSON files.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#createJSONLoader)
    */
  def createJSONLoader(params: intlCreateJSONLoaderParams): MessageBundleLoader = js.native
  
  /**
    * Loads a localized message bundle used with the current API locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#fetchMessageBundle)
    */
  def fetchMessageBundle(bundleId: String): js.Promise[Any] = js.native
  
  /**
    * Formats a `Date` or `Number` value to a string in the current locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatDate)
    */
  def formatDate(value: js.Date): String = js.native
  def formatDate(value: js.Date, formatOptions: DateTimeFormatOptions): String = js.native
  def formatDate(value: Double): String = js.native
  def formatDate(value: Double, formatOptions: DateTimeFormatOptions): String = js.native
  
  /**
    * Formats a `Number` value to a string in the current locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatNumber)
    */
  def formatNumber(value: Double): String = js.native
  def formatNumber(value: Double, formatOptions: NumberFormatOptions): String = js.native
  
  /**
    * Returns the current locale used by the API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#getLocale)
    */
  def getLocale(): String = js.native
  
  /**
    * Returns one of the known message bundle locale for an input locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#normalizeMessageBundleLocale)
    */
  def normalizeMessageBundleLocale(locale: String): String | Null = js.native
  
  /**
    * Registers a [callback](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#LocaleChangeCallback) that gets notified when the locale changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#onLocaleChange)
    */
  def onLocaleChange(callback: LocaleChangeCallback): Handle = js.native
  
  /**
    * Provides right-to-left preference for input locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#prefersRTL)
    */
  def prefersRTL(): Boolean = js.native
  def prefersRTL(locale: String): Boolean = js.native
  
  /**
    * Registers a message loader to load specified message bundles needed for translating strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#registerMessageBundleLoader)
    */
  def registerMessageBundleLoader(loader: MessageBundleLoader): Any = js.native
  
  /**
    * Sets the locale used by the API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#setLocale)
    */
  def setLocale(locale: String): scala.Unit = js.native
  
  /**
    * Use this to substitute keys in a `template` string with values from the argument `data`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#substitute)
    */
  def substitute(template: String, data: Any): String = js.native
  def substitute(template: String, data: Any, options: SubstituteOptions): String = js.native
}
