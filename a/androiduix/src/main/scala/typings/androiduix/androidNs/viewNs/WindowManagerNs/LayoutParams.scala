package typings.androiduix.androidNs.viewNs.WindowManagerNs

import typings.androiduix.androidNs.viewNs.animationNs.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.WindowManager.LayoutParams")
@js.native
class LayoutParams ()
  extends typings.androiduix.androidNs.widgetNs.FrameLayoutNs.LayoutParams {
  def this(_type: Double) = this()
  var dimAmount: Double = js.native
  var enterAnimation: Animation = js.native
  var exitAnimation: Animation = js.native
  var flags: Double = js.native
  var hideAnimation: Animation = js.native
  var mTitle: js.Any = js.native
  var resumeAnimation: Animation = js.native
  var `type`: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def copyFrom(o: LayoutParams): Double = js.native
  def getTitle(): String = js.native
  /* private */ def isFloating(): js.Any = js.native
  /* private */ def isFocusable(): js.Any = js.native
  /* private */ def isSplitTouch(): js.Any = js.native
  /* private */ def isTouchModal(): js.Any = js.native
  /* private */ def isTouchable(): js.Any = js.native
  /* private */ def isWatchTouchOutside(): js.Any = js.native
  def setTitle(title: String): Unit = js.native
}

/* static members */
@JSGlobal("android.view.WindowManager.LayoutParams")
@js.native
object LayoutParams extends js.Object {
  var ALPHA_CHANGED: Double = js.native
  var ANIMATION_CHANGED: Double = js.native
  var DIM_AMOUNT_CHANGED: Double = js.native
  var FIRST_APPLICATION_WINDOW: Double = js.native
  var FIRST_SUB_WINDOW: Double = js.native
  var FIRST_SYSTEM_WINDOW: Double = js.native
  var FLAGS_CHANGED: Double = js.native
  var FLAG_FLOATING: Double = js.native
  var FLAG_NOT_FOCUSABLE: Double = js.native
  var FLAG_NOT_TOUCHABLE: Double = js.native
  var FLAG_NOT_TOUCH_MODAL: Double = js.native
  var FLAG_SPLIT_TOUCH: Double = js.native
  var FLAG_WATCH_OUTSIDE_TOUCH: Double = js.native
  var FORMAT_CHANGED: Double = js.native
  var LAST_APPLICATION_WINDOW: Double = js.native
  var LAST_SUB_WINDOW: Double = js.native
  var LAST_SYSTEM_WINDOW: Double = js.native
  var LAYOUT_CHANGED: Double = js.native
  var TITLE_CHANGED: Double = js.native
  var TYPE_APPLICATION: Double = js.native
  var TYPE_APPLICATION_ATTACHED_DIALOG: Double = js.native
  var TYPE_APPLICATION_MEDIA: Double = js.native
  var TYPE_APPLICATION_MEDIA_OVERLAY: Double = js.native
  var TYPE_APPLICATION_PANEL: Double = js.native
  var TYPE_APPLICATION_STARTING: Double = js.native
  var TYPE_APPLICATION_SUB_PANEL: Double = js.native
  var TYPE_BASE_APPLICATION: Double = js.native
  var TYPE_CHANGED: Double = js.native
  var TYPE_KEYGUARD: Double = js.native
  var TYPE_PHONE: Double = js.native
  var TYPE_PRIORITY_PHONE: Double = js.native
  var TYPE_SEARCH_BAR: Double = js.native
  var TYPE_STATUS_BAR: Double = js.native
  var TYPE_SYSTEM_ALERT: Double = js.native
  var TYPE_SYSTEM_DIALOG: Double = js.native
  var TYPE_SYSTEM_OVERLAY: Double = js.native
  var TYPE_TOAST: Double = js.native
}

