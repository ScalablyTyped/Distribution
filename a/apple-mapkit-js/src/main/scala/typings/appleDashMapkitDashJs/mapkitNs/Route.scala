package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.mapkitNs.DirectionsNs.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var distance: Double
  var expectedTravelTime: Double
  var name: String
  var path: js.Array[js.Array[Coordinate]]
  var polyline: PolylineOverlay
  var steps: js.Array[RouteStep]
  var transportType: Transport
}

object Route {
  @scala.inline
  def apply(
    distance: Double,
    expectedTravelTime: Double,
    name: String,
    path: js.Array[js.Array[Coordinate]],
    polyline: PolylineOverlay,
    steps: js.Array[RouteStep],
    transportType: Transport
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance, expectedTravelTime = expectedTravelTime, name = name, path = path, polyline = polyline, steps = steps, transportType = transportType)
  
    __obj.asInstanceOf[Route]
  }
}

