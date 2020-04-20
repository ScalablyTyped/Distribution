package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single route between a requested start and end point.
  */
trait RouteStep extends js.Object {
  /**
    * The step distance in meters.
    */
  var distance: Double
  /**
    * The written instructions for following the path represented by the step.
    */
  var instructions: String
  /**
    * An array of coordinate objects representing the path of the route segment.
    */
  var path: js.Array[Coordinate]
  /**
    * The transport type of the step.
    */
  var transportType: String
}

object RouteStep {
  @scala.inline
  def apply(distance: Double, instructions: String, path: js.Array[Coordinate], transportType: String): RouteStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteStep]
  }
}

