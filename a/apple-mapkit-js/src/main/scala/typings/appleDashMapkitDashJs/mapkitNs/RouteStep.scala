package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.mapkitNs.DirectionsNs.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteStep extends js.Object {
  var distance: Double
  var instructions: String
  var path: js.Array[Coordinate]
  var transportType: Transport
}

object RouteStep {
  @scala.inline
  def apply(distance: Double, instructions: String, path: js.Array[Coordinate], transportType: Transport): RouteStep = {
    val __obj = js.Dynamic.literal(distance = distance, instructions = instructions, path = path, transportType = transportType)
  
    __obj.asInstanceOf[RouteStep]
  }
}

