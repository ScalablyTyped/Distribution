package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.NumberPicker.Formatter
import typings.androiduix.android.widget.NumberPicker.OnScrollListener
import typings.androiduix.android.widget.NumberPicker.OnValueChangeListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.NumberPicker")
@js.native
class NumberPicker_ protected () extends LinearLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var SELECTOR_MIDDLE_ITEM_INDEX: js.Any = js.native
  var SELECTOR_WHEEL_ITEM_COUNT: js.Any = js.native
  var mAdjustScroller: js.Any = js.native
  var mBeginSoftInputOnLongPressCommand: js.Any = js.native
  var mBottomSelectionDividerBottom: js.Any = js.native
  var mChangeCurrentByOneFromLongPressCommand: js.Any = js.native
  var mComputeMaxWidth: js.Any = js.native
  var mCurrentScrollOffset: js.Any = js.native
  var mDecrementVirtualButtonPressed: js.Any = js.native
  var mDisplayedValues: js.Any = js.native
  var mFlingScroller: js.Any = js.native
  var mFormatter: js.Any = js.native
  var mHasSelectorWheel: js.Any = js.native
  var mIncrementVirtualButtonPressed: js.Any = js.native
  var mIngonreMoveEvents: js.Any = js.native
  var mInitialScrollOffset: js.Any = js.native
  var mLastDownEventTime: js.Any = js.native
  var mLastDownEventY: js.Any = js.native
  var mLastDownOrMoveEventY: js.Any = js.native
  var mLastHandledDownDpadKeyCode: js.Any = js.native
  var mLastHoveredChildVirtualViewId: js.Any = js.native
  var mLongPressUpdateInterval: js.Any = js.native
  var mMaxHeight: js.Any = js.native
  var mMaxValue: js.Any = js.native
  var mMaxWidth: js.Any = js.native
  var mMaximumFlingVelocity: js.Any = js.native
  var mMinHeight_ : js.Any = js.native
  var mMinValue: js.Any = js.native
  var mMinWidth_ : js.Any = js.native
  var mMinimumFlingVelocity: js.Any = js.native
  var mOnScrollListener: js.Any = js.native
  var mOnValueChangeListener: js.Any = js.native
  var mPressedStateHelper: js.Any = js.native
  var mPreviousScrollerY: js.Any = js.native
  var mScrollState: js.Any = js.native
  var mSelectionDivider: js.Any = js.native
  var mSelectionDividerHeight: js.Any = js.native
  var mSelectionDividersDistance: js.Any = js.native
  var mSelectorElementHeight: js.Any = js.native
  var mSelectorIndexToStringCache: js.Any = js.native
  var mSelectorIndices: js.Any = js.native
  var mSelectorTextGapHeight: js.Any = js.native
  var mSelectorWheelPaint: js.Any = js.native
  var mSetSelectionCommand: js.Any = js.native
  var mShowSoftInputOnTap: js.Any = js.native
  var mSolidColor: js.Any = js.native
  var mTextSize: js.Any = js.native
  var mTopSelectionDividerTop: js.Any = js.native
  var mValue: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  var mVirtualButtonPressedDrawable: js.Any = js.native
  var mWrapSelectorWheel: js.Any = js.native
  /* private */ def changeValueByOne(increment: js.Any): js.Any = js.native
  /* private */ def decrementSelectorIndices(selectorIndices: js.Any): js.Any = js.native
  /* private */ def ensureCachedScrollSelectorValue(selectorIndex: js.Any): js.Any = js.native
  /* private */ def ensureScrollWheelAdjusted(): js.Any = js.native
  /* private */ def fling(velocityY: js.Any): js.Any = js.native
  /* private */ def formatNumber(value: js.Any): js.Any = js.native
  def getDisplayedValues(): js.Array[String] = js.native
  def getMaxValue(): Double = js.native
  def getMinValue(): Double = js.native
  /* private */ def getSelectedPos(value: js.Any): js.Any = js.native
  def getSolidColor(): Double = js.native
  def getValue(): Double = js.native
  def getWrapSelectorWheel(): Boolean = js.native
  /* private */ def getWrappedSelectorIndex(selectorIndex: js.Any): js.Any = js.native
  /* private */ def hideSoftInput(): js.Any = js.native
  /* private */ def incrementSelectorIndices(selectorIndices: js.Any): js.Any = js.native
  /* private */ def initializeFadingEdges(): js.Any = js.native
  /* private */ def initializeSelectorWheel(): js.Any = js.native
  /* private */ def initializeSelectorWheelIndices(): js.Any = js.native
  /* private */ def makeMeasureSpec(measureSpec: js.Any, maxSize: js.Any): js.Any = js.native
  /* private */ def moveToFinalScrollerPosition(scroller: js.Any): js.Any = js.native
  /* private */ def notifyChange(previous: js.Any, current: js.Any): js.Any = js.native
  /* private */ def onScrollStateChange(scrollState: js.Any): js.Any = js.native
  /* private */ def onScrollerFinished(scroller: js.Any): js.Any = js.native
  /* private */ def postBeginSoftInputOnLongPressCommand(): js.Any = js.native
  /* private */ def postChangeCurrentByOneFromLongPress(increment: js.Any, delayMillis: js.Any): js.Any = js.native
  /* private */ def postSetSelectionCommand(selectionStart: js.Any, selectionEnd: js.Any): js.Any = js.native
  /* private */ def removeAllCallbacks(): js.Any = js.native
  /* private */ def removeBeginSoftInputCommand(): js.Any = js.native
  /* private */ def removeChangeCurrentByOneFromLongPress(): js.Any = js.native
  /* private */ def resolveSizeAndStateRespectingMinSize(minSize: js.Any, measuredSize: js.Any, measureSpec: js.Any): js.Any = js.native
  def setDisplayedValues(displayedValues: js.Array[String]): Unit = js.native
  def setFormatter(formatter: Formatter): Unit = js.native
  def setMaxValue(maxValue: Double): Unit = js.native
  def setMinValue(minValue: Double): Unit = js.native
  def setOnLongPressUpdateInterval(intervalMillis: Double): Unit = js.native
  def setOnScrollListener(onScrollListener: OnScrollListener): Unit = js.native
  def setOnValueChangedListener(onValueChangedListener: OnValueChangeListener): Unit = js.native
  def setValue(value: Double): Unit = js.native
  /* private */ def setValueInternal(current: js.Any, notifyChange: js.Any): js.Any = js.native
  def setWrapSelectorWheel(wrapSelectorWheel: Boolean): Unit = js.native
  /* private */ def showSoftInput(): js.Any = js.native
  /* private */ def tryComputeMaxWidth(): js.Any = js.native
  /* private */ def updateInputTextView(): js.Any = js.native
  /* private */ def validateInputTextView(v: js.Any): js.Any = js.native
}

