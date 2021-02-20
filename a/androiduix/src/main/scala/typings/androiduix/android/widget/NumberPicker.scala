package typings.androiduix.android.widget

import typings.androiduix.android.widget.NumberPicker.Formatter
import typings.androiduix.android.widget.NumberPicker.OnScrollListener
import typings.androiduix.android.widget.NumberPicker.OnValueChangeListener
import typings.androiduix.java_.lang.Runnable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberPicker extends LinearLayout {
  
  var SELECTOR_MIDDLE_ITEM_INDEX: js.Any = js.native
  
  var SELECTOR_WHEEL_ITEM_COUNT: js.Any = js.native
  
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
object NumberPicker {
  
  @js.native
  trait BeginSoftInputOnLongPressCommand extends Runnable {
    
    var _NumberPicker_this: NumberPicker = js.native
  }
  object BeginSoftInputOnLongPressCommand {
    
    @scala.inline
    def apply(_NumberPicker_this: NumberPicker, run: () => js.Any): BeginSoftInputOnLongPressCommand = {
      val __obj = js.Dynamic.literal(_NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[BeginSoftInputOnLongPressCommand]
    }
    
    @scala.inline
    implicit class BeginSoftInputOnLongPressCommandMutableBuilder[Self <: BeginSoftInputOnLongPressCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_NumberPicker_this(value: NumberPicker): Self = StObject.set(x, "_NumberPicker_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChangeCurrentByOneFromLongPressCommand extends Runnable {
    
    var _NumberPicker_this: NumberPicker = js.native
    
    var mIncrement: js.Any = js.native
    
    def setStep(increment: Boolean): Unit = js.native
  }
  object ChangeCurrentByOneFromLongPressCommand {
    
    @scala.inline
    def apply(_NumberPicker_this: NumberPicker, mIncrement: js.Any, run: () => js.Any, setStep: Boolean => Unit): ChangeCurrentByOneFromLongPressCommand = {
      val __obj = js.Dynamic.literal(_NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], mIncrement = mIncrement.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), setStep = js.Any.fromFunction1(setStep))
      __obj.asInstanceOf[ChangeCurrentByOneFromLongPressCommand]
    }
    
    @scala.inline
    implicit class ChangeCurrentByOneFromLongPressCommandMutableBuilder[Self <: ChangeCurrentByOneFromLongPressCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIncrement(value: js.Any): Self = StObject.set(x, "mIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetStep(value: Boolean => Unit): Self = StObject.set(x, "setStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_NumberPicker_this(value: NumberPicker): Self = StObject.set(x, "_NumberPicker_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Formatter extends StObject {
    
    def format(value: Double): String = js.native
  }
  object Formatter {
    
    @scala.inline
    def apply(format: Double => String): Formatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
      __obj.asInstanceOf[Formatter]
    }
    
    @scala.inline
    implicit class FormatterMutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnScrollListener extends StObject {
    
    def onScrollStateChange(view: NumberPicker, scrollState: Double): Unit = js.native
  }
  object OnScrollListener {
    
    @scala.inline
    def apply(onScrollStateChange: (NumberPicker, Double) => Unit): OnScrollListener = {
      val __obj = js.Dynamic.literal(onScrollStateChange = js.Any.fromFunction2(onScrollStateChange))
      __obj.asInstanceOf[OnScrollListener]
    }
    
    @scala.inline
    implicit class OnScrollListenerMutableBuilder[Self <: OnScrollListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnScrollStateChange(value: (NumberPicker, Double) => Unit): Self = StObject.set(x, "onScrollStateChange", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OnValueChangeListener extends StObject {
    
    def onValueChange(picker: NumberPicker, oldVal: Double, newVal: Double): Unit = js.native
  }
  object OnValueChangeListener {
    
    @scala.inline
    def apply(onValueChange: (NumberPicker, Double, Double) => Unit): OnValueChangeListener = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction3(onValueChange))
      __obj.asInstanceOf[OnValueChangeListener]
    }
    
    @scala.inline
    implicit class OnValueChangeListenerMutableBuilder[Self <: OnValueChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnValueChange(value: (NumberPicker, Double, Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait PressedStateHelper extends Runnable {
    
    var MODE_PRESS: js.Any = js.native
    
    var MODE_TAPPED: js.Any = js.native
    
    var _NumberPicker_this: NumberPicker = js.native
    
    def buttonPressDelayed(button: Double): Unit = js.native
    
    def buttonTapped(button: Double): Unit = js.native
    
    def cancel(): Unit = js.native
    
    var mManagedButton: js.Any = js.native
    
    var mMode: js.Any = js.native
  }
  object PressedStateHelper {
    
    @scala.inline
    def apply(
      MODE_PRESS: js.Any,
      MODE_TAPPED: js.Any,
      _NumberPicker_this: NumberPicker,
      buttonPressDelayed: Double => Unit,
      buttonTapped: Double => Unit,
      cancel: () => Unit,
      mManagedButton: js.Any,
      mMode: js.Any,
      run: () => js.Any
    ): PressedStateHelper = {
      val __obj = js.Dynamic.literal(MODE_PRESS = MODE_PRESS.asInstanceOf[js.Any], MODE_TAPPED = MODE_TAPPED.asInstanceOf[js.Any], _NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], buttonPressDelayed = js.Any.fromFunction1(buttonPressDelayed), buttonTapped = js.Any.fromFunction1(buttonTapped), cancel = js.Any.fromFunction0(cancel), mManagedButton = mManagedButton.asInstanceOf[js.Any], mMode = mMode.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[PressedStateHelper]
    }
    
    @scala.inline
    implicit class PressedStateHelperMutableBuilder[Self <: PressedStateHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonPressDelayed(value: Double => Unit): Self = StObject.set(x, "buttonPressDelayed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setButtonTapped(value: Double => Unit): Self = StObject.set(x, "buttonTapped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMManagedButton(value: js.Any): Self = StObject.set(x, "mManagedButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMode(value: js.Any): Self = StObject.set(x, "mMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODE_PRESS(value: js.Any): Self = StObject.set(x, "MODE_PRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODE_TAPPED(value: js.Any): Self = StObject.set(x, "MODE_TAPPED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_NumberPicker_this(value: NumberPicker): Self = StObject.set(x, "_NumberPicker_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetSelectionCommand extends Runnable {
    
    var _NumberPicker_this: NumberPicker = js.native
    
    var mSelectionEnd: js.Any = js.native
    
    var mSelectionStart: js.Any = js.native
  }
  object SetSelectionCommand {
    
    @scala.inline
    def apply(
      _NumberPicker_this: NumberPicker,
      mSelectionEnd: js.Any,
      mSelectionStart: js.Any,
      run: () => js.Any
    ): SetSelectionCommand = {
      val __obj = js.Dynamic.literal(_NumberPicker_this = _NumberPicker_this.asInstanceOf[js.Any], mSelectionEnd = mSelectionEnd.asInstanceOf[js.Any], mSelectionStart = mSelectionStart.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[SetSelectionCommand]
    }
    
    @scala.inline
    implicit class SetSelectionCommandMutableBuilder[Self <: SetSelectionCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMSelectionEnd(value: js.Any): Self = StObject.set(x, "mSelectionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMSelectionStart(value: js.Any): Self = StObject.set(x, "mSelectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_NumberPicker_this(value: NumberPicker): Self = StObject.set(x, "_NumberPicker_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TwoDigitFormatter extends Formatter
  object TwoDigitFormatter {
    
    @scala.inline
    def apply(format: Double => String): TwoDigitFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
      __obj.asInstanceOf[TwoDigitFormatter]
    }
  }
}
