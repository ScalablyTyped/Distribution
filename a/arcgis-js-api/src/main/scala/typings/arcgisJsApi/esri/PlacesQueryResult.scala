package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacesQueryResult
  extends StObject
     with Accessor {
  
  /**
  		 * Property indicating whether the query resulted in more than **200** places.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#maxResultsExceeded)
  		 */
  var maxResultsExceeded: Boolean = js.native
  
  /**
  		 * The query parameters for the next set of results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#nextQueryParams)
  		 */
  var nextQueryParams: PlacesQueryParameters = js.native
  
  /**
  		 * The query parameters for the previous set of results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#previousQueryParams)
  		 */
  var previousQueryParams: PlacesQueryParameters = js.native
  
  /**
  		 * An array of results from searching for places using the [queryPlacesNearPoint()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesNearPoint) and [queryPlacesWithinExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesWithinExtent) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#results)
  		 */
  var results: js.Array[PlaceResult] = js.native
}
