package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.HorizontalScrollView")
@js.native
class HorizontalScrollView protected () extends FrameLayout {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var _mOverflingDistance: js.Any = js.native
  var mActivePointerId: js.Any = js.native
  var mChildToScrollTo: js.Any = js.native
  var mFillViewport: js.Any = js.native
  var mIsBeingDragged: js.Any = js.native
  var mIsLayoutDirty: js.Any = js.native
  var mLastMotionX: js.Any = js.native
  var mLastScroll: js.Any = js.native
  var mMaximumVelocity: js.Any = js.native
  var mMinimumVelocity: js.Any = js.native
  var mOverflingDistance: js.Any = js.native
  var mOverscrollDistance: js.Any = js.native
  var mScroller: js.Any = js.native
  var mSmoothScrollingEnabled: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  def arrowScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def canScroll(): js.Any = js.native
  /* protected */ def computeScrollDeltaToGetChildRectOnScreen(rect: androiduixLib.androidNs.graphicsNs.Rect): scala.Double = js.native
  /* private */ def doScrollX(delta: js.Any): js.Any = js.native
  def executeKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* private */ def findFocusableViewInBounds(leftFocus: js.Any, left: js.Any, right: js.Any): js.Any = js.native
  /* private */ def findFocusableViewInMyBounds(leftFocus: js.Any, left: js.Any, preferredFocusable: js.Any): js.Any = js.native
  def fling(velocityX: scala.Double): scala.Unit = js.native
  def fullScroll(direction: scala.Double): scala.Boolean = js.native
  def getMaxScrollAmount(): scala.Double = js.native
  /* private */ def getScrollRange(): js.Any = js.native
  /* private */ def inChild(x: js.Any, y: js.Any): js.Any = js.native
  /* private */ def initOrResetVelocityTracker(): js.Any = js.native
  /* private */ def initScrollView(): js.Any = js.native
  /* private */ def initVelocityTrackerIfNotExists(): js.Any = js.native
  def isFillViewport(): scala.Boolean = js.native
  /* private */ def isOffScreen(descendant: js.Any): js.Any = js.native
  def isSmoothScrollingEnabled(): scala.Boolean = js.native
  /* private */ def isWithinDeltaOfScreen(descendant: js.Any, delta: js.Any): js.Any = js.native
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  def pageScroll(direction: scala.Double): scala.Boolean = js.native
  /* private */ def recycleVelocityTracker(): js.Any = js.native
  /* private */ def scrollAndFocus(direction: js.Any, left: js.Any, right: js.Any): js.Any = js.native
  /* private */ def scrollToChild(child: js.Any): js.Any = js.native
  /* private */ def scrollToChildRect(rect: js.Any, immediate: js.Any): js.Any = js.native
  def setFillViewport(fillViewport: scala.Boolean): scala.Unit = js.native
  def setSmoothScrollingEnabled(smoothScrollingEnabled: scala.Boolean): scala.Unit = js.native
  def smoothScrollBy(dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def smoothScrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

@JSGlobal("android.widget.HorizontalScrollView")
@js.native
object HorizontalScrollView extends js.Object {
  var ANIMATED_SCROLL_GAP: js.Any = js.native
  var INVALID_POINTER: js.Any = js.native
  var MAX_SCROLL_FACTOR: js.Any = js.native
  var TAG: js.Any = js.native
  /* private */ def clamp(n: js.Any, my: js.Any, child: js.Any): js.Any = js.native
  /* private */ def isViewDescendantOf(child: js.Any, parent: js.Any): js.Any = js.native
}

