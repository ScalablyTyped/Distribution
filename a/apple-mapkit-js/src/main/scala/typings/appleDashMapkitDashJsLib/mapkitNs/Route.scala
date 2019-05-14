package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var distance: scala.Double
  var expectedTravelTime: scala.Double
  var name: java.lang.String
  var path: js.Array[js.Array[Coordinate]]
  var polyline: PolylineOverlay
  var steps: js.Array[RouteStep]
  var transportType: appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
}

object Route {
  @scala.inline
  def apply(
    distance: scala.Double,
    expectedTravelTime: scala.Double,
    name: java.lang.String,
    path: js.Array[js.Array[Coordinate]],
    polyline: PolylineOverlay,
    steps: js.Array[RouteStep],
    transportType: appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance, expectedTravelTime = expectedTravelTime, name = name, path = path, polyline = polyline, steps = steps, transportType = transportType)
  
    __obj.asInstanceOf[Route]
  }
}

