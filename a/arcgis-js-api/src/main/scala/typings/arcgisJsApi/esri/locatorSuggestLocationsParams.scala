package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locatorSuggestLocationsParams extends StObject {
  
  /**
  		 * A place or address type which can be used to filter suggest results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#suggestLocations)
  		 */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Defines a normalized location point that is used to sort geocoding candidates based upon their proximity to the given location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#suggestLocations)
  		 */
  var location: Point
  
  /**
  		 * The input text entered by a user which is used by the suggest operation to generate a list of possible matches.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html#suggestLocations)
  		 */
  var text: String
}
object locatorSuggestLocationsParams {
  
  inline def apply(location: Point, text: String): locatorSuggestLocationsParams = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[locatorSuggestLocationsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: locatorSuggestLocationsParams] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
