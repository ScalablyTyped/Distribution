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
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-long-time-24`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-long-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date-short-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-date`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-month-year`
import typings.arcgisJsApi.arcgisJsApiStrings.default
import typings.arcgisJsApi.arcgisJsApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInfoFormatProperties extends StObject {
  
  /**
    * Used only with `Date` fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#dateFormat)
    */
  var dateFormat: js.UndefOr[
    default | `short-date` | `short-date-short-time` | `short-date-long-time` | `short-date-long-time-24` | `long-month-day-year` | `long-month-day-year-short-time` | `long-month-day-year-short-time-24` | `long-month-day-year-long-time` | `long-month-day-year-long-time-24` | `day-short-month-year` | `day-short-month-year-short-time` | `day-short-month-year-short-time-24` | `day-short-month-year-long-time` | `day-short-month-year-long-time-24` | `long-date` | `long-date-short-time` | `long-date-short-time-24` | `long-date-long-time` | `long-date-long-time-24` | `long-month-year` | `short-month-year` | year
  ] = js.undefined
  
  /**
    * Used only with `Number` fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#digitSeparator)
    */
  var digitSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used only with `Number` fields to specify the number of supported decimal places that should appear in popups.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#places)
    */
  var places: js.UndefOr[Double] = js.undefined
}
object FieldInfoFormatProperties {
  
  @scala.inline
  def apply(): FieldInfoFormatProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldInfoFormatProperties]
  }
  
  @scala.inline
  implicit class FieldInfoFormatPropertiesMutableBuilder[Self <: FieldInfoFormatProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(
      value: default | `short-date` | `short-date-short-time` | `short-date-long-time` | `short-date-long-time-24` | `long-month-day-year` | `long-month-day-year-short-time` | `long-month-day-year-short-time-24` | `long-month-day-year-long-time` | `long-month-day-year-long-time-24` | `day-short-month-year` | `day-short-month-year-short-time` | `day-short-month-year-short-time-24` | `day-short-month-year-long-time` | `day-short-month-year-long-time-24` | `long-date` | `long-date-short-time` | `long-date-short-time-24` | `long-date-long-time` | `long-date-long-time-24` | `long-month-year` | `short-month-year` | year
    ): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDigitSeparator(value: Boolean): Self = StObject.set(x, "digitSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitSeparatorUndefined: Self = StObject.set(x, "digitSeparator", js.undefined)
    
    @scala.inline
    def setPlaces(value: Double): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
  }
}
