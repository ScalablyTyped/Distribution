package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.mapkitNs.DirectionsNs.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRequest extends js.Object {
  var destination: String | Coordinate | Place
  var origin: String | Coordinate | Place
  var requestsAlternateRoutes: Boolean
  var transportType: Transport
}

object DirectionsRequest {
  @scala.inline
  def apply(
    destination: String | Coordinate | Place,
    origin: String | Coordinate | Place,
    requestsAlternateRoutes: Boolean,
    transportType: Transport
  ): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], requestsAlternateRoutes = requestsAlternateRoutes, transportType = transportType)
  
    __obj.asInstanceOf[DirectionsRequest]
  }
}

