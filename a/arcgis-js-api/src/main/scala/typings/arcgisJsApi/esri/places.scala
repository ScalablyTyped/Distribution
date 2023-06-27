package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Find [places](/documentation/mapping-apis-and-services/places/) within a search distance of a geographic point or within an extent, or find more information about specific places.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html)
	 */
@js.native
trait places extends StObject {
  
  /**
  		 * Get place details, including name, address, description, and other attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#fetchPlace)
  		 */
  def fetchPlace(params: FetchPlaceParameters): js.Promise[Any] = js.native
  def fetchPlace(params: FetchPlaceParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
  		 * A nearby search that finds places within a given radius of a location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesNearPoint)
  		 */
  def queryPlacesNearPoint(params: PlacesQueryParameters): js.Promise[PlacesQueryResult] = js.native
  def queryPlacesNearPoint(params: PlacesQueryParameters, requestOptions: Any): js.Promise[PlacesQueryResult] = js.native
  
  /**
  		 * A search that finds places within a given extent.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesWithinExtent)
  		 */
  def queryPlacesWithinExtent(params: PlacesQueryParameters): js.Promise[PlacesQueryResult] = js.native
  def queryPlacesWithinExtent(params: PlacesQueryParameters, requestOptions: Any): js.Promise[PlacesQueryResult] = js.native
}
