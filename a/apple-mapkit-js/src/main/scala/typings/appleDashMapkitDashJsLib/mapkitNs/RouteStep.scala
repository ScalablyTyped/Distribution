package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteStep extends js.Object {
  var distance: scala.Double
  var instructions: java.lang.String
  var path: js.Array[Coordinate]
  var transportType: appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
}

object RouteStep {
  @scala.inline
  def apply(
    distance: scala.Double,
    instructions: java.lang.String,
    path: js.Array[Coordinate],
    transportType: appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
  ): RouteStep = {
    val __obj = js.Dynamic.literal(distance = distance, instructions = instructions, path = path, transportType = transportType)
  
    __obj.asInstanceOf[RouteStep]
  }
}

