package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchPlaceParameters
  extends StObject
     with PlacesParameters {
  
  /**
  		 * The Id of the place that you want to fetch additional details.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FetchPlaceParameters.html#placeId)
  		 */
  var placeId: String = js.native
  
  /**
  		 * The array of fields that define the attributes to return for a place.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FetchPlaceParameters.html#requestedFields)
  		 */
  var requestedFields: js.Array[String] = js.native
}
