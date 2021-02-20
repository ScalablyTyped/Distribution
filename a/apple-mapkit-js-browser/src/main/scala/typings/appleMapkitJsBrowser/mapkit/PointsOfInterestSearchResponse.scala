package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a request used to fetch points of interest.
  */
@js.native
trait PointsOfInterestSearchResponse extends StObject {
  
  /**
    * The list of points of interest that match the request options.
    */
  var places: js.Array[Place] = js.native
}
object PointsOfInterestSearchResponse {
  
  @scala.inline
  def apply(places: js.Array[Place]): PointsOfInterestSearchResponse = {
    val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsOfInterestSearchResponse]
  }
  
  @scala.inline
  implicit class PointsOfInterestSearchResponseMutableBuilder[Self <: PointsOfInterestSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesVarargs(value: Place*): Self = StObject.set(x, "places", js.Array(value :_*))
  }
}
