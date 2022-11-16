package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typings.arcgisJsApi.arcgisJsApiStrings.dd
import typings.arcgisJsApi.arcgisJsApiStrings.ddm
import typings.arcgisJsApi.arcgisJsApiStrings.dms
import typings.arcgisJsApi.arcgisJsApiStrings.gars
import typings.arcgisJsApi.arcgisJsApiStrings.mrgs
import typings.arcgisJsApi.arcgisJsApiStrings.usng
import typings.arcgisJsApi.arcgisJsApiStrings.utm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait geometryServiceFromGeoCoordinateStringParams extends StObject {
  
  /**
    * Conversion options for mrgs, utm and gars conversion types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#fromGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.undefined
  
  /**
    * The conversion type of the input strings.
    *
    * @default mrgs
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#fromGeoCoordinateString)
    */
  var conversionType: js.UndefOr[mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd] = js.undefined
  
  /**
    * The spatial reference or well-known ID to convert the input string coordinates to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#fromGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double
  
  /**
    * An array of formatted strings as specified by `conversionType`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#fromGeoCoordinateString)
    */
  var strings: js.Array[String]
}
object geometryServiceFromGeoCoordinateStringParams {
  
  inline def apply(sr: SpatialReference | String | Double, strings: js.Array[String]): geometryServiceFromGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(sr = sr.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[geometryServiceFromGeoCoordinateStringParams]
  }
  
  extension [Self <: geometryServiceFromGeoCoordinateStringParams](x: Self) {
    
    inline def setConversionMode(value: String): Self = StObject.set(x, "conversionMode", value.asInstanceOf[js.Any])
    
    inline def setConversionModeUndefined: Self = StObject.set(x, "conversionMode", js.undefined)
    
    inline def setConversionType(value: mrgs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = StObject.set(x, "conversionType", value.asInstanceOf[js.Any])
    
    inline def setConversionTypeUndefined: Self = StObject.set(x, "conversionType", js.undefined)
    
    inline def setSr(value: SpatialReference | String | Double): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
    
    inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
  }
}
