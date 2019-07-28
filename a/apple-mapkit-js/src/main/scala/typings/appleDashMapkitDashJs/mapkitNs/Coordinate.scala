package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Coordinate")
@js.native
class Coordinate protected () extends js.Object {
  def this(latitude: Double, longitude: Double) = this()
  var latitude: Double = js.native
  var longitude: Double = js.native
  def copy(): Coordinate = js.native
  def equals(coordinate: Coordinate): Boolean = js.native
  def toMapPoint(): MapPoint = js.native
  def toUnwrappedMapPoint(): MapPoint = js.native
}

