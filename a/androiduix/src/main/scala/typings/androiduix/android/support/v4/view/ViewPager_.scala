package typings.androiduix.android.support.v4.view

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.support.v4.view.ViewPager.OnAdapterChangeListener
import typings.androiduix.android.support.v4.view.ViewPager.OnPageChangeListener
import typings.androiduix.android.support.v4.view.ViewPager.PageTransformer
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPager_ extends ViewGroup {
  
  /* private */ def _addViewOverride(child: js.Any, index: js.Any, params: js.Any): js.Any = js.native
  
  /* private */ def addNewItem(position: js.Any, index: js.Any): js.Any = js.native
  
  def addOnPageChangeListener(listener: OnPageChangeListener): Unit = js.native
  
  def arrowScroll(direction: Double): Boolean = js.native
  
  def beginFakeDrag(): Boolean = js.native
  
  /* private */ def calculatePageOffsets(curItem: js.Any, curIndex: js.Any, oldCurInfo: js.Any): js.Any = js.native
  
  def canScroll(v: View, checkV: Boolean, dx: Double, x: Double, y: Double): Boolean = js.native
  
  def clearOnPageChangeListeners(): Unit = js.native
  
  /* private */ def completeScroll(postEvents: js.Any): js.Any = js.native
  
  def dataSetChanged(): Unit = js.native
  
  /* private */ def determineTargetPage(currentPage: js.Any, pageOffset: js.Any, velocity: js.Any, deltaX: js.Any): js.Any = js.native
  
  /* private */ def dispatchOnPageScrolled(position: js.Any, offset: js.Any, offsetPixels: js.Any): js.Any = js.native
  
  /* private */ def dispatchOnPageSelected(position: js.Any): js.Any = js.native
  
  /* private */ def dispatchOnScrollStateChanged(state: js.Any): js.Any = js.native
  
  def distanceInfluenceForSnapDuration(f: Double): Double = js.native
  
  /* private */ def enableLayers(enable: js.Any): js.Any = js.native
  
  /* private */ def endDrag(): js.Any = js.native
  
  def endFakeDrag(): Unit = js.native
  
  def executeKeyEvent(event: KeyEvent): Boolean = js.native
  
  def fakeDragBy(xOffset: Double): Unit = js.native
  
  def getAdapter(): PagerAdapter = js.native
  
  /* private */ def getChildRectInPagerCoordinates(outRect: js.Any, child: js.Any): js.Any = js.native
  
  /* private */ def getClientWidth(): js.Any = js.native
  
  def getCurrentItem(): Double = js.native
  
  def getOffscreenPageLimit(): Double = js.native
  
  def getPageMargin(): Double = js.native
  
  /* private */ def infoForAnyChild(child: js.Any): js.Any = js.native
  
  /* private */ def infoForChild(child: js.Any): js.Any = js.native
  
  /* private */ def infoForCurrentScrollPosition(): js.Any = js.native
  
  /* private */ def infoForPosition(position: js.Any): js.Any = js.native
  
  /* private */ def initViewPager(): js.Any = js.native
  
  def isFakeDragging(): Boolean = js.native
  
  /* private */ def isGutterDrag(x: js.Any, dx: js.Any): js.Any = js.native
  
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
  
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
  
  def onPageScrolled(position: Double, offset: Double, offsetPixels: Double): Unit = js.native
  
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  
  def pageLeft(): Boolean = js.native
  
  def pageRight(): Boolean = js.native
  
  /* private */ def pageScrolled(xpos: js.Any): js.Any = js.native
  
  /* private */ def performDrag(x: js.Any): js.Any = js.native
  
  def populate(): Unit = js.native
  def populate(newCurrentItem: Double): Unit = js.native
  
  /* private */ def recomputeScrollPosition(width: js.Any, oldWidth: js.Any, margin: js.Any, oldMargin: js.Any): js.Any = js.native
  
  /* private */ def removeNonDecorViews(): js.Any = js.native
  
  def removeOnPageChangeListener(listener: OnPageChangeListener): Unit = js.native
  
  /* private */ def requestParentDisallowInterceptTouchEvent(disallowIntercept: js.Any): js.Any = js.native
  
  /* private */ def resetTouch(): js.Any = js.native
  
  /* private */ def scrollToItem(item: js.Any, smoothScroll: js.Any, velocity: js.Any, dispatchSelected: js.Any): js.Any = js.native
  
  def setAdapter(adapter: PagerAdapter): Unit = js.native
  
  def setChildrenDrawingOrderEnabledCompat(): Unit = js.native
  def setChildrenDrawingOrderEnabledCompat(enable: Boolean): Unit = js.native
  
  def setCurrentItem(item: Double): Unit = js.native
  def setCurrentItem(item: Double, smoothScroll: Boolean): Unit = js.native
  
  def setCurrentItemInternal(item: Double, smoothScroll: Boolean, always: Boolean): Unit = js.native
  def setCurrentItemInternal(item: Double, smoothScroll: Boolean, always: Boolean, velocity: Double): Unit = js.native
  
  def setInternalPageChangeListener(listener: OnPageChangeListener): OnPageChangeListener = js.native
  
  def setOffscreenPageLimit(limit: Double): Unit = js.native
  
  def setOnAdapterChangeListener(listener: OnAdapterChangeListener): Unit = js.native
  
  def setOnPageChangeListener(listener: OnPageChangeListener): Unit = js.native
  
  def setPageMargin(marginPixels: Double): Unit = js.native
  
  def setPageMarginDrawable(d: Drawable): Unit = js.native
  
  def setPageTransformer(reverseDrawingOrder: Boolean, transformer: PageTransformer): Unit = js.native
  
  /* private */ def setScrollState(newState: js.Any): js.Any = js.native
  
  /* private */ def setScrollingCacheEnabled(enabled: js.Any): js.Any = js.native
  
  def smoothScrollTo(x: Double, y: Double): Unit = js.native
  def smoothScrollTo(x: Double, y: Double, velocity: Double): Unit = js.native
  
  /* private */ def sortChildDrawingOrder(): js.Any = js.native
}
