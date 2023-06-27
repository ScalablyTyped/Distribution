package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPlaceParametersProperties
  extends StObject
     with PlacesParametersProperties {
  
  /**
  		 * The Id of the place that you want to fetch additional details.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FetchPlaceParameters.html#placeId)
  		 */
  var placeId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The array of fields that define the attributes to return for a place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FetchPlaceParameters.html#requestedFields)
  		 */
  var requestedFields: js.UndefOr[js.Array[String]] = js.undefined
}
object FetchPlaceParametersProperties {
  
  inline def apply(): FetchPlaceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPlaceParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchPlaceParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setRequestedFields(value: js.Array[String]): Self = StObject.set(x, "requestedFields", value.asInstanceOf[js.Any])
    
    inline def setRequestedFieldsUndefined: Self = StObject.set(x, "requestedFields", js.undefined)
    
    inline def setRequestedFieldsVarargs(value: String*): Self = StObject.set(x, "requestedFields", js.Array(value*))
  }
}
