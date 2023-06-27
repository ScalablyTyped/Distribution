package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesParametersProperties extends StObject {
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesParameters.html#apiKey)
  		 */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
  		 * URL to the places service.
  		 *
  		 * @default "https://places-api.arcgis.com/arcgis/rest/services/places-service/v1"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesParameters.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object PlacesParametersProperties {
  
  inline def apply(): PlacesParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacesParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacesParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
