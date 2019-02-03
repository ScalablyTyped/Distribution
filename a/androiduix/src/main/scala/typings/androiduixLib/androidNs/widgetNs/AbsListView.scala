package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsListView")
@js.native
abstract class AbsListView protected ()
  extends AdapterView[ListAdapter]
     with androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener
     with androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnTouchModeChangeListener {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var _mOverflingDistance: js.Any = js.native
  var mActivePointerId: js.Any = js.native
  var mAdapter: ListAdapter = js.native
  var mAdapterHasStableIds: js.Any = js.native
  var mCacheColorHint: js.Any = js.native
  var mCachingActive: scala.Boolean = js.native
  var mCachingStarted: scala.Boolean = js.native
  var mCheckStates: androiduixLib.androidNs.utilNs.SparseBooleanArray = js.native
  var mCheckedIdStates: js.Any = js.native
  var mCheckedItemCount: js.Any = js.native
  var mChoiceActionMode: js.Any = js.native
  var mChoiceMode: scala.Double = js.native
  var mClearScrollingCache: js.Any = js.native
  var mDataSetObserver: androiduixLib.androidNs.widgetNs.AbsListViewNs.AdapterDataSetObserver = js.native
  var mDeferNotifyDataSetChanged: js.Any = js.native
  var mDensityScale: js.Any = js.native
  var mDirection: js.Any = js.native
  var mDrawSelectorOnTop: js.Any = js.native
  var mFastScrollAlwaysVisible: js.Any = js.native
  var mFastScrollEnabled: js.Any = js.native
  var mFiltered: js.Any = js.native
  var mFirstPositionDistanceGuess: js.Any = js.native
  var mFlingProfilingStarted: js.Any = js.native
  var mFlingRunnable: androiduixLib.androidNs.widgetNs.AbsListViewNs.FlingRunnable = js.native
  var mForceTranscriptScroll: js.Any = js.native
  var mGlobalLayoutListenerAddedFilter: js.Any = js.native
  var mGlowPaddingLeft: js.Any = js.native
  var mGlowPaddingRight: js.Any = js.native
  var mIsChildViewEnabled: js.Any = js.native
  var mIsScrap: js.Array[scala.Boolean] = js.native
  var mLastHandledItemCount: js.Any = js.native
  var mLastPositionDistanceGuess: js.Any = js.native
  var mLastScrollState: js.Any = js.native
  var mLastTouchMode: js.Any = js.native
  var mLastY: js.Any = js.native
  var mListPadding: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mMaximumVelocity: js.Any = js.native
  var mMinimumVelocity: js.Any = js.native
  var mMotionCorrection: js.Any = js.native
  var mMotionPosition: scala.Double = js.native
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
  var `mPendingCheckForTap_`: js.Any = js.native
  var mPendingSync: js.Any = js.native
  var `mPerformClick_`: js.Any = js.native
  var mPopupHidden: js.Any = js.native
  var mPositionScrollAfterLayout: androiduixLib.javaNs.langNs.Runnable = js.native
  var mPositionScroller: androiduixLib.androidNs.widgetNs.AbsListViewNs.PositionScroller = js.native
  var mRecycler: androiduixLib.androidNs.widgetNs.AbsListViewNs.RecycleBin = js.native
  var mResurrectToPosition: scala.Double = js.native
  var mScrollDown: js.Any = js.native
  var mScrollProfilingStarted: js.Any = js.native
  var mScrollUp: js.Any = js.native
  var mScrollingCacheEnabled: js.Any = js.native
  var mSelectedTop: scala.Double = js.native
  var mSelectionBottomPadding: js.Any = js.native
  var mSelectionLeftPadding: js.Any = js.native
  var mSelectionRightPadding: js.Any = js.native
  var mSelectionTopPadding: js.Any = js.native
  var mSelector: js.Any = js.native
  var mSelectorPosition: js.Any = js.native
  var mSelectorRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mSmoothScrollbarEnabled: js.Any = js.native
  var mStackFromBottom: scala.Boolean = js.native
  var mTextFilterEnabled: js.Any = js.native
  var mTouchFrame: js.Any = js.native
  var mTouchMode: scala.Double = js.native
  var mTouchModeReset: androiduixLib.javaNs.langNs.Runnable = js.native
  var mTranscriptMode: js.Any = js.native
  var mVelocityScale: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  var mWidthMeasureSpec: scala.Double = js.native
  def canScrollList(direction: scala.Double): scala.Boolean = js.native
  /* protected */ def checkOverScrollStartScrollIfNeeded(): scala.Boolean = js.native
  def clearChoices(): scala.Unit = js.native
  /* private */ def clearScrollingCache(): js.Any = js.native
  /* private */ def confirmCheckedPositionsById(): js.Any = js.native
  /* private */ def contentFits(): js.Any = js.native
  /* private */ def createScrollingCache(): js.Any = js.native
  /* private */ def dismissPopup(): js.Any = js.native
  /* private */ def drawSelector(canvas: js.Any): js.Any = js.native
  def fillGap(down: scala.Boolean): scala.Unit = js.native
  /* private */ def findClosestMotionRow(y: js.Any): js.Any = js.native
  def findMotionRow(y: scala.Double): scala.Double = js.native
  /* private */ def finishGlows(): js.Any = js.native
  def getBottomPaddingOffset(): scala.Double = js.native
  def getCacheColorHint(): scala.Double = js.native
  def getCheckedItemCount(): scala.Double = js.native
  def getCheckedItemIds(): js.Array[scala.Double] = js.native
  def getCheckedItemPosition(): scala.Double = js.native
  def getCheckedItemPositions(): androiduixLib.androidNs.utilNs.SparseBooleanArray = js.native
  def getChoiceMode(): scala.Double = js.native
  def getFooterViewsCount(): scala.Double = js.native
  def getHeaderViewsCount(): scala.Double = js.native
  def getLeftPaddingOffset(): scala.Double = js.native
  def getListPaddingBottom(): scala.Double = js.native
  def getListPaddingLeft(): scala.Double = js.native
  def getListPaddingRight(): scala.Double = js.native
  def getListPaddingTop(): scala.Double = js.native
  /* InferMemberOverrides */
  override def getParent(): androiduixLib.androidNs.viewNs.ViewParent = js.native
  def getRightPaddingOffset(): scala.Double = js.native
  def getSelector(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getSolidColor(): scala.Double = js.native
  def getTopPaddingOffset(): scala.Double = js.native
  def getTranscriptMode(): scala.Double = js.native
  def hasTextFilter(): scala.Boolean = js.native
  def hideSelector(): scala.Unit = js.native
  /* private */ def initAbsListView(): js.Any = js.native
  /* private */ def initOrResetVelocityTracker(): js.Any = js.native
  /* private */ def initVelocityTrackerIfNotExists(): js.Any = js.native
  def invalidateViews(): scala.Unit = js.native
  def invokeOnItemScrollListener(): scala.Unit = js.native
  def isFastScrollAlwaysVisible(): scala.Boolean = js.native
  def isFastScrollEnabled(): scala.Boolean = js.native
  def isItemChecked(position: scala.Double): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def isLayoutRequested(): scala.Boolean = js.native
  /* private */ def isOwnerThread(): js.Any = js.native
  def isPaddingOffsetRequired(): scala.Boolean = js.native
  def isScrollingCacheEnabled(): scala.Boolean = js.native
  def isSmoothScrollbarEnabled(): scala.Boolean = js.native
  def isStackFromBottom(): scala.Boolean = js.native
  def isTextFilterEnabled(): scala.Boolean = js.native
  def keyPressed(): scala.Unit = js.native
  /* protected */ def layoutChildren(): scala.Unit = js.native
  def obtainView(position: scala.Double, isScrap: js.Array[scala.Boolean]): androiduixLib.androidNs.viewNs.View = js.native
  /* CompleteClass */
  override def onGlobalLayout(): js.Any = js.native
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  /* private */ def onTouchCancel(): js.Any = js.native
  /* private */ def onTouchDown(ev: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onTouchModeChanged(isInTouchMode: scala.Boolean): js.Any = js.native
  /* private */ def onTouchMove(ev: js.Any): js.Any = js.native
  /* private */ def onTouchUp(ev: js.Any): js.Any = js.native
  /* private */ def performLongPress(child: js.Any, longPressPosition: js.Any, longPressId: js.Any): js.Any = js.native
  def pointToPosition(x: scala.Double, y: scala.Double): scala.Double = js.native
  def pointToRowId(x: scala.Double, y: scala.Double): scala.Double = js.native
  /* private */ def positionPopup(): js.Any = js.native
  def positionSelector(l: scala.Double, t: scala.Double, r: scala.Double, b: scala.Double): scala.Unit = js.native
  def positionSelector(position: scala.Double, sel: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def reclaimViews(views: androiduixLib.javaNs.utilNs.List[androiduixLib.androidNs.viewNs.View]): scala.Unit = js.native
  def reconcileSelectedPosition(): scala.Double = js.native
  /* private */ def recycleVelocityTracker(): js.Any = js.native
  /* private */ def reportScrollStateChange(newState: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def requestLayout(): scala.Unit with js.Any = js.native
  /* private */ def requestLayoutIfNecessary(): js.Any = js.native
  def resetList(): scala.Unit = js.native
  /* private */ def resurrectSelection(): js.Any = js.native
  def resurrectSelectionIfNeeded(): scala.Boolean = js.native
  /* private */ def scrollIfNeeded(y: js.Any): js.Any = js.native
  def scrollListBy(y: scala.Double): scala.Unit = js.native
  def setCacheColorHint(color: scala.Double): scala.Unit = js.native
  def setChoiceMode(choiceMode: scala.Double): scala.Unit = js.native
  def setDrawSelectorOnTop(onTop: scala.Boolean): scala.Unit = js.native
  def setFastScrollAlwaysVisible(alwaysShow: scala.Boolean): scala.Unit = js.native
  def setFastScrollEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /* private */ def setFastScrollerAlwaysVisibleUiThread(alwaysShow: js.Any): js.Any = js.native
  /* private */ def setFastScrollerEnabledUiThread(enabled: js.Any): js.Any = js.native
  def setFriction(friction: scala.Double): scala.Unit = js.native
  def setItemChecked(position: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def setOnScrollListener(l: androiduixLib.androidNs.widgetNs.AbsListViewNs.OnScrollListener): scala.Unit = js.native
  def setOverScrollEffectPadding(leftPadding: scala.Double, rightPadding: scala.Double): scala.Unit = js.native
  def setRecyclerListener(listener: androiduixLib.androidNs.widgetNs.AbsListViewNs.RecyclerListener): scala.Unit = js.native
  def setScrollIndicators(up: androiduixLib.androidNs.viewNs.View, down: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setScrollingCacheEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setSelectionInt(position: scala.Double): scala.Unit = js.native
  def setSelector(sel: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setSmoothScrollbarEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setStackFromBottom(stackFromBottom: scala.Boolean): scala.Unit = js.native
  def setTextFilterEnabled(textFilterEnabled: scala.Boolean): scala.Unit = js.native
  def setTranscriptMode(mode: scala.Double): scala.Unit = js.native
  def setVelocityScale(scale: scala.Double): scala.Unit = js.native
  def setVisibleRangeHint(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def shouldShowSelector(): scala.Boolean = js.native
  /* private */ def showPopup(): js.Any = js.native
  def smoothScrollBy(distance: scala.Double, duration: scala.Double): scala.Unit = js.native
  def smoothScrollBy(distance: scala.Double, duration: scala.Double, linear: scala.Boolean): scala.Unit = js.native
  def smoothScrollByOffset(position: scala.Double): scala.Unit = js.native
  def smoothScrollToPosition(position: scala.Double): scala.Unit = js.native
  def smoothScrollToPosition(position: scala.Double, boundPosition: scala.Double): scala.Unit = js.native
  def smoothScrollToPositionFromTop(position: scala.Double, offset: scala.Double): scala.Unit = js.native
  def smoothScrollToPositionFromTop(position: scala.Double, offset: scala.Double, duration: scala.Double): scala.Unit = js.native
  /* private */ def startScrollIfNeeded(y: js.Any): js.Any = js.native
  def touchModeDrawsInPressedState(): scala.Boolean = js.native
  /* private */ def trackMotionScroll(deltaY: js.Any, incrementalDeltaY: js.Any): js.Any = js.native
  /* private */ def updateOnScreenCheckedViews(): js.Any = js.native
  def updateScrollIndicators(): scala.Unit = js.native
  /* private */ def updateSelectorState(): js.Any = js.native
  /* private */ def useDefaultSelector(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.AbsListView")
@js.native
object AbsListView extends js.Object {
  var CHECK_POSITION_SEARCH_DISTANCE: js.Any = js.native
  var CHOICE_MODE_MULTIPLE: scala.Double = js.native
  var CHOICE_MODE_MULTIPLE_MODAL: scala.Double = js.native
  var CHOICE_MODE_NONE: scala.Double = js.native
  var CHOICE_MODE_SINGLE: scala.Double = js.native
  var INVALID_POINTER: scala.Double = js.native
  var LAYOUT_FORCE_BOTTOM: scala.Double = js.native
  var LAYOUT_FORCE_TOP: scala.Double = js.native
  var LAYOUT_MOVE_SELECTION: scala.Double = js.native
  var LAYOUT_NORMAL: scala.Double = js.native
  var LAYOUT_SET_SELECTION: scala.Double = js.native
  var LAYOUT_SPECIFIC: scala.Double = js.native
  var LAYOUT_SYNC: scala.Double = js.native
  var OVERSCROLL_LIMIT_DIVISOR: js.Any = js.native
  var PROFILE_FLINGING: scala.Boolean = js.native
  var PROFILE_SCROLLING: js.Any = js.native
  var TAG_AbsListView: java.lang.String = js.native
  var TOUCH_MODE_DONE_WAITING: scala.Double = js.native
  var TOUCH_MODE_DOWN: scala.Double = js.native
  var TOUCH_MODE_FLING: scala.Double = js.native
  var TOUCH_MODE_OFF: js.Any = js.native
  var TOUCH_MODE_ON: js.Any = js.native
  var TOUCH_MODE_OVERFLING: scala.Double = js.native
  var TOUCH_MODE_OVERSCROLL: js.Any = js.native
  var TOUCH_MODE_REST: scala.Double = js.native
  var TOUCH_MODE_SCROLL: scala.Double = js.native
  var TOUCH_MODE_TAP: scala.Double = js.native
  var TOUCH_MODE_UNKNOWN: js.Any = js.native
  var TRANSCRIPT_MODE_ALWAYS_SCROLL: scala.Double = js.native
  var TRANSCRIPT_MODE_DISABLED: scala.Double = js.native
  var TRANSCRIPT_MODE_NORMAL: scala.Double = js.native
  var sLinearInterpolator: androiduixLib.androidNs.viewNs.animationNs.Interpolator = js.native
  def getDistance(
    source: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect,
    direction: scala.Double
  ): scala.Double = js.native
  def retrieveFromScrap(
    scrapViews: androiduixLib.javaNs.utilNs.ArrayList[androiduixLib.androidNs.viewNs.View],
    position: scala.Double
  ): androiduixLib.androidNs.viewNs.View = js.native
}

