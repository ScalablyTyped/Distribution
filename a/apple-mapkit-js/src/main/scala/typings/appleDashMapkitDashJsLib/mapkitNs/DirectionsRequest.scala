package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRequest extends js.Object {
  var destination: java.lang.String | Coordinate | Place
  var origin: java.lang.String | Coordinate | Place
  var requestsAlternateRoutes: scala.Boolean
  var transportType: appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
}

object DirectionsRequest {
  @scala.inline
  def apply(
    destination: java.lang.String | Coordinate | Place,
    origin: java.lang.String | Coordinate | Place,
    requestsAlternateRoutes: scala.Boolean,
    transportType: appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
  ): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], requestsAlternateRoutes = requestsAlternateRoutes, transportType = transportType)
  
    __obj.asInstanceOf[DirectionsRequest]
  }
}

