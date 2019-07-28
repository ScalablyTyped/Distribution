package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.utilNs.SparseBooleanArray
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewParent
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnTouchModeChangeListener
import typings.androiduix.androidNs.viewNs.animationNs.Interpolator
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.AdapterDataSetObserver
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.FlingRunnable
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.OnScrollListener
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.PositionScroller
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.RecycleBin
import typings.androiduix.androidNs.widgetNs.AbsListViewNs.RecyclerListener
import typings.androiduix.javaNs.langNs.Runnable
import typings.androiduix.javaNs.utilNs.ArrayList
import typings.androiduix.javaNs.utilNs.List
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView")
@js.native
abstract class AbsListView protected ()
  extends AdapterView[ListAdapter]
     with OnGlobalLayoutListener
     with OnTouchModeChangeListener {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var _mOverflingDistance: js.Any = js.native
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
  def obtainView(position: Double, isScrap: js.Array[Boolean]): View = js.native
  /* CompleteClass */
  override def onGlobalLayout(): js.Any = js.native
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  /* private */ def onTouchCancel(): js.Any = js.native
  /* private */ def onTouchDown(ev: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onTouchModeChanged(isInTouchMode: Boolean): js.Any = js.native
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

/* static members */
@JSGlobal("android.widget.AbsListView")
@js.native
object AbsListView extends js.Object {
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

