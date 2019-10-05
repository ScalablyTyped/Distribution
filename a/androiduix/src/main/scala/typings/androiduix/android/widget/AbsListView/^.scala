package typings.androiduix.android.widget.AbsListView

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import typings.androiduix.android.view.animation.Interpolator
import typings.androiduix.java.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView")
@js.native
object ^ extends js.Object {
  var CHECK_POSITION_SEARCH_DISTANCE: js.Any = js.native
  var CHOICE_MODE_MULTIPLE: Double = js.native
  var CHOICE_MODE_MULTIPLE_MODAL: Double = js.native
  var CHOICE_MODE_NONE: Double = js.native
  var CHOICE_MODE_SINGLE: Double = js.native
  var INVALID_POINTER: Double = js.native
  var LAYOUT_FORCE_BOTTOM: Double = js.native
  var LAYOUT_FORCE_TOP: Double = js.native
  var LAYOUT_MOVE_SELECTION: Double = js.native
  var LAYOUT_NORMAL: Double = js.native
  var LAYOUT_SET_SELECTION: Double = js.native
  var LAYOUT_SPECIFIC: Double = js.native
  var LAYOUT_SYNC: Double = js.native
  var OVERSCROLL_LIMIT_DIVISOR: js.Any = js.native
  var PROFILE_FLINGING: Boolean = js.native
  var PROFILE_SCROLLING: js.Any = js.native
  var TAG_AbsListView: String = js.native
  var TOUCH_MODE_DONE_WAITING: Double = js.native
  var TOUCH_MODE_DOWN: Double = js.native
  var TOUCH_MODE_FLING: Double = js.native
  var TOUCH_MODE_OFF: js.Any = js.native
  var TOUCH_MODE_ON: js.Any = js.native
  var TOUCH_MODE_OVERFLING: Double = js.native
  var TOUCH_MODE_OVERSCROLL: js.Any = js.native
  var TOUCH_MODE_REST: Double = js.native
  var TOUCH_MODE_SCROLL: Double = js.native
  var TOUCH_MODE_TAP: Double = js.native
  var TOUCH_MODE_UNKNOWN: js.Any = js.native
  var TRANSCRIPT_MODE_ALWAYS_SCROLL: Double = js.native
  var TRANSCRIPT_MODE_DISABLED: Double = js.native
  var TRANSCRIPT_MODE_NORMAL: Double = js.native
  var sLinearInterpolator: Interpolator = js.native
  def getDistance(source: Rect, dest: Rect, direction: Double): Double = js.native
  def retrieveFromScrap(scrapViews: ArrayList[View], position: Double): View = js.native
}

