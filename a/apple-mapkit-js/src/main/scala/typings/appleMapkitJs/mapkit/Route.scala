package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a route, including step-by-step instructions, distance,
  * and estimated travel time.
  */
@js.native
trait Route extends js.Object {
  /**
    * The route distance in meters.
    */
  var distance: Double = js.native
  /**
    * The expected travel time in seconds.
    */
  var expectedTravelTime: Double = js.native
  /**
    * The name assigned to the route.
    */
  var name: String = js.native
  /**
    * An array of coordinate objects representing the path of the route.
    * @deprecated
    */
  var path: js.Array[Coordinate] = js.native
  /**
    * An instance of a polyline overlay that represents the path of a route.
    */
  var polyline: PolylineOverlay = js.native
  /**
    * An array of steps that comprise the overall route.
    */
  var steps: js.Array[RouteStep] = js.native
  /**
    * The overall route transport type.
    */
  var transportType: String = js.native
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
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedTravelTime(value: Double): Self = this.set("expectedTravelTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: Coordinate*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Coordinate]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolyline(value: PolylineOverlay): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: RouteStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[RouteStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportType(value: String): Self = this.set("transportType", value.asInstanceOf[js.Any])
  }
  
}

