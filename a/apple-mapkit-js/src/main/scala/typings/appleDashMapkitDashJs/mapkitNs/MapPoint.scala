package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.MapPoint")
@js.native
class MapPoint protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  def copy(): MapPoint = js.native
  def equals(point: MapPoint): Boolean = js.native
  def toCoordinate(): Coordinate = js.native
}

