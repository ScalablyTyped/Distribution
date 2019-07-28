package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.BoundingRegion")
@js.native
class BoundingRegion protected () extends js.Object {
  def this(northLatitude: Double, eastLongitude: Double, southLatitude: Double, westLongitude: Double) = this()
  var eastLongitude: Double = js.native
  var northLatitude: Double = js.native
  var southLatitude: Double = js.native
  var westLongitude: Double = js.native
  def copy(): BoundingRegion = js.native
  def toCoordinateRegion(): CoordinateRegion = js.native
}

