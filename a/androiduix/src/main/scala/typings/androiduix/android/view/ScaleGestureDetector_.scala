package typings.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleGestureDetector_ extends js.Object {
  
  /* private */ def addTouchHistory(ev: js.Any): js.Any = js.native
  
  /* private */ def clearTouchHistory(): js.Any = js.native
  
  def getCurrentSpan(): Double = js.native
  
  def getCurrentSpanX(): Double = js.native
  
  def getCurrentSpanY(): Double = js.native
  
  def getEventTime(): Double = js.native
  
  def getFocusX(): Double = js.native
  
  def getFocusY(): Double = js.native
  
  def getPreviousSpan(): Double = js.native
  
  def getPreviousSpanX(): Double = js.native
  
  def getPreviousSpanY(): Double = js.native
  
  def getScaleFactor(): Double = js.native
  
  def getTimeDelta(): Double = js.native
  
  /* private */ def inDoubleTapMode(): js.Any = js.native
  
  def isInProgress(): Boolean = js.native
  
  def isQuickScaleEnabled(): Boolean = js.native
  
  var mCurrSpan: js.Any = js.native
  
  var mCurrSpanX: js.Any = js.native
  
  var mCurrSpanY: js.Any = js.native
  
  var mCurrTime: js.Any = js.native
  
  var mDoubleTapEvent: js.Any = js.native
  
  var mDoubleTapMode: js.Any = js.native
  
  var mEventBeforeOrAboveStartingGestureEvent: js.Any = js.native
  
  var mFocusX: js.Any = js.native
  
  var mFocusY: js.Any = js.native
  
  var mGestureDetector: js.Any = js.native
  
  var mHandler: js.Any = js.native
  
  var mInProgress: js.Any = js.native
  
  var mInitialSpan: js.Any = js.native
  
  var mListener: js.Any = js.native
  
  var mMinSpan: js.Any = js.native
  
  var mPrevSpan: js.Any = js.native
  
  var mPrevSpanX: js.Any = js.native
  
  var mPrevSpanY: js.Any = js.native
  
  var mPrevTime: js.Any = js.native
  
  var mQuickScaleEnabled: js.Any = js.native
  
  var mSpanSlop: js.Any = js.native
  
  var mTouchHistoryDirection: js.Any = js.native
  
  var mTouchHistoryLastAccepted: js.Any = js.native
  
  var mTouchHistoryLastAcceptedTime: js.Any = js.native
  
  var mTouchLower: js.Any = js.native
  
  var mTouchMinMajor: js.Any = js.native
  
  var mTouchUpper: js.Any = js.native
  
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  
  def setQuickScaleEnabled(scales: Boolean): Unit = js.native
}
object ScaleGestureDetector_ {
  
  @scala.inline
  def apply(
    addTouchHistory: js.Any => js.Any,
    clearTouchHistory: () => js.Any,
    getCurrentSpan: () => Double,
    getCurrentSpanX: () => Double,
    getCurrentSpanY: () => Double,
    getEventTime: () => Double,
    getFocusX: () => Double,
    getFocusY: () => Double,
    getPreviousSpan: () => Double,
    getPreviousSpanX: () => Double,
    getPreviousSpanY: () => Double,
    getScaleFactor: () => Double,
    getTimeDelta: () => Double,
    inDoubleTapMode: () => js.Any,
    isInProgress: () => Boolean,
    isQuickScaleEnabled: () => Boolean,
    mCurrSpan: js.Any,
    mCurrSpanX: js.Any,
    mCurrSpanY: js.Any,
    mCurrTime: js.Any,
    mDoubleTapEvent: js.Any,
    mDoubleTapMode: js.Any,
    mEventBeforeOrAboveStartingGestureEvent: js.Any,
    mFocusX: js.Any,
    mFocusY: js.Any,
    mGestureDetector: js.Any,
    mHandler: js.Any,
    mInProgress: js.Any,
    mInitialSpan: js.Any,
    mListener: js.Any,
    mMinSpan: js.Any,
    mPrevSpan: js.Any,
    mPrevSpanX: js.Any,
    mPrevSpanY: js.Any,
    mPrevTime: js.Any,
    mQuickScaleEnabled: js.Any,
    mSpanSlop: js.Any,
    mTouchHistoryDirection: js.Any,
    mTouchHistoryLastAccepted: js.Any,
    mTouchHistoryLastAcceptedTime: js.Any,
    mTouchLower: js.Any,
    mTouchMinMajor: js.Any,
    mTouchUpper: js.Any,
    onTouchEvent: MotionEvent => Boolean,
    setQuickScaleEnabled: Boolean => Unit
  ): ScaleGestureDetector_ = {
    val __obj = js.Dynamic.literal(addTouchHistory = js.Any.fromFunction1(addTouchHistory), clearTouchHistory = js.Any.fromFunction0(clearTouchHistory), getCurrentSpan = js.Any.fromFunction0(getCurrentSpan), getCurrentSpanX = js.Any.fromFunction0(getCurrentSpanX), getCurrentSpanY = js.Any.fromFunction0(getCurrentSpanY), getEventTime = js.Any.fromFunction0(getEventTime), getFocusX = js.Any.fromFunction0(getFocusX), getFocusY = js.Any.fromFunction0(getFocusY), getPreviousSpan = js.Any.fromFunction0(getPreviousSpan), getPreviousSpanX = js.Any.fromFunction0(getPreviousSpanX), getPreviousSpanY = js.Any.fromFunction0(getPreviousSpanY), getScaleFactor = js.Any.fromFunction0(getScaleFactor), getTimeDelta = js.Any.fromFunction0(getTimeDelta), inDoubleTapMode = js.Any.fromFunction0(inDoubleTapMode), isInProgress = js.Any.fromFunction0(isInProgress), isQuickScaleEnabled = js.Any.fromFunction0(isQuickScaleEnabled), mCurrSpan = mCurrSpan.asInstanceOf[js.Any], mCurrSpanX = mCurrSpanX.asInstanceOf[js.Any], mCurrSpanY = mCurrSpanY.asInstanceOf[js.Any], mCurrTime = mCurrTime.asInstanceOf[js.Any], mDoubleTapEvent = mDoubleTapEvent.asInstanceOf[js.Any], mDoubleTapMode = mDoubleTapMode.asInstanceOf[js.Any], mEventBeforeOrAboveStartingGestureEvent = mEventBeforeOrAboveStartingGestureEvent.asInstanceOf[js.Any], mFocusX = mFocusX.asInstanceOf[js.Any], mFocusY = mFocusY.asInstanceOf[js.Any], mGestureDetector = mGestureDetector.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mInProgress = mInProgress.asInstanceOf[js.Any], mInitialSpan = mInitialSpan.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMinSpan = mMinSpan.asInstanceOf[js.Any], mPrevSpan = mPrevSpan.asInstanceOf[js.Any], mPrevSpanX = mPrevSpanX.asInstanceOf[js.Any], mPrevSpanY = mPrevSpanY.asInstanceOf[js.Any], mPrevTime = mPrevTime.asInstanceOf[js.Any], mQuickScaleEnabled = mQuickScaleEnabled.asInstanceOf[js.Any], mSpanSlop = mSpanSlop.asInstanceOf[js.Any], mTouchHistoryDirection = mTouchHistoryDirection.asInstanceOf[js.Any], mTouchHistoryLastAccepted = mTouchHistoryLastAccepted.asInstanceOf[js.Any], mTouchHistoryLastAcceptedTime = mTouchHistoryLastAcceptedTime.asInstanceOf[js.Any], mTouchLower = mTouchLower.asInstanceOf[js.Any], mTouchMinMajor = mTouchMinMajor.asInstanceOf[js.Any], mTouchUpper = mTouchUpper.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setQuickScaleEnabled = js.Any.fromFunction1(setQuickScaleEnabled))
    __obj.asInstanceOf[ScaleGestureDetector_]
  }
  
  @scala.inline
  implicit class ScaleGestureDetector_Ops[Self <: ScaleGestureDetector_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddTouchHistory(value: js.Any => js.Any): Self = this.set("addTouchHistory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearTouchHistory(value: () => js.Any): Self = this.set("clearTouchHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSpan(value: () => Double): Self = this.set("getCurrentSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSpanX(value: () => Double): Self = this.set("getCurrentSpanX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSpanY(value: () => Double): Self = this.set("getCurrentSpanY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventTime(value: () => Double): Self = this.set("getEventTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFocusX(value: () => Double): Self = this.set("getFocusX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFocusY(value: () => Double): Self = this.set("getFocusY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSpan(value: () => Double): Self = this.set("getPreviousSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSpanX(value: () => Double): Self = this.set("getPreviousSpanX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSpanY(value: () => Double): Self = this.set("getPreviousSpanY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaleFactor(value: () => Double): Self = this.set("getScaleFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeDelta(value: () => Double): Self = this.set("getTimeDelta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInDoubleTapMode(value: () => js.Any): Self = this.set("inDoubleTapMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInProgress(value: () => Boolean): Self = this.set("isInProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsQuickScaleEnabled(value: () => Boolean): Self = this.set("isQuickScaleEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMCurrSpan(value: js.Any): Self = this.set("mCurrSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrSpanX(value: js.Any): Self = this.set("mCurrSpanX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrSpanY(value: js.Any): Self = this.set("mCurrSpanY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrTime(value: js.Any): Self = this.set("mCurrTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapEvent(value: js.Any): Self = this.set("mDoubleTapEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapMode(value: js.Any): Self = this.set("mDoubleTapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEventBeforeOrAboveStartingGestureEvent(value: js.Any): Self = this.set("mEventBeforeOrAboveStartingGestureEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFocusX(value: js.Any): Self = this.set("mFocusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFocusY(value: js.Any): Self = this.set("mFocusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMGestureDetector(value: js.Any): Self = this.set("mGestureDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = this.set("mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInProgress(value: js.Any): Self = this.set("mInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInitialSpan(value: js.Any): Self = this.set("mInitialSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMListener(value: js.Any): Self = this.set("mListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMinSpan(value: js.Any): Self = this.set("mMinSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevSpan(value: js.Any): Self = this.set("mPrevSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevSpanX(value: js.Any): Self = this.set("mPrevSpanX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevSpanY(value: js.Any): Self = this.set("mPrevSpanY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevTime(value: js.Any): Self = this.set("mPrevTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMQuickScaleEnabled(value: js.Any): Self = this.set("mQuickScaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSpanSlop(value: js.Any): Self = this.set("mSpanSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchHistoryDirection(value: js.Any): Self = this.set("mTouchHistoryDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchHistoryLastAccepted(value: js.Any): Self = this.set("mTouchHistoryLastAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchHistoryLastAcceptedTime(value: js.Any): Self = this.set("mTouchHistoryLastAcceptedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchLower(value: js.Any): Self = this.set("mTouchLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchMinMajor(value: js.Any): Self = this.set("mTouchMinMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchUpper(value: js.Any): Self = this.set("mTouchUpper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = this.set("onTouchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuickScaleEnabled(value: Boolean => Unit): Self = this.set("setQuickScaleEnabled", js.Any.fromFunction1(value))
  }
}
