package typings.androiduix.android.widget

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.util.SparseBooleanArray
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewParent
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.view.ViewTreeObserver.OnTouchModeChangeListener
import typings.androiduix.android.widget.AbsListView.AdapterDataSetObserver
import typings.androiduix.android.widget.AbsListView.FlingRunnable
import typings.androiduix.android.widget.AbsListView.OnScrollListener
import typings.androiduix.android.widget.AbsListView.PositionScroller
import typings.androiduix.android.widget.AbsListView.RecycleBin
import typings.androiduix.android.widget.AbsListView.RecyclerListener
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.java_.util.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsListView
  extends AdapterView[ListAdapter]
     with OnGlobalLayoutListener
     with OnTouchModeChangeListener {
  
  var _mOverflingDistance: js.Any = js.native
  
  def canScrollList(direction: Double): Boolean = js.native
  
  /* protected */ def checkOverScrollStartScrollIfNeeded(): Boolean = js.native
  
  def clearChoices(): Unit = js.native
  
  /* private */ def clearScrollingCache(): js.Any = js.native
  
  /* private */ def confirmCheckedPositionsById(): js.Any = js.native
  
  /* private */ def contentFits(): js.Any = js.native
  
  /* private */ def createScrollingCache(): js.Any = js.native
  
  /* private */ def dismissPopup(): js.Any = js.native
  
  /* private */ def drawSelector(canvas: js.Any): js.Any = js.native
  
  def fillGap(down: Boolean): Unit = js.native
  
  /* private */ def findClosestMotionRow(y: js.Any): js.Any = js.native
  
  def findMotionRow(y: Double): Double = js.native
  
  /* private */ def finishGlows(): js.Any = js.native
  
  def getBottomPaddingOffset(): Double = js.native
  
  def getCacheColorHint(): Double = js.native
  
  def getCheckedItemCount(): Double = js.native
  
  def getCheckedItemIds(): js.Array[Double] = js.native
  
  def getCheckedItemPosition(): Double = js.native
  
  def getCheckedItemPositions(): SparseBooleanArray = js.native
  
  def getChoiceMode(): Double = js.native
  
  def getFooterViewsCount(): Double = js.native
  
  def getHeaderViewsCount(): Double = js.native
  
  def getLeftPaddingOffset(): Double = js.native
  
  def getListPaddingBottom(): Double = js.native
  
  def getListPaddingLeft(): Double = js.native
  
  def getListPaddingRight(): Double = js.native
  
  def getListPaddingTop(): Double = js.native
  
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  
  def getRightPaddingOffset(): Double = js.native
  
  def getSelector(): Drawable = js.native
  
  def getSolidColor(): Double = js.native
  
  def getTopPaddingOffset(): Double = js.native
  
  def getTranscriptMode(): Double = js.native
  
  def hasTextFilter(): Boolean = js.native
  
  def hideSelector(): Unit = js.native
  
  /* private */ def initAbsListView(): js.Any = js.native
  
  /* private */ def initOrResetVelocityTracker(): js.Any = js.native
  
  /* private */ def initVelocityTrackerIfNotExists(): js.Any = js.native
  
  def invalidateViews(): Unit = js.native
  
  def invokeOnItemScrollListener(): Unit = js.native
  
  def isFastScrollAlwaysVisible(): Boolean = js.native
  
  def isFastScrollEnabled(): Boolean = js.native
  
  def isItemChecked(position: Double): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isLayoutRequested(): Boolean = js.native
  
  /* private */ def isOwnerThread(): js.Any = js.native
  
  def isPaddingOffsetRequired(): Boolean = js.native
  
  def isScrollingCacheEnabled(): Boolean = js.native
  
  def isSmoothScrollbarEnabled(): Boolean = js.native
  
  def isStackFromBottom(): Boolean = js.native
  
  def isTextFilterEnabled(): Boolean = js.native
  
  def keyPressed(): Unit = js.native
  
  /* protected */ def layoutChildren(): Unit = js.native
  
  var mActivePointerId: js.Any = js.native
  
  var mAdapter: ListAdapter = js.native
  
  var mAdapterHasStableIds: js.Any = js.native
  
  var mCacheColorHint: js.Any = js.native
  
  var mCachingActive: Boolean = js.native
  
  var mCachingStarted: Boolean = js.native
  
  var mCheckStates: SparseBooleanArray = js.native
  
  var mCheckedIdStates: js.Any = js.native
  
  var mCheckedItemCount: js.Any = js.native
  
  var mChoiceActionMode: js.Any = js.native
  
  var mChoiceMode: Double = js.native
  
  var mClearScrollingCache: js.Any = js.native
  
  var mDataSetObserver: AdapterDataSetObserver = js.native
  
  var mDeferNotifyDataSetChanged: js.Any = js.native
  
  var mDensityScale: js.Any = js.native
  
  var mDirection: js.Any = js.native
  
  var mDrawSelectorOnTop: js.Any = js.native
  
  var mFastScrollAlwaysVisible: js.Any = js.native
  
  var mFastScrollEnabled: js.Any = js.native
  
  var mFiltered: js.Any = js.native
  
  var mFirstPositionDistanceGuess: js.Any = js.native
  
  var mFlingProfilingStarted: js.Any = js.native
  
  var mFlingRunnable: FlingRunnable = js.native
  
  var mForceTranscriptScroll: js.Any = js.native
  
  var mGlobalLayoutListenerAddedFilter: js.Any = js.native
  
  var mGlowPaddingLeft: js.Any = js.native
  
  var mGlowPaddingRight: js.Any = js.native
  
  var mIsChildViewEnabled: js.Any = js.native
  
  var mIsScrap: js.Array[Boolean] = js.native
  
  var mLastHandledItemCount: js.Any = js.native
  
  var mLastPositionDistanceGuess: js.Any = js.native
  
  var mLastScrollState: js.Any = js.native
  
  var mLastTouchMode: js.Any = js.native
  
  var mLastY: js.Any = js.native
  
  var mListPadding: Rect = js.native
  
  var mMaximumVelocity: js.Any = js.native
  
  var mMinimumVelocity: js.Any = js.native
  
  var mMotionCorrection: js.Any = js.native
  
  var mMotionPosition: Double = js.native
  
  var mMotionViewNewTop: js.Any = js.native
  
  var mMotionViewOriginalTop: js.Any = js.native
  
  var mMotionX: js.Any = js.native
  
  var mMotionY: js.Any = js.native
  
  var mOnScrollListener: js.Any = js.native
  
  var mOverflingDistance: js.Any = js.native
  
  var mOverscrollDistance: js.Any = js.native
  
  var mOverscrollMax: js.Any = js.native
  
  var mPendingCheckForKeyLongPress: js.Any = js.native
  
  var mPendingCheckForLongPress_List: js.Any = js.native
  
  var mPendingCheckForTap_ : js.Any = js.native
  
  var mPendingSync: js.Any = js.native
  
  var mPerformClick_ : js.Any = js.native
  
  var mPopupHidden: js.Any = js.native
  
  var mPositionScrollAfterLayout: Runnable = js.native
  
  var mPositionScroller: PositionScroller = js.native
  
  var mRecycler: RecycleBin = js.native
  
  var mResurrectToPosition: Double = js.native
  
  var mScrollDown: js.Any = js.native
  
  var mScrollProfilingStarted: js.Any = js.native
  
  var mScrollUp: js.Any = js.native
  
  var mScrollingCacheEnabled: js.Any = js.native
  
  var mSelectedTop: Double = js.native
  
  var mSelectionBottomPadding: js.Any = js.native
  
  var mSelectionLeftPadding: js.Any = js.native
  
  var mSelectionRightPadding: js.Any = js.native
  
  var mSelectionTopPadding: js.Any = js.native
  
  var mSelector: js.Any = js.native
  
  var mSelectorPosition: js.Any = js.native
  
  var mSelectorRect: Rect = js.native
  
  var mSmoothScrollbarEnabled: js.Any = js.native
  
  var mStackFromBottom: Boolean = js.native
  
  var mTextFilterEnabled: js.Any = js.native
  
  var mTouchFrame: js.Any = js.native
  
  var mTouchMode: Double = js.native
  
  var mTouchModeReset: Runnable = js.native
  
  var mTranscriptMode: js.Any = js.native
  
  var mVelocityScale: js.Any = js.native
  
  var mVelocityTracker: js.Any = js.native
  
  var mWidthMeasureSpec: Double = js.native
  
  def obtainView(position: Double, isScrap: js.Array[Boolean]): View = js.native
  
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  
  /* private */ def onTouchCancel(): js.Any = js.native
  
  /* private */ def onTouchDown(ev: js.Any): js.Any = js.native
  
  /* private */ def onTouchMove(ev: js.Any): js.Any = js.native
  
  /* private */ def onTouchUp(ev: js.Any): js.Any = js.native
  
  /* private */ def performLongPress(child: js.Any, longPressPosition: js.Any, longPressId: js.Any): js.Any = js.native
  
  def pointToPosition(x: Double, y: Double): Double = js.native
  
  def pointToRowId(x: Double, y: Double): Double = js.native
  
  /* private */ def positionPopup(): js.Any = js.native
  
  def positionSelector(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  def positionSelector(position: Double, sel: View): Unit = js.native
  
  def reclaimViews(views: List[View]): Unit = js.native
  
  def reconcileSelectedPosition(): Double = js.native
  
  /* private */ def recycleVelocityTracker(): js.Any = js.native
  
  /* private */ def reportScrollStateChange(newState: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def requestLayout(): js.Any with Unit = js.native
  
  /* private */ def requestLayoutIfNecessary(): js.Any = js.native
  
  def resetList(): Unit = js.native
  
  /* private */ def resurrectSelection(): js.Any = js.native
  
  def resurrectSelectionIfNeeded(): Boolean = js.native
  
  /* private */ def scrollIfNeeded(y: js.Any): js.Any = js.native
  
  def scrollListBy(y: Double): Unit = js.native
  
  def setCacheColorHint(color: Double): Unit = js.native
  
  def setChoiceMode(choiceMode: Double): Unit = js.native
  
  def setDrawSelectorOnTop(onTop: Boolean): Unit = js.native
  
  def setFastScrollAlwaysVisible(alwaysShow: Boolean): Unit = js.native
  
  def setFastScrollEnabled(enabled: Boolean): Unit = js.native
  
  /* private */ def setFastScrollerAlwaysVisibleUiThread(alwaysShow: js.Any): js.Any = js.native
  
  /* private */ def setFastScrollerEnabledUiThread(enabled: js.Any): js.Any = js.native
  
  def setFriction(friction: Double): Unit = js.native
  
  def setItemChecked(position: Double, value: Boolean): Unit = js.native
  
  def setOnScrollListener(l: OnScrollListener): Unit = js.native
  
  def setOverScrollEffectPadding(leftPadding: Double, rightPadding: Double): Unit = js.native
  
  def setRecyclerListener(listener: RecyclerListener): Unit = js.native
  
  def setScrollIndicators(up: View, down: View): Unit = js.native
  
  def setScrollingCacheEnabled(enabled: Boolean): Unit = js.native
  
  def setSelectionInt(position: Double): Unit = js.native
  
  def setSelector(sel: Drawable): Unit = js.native
  
  def setSmoothScrollbarEnabled(enabled: Boolean): Unit = js.native
  
  def setStackFromBottom(stackFromBottom: Boolean): Unit = js.native
  
  def setTextFilterEnabled(textFilterEnabled: Boolean): Unit = js.native
  
  def setTranscriptMode(mode: Double): Unit = js.native
  
  def setVelocityScale(scale: Double): Unit = js.native
  
  def setVisibleRangeHint(start: Double, end: Double): Unit = js.native
  
  def shouldShowSelector(): Boolean = js.native
  
  /* private */ def showPopup(): js.Any = js.native
  
  def smoothScrollBy(distance: Double, duration: Double): Unit = js.native
  def smoothScrollBy(distance: Double, duration: Double, linear: Boolean): Unit = js.native
  
  def smoothScrollByOffset(position: Double): Unit = js.native
  
  def smoothScrollToPosition(position: Double): Unit = js.native
  def smoothScrollToPosition(position: Double, boundPosition: Double): Unit = js.native
  
  def smoothScrollToPositionFromTop(position: Double, offset: Double): Unit = js.native
  def smoothScrollToPositionFromTop(position: Double, offset: Double, duration: Double): Unit = js.native
  
  /* private */ def startScrollIfNeeded(y: js.Any): js.Any = js.native
  
  def touchModeDrawsInPressedState(): Boolean = js.native
  
  /* private */ def trackMotionScroll(deltaY: js.Any, incrementalDeltaY: js.Any): js.Any = js.native
  
  /* private */ def updateOnScreenCheckedViews(): js.Any = js.native
  
  def updateScrollIndicators(): Unit = js.native
  
  /* private */ def updateSelectorState(): js.Any = js.native
  
  /* private */ def useDefaultSelector(): js.Any = js.native
}
object AbsListView {
  
  @js.native
  trait AdapterDataSetObserver
    extends typings.androiduix.android.widget.AdapterView.AdapterDataSetObserver {
    
    var _AbsListView_this: AbsListView = js.native
  }
  object AdapterDataSetObserver {
    
    @scala.inline
    def apply(
      AdapterView_this: AdapterView[_],
      _AbsListView_this: AbsListView,
      clearSavedState: () => Unit,
      onChanged: () => Unit,
      onInvalidated: () => Unit
    ): AdapterDataSetObserver = {
      val __obj = js.Dynamic.literal(AdapterView_this = AdapterView_this.asInstanceOf[js.Any], _AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], clearSavedState = js.Any.fromFunction0(clearSavedState), onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
      __obj.asInstanceOf[AdapterDataSetObserver]
    }
    
    @scala.inline
    implicit class AdapterDataSetObserverMutableBuilder[Self <: AdapterDataSetObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_AbsListView_this(value: AbsListView): Self = StObject.set(x, "_AbsListView_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckForKeyLongPress
    extends WindowRunnnable
       with Runnable
  object CheckForKeyLongPress {
    
    @scala.inline
    def apply(
      _AbsListView_this: AbsListView,
      mOriginalAttachCount: js.Any,
      rememberWindowAttachCount: () => Unit,
      run: () => js.Any,
      sameWindow: () => Boolean
    ): CheckForKeyLongPress = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), run = js.Any.fromFunction0(run), sameWindow = js.Any.fromFunction0(sameWindow))
      __obj.asInstanceOf[CheckForKeyLongPress]
    }
  }
  
  @js.native
  trait CheckForLongPress
    extends WindowRunnnable
       with Runnable
  object CheckForLongPress {
    
    @scala.inline
    def apply(
      _AbsListView_this: AbsListView,
      mOriginalAttachCount: js.Any,
      rememberWindowAttachCount: () => Unit,
      run: () => js.Any,
      sameWindow: () => Boolean
    ): CheckForLongPress = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), run = js.Any.fromFunction0(run), sameWindow = js.Any.fromFunction0(sameWindow))
      __obj.asInstanceOf[CheckForLongPress]
    }
  }
  
  @js.native
  trait CheckForTap extends Runnable {
    
    var _AbsListView_this: AbsListView = js.native
  }
  object CheckForTap {
    
    @scala.inline
    def apply(_AbsListView_this: AbsListView, run: () => js.Any): CheckForTap = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[CheckForTap]
    }
    
    @scala.inline
    implicit class CheckForTapMutableBuilder[Self <: CheckForTap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_AbsListView_this(value: AbsListView): Self = StObject.set(x, "_AbsListView_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlingRunnable extends Runnable {
    
    var _AbsListView_this: AbsListView = js.native
    
    /* private */ def edgeReached(delta: js.Any): js.Any = js.native
    
    def endFling(): Unit = js.native
    
    def flywheelTouch(): Unit = js.native
    
    var mCheckFlywheel: js.Any = js.native
    
    var mLastFlingY: js.Any = js.native
    
    var mScroller: OverScroller = js.native
    
    def start(initialVelocity: Double): Unit = js.native
    
    def startOverfling(initialVelocity: Double): Unit = js.native
    
    def startScroll(distance: Double, duration: Double, linear: Boolean): Unit = js.native
    
    def startSpringback(): Unit = js.native
  }
  object FlingRunnable {
    
    @scala.inline
    def apply(
      _AbsListView_this: AbsListView,
      edgeReached: js.Any => js.Any,
      endFling: () => Unit,
      flywheelTouch: () => Unit,
      mCheckFlywheel: js.Any,
      mLastFlingY: js.Any,
      mScroller: OverScroller,
      run: () => js.Any,
      start: Double => Unit,
      startOverfling: Double => Unit,
      startScroll: (Double, Double, Boolean) => Unit,
      startSpringback: () => Unit
    ): FlingRunnable = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], edgeReached = js.Any.fromFunction1(edgeReached), endFling = js.Any.fromFunction0(endFling), flywheelTouch = js.Any.fromFunction0(flywheelTouch), mCheckFlywheel = mCheckFlywheel.asInstanceOf[js.Any], mLastFlingY = mLastFlingY.asInstanceOf[js.Any], mScroller = mScroller.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), start = js.Any.fromFunction1(start), startOverfling = js.Any.fromFunction1(startOverfling), startScroll = js.Any.fromFunction3(startScroll), startSpringback = js.Any.fromFunction0(startSpringback))
      __obj.asInstanceOf[FlingRunnable]
    }
    
    @scala.inline
    implicit class FlingRunnableMutableBuilder[Self <: FlingRunnable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdgeReached(value: js.Any => js.Any): Self = StObject.set(x, "edgeReached", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndFling(value: () => Unit): Self = StObject.set(x, "endFling", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFlywheelTouch(value: () => Unit): Self = StObject.set(x, "flywheelTouch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMCheckFlywheel(value: js.Any): Self = StObject.set(x, "mCheckFlywheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMLastFlingY(value: js.Any): Self = StObject.set(x, "mLastFlingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScroller(value: OverScroller): Self = StObject.set(x, "mScroller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartOverfling(value: Double => Unit): Self = StObject.set(x, "startOverfling", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartScroll(value: (Double, Double, Boolean) => Unit): Self = StObject.set(x, "startScroll", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStartSpringback(value: () => Unit): Self = StObject.set(x, "startSpringback", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_AbsListView_this(value: AbsListView): Self = StObject.set(x, "_AbsListView_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutParams
    extends typings.androiduix.android.view.ViewGroup.LayoutParams {
    
    var forceAdd: Boolean = js.native
    
    var itemId: Double = js.native
    
    var recycledHeaderFooter: Boolean = js.native
    
    var scrappedFromPosition: Double = js.native
    
    var viewType: Double = js.native
  }
  object LayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      createClassAttrBinder: () => ClassBinderMap,
      equals_ : js.Any => Boolean,
      forceAdd: Boolean,
      getAttrBinder: () => AttrBinder,
      hash: js.Any,
      height: Double,
      initBindAttr: () => js.Any,
      itemId: Double,
      recycledHeaderFooter: Boolean,
      scrappedFromPosition: Double,
      setBaseAttributes: (TypedArray, String, String) => Unit,
      viewType: Double,
      width: Double
    ): LayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), forceAdd = forceAdd.asInstanceOf[js.Any], getAttrBinder = js.Any.fromFunction0(getAttrBinder), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), itemId = itemId.asInstanceOf[js.Any], recycledHeaderFooter = recycledHeaderFooter.asInstanceOf[js.Any], scrappedFromPosition = scrappedFromPosition.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), viewType = viewType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LayoutParams]
    }
    
    @scala.inline
    implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceAdd(value: Boolean): Self = StObject.set(x, "forceAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecycledHeaderFooter(value: Boolean): Self = StObject.set(x, "recycledHeaderFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrappedFromPosition(value: Double): Self = StObject.set(x, "scrappedFromPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewType(value: Double): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnScrollListener extends StObject {
    
    def onScroll(view: AbsListView, firstVisibleItem: Double, visibleItemCount: Double, totalItemCount: Double): Unit = js.native
    
    def onScrollStateChanged(view: AbsListView, scrollState: Double): Unit = js.native
  }
  object OnScrollListener {
    
    @scala.inline
    def apply(
      onScroll: (AbsListView, Double, Double, Double) => Unit,
      onScrollStateChanged: (AbsListView, Double) => Unit
    ): OnScrollListener = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction4(onScroll), onScrollStateChanged = js.Any.fromFunction2(onScrollStateChanged))
      __obj.asInstanceOf[OnScrollListener]
    }
    
    @scala.inline
    implicit class OnScrollListenerMutableBuilder[Self <: OnScrollListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnScroll(value: (AbsListView, Double, Double, Double) => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnScrollStateChanged(value: (AbsListView, Double) => Unit): Self = StObject.set(x, "onScrollStateChanged", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PerformClick
    extends WindowRunnnable
       with Runnable {
    
    var mClickMotionPosition: Double = js.native
  }
  object PerformClick {
    
    @scala.inline
    def apply(
      _AbsListView_this: AbsListView,
      mClickMotionPosition: Double,
      mOriginalAttachCount: js.Any,
      rememberWindowAttachCount: () => Unit,
      run: () => js.Any,
      sameWindow: () => Boolean
    ): PerformClick = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mClickMotionPosition = mClickMotionPosition.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), run = js.Any.fromFunction0(run), sameWindow = js.Any.fromFunction0(sameWindow))
      __obj.asInstanceOf[PerformClick]
    }
    
    @scala.inline
    implicit class PerformClickMutableBuilder[Self <: PerformClick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMClickMotionPosition(value: Double): Self = StObject.set(x, "mClickMotionPosition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PositionScroller extends Runnable {
    
    var _AbsListView_this: AbsListView = js.native
    
    /* private */ def _start_1(position: js.Any): js.Any = js.native
    
    /* private */ def _start_2(position: js.Any, boundPosition: js.Any): js.Any = js.native
    
    var mBoundPos: js.Any = js.native
    
    var mExtraScroll: js.Any = js.native
    
    var mLastSeenPos: js.Any = js.native
    
    var mMode: js.Any = js.native
    
    var mOffsetFromTop: js.Any = js.native
    
    var mScrollDuration: js.Any = js.native
    
    var mTargetPos: js.Any = js.native
    
    /* private */ def scrollToVisible(targetPos: js.Any, boundPos: js.Any, duration: js.Any): js.Any = js.native
    
    def start(position: Double): Unit = js.native
    def start(position: Double, boundPosition: Double): Unit = js.native
    
    def startWithOffset(position: Double, offset: Double): Unit = js.native
    def startWithOffset(position: Double, offset: Double, duration: Double): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait RecycleBin extends StObject {
    
    var _AbsListView_this: AbsListView = js.native
    
    def addScrapView(scrap: View, position: Double): Unit = js.native
    
    def clear(): Unit = js.native
    
    def clearTransientStateViews(): Unit = js.native
    
    def fillActiveViews(childCount: Double, firstActivePosition: Double): Unit = js.native
    
    def getActiveView(position: Double): View = js.native
    
    def getScrapView(position: Double): View = js.native
    
    def getTransientStateView(position: Double): View = js.native
    
    var mActiveViews: js.Array[View] = js.native
    
    var mCurrentScrap: js.Any = js.native
    
    var mFirstActivePosition: js.Any = js.native
    
    var mRecyclerListener: RecyclerListener = js.native
    
    var mScrapViews: js.Any = js.native
    
    var mSkippedScrap: js.Any = js.native
    
    var mTransientStateViews: js.Any = js.native
    
    var mTransientStateViewsById: js.Any = js.native
    
    var mViewTypeCount: js.Any = js.native
    
    def markChildrenDirty(): Unit = js.native
    
    /* private */ def pruneScrapViews(): js.Any = js.native
    
    def reclaimScrapViews(views: List[View]): Unit = js.native
    
    def removeSkippedScrap(): Unit = js.native
    
    def scrapActiveViews(): Unit = js.native
    
    def setCacheColorHint(color: Double): Unit = js.native
    
    def setViewTypeCount(viewTypeCount: Double): Unit = js.native
    
    def shouldRecycleViewType(viewType: Double): Boolean = js.native
  }
  object RecycleBin {
    
    @scala.inline
    def apply(
      _AbsListView_this: AbsListView,
      addScrapView: (View, Double) => Unit,
      clear: () => Unit,
      clearTransientStateViews: () => Unit,
      fillActiveViews: (Double, Double) => Unit,
      getActiveView: Double => View,
      getScrapView: Double => View,
      getTransientStateView: Double => View,
      mActiveViews: js.Array[View],
      mCurrentScrap: js.Any,
      mFirstActivePosition: js.Any,
      mRecyclerListener: RecyclerListener,
      mScrapViews: js.Any,
      mSkippedScrap: js.Any,
      mTransientStateViews: js.Any,
      mTransientStateViewsById: js.Any,
      mViewTypeCount: js.Any,
      markChildrenDirty: () => Unit,
      pruneScrapViews: () => js.Any,
      reclaimScrapViews: List[View] => Unit,
      removeSkippedScrap: () => Unit,
      scrapActiveViews: () => Unit,
      setCacheColorHint: Double => Unit,
      setViewTypeCount: Double => Unit,
      shouldRecycleViewType: Double => Boolean
    ): RecycleBin = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], addScrapView = js.Any.fromFunction2(addScrapView), clear = js.Any.fromFunction0(clear), clearTransientStateViews = js.Any.fromFunction0(clearTransientStateViews), fillActiveViews = js.Any.fromFunction2(fillActiveViews), getActiveView = js.Any.fromFunction1(getActiveView), getScrapView = js.Any.fromFunction1(getScrapView), getTransientStateView = js.Any.fromFunction1(getTransientStateView), mActiveViews = mActiveViews.asInstanceOf[js.Any], mCurrentScrap = mCurrentScrap.asInstanceOf[js.Any], mFirstActivePosition = mFirstActivePosition.asInstanceOf[js.Any], mRecyclerListener = mRecyclerListener.asInstanceOf[js.Any], mScrapViews = mScrapViews.asInstanceOf[js.Any], mSkippedScrap = mSkippedScrap.asInstanceOf[js.Any], mTransientStateViews = mTransientStateViews.asInstanceOf[js.Any], mTransientStateViewsById = mTransientStateViewsById.asInstanceOf[js.Any], mViewTypeCount = mViewTypeCount.asInstanceOf[js.Any], markChildrenDirty = js.Any.fromFunction0(markChildrenDirty), pruneScrapViews = js.Any.fromFunction0(pruneScrapViews), reclaimScrapViews = js.Any.fromFunction1(reclaimScrapViews), removeSkippedScrap = js.Any.fromFunction0(removeSkippedScrap), scrapActiveViews = js.Any.fromFunction0(scrapActiveViews), setCacheColorHint = js.Any.fromFunction1(setCacheColorHint), setViewTypeCount = js.Any.fromFunction1(setViewTypeCount), shouldRecycleViewType = js.Any.fromFunction1(shouldRecycleViewType))
      __obj.asInstanceOf[RecycleBin]
    }
    
    @scala.inline
    implicit class RecycleBinMutableBuilder[Self <: RecycleBin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddScrapView(value: (View, Double) => Unit): Self = StObject.set(x, "addScrapView", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearTransientStateViews(value: () => Unit): Self = StObject.set(x, "clearTransientStateViews", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFillActiveViews(value: (Double, Double) => Unit): Self = StObject.set(x, "fillActiveViews", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetActiveView(value: Double => View): Self = StObject.set(x, "getActiveView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetScrapView(value: Double => View): Self = StObject.set(x, "getScrapView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTransientStateView(value: Double => View): Self = StObject.set(x, "getTransientStateView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMActiveViews(value: js.Array[View]): Self = StObject.set(x, "mActiveViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMActiveViewsVarargs(value: View*): Self = StObject.set(x, "mActiveViews", js.Array(value :_*))
      
      @scala.inline
      def setMCurrentScrap(value: js.Any): Self = StObject.set(x, "mCurrentScrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMFirstActivePosition(value: js.Any): Self = StObject.set(x, "mFirstActivePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMRecyclerListener(value: RecyclerListener): Self = StObject.set(x, "mRecyclerListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScrapViews(value: js.Any): Self = StObject.set(x, "mScrapViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMSkippedScrap(value: js.Any): Self = StObject.set(x, "mSkippedScrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTransientStateViews(value: js.Any): Self = StObject.set(x, "mTransientStateViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTransientStateViewsById(value: js.Any): Self = StObject.set(x, "mTransientStateViewsById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMViewTypeCount(value: js.Any): Self = StObject.set(x, "mViewTypeCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkChildrenDirty(value: () => Unit): Self = StObject.set(x, "markChildrenDirty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPruneScrapViews(value: () => js.Any): Self = StObject.set(x, "pruneScrapViews", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReclaimScrapViews(value: List[View] => Unit): Self = StObject.set(x, "reclaimScrapViews", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveSkippedScrap(value: () => Unit): Self = StObject.set(x, "removeSkippedScrap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrapActiveViews(value: () => Unit): Self = StObject.set(x, "scrapActiveViews", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCacheColorHint(value: Double => Unit): Self = StObject.set(x, "setCacheColorHint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetViewTypeCount(value: Double => Unit): Self = StObject.set(x, "setViewTypeCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRecycleViewType(value: Double => Boolean): Self = StObject.set(x, "shouldRecycleViewType", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_AbsListView_this(value: AbsListView): Self = StObject.set(x, "_AbsListView_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecyclerListener extends StObject {
    
    def onMovedToScrapHeap(view: View): Unit = js.native
  }
  object RecyclerListener {
    
    @scala.inline
    def apply(onMovedToScrapHeap: View => Unit): RecyclerListener = {
      val __obj = js.Dynamic.literal(onMovedToScrapHeap = js.Any.fromFunction1(onMovedToScrapHeap))
      __obj.asInstanceOf[RecyclerListener]
    }
    
    @scala.inline
    implicit class RecyclerListenerMutableBuilder[Self <: RecyclerListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnMovedToScrapHeap(value: View => Unit): Self = StObject.set(x, "onMovedToScrapHeap", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SelectionBoundsAdjuster extends StObject {
    
    def adjustListItemSelectionBounds(bounds: Rect): Unit = js.native
  }
  object SelectionBoundsAdjuster {
    
    @scala.inline
    def apply(adjustListItemSelectionBounds: Rect => Unit): SelectionBoundsAdjuster = {
      val __obj = js.Dynamic.literal(adjustListItemSelectionBounds = js.Any.fromFunction1(adjustListItemSelectionBounds))
      __obj.asInstanceOf[SelectionBoundsAdjuster]
    }
    
    @scala.inline
    implicit class SelectionBoundsAdjusterMutableBuilder[Self <: SelectionBoundsAdjuster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustListItemSelectionBounds(value: Rect => Unit): Self = StObject.set(x, "adjustListItemSelectionBounds", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WindowRunnnable extends StObject {
    
    var _AbsListView_this: AbsListView = js.native
    
    var mOriginalAttachCount: js.Any = js.native
    
    def rememberWindowAttachCount(): Unit = js.native
    
    def sameWindow(): Boolean = js.native
  }
  object WindowRunnnable {
    
    @scala.inline
    def apply(
      _AbsListView_this: AbsListView,
      mOriginalAttachCount: js.Any,
      rememberWindowAttachCount: () => Unit,
      sameWindow: () => Boolean
    ): WindowRunnnable = {
      val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), sameWindow = js.Any.fromFunction0(sameWindow))
      __obj.asInstanceOf[WindowRunnnable]
    }
    
    @scala.inline
    implicit class WindowRunnnableMutableBuilder[Self <: WindowRunnnable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMOriginalAttachCount(value: js.Any): Self = StObject.set(x, "mOriginalAttachCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberWindowAttachCount(value: () => Unit): Self = StObject.set(x, "rememberWindowAttachCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSameWindow(value: () => Boolean): Self = StObject.set(x, "sameWindow", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_AbsListView_this(value: AbsListView): Self = StObject.set(x, "_AbsListView_this", value.asInstanceOf[js.Any])
    }
  }
}
