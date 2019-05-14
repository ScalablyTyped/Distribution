package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Padding")
@js.native
class Padding () extends js.Object {
  def this(options: PaddingConstructorOptions) = this()
  def this(options: js.Array[scala.Double]) = this()
  var latitude: scala.Double = js.native
  var longitude: scala.Double = js.native
  def copy(): Coordinate = js.native
  def equals(coordinate: Coordinate): scala.Boolean = js.native
  def toMapPoint(): MapPoint = js.native
  def toUnwrappedMapPoint(): MapPoint = js.native
}

