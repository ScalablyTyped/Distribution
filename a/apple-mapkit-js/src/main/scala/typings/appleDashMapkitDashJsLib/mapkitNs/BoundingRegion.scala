package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.BoundingRegion")
@js.native
class BoundingRegion protected () extends js.Object {
  def this(northLatitude: scala.Double, eastLongitude: scala.Double, southLatitude: scala.Double, westLongitude: scala.Double) = this()
  var eastLongitude: scala.Double = js.native
  var northLatitude: scala.Double = js.native
  var southLatitude: scala.Double = js.native
  var westLongitude: scala.Double = js.native
  def copy(): BoundingRegion = js.native
  def toCoordinateRegion(): CoordinateRegion = js.native
}

