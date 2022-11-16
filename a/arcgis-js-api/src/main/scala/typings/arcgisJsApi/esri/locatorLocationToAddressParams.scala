package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locatorLocationToAddressParams extends StObject {
  
  /**
    * The point at which to search for the closest address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#locationToAddress)
    */
  var location: Point
  
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#locationToAddress)
    */
  var locationType: js.UndefOr[String] = js.undefined
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#locationToAddress)
    */
  var outSpatialReference: js.UndefOr[SpatialReference] = js.undefined
}
object locatorLocationToAddressParams {
  
  inline def apply(location: Point): locatorLocationToAddressParams = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[locatorLocationToAddressParams]
  }
  
  extension [Self <: locatorLocationToAddressParams](x: Self) {
    
    inline def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReference): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
  }
}
