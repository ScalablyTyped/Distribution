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
    */
  def convertNumberFormatToIntlOptions(): NumberFormatOptions = js.native
  def convertNumberFormatToIntlOptions(format: NumberFormat): NumberFormatOptions = js.native
  
  def formatDate(value: Double): String = js.native
  def formatDate(value: Double, formatOptions: DateTimeFormatOptions): String = js.native
  /**
    * Formats a `Date` or `Number` value to a string in the current locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#formatDate)
    */
  def formatDate(value: Date): String = js.native
  def formatDate(value: Date, formatOptions: DateTimeFormatOptions): String = js.native
  
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
    * Evokes a callback to notify when the locale changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#onLocaleChange)
    */
  def onLocaleChange(listener: js.Function): js.Any = js.native
  
  /**
    * Provides right-to-left preference for input locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#prefersRTL)
    */
  def prefersRTL(): Boolean = js.native
  def prefersRTL(locale: String): Boolean = js.native
  
  /**
    * Sets the locale used by the API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#setLocale)
    */
  def setLocale(locale: String): Unit = js.native
  
  /**
    * Use this to substitute keys in a `template` string with values from the argument `data`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#substitute)
    */
  def substitute(template: String, data: js.Any): String = js.native
  def substitute(template: String, data: js.Any, options: SubstituteOptions): String = js.native
}
