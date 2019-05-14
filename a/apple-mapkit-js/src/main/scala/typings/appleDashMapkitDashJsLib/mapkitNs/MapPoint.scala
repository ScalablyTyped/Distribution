package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.MapPoint")
@js.native
class MapPoint protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def copy(): MapPoint = js.native
  def equals(point: MapPoint): scala.Boolean = js.native
  def toCoordinate(): Coordinate = js.native
}

