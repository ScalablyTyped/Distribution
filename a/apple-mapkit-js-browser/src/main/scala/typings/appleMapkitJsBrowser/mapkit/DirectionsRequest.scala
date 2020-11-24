package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The requested start and end points for a route, as well as the planned mode of transportation.
  */
@js.native
trait DirectionsRequest extends js.Object {
  
  /**
    * The arrival date for the trip.
    */
  var arrivalDate: js.UndefOr[Date] = js.native
  
  /**
    * The departure date for the trip.
    */
  var departureDate: js.UndefOr[Date] = js.native
  
  /**
    * The end point for routing directions.
    */
  var destination: String | Coordinate | Place = js.native
  
  /**
    * The start point for routing directions.
    */
  var origin: String | Coordinate | Place = js.native
  
  /**
    * A Boolean value that indicates whether the server should return multiple
    * routes when they are available.
    */
  var requestsAlternateRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode of transportation to which directions should apply.
    */
  var transportType: js.UndefOr[Transport] = js.native
}
object DirectionsRequest {
  
  @scala.inline
  def apply(destination: String | Coordinate | Place, origin: String | Coordinate | Place): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  
  @scala.inline
  implicit class DirectionsRequestOps[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String | Coordinate | Place): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String | Coordinate | Place): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalDate(value: Date): Self = this.set("arrivalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrivalDate: Self = this.set("arrivalDate", js.undefined)
    
    @scala.inline
    def setDepartureDate(value: Date): Self = this.set("departureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartureDate: Self = this.set("departureDate", js.undefined)
    
    @scala.inline
    def setRequestsAlternateRoutes(value: Boolean): Self = this.set("requestsAlternateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsAlternateRoutes: Self = this.set("requestsAlternateRoutes", js.undefined)
    
    @scala.inline
    def setTransportType(value: Transport): Self = this.set("transportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportType: Self = this.set("transportType", js.undefined)
  }
}
