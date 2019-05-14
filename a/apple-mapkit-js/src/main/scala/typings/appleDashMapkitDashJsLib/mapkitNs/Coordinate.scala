package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Coordinate")
@js.native
class Coordinate protected () extends js.Object {
  def this(latitude: scala.Double, longitude: scala.Double) = this()
  var latitude: scala.Double = js.native
  var longitude: scala.Double = js.native
  def copy(): Coordinate = js.native
  def equals(coordinate: Coordinate): scala.Boolean = js.native
  def toMapPoint(): MapPoint = js.native
  def toUnwrappedMapPoint(): MapPoint = js.native
}

