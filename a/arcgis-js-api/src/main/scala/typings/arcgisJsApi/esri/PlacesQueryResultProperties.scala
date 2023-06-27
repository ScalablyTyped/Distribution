package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesQueryResultProperties extends StObject {
  
  /**
  		 * Property indicating whether the query resulted in more than **200** places.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#maxResultsExceeded)
  		 */
  var maxResultsExceeded: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The query parameters for the next set of results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#nextQueryParams)
  		 */
  var nextQueryParams: js.UndefOr[PlacesQueryParametersProperties] = js.undefined
  
  /**
  		 * The query parameters for the previous set of results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#previousQueryParams)
  		 */
  var previousQueryParams: js.UndefOr[PlacesQueryParametersProperties] = js.undefined
  
  /**
  		 * An array of results from searching for places using the [queryPlacesNearPoint()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesNearPoint) and [queryPlacesWithinExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-places.html#queryPlacesWithinExtent) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PlacesQueryResult.html#results)
  		 */
  var results: js.UndefOr[js.Array[PlaceResultProperties]] = js.undefined
}
object PlacesQueryResultProperties {
  
  inline def apply(): PlacesQueryResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacesQueryResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacesQueryResultProperties] (val x: Self) extends AnyVal {
    
    inline def setMaxResultsExceeded(value: Boolean): Self = StObject.set(x, "maxResultsExceeded", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsExceededUndefined: Self = StObject.set(x, "maxResultsExceeded", js.undefined)
    
    inline def setNextQueryParams(value: PlacesQueryParametersProperties): Self = StObject.set(x, "nextQueryParams", value.asInstanceOf[js.Any])
    
    inline def setNextQueryParamsUndefined: Self = StObject.set(x, "nextQueryParams", js.undefined)
    
    inline def setPreviousQueryParams(value: PlacesQueryParametersProperties): Self = StObject.set(x, "previousQueryParams", value.asInstanceOf[js.Any])
    
    inline def setPreviousQueryParamsUndefined: Self = StObject.set(x, "previousQueryParams", js.undefined)
    
    inline def setResults(value: js.Array[PlaceResultProperties]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: PlaceResultProperties*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
