package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a request used to fetch points of interest.
  */
@js.native
trait PointsOfInterestSearchResponse extends js.Object {
  
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
  implicit class PointsOfInterestSearchResponseOps[Self <: PointsOfInterestSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlacesVarargs(value: Place*): Self = this.set("places", js.Array(value :_*))
    
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = this.set("places", value.asInstanceOf[js.Any])
  }
}
