package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a route, including step-by-step instructions, distance,
  * and estimated travel time.
  */
trait Route extends js.Object {
  /**
    * The route distance in meters.
    */
  var distance: Double
  /**
    * The expected travel time in seconds.
    */
  var expectedTravelTime: Double
  /**
    * The name assigned to the route.
    */
  var name: String
  /**
    * An array of coordinate objects representing the path of the route.
    * @deprecated
    */
  var path: js.Array[Coordinate]
  /**
    * An instance of a polyline overlay that represents the path of a route.
    */
  var polyline: PolylineOverlay
  /**
    * An array of steps that comprise the overall route.
    */
  var steps: js.Array[RouteStep]
  /**
    * The overall route transport type.
    */
  var transportType: String
}

object Route {
  @scala.inline
  def apply(
    distance: Double,
    expectedTravelTime: Double,
    name: String,
    path: js.Array[Coordinate],
    polyline: PolylineOverlay,
    steps: js.Array[RouteStep],
    transportType: String
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], expectedTravelTime = expectedTravelTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Route]
  }
}

