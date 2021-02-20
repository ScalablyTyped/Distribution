package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typings.arcgisJsApi.arcgisJsApiStrings.dd
import typings.arcgisJsApi.arcgisJsApiStrings.ddm
import typings.arcgisJsApi.arcgisJsApiStrings.dms
import typings.arcgisJsApi.arcgisJsApiStrings.gars
import typings.arcgisJsApi.arcgisJsApiStrings.mrgs
import typings.arcgisJsApi.arcgisJsApiStrings.usng
import typings.arcgisJsApi.arcgisJsApiStrings.utm
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryServiceFromGeoCoordinateStringParams extends Object {
  
  /**
    * Conversion options for mrgs, utm and gars conversion types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.native
  
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var conversionType: js.UndefOr[mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd] = js.native
  
  /**
    * The spatial reference or well-known ID to convert the input string coordinates to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double = js.native
  
  /**
    * An array of formatted strings as specified by `conversionType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  var strings: js.Array[String] = js.native
}
object GeometryServiceFromGeoCoordinateStringParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sr: SpatialReference | String | Double,
    strings: js.Array[String]
  ): GeometryServiceFromGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sr = sr.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryServiceFromGeoCoordinateStringParams]
  }
  
  @scala.inline
  implicit class GeometryServiceFromGeoCoordinateStringParamsMutableBuilder[Self <: GeometryServiceFromGeoCoordinateStringParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionMode(value: String): Self = StObject.set(x, "conversionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionModeUndefined: Self = StObject.set(x, "conversionMode", js.undefined)
    
    @scala.inline
    def setConversionType(value: mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = StObject.set(x, "conversionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionTypeUndefined: Self = StObject.set(x, "conversionType", js.undefined)
    
    @scala.inline
    def setSr(value: SpatialReference | String | Double): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
  }
}
