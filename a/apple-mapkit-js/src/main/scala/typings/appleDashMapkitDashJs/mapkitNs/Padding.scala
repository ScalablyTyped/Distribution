package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Padding")
@js.native
class Padding () extends js.Object {
  def this(options: js.Array[Double]) = this()
  def this(options: PaddingConstructorOptions) = this()
  var latitude: Double = js.native
  var longitude: Double = js.native
  def copy(): Coordinate = js.native
  def equals(coordinate: Coordinate): Boolean = js.native
  def toMapPoint(): MapPoint = js.native
  def toUnwrappedMapPoint(): MapPoint = js.native
}

