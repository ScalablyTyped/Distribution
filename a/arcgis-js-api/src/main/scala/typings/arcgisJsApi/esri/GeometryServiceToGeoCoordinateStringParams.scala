package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typings.arcgisJsApi.arcgisJsApiStrings.dd
import typings.arcgisJsApi.arcgisJsApiStrings.ddm
import typings.arcgisJsApi.arcgisJsApiStrings.dms
import typings.arcgisJsApi.arcgisJsApiStrings.gars
import typings.arcgisJsApi.arcgisJsApiStrings.mgrs
import typings.arcgisJsApi.arcgisJsApiStrings.usng
import typings.arcgisJsApi.arcgisJsApiStrings.utm
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryServiceToGeoCoordinateStringParams extends Object {
  
  /**
    * If `true`, then spaces are added between components of the string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var addSpaces: js.UndefOr[Boolean] = js.native
  
  /**
    * Conversion options for mgrs and utm conversion types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.native
  
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd = js.native
  
  /**
    * An array of XY-coordinates (in JSON format) to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var coordinates: js.Array[js.Array[Double]] = js.native
  
  /**
    * The number of digits to output for each of the numerical portions in the string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var numOfDigits: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var rounding: js.UndefOr[Boolean] = js.native
  
  /**
    * The spatial reference (or WKID of the spatial reference) of the XY-coordinates to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double = js.native
}
object GeometryServiceToGeoCoordinateStringParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd,
    coordinates: js.Array[js.Array[Double]],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sr: SpatialReference | String | Double
  ): GeometryServiceToGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], conversionType = conversionType.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sr = sr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryServiceToGeoCoordinateStringParams]
  }
  
  @scala.inline
  implicit class GeometryServiceToGeoCoordinateStringParamsMutableBuilder[Self <: GeometryServiceToGeoCoordinateStringParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSpaces(value: Boolean): Self = StObject.set(x, "addSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSpacesUndefined: Self = StObject.set(x, "addSpaces", js.undefined)
    
    @scala.inline
    def setConversionMode(value: String): Self = StObject.set(x, "conversionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionModeUndefined: Self = StObject.set(x, "conversionMode", js.undefined)
    
    @scala.inline
    def setConversionType(value: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = StObject.set(x, "conversionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setNumOfDigits(value: Double): Self = StObject.set(x, "numOfDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOfDigitsUndefined: Self = StObject.set(x, "numOfDigits", js.undefined)
    
    @scala.inline
    def setRounding(value: Boolean): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    @scala.inline
    def setSr(value: SpatialReference | String | Double): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
  }
}
