package typings.androiduix.global.android.view

import typings.androiduix.android.view.ScaleGestureDetector.OnScaleGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ScaleGestureDetector")
@js.native
class ScaleGestureDetector protected ()
  extends typings.androiduix.android.view.ScaleGestureDetector {
  def this(listener: OnScaleGestureListener) = this()
  def this(listener: OnScaleGestureListener, handler: js.Any) = this()
}

/* static members */
@JSGlobal("android.view.ScaleGestureDetector")
@js.native
object ScaleGestureDetector extends js.Object {
  @js.native
  class SimpleOnScaleGestureListener ()
    extends typings.androiduix.android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
  
  var DOUBLE_TAP_MODE_IN_PROGRESS: js.Any = js.native
  var DOUBLE_TAP_MODE_NONE: js.Any = js.native
  var SCALE_FACTOR: js.Any = js.native
  var TAG: js.Any = js.native
  var TOUCH_STABILIZE_TIME: js.Any = js.native
}

