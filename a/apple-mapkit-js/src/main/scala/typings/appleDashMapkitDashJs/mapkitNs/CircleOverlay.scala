package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.CircleOverlay")
@js.native
class CircleOverlay protected () extends Overlay {
  def this(coordinate: Coordinate, radius: Double) = this()
  def this(coordinate: Coordinate, radius: Double, options: StylesOverlayOptions) = this()
  var coordinate: Coordinate = js.native
  @JSName("enabled")
  var enabled_CircleOverlay: Boolean = js.native
  var radius: Double = js.native
  @JSName("selected")
  var selected_CircleOverlay: Boolean = js.native
  @JSName("visible")
  var visible_CircleOverlay: Boolean = js.native
}

