package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.MapRect")
@js.native
class MapRect protected () extends js.Object {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var origin: MapPoint = js.native
  var size: MapSize = js.native
  def copy(): MapRect = js.native
  def equals(rect: MapRect): Boolean = js.native
  def maxX(): Double = js.native
  def maxY(): Double = js.native
  def midX(): Double = js.native
  def midY(): Double = js.native
  def minX(): Double = js.native
  def minY(): Double = js.native
  def scale(scaleFactor: Double, scaleCenter: MapPoint): MapRect = js.native
  def toCoordinateRegion(): CoordinateRegion = js.native
}

