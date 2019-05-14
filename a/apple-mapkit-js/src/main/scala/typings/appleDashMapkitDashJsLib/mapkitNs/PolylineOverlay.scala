package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.PolylineOverlay")
@js.native
class PolylineOverlay protected () extends js.Object {
  def this(points: js.Array[Coordinate]) = this()
  def this(points: js.Array[Coordinate], options: StylesOverlayOptions) = this()
  var data: js.Any = js.native
  var enabled: scala.Boolean = js.native
  var map: Map = js.native
  var points: js.Array[Coordinate] = js.native
  var selected: scala.Boolean = js.native
  var style: Style = js.native
  var visible: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
}

