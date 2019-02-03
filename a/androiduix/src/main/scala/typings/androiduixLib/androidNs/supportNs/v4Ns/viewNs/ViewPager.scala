package typings
package androiduixLib.androidNs.supportNs.v4Ns.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.view.ViewPager")
@js.native
class ViewPager protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: js.Any) = this()
  var mActivePointerId: js.Any = js.native
  var mAdapter: js.Any = js.native
  var mAdapterChangeListener: js.Any = js.native
  var mBottomPageBounds: js.Any = js.native
  var mCalledSuper: js.Any = js.native
  var mChildHeightMeasureSpec: js.Any = js.native
  var mChildWidthMeasureSpec: js.Any = js.native
  var mCloseEnough: js.Any = js.native
  var mCurItem: js.Any = js.native
  var mDecorChildCount: js.Any = js.native
  var mDefaultGutterSize: js.Any = js.native
  var mDrawingOrder: js.Any = js.native
  var mDrawingOrderedChildren: js.Any = js.native
  var mEndScrollRunnable: js.Any = js.native
  var mExpectedAdapterCount: js.Any = js.native
  var mFakeDragBeginTime: js.Any = js.native
  var mFakeDragging: js.Any = js.native
  var mFirstLayout: js.Any = js.native
  var mFirstOffset: js.Any = js.native
  var mFlingDistance: js.Any = js.native
  var mGutterSize: js.Any = js.native
  var mInLayout: js.Any = js.native
  var mInitialMotionX: js.Any = js.native
  var mInitialMotionY: js.Any = js.native
  var mInternalPageChangeListener: js.Any = js.native
  var mIsBeingDragged: js.Any = js.native
  var mIsUnableToDrag: js.Any = js.native
  var mItems: js.Any = js.native
  var mLastMotionX: js.Any = js.native
  var mLastMotionY: js.Any = js.native
  var mLastOffset: js.Any = js.native
  var mMarginDrawable: js.Any = js.native
  var mMaximumVelocity: js.Any = js.native
  var mMinimumVelocity: js.Any = js.native
  var mNeedCalculatePageOffsets: js.Any = js.native
  var mObserver: js.Any = js.native
  var mOffscreenPageLimit: js.Any = js.native
  var mOnPageChangeListener: js.Any = js.native
  var mOnPageChangeListeners: js.Any = js.native
  var mPageMargin: js.Any = js.native
  var mPageTransformer: js.Any = js.native
  var mPopulatePending: js.Any = js.native
  var mRestoredCurItem: js.Any = js.native
  var mScrollState: js.Any = js.native
  var mScroller: js.Any = js.native
  var mScrollingCacheEnabled: js.Any = js.native
  var mTempItem: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTopPageBounds: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  /* private */ def _addViewOverride(child: js.Any, index: js.Any, params: js.Any): js.Any = js.native
  /* private */ def addNewItem(position: js.Any, index: js.Any): js.Any = js.native
  def addOnPageChangeListener(listener: androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.OnPageChangeListener): scala.Unit = js.native
  def arrowScroll(direction: scala.Double): scala.Boolean = js.native
  def beginFakeDrag(): scala.Boolean = js.native
  /* private */ def calculatePageOffsets(curItem: js.Any, curIndex: js.Any, oldCurInfo: js.Any): js.Any = js.native
  def canScroll(
    v: androiduixLib.androidNs.viewNs.View,
    checkV: scala.Boolean,
    dx: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
  def clearOnPageChangeListeners(): scala.Unit = js.native
  /* private */ def completeScroll(postEvents: js.Any): js.Any = js.native
  def dataSetChanged(): scala.Unit = js.native
  /* private */ def determineTargetPage(currentPage: js.Any, pageOffset: js.Any, velocity: js.Any, deltaX: js.Any): js.Any = js.native
  /* private */ def dispatchOnPageScrolled(position: js.Any, offset: js.Any, offsetPixels: js.Any): js.Any = js.native
  /* private */ def dispatchOnPageSelected(position: js.Any): js.Any = js.native
  /* private */ def dispatchOnScrollStateChanged(state: js.Any): js.Any = js.native
  def distanceInfluenceForSnapDuration(f: scala.Double): scala.Double = js.native
  /* private */ def enableLayers(enable: js.Any): js.Any = js.native
  /* private */ def endDrag(): js.Any = js.native
  def endFakeDrag(): scala.Unit = js.native
  def executeKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def fakeDragBy(xOffset: scala.Double): scala.Unit = js.native
  def getAdapter(): PagerAdapter = js.native
  /* private */ def getChildRectInPagerCoordinates(outRect: js.Any, child: js.Any): js.Any = js.native
  /* private */ def getClientWidth(): js.Any = js.native
  def getCurrentItem(): scala.Double = js.native
  def getOffscreenPageLimit(): scala.Double = js.native
  def getPageMargin(): scala.Double = js.native
  /* private */ def infoForAnyChild(child: js.Any): js.Any = js.native
  /* private */ def infoForChild(child: js.Any): js.Any = js.native
  /* private */ def infoForCurrentScrollPosition(): js.Any = js.native
  /* private */ def infoForPosition(position: js.Any): js.Any = js.native
  /* private */ def initViewPager(): js.Any = js.native
  def isFakeDragging(): scala.Boolean = js.native
  /* private */ def isGutterDrag(x: js.Any, dx: js.Any): js.Any = js.native
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): scala.Unit = js.native
  def onPageScrolled(position: scala.Double, offset: scala.Double, offsetPixels: scala.Double): scala.Unit = js.native
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  def pageLeft(): scala.Boolean = js.native
  def pageRight(): scala.Boolean = js.native
  /* private */ def pageScrolled(xpos: js.Any): js.Any = js.native
  /* private */ def performDrag(x: js.Any): js.Any = js.native
  def populate(): scala.Unit = js.native
  def populate(newCurrentItem: scala.Double): scala.Unit = js.native
  /* private */ def recomputeScrollPosition(width: js.Any, oldWidth: js.Any, margin: js.Any, oldMargin: js.Any): js.Any = js.native
  /* private */ def removeNonDecorViews(): js.Any = js.native
  def removeOnPageChangeListener(listener: androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.OnPageChangeListener): scala.Unit = js.native
  /* private */ def requestParentDisallowInterceptTouchEvent(disallowIntercept: js.Any): js.Any = js.native
  /* private */ def resetTouch(): js.Any = js.native
  /* private */ def scrollToItem(item: js.Any, smoothScroll: js.Any, velocity: js.Any, dispatchSelected: js.Any): js.Any = js.native
  def setAdapter(adapter: PagerAdapter): scala.Unit = js.native
  def setChildrenDrawingOrderEnabledCompat(): scala.Unit = js.native
  def setChildrenDrawingOrderEnabledCompat(enable: scala.Boolean): scala.Unit = js.native
  def setCurrentItem(item: scala.Double): scala.Unit = js.native
  def setCurrentItem(item: scala.Double, smoothScroll: scala.Boolean): scala.Unit = js.native
  def setCurrentItemInternal(item: scala.Double, smoothScroll: scala.Boolean, always: scala.Boolean): scala.Unit = js.native
  def setCurrentItemInternal(item: scala.Double, smoothScroll: scala.Boolean, always: scala.Boolean, velocity: scala.Double): scala.Unit = js.native
  def setInternalPageChangeListener(listener: androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.OnPageChangeListener): androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.OnPageChangeListener = js.native
  def setOffscreenPageLimit(limit: scala.Double): scala.Unit = js.native
  def setOnAdapterChangeListener(listener: androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.OnAdapterChangeListener): scala.Unit = js.native
  def setOnPageChangeListener(listener: androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.OnPageChangeListener): scala.Unit = js.native
  def setPageMargin(marginPixels: scala.Double): scala.Unit = js.native
  def setPageMarginDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setPageTransformer(
    reverseDrawingOrder: scala.Boolean,
    transformer: androiduixLib.androidNs.supportNs.v4Ns.viewNs.ViewPagerNs.PageTransformer
  ): scala.Unit = js.native
  /* private */ def setScrollState(newState: js.Any): js.Any = js.native
  /* private */ def setScrollingCacheEnabled(enabled: js.Any): js.Any = js.native
  def smoothScrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def smoothScrollTo(x: scala.Double, y: scala.Double, velocity: scala.Double): scala.Unit = js.native
  /* private */ def sortChildDrawingOrder(): js.Any = js.native
}

/* static members */
@JSGlobal("android.support.v4.view.ViewPager")
@js.native
object ViewPager extends js.Object {
  var CLOSE_ENOUGH: js.Any = js.native
  var COMPARATOR: js.Any = js.native
  var DEFAULT_GUTTER_SIZE: js.Any = js.native
  var DEFAULT_OFFSCREEN_PAGES: js.Any = js.native
  var DRAW_ORDER_DEFAULT: js.Any = js.native
  var DRAW_ORDER_FORWARD: js.Any = js.native
  var DRAW_ORDER_REVERSE: js.Any = js.native
  var INVALID_POINTER: js.Any = js.native
  var MAX_SETTLE_DURATION: js.Any = js.native
  var MIN_DISTANCE_FOR_FLING: js.Any = js.native
  var MIN_FLING_VELOCITY: js.Any = js.native
  var SCROLL_STATE_DRAGGING: scala.Double = js.native
  var SCROLL_STATE_IDLE: scala.Double = js.native
  var SCROLL_STATE_SETTLING: scala.Double = js.native
  var USE_CACHE: js.Any = js.native
  var sInterpolator: js.Any = js.native
  var sPositionComparator: js.Any = js.native
  /* private */ def isImplDecor(view: js.Any): js.Any = js.native
  def setClassImplDecor(clazz: js.Function): scala.Unit = js.native
}

