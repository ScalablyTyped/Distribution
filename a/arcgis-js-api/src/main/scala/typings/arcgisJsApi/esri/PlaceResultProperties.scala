package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceResultProperties extends StObject {
  
  /**
  		 * An arrary of category objects for a place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#categories)
  		 */
  var categories: js.UndefOr[js.Array[Category]] = js.undefined
  
  /**
  		 * The distance, in meters, from the place to the search point.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#distance)
  		 */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A location defined by X and Y coordinates in WGS84.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#location)
  		 */
  var location: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * The name of the place, or point of interest.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The unique Id of this place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlaceResult.html#placeId)
  		 */
  var placeId: js.UndefOr[String] = js.undefined
}
object PlaceResultProperties {
  
  inline def apply(): PlaceResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceResultProperties] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}
