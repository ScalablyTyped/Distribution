package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForTextResult extends StObject {
  
  /**
    * The distance in meters of a great-circle arc between the bias position specified and the result. Distance will be returned only if a bias position was specified in the query.  A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance between two locations. 
    */
  var Distance: js.UndefOr[SearchForTextResultDistanceDouble] = js.undefined
  
  /**
    * Details about the search result, such as its address and position.
    */
  var Place: typings.awsSdk.clientsLocationMod.Place
  
  /**
    * The unique identifier of the place. You can use this with the GetPlace operation to find the place again later.  For SearchPlaceIndexForText operations, the PlaceId is returned only by place indexes that use HERE as a data provider. 
    */
  var PlaceId: js.UndefOr[typings.awsSdk.clientsLocationMod.PlaceId] = js.undefined
  
  /**
    * The relative confidence in the match for a result among the results returned. For example, if more fields for an address match (including house number, street, city, country/region, and postal code), the relevance score is closer to 1. Returned only when the partner selected is Esri.
    */
  var Relevance: js.UndefOr[SearchForTextResultRelevanceDouble] = js.undefined
}
object SearchForTextResult {
  
  inline def apply(Place: Place): SearchForTextResult = {
    val __obj = js.Dynamic.literal(Place = Place.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForTextResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchForTextResult] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: SearchForTextResultDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "Distance", js.undefined)
    
    inline def setPlace(value: Place): Self = StObject.set(x, "Place", value.asInstanceOf[js.Any])
    
    inline def setPlaceId(value: PlaceId): Self = StObject.set(x, "PlaceId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "PlaceId", js.undefined)
    
    inline def setRelevance(value: SearchForTextResultRelevanceDouble): Self = StObject.set(x, "Relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "Relevance", js.undefined)
  }
}
