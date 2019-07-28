package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.CoordinateRegion")
@js.native
class CoordinateRegion protected () extends js.Object {
  def this(center: Coordinate, span: CoordinateSpan) = this()
  var center: Coordinate = js.native
  var span: CoordinateSpan = js.native
  def copy(): CoordinateRegion = js.native
  def equals(coordinateSpan: CoordinateRegion): Boolean = js.native
  def toBoundingRegion(): BoundingRegion = js.native
  def toMapRect(): MapRect = js.native
}

