package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.PolylineOverlay")
@js.native
class PolylineOverlay protected () extends js.Object {
  def this(points: js.Array[Coordinate]) = this()
  def this(points: js.Array[Coordinate], options: StylesOverlayOptions) = this()
  var data: js.Any = js.native
  var enabled: Boolean = js.native
  var map: Map = js.native
  var points: js.Array[Coordinate] = js.native
  var selected: Boolean = js.native
  var style: Style = js.native
  var visible: Boolean = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
}

