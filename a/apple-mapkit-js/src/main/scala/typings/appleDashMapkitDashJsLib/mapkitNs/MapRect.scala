package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.MapRect")
@js.native
class MapRect protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  var origin: MapPoint = js.native
  var size: MapSize = js.native
  def copy(): MapRect = js.native
  def equals(rect: MapRect): scala.Boolean = js.native
  def maxX(): scala.Double = js.native
  def maxY(): scala.Double = js.native
  def midX(): scala.Double = js.native
  def midY(): scala.Double = js.native
  def minX(): scala.Double = js.native
  def minY(): scala.Double = js.native
  def scale(scaleFactor: scala.Double, scaleCenter: MapPoint): MapRect = js.native
  def toCoordinateRegion(): CoordinateRegion = js.native
}

