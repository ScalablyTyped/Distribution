package typings.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewConfiguration")
@js.native
class ViewConfiguration () extends js.Object {
  var density: js.Any = js.native
  var mDoubleTapSlop: Double = js.native
  var mDoubleTapTouchSlop: Double = js.native
  var mEdgeSlop: Double = js.native
  var mFadingEdgeLength: Double = js.native
  var mMaximumDrawingCacheSize: Double = js.native
  var mMaximumFlingVelocity: Double = js.native
  var mMinimumFlingVelocity: Double = js.native
  var mOverflingDistance: Double = js.native
  var mOverscrollDistance: Double = js.native
  var mPagingTouchSlop: Double = js.native
  var mScrollbarSize: Double = js.native
  var mTouchSlop: Double = js.native
  var mWindowTouchSlop: Double = js.native
  var sizeAndDensity: js.Any = js.native
  def getScaledDoubleTapSlop(): Double = js.native
  def getScaledDoubleTapTouchSlop(): Double = js.native
  def getScaledEdgeSlop(): Double = js.native
  def getScaledFadingEdgeLength(): Double = js.native
  def getScaledMaximumDrawingCacheSize(): Double = js.native
  def getScaledMaximumFlingVelocity(): Double = js.native
  def getScaledMinimumFlingVelocity(): Double = js.native
  def getScaledOverflingDistance(): Double = js.native
  def getScaledOverscrollDistance(): Double = js.native
  def getScaledPagingTouchSlop(): Double = js.native
  def getScaledScrollBarSize(): Double = js.native
  def getScaledTouchSlop(): Double = js.native
  def getScaledWindowTouchSlop(): Double = js.native
}

/* static members */
@JSGlobal("android.view.ViewConfiguration")
@js.native
object ViewConfiguration extends js.Object {
  var DEFAULT_LONG_PRESS_TIMEOUT: js.Any = js.native
  var DOUBLE_TAP_MIN_TIME: js.Any = js.native
  var DOUBLE_TAP_SLOP: js.Any = js.native
  var DOUBLE_TAP_TIMEOUT: js.Any = js.native
  var DOUBLE_TAP_TOUCH_SLOP: js.Any = js.native
  var EDGE_SLOP: Double = js.native
  var FADING_EDGE_LENGTH: js.Any = js.native
  var GLOBAL_ACTIONS_KEY_TIMEOUT: js.Any = js.native
  var HOVER_TAP_SLOP: js.Any = js.native
  var HOVER_TAP_TIMEOUT: js.Any = js.native
  var JUMP_TAP_TIMEOUT: js.Any = js.native
  var KEY_REPEAT_DELAY: js.Any = js.native
  var MAXIMUM_FLING_VELOCITY: js.Any = js.native
  var MINIMUM_FLING_VELOCITY: js.Any = js.native
  var OVERFLING_DISTANCE: js.Any = js.native
  var OVERSCROLL_DISTANCE: js.Any = js.native
  var PAGING_TOUCH_SLOP: js.Any = js.native
  var PRESSED_STATE_DURATION: js.Any = js.native
  var SCROLL_BAR_DEFAULT_DELAY: js.Any = js.native
  var SCROLL_BAR_FADE_DURATION: js.Any = js.native
  var SCROLL_BAR_SIZE: js.Any = js.native
  var SCROLL_FRICTION: js.Any = js.native
  var TAP_TIMEOUT: js.Any = js.native
  var TOUCH_SLOP: js.Any = js.native
  var WINDOW_TOUCH_SLOP: js.Any = js.native
  var ZOOM_CONTROLS_TIMEOUT: js.Any = js.native
  var instance: ViewConfiguration = js.native
  def get(): ViewConfiguration = js.native
  def get(arg: js.Any): ViewConfiguration = js.native
  def getDoubleTapMinTime(): Double = js.native
  def getDoubleTapTimeout(): Double = js.native
  def getJumpTapTimeout(): Double = js.native
  def getKeyRepeatDelay(): Double = js.native
  def getLongPressTimeout(): Double = js.native
  def getPressedStateDuration(): Double = js.native
  def getScrollBarFadeDuration(): Double = js.native
  def getScrollDefaultDelay(): Double = js.native
  def getScrollFriction(): Double = js.native
  def getTapTimeout(): Double = js.native
}

