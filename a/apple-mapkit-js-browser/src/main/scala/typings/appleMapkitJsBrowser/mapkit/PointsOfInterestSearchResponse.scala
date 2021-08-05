package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a request used to fetch points of interest.
  */
trait PointsOfInterestSearchResponse extends StObject {
  
  /**
    * The list of points of interest that match the request options.
    */
  var places: js.Array[Place]
}
object PointsOfInterestSearchResponse {
  
  inline def apply(places: js.Array[Place]): PointsOfInterestSearchResponse = {
    val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsOfInterestSearchResponse]
  }
  
  extension [Self <: PointsOfInterestSearchResponse](x: Self) {
    
    inline def setPlaces(value: js.Array[Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    inline def setPlacesVarargs(value: Place*): Self = StObject.set(x, "places", js.Array(value :_*))
  }
}
