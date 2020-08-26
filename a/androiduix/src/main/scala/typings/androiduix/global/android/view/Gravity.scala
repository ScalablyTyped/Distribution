package typings.androiduix.global.android.view

import typings.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.Gravity")
@js.native
class Gravity ()
  extends typings.androiduix.android.view.Gravity

/* static members */
@JSGlobal("android.view.Gravity")
@js.native
object Gravity extends js.Object {
  var AXIS_CLIP: Double = js.native
  var AXIS_PULL_AFTER: Double = js.native
  var AXIS_PULL_BEFORE: Double = js.native
  var AXIS_SPECIFIED: Double = js.native
  var AXIS_X_SHIFT: Double = js.native
  var AXIS_Y_SHIFT: Double = js.native
  var BOTTOM: Double = js.native
  var CENTER: Double = js.native
  var CENTER_HORIZONTAL: Double = js.native
  var CENTER_VERTICAL: Double = js.native
  var CLIP_HORIZONTAL: Double = js.native
  var CLIP_VERTICAL: Double = js.native
  var DISPLAY_CLIP_HORIZONTAL: Double = js.native
  var DISPLAY_CLIP_VERTICAL: Double = js.native
  var END: Double = js.native
  var FILL: Double = js.native
  var FILL_HORIZONTAL: Double = js.native
  var FILL_VERTICAL: Double = js.native
  var HORIZONTAL_GRAVITY_MASK: Double = js.native
  var LEFT: Double = js.native
  var NO_GRAVITY: Double = js.native
  var RELATIVE_HORIZONTAL_GRAVITY_MASK: Double = js.native
  var RIGHT: Double = js.native
  var START: Double = js.native
  var TOP: Double = js.native
  var VERTICAL_GRAVITY_MASK: Double = js.native
  @JSName("apply")
  def apply(gravity: Double, w: Double, h: Double, container: Rect, outRect: Rect): Unit = js.native
  @JSName("apply")
  def apply(gravity: Double, w: Double, h: Double, container: Rect, outRect: Rect, layoutDirection: Double): Unit = js.native
  def getAbsoluteGravity(gravity: Double): Double = js.native
  def getAbsoluteGravity(gravity: Double, layoutDirection: Double): Double = js.native
  def parseGravity(gravityStr: String): Double = js.native
  def parseGravity(gravityStr: String, defaultGravity: Double): Double = js.native
}

