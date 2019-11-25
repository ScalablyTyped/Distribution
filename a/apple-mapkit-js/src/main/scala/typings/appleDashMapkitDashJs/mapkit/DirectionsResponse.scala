package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The directions and estimated travel time returned for a route.
  */
trait DirectionsResponse extends js.Object {
  var request: js.Any
  var routes: js.Array[Route]
}

object DirectionsResponse {
  @scala.inline
  def apply(request: js.Any, routes: js.Array[Route]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectionsResponse]
  }
}

