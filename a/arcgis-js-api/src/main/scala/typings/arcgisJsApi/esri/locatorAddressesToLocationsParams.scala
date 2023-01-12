package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locatorAddressesToLocationsParams extends StObject {
  
  /**
    * The input addresses in the format supported by the geocode service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressesToLocations)
    */
  var addresses: js.Array[Any]
  
  /**
    * Limit result to one or more categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressesToLocations)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Limits the results to only search in the country provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressesToLocations)
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressesToLocations)
    */
  var locationType: js.UndefOr[String] = js.undefined
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressesToLocations)
    */
  var outSpatialReference: js.UndefOr[SpatialReference] = js.undefined
}
object locatorAddressesToLocationsParams {
  
  inline def apply(addresses: js.Array[Any]): locatorAddressesToLocationsParams = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[locatorAddressesToLocationsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: locatorAddressesToLocationsParams] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[Any]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: Any*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReference): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
  }
}
