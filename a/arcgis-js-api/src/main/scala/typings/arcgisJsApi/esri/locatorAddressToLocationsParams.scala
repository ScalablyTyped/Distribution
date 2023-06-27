package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locatorAddressToLocationsParams extends StObject {
  
  /**
  		 * The address argument is data object that contains properties representing the various address fields accepted by the corresponding geocode service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var address: Any
  
  /**
  		 * Limit result to one or more categories.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Limit result to a specific country.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
  		 * Allows the results of single geocode transactions to be persisted.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var forStorage: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Used to weight returned results for a specified area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var location: js.UndefOr[Point] = js.undefined
  
  /**
  		 * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var locationType: js.UndefOr[String] = js.undefined
  
  /**
  		 * A `suggestLocations` result ID (magicKey).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var magicKey: js.UndefOr[String] = js.undefined
  
  /**
  		 * Maximum results to return from the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var maxLocations: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The list of fields included in the returned result set.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The spatial reference of the output geometries.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var outSpatialReference: js.UndefOr[SpatialReference] = js.undefined
  
  /**
  		 * Defines the extent within which the geocode server will search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#addressToLocations)
  		 */
  var searchExtent: js.UndefOr[Extent] = js.undefined
}
object locatorAddressToLocationsParams {
  
  inline def apply(address: Any): locatorAddressToLocationsParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[locatorAddressToLocationsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: locatorAddressToLocationsParams] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Any): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setForStorage(value: Boolean): Self = StObject.set(x, "forStorage", value.asInstanceOf[js.Any])
    
    inline def setForStorageUndefined: Self = StObject.set(x, "forStorage", js.undefined)
    
    inline def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMagicKey(value: String): Self = StObject.set(x, "magicKey", value.asInstanceOf[js.Any])
    
    inline def setMagicKeyUndefined: Self = StObject.set(x, "magicKey", js.undefined)
    
    inline def setMaxLocations(value: Double): Self = StObject.set(x, "maxLocations", value.asInstanceOf[js.Any])
    
    inline def setMaxLocationsUndefined: Self = StObject.set(x, "maxLocations", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setOutSpatialReference(value: SpatialReference): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setSearchExtent(value: Extent): Self = StObject.set(x, "searchExtent", value.asInstanceOf[js.Any])
    
    inline def setSearchExtentUndefined: Self = StObject.set(x, "searchExtent", js.undefined)
  }
}
