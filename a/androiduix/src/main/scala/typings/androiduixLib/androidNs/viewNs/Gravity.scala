package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.Gravity")
@js.native
class Gravity () extends js.Object

/* static members */
@JSGlobal("android.view.Gravity")
@js.native
object Gravity extends js.Object {
  var AXIS_CLIP: scala.Double = js.native
  var AXIS_PULL_AFTER: scala.Double = js.native
  var AXIS_PULL_BEFORE: scala.Double = js.native
  var AXIS_SPECIFIED: scala.Double = js.native
  var AXIS_X_SHIFT: scala.Double = js.native
  var AXIS_Y_SHIFT: scala.Double = js.native
  var BOTTOM: scala.Double = js.native
  var CENTER: scala.Double = js.native
  var CENTER_HORIZONTAL: scala.Double = js.native
  var CENTER_VERTICAL: scala.Double = js.native
  var CLIP_HORIZONTAL: scala.Double = js.native
  var CLIP_VERTICAL: scala.Double = js.native
  var DISPLAY_CLIP_HORIZONTAL: scala.Double = js.native
  var DISPLAY_CLIP_VERTICAL: scala.Double = js.native
  var END: scala.Double = js.native
  var FILL: scala.Double = js.native
  var FILL_HORIZONTAL: scala.Double = js.native
  var FILL_VERTICAL: scala.Double = js.native
  var HORIZONTAL_GRAVITY_MASK: scala.Double = js.native
  var LEFT: scala.Double = js.native
  var NO_GRAVITY: scala.Double = js.native
  var RELATIVE_HORIZONTAL_GRAVITY_MASK: scala.Double = js.native
  var RIGHT: scala.Double = js.native
  var START: scala.Double = js.native
  var TOP: scala.Double = js.native
  var VERTICAL_GRAVITY_MASK: scala.Double = js.native
  @JSName("apply")
  def apply(
    gravity: scala.Double,
    w: scala.Double,
    h: scala.Double,
    container: androiduixLib.androidNs.graphicsNs.Rect,
    outRect: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Unit = js.native
  @JSName("apply")
  def apply(
    gravity: scala.Double,
    w: scala.Double,
    h: scala.Double,
    container: androiduixLib.androidNs.graphicsNs.Rect,
    outRect: androiduixLib.androidNs.graphicsNs.Rect,
    layoutDirection: scala.Double
  ): scala.Unit = js.native
  def getAbsoluteGravity(gravity: scala.Double): scala.Double = js.native
  def getAbsoluteGravity(gravity: scala.Double, layoutDirection: scala.Double): scala.Double = js.native
  def parseGravity(gravityStr: java.lang.String): scala.Double = js.native
  def parseGravity(gravityStr: java.lang.String, defaultGravity: scala.Double): scala.Double = js.native
}

