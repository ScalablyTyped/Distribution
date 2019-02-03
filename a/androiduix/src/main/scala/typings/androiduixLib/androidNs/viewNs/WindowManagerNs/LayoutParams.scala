package typings
package androiduixLib.androidNs.viewNs.WindowManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.WindowManager.LayoutParams")
@js.native
class LayoutParams ()
  extends androiduixLib.androidNs.widgetNs.FrameLayoutNs.LayoutParams {
  def this(_type: scala.Double) = this()
  var dimAmount: scala.Double = js.native
  var enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var flags: scala.Double = js.native
  var hideAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var mTitle: js.Any = js.native
  var resumeAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var `type`: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def copyFrom(o: LayoutParams): scala.Double = js.native
  def getTitle(): java.lang.String = js.native
  /* private */ def isFloating(): js.Any = js.native
  /* private */ def isFocusable(): js.Any = js.native
  /* private */ def isSplitTouch(): js.Any = js.native
  /* private */ def isTouchModal(): js.Any = js.native
  /* private */ def isTouchable(): js.Any = js.native
  /* private */ def isWatchTouchOutside(): js.Any = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.WindowManager.LayoutParams")
@js.native
object LayoutParams extends js.Object {
  var ALPHA_CHANGED: scala.Double = js.native
  var ANIMATION_CHANGED: scala.Double = js.native
  var DIM_AMOUNT_CHANGED: scala.Double = js.native
  var FIRST_APPLICATION_WINDOW: scala.Double = js.native
  var FIRST_SUB_WINDOW: scala.Double = js.native
  var FIRST_SYSTEM_WINDOW: scala.Double = js.native
  var FLAGS_CHANGED: scala.Double = js.native
  var FLAG_FLOATING: scala.Double = js.native
  var FLAG_NOT_FOCUSABLE: scala.Double = js.native
  var FLAG_NOT_TOUCHABLE: scala.Double = js.native
  var FLAG_NOT_TOUCH_MODAL: scala.Double = js.native
  var FLAG_SPLIT_TOUCH: scala.Double = js.native
  var FLAG_WATCH_OUTSIDE_TOUCH: scala.Double = js.native
  var FORMAT_CHANGED: scala.Double = js.native
  var LAST_APPLICATION_WINDOW: scala.Double = js.native
  var LAST_SUB_WINDOW: scala.Double = js.native
  var LAST_SYSTEM_WINDOW: scala.Double = js.native
  var LAYOUT_CHANGED: scala.Double = js.native
  var TITLE_CHANGED: scala.Double = js.native
  var TYPE_APPLICATION: scala.Double = js.native
  var TYPE_APPLICATION_ATTACHED_DIALOG: scala.Double = js.native
  var TYPE_APPLICATION_MEDIA: scala.Double = js.native
  var TYPE_APPLICATION_MEDIA_OVERLAY: scala.Double = js.native
  var TYPE_APPLICATION_PANEL: scala.Double = js.native
  var TYPE_APPLICATION_STARTING: scala.Double = js.native
  var TYPE_APPLICATION_SUB_PANEL: scala.Double = js.native
  var TYPE_BASE_APPLICATION: scala.Double = js.native
  var TYPE_CHANGED: scala.Double = js.native
  var TYPE_KEYGUARD: scala.Double = js.native
  var TYPE_PHONE: scala.Double = js.native
  var TYPE_PRIORITY_PHONE: scala.Double = js.native
  var TYPE_SEARCH_BAR: scala.Double = js.native
  var TYPE_STATUS_BAR: scala.Double = js.native
  var TYPE_SYSTEM_ALERT: scala.Double = js.native
  var TYPE_SYSTEM_DIALOG: scala.Double = js.native
  var TYPE_SYSTEM_OVERLAY: scala.Double = js.native
  var TYPE_TOAST: scala.Double = js.native
}

