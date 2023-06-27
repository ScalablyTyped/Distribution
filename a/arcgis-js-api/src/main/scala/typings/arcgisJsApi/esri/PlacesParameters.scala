package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacesParameters
  extends StObject
     with Accessor {
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesParameters.html#apiKey)
  		 */
  var apiKey: String = js.native
  
  /**
  		 * URL to the places service.
  		 *
  		 * @default "https://places-api.arcgis.com/arcgis/rest/services/places-service/v1"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesParameters.html#url)
  		 */
  var url: String = js.native
}
