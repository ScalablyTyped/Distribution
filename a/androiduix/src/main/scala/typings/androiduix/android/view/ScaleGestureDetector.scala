package typings.androiduix.android.view

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleGestureDetector extends StObject {
  
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
object ScaleGestureDetector {
  
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
  ): ScaleGestureDetector = {
    val __obj = js.Dynamic.literal(addTouchHistory = js.Any.fromFunction1(addTouchHistory), clearTouchHistory = js.Any.fromFunction0(clearTouchHistory), getCurrentSpan = js.Any.fromFunction0(getCurrentSpan), getCurrentSpanX = js.Any.fromFunction0(getCurrentSpanX), getCurrentSpanY = js.Any.fromFunction0(getCurrentSpanY), getEventTime = js.Any.fromFunction0(getEventTime), getFocusX = js.Any.fromFunction0(getFocusX), getFocusY = js.Any.fromFunction0(getFocusY), getPreviousSpan = js.Any.fromFunction0(getPreviousSpan), getPreviousSpanX = js.Any.fromFunction0(getPreviousSpanX), getPreviousSpanY = js.Any.fromFunction0(getPreviousSpanY), getScaleFactor = js.Any.fromFunction0(getScaleFactor), getTimeDelta = js.Any.fromFunction0(getTimeDelta), inDoubleTapMode = js.Any.fromFunction0(inDoubleTapMode), isInProgress = js.Any.fromFunction0(isInProgress), isQuickScaleEnabled = js.Any.fromFunction0(isQuickScaleEnabled), mCurrSpan = mCurrSpan.asInstanceOf[js.Any], mCurrSpanX = mCurrSpanX.asInstanceOf[js.Any], mCurrSpanY = mCurrSpanY.asInstanceOf[js.Any], mCurrTime = mCurrTime.asInstanceOf[js.Any], mDoubleTapEvent = mDoubleTapEvent.asInstanceOf[js.Any], mDoubleTapMode = mDoubleTapMode.asInstanceOf[js.Any], mEventBeforeOrAboveStartingGestureEvent = mEventBeforeOrAboveStartingGestureEvent.asInstanceOf[js.Any], mFocusX = mFocusX.asInstanceOf[js.Any], mFocusY = mFocusY.asInstanceOf[js.Any], mGestureDetector = mGestureDetector.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mInProgress = mInProgress.asInstanceOf[js.Any], mInitialSpan = mInitialSpan.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMinSpan = mMinSpan.asInstanceOf[js.Any], mPrevSpan = mPrevSpan.asInstanceOf[js.Any], mPrevSpanX = mPrevSpanX.asInstanceOf[js.Any], mPrevSpanY = mPrevSpanY.asInstanceOf[js.Any], mPrevTime = mPrevTime.asInstanceOf[js.Any], mQuickScaleEnabled = mQuickScaleEnabled.asInstanceOf[js.Any], mSpanSlop = mSpanSlop.asInstanceOf[js.Any], mTouchHistoryDirection = mTouchHistoryDirection.asInstanceOf[js.Any], mTouchHistoryLastAccepted = mTouchHistoryLastAccepted.asInstanceOf[js.Any], mTouchHistoryLastAcceptedTime = mTouchHistoryLastAcceptedTime.asInstanceOf[js.Any], mTouchLower = mTouchLower.asInstanceOf[js.Any], mTouchMinMajor = mTouchMinMajor.asInstanceOf[js.Any], mTouchUpper = mTouchUpper.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setQuickScaleEnabled = js.Any.fromFunction1(setQuickScaleEnabled))
    __obj.asInstanceOf[ScaleGestureDetector]
  }
  
  @js.native
  trait OnScaleGestureListener extends StObject {
    
    def onScale(detector: ScaleGestureDetector): Boolean = js.native
    
    def onScaleBegin(detector: ScaleGestureDetector): Boolean = js.native
    
    def onScaleEnd(detector: ScaleGestureDetector): Unit = js.native
  }
  object OnScaleGestureListener {
    
    @scala.inline
    def apply(
      onScale: ScaleGestureDetector => Boolean,
      onScaleBegin: ScaleGestureDetector => Boolean,
      onScaleEnd: ScaleGestureDetector => Unit
    ): OnScaleGestureListener = {
      val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
      __obj.asInstanceOf[OnScaleGestureListener]
    }
    
    @scala.inline
    implicit class OnScaleGestureListenerMutableBuilder[Self <: OnScaleGestureListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnScale(value: ScaleGestureDetector => Boolean): Self = StObject.set(x, "onScale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScaleBegin(value: ScaleGestureDetector => Boolean): Self = StObject.set(x, "onScaleBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScaleEnd(value: ScaleGestureDetector => Unit): Self = StObject.set(x, "onScaleEnd", js.Any.fromFunction1(value))
    }
  }
  
  @scala.inline
  implicit class ScaleGestureDetectorMutableBuilder[Self <: ScaleGestureDetector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTouchHistory(value: js.Any => js.Any): Self = StObject.set(x, "addTouchHistory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearTouchHistory(value: () => js.Any): Self = StObject.set(x, "clearTouchHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSpan(value: () => Double): Self = StObject.set(x, "getCurrentSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSpanX(value: () => Double): Self = StObject.set(x, "getCurrentSpanX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSpanY(value: () => Double): Self = StObject.set(x, "getCurrentSpanY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventTime(value: () => Double): Self = StObject.set(x, "getEventTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFocusX(value: () => Double): Self = StObject.set(x, "getFocusX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFocusY(value: () => Double): Self = StObject.set(x, "getFocusY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSpan(value: () => Double): Self = StObject.set(x, "getPreviousSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSpanX(value: () => Double): Self = StObject.set(x, "getPreviousSpanX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSpanY(value: () => Double): Self = StObject.set(x, "getPreviousSpanY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaleFactor(value: () => Double): Self = StObject.set(x, "getScaleFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeDelta(value: () => Double): Self = StObject.set(x, "getTimeDelta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInDoubleTapMode(value: () => js.Any): Self = StObject.set(x, "inDoubleTapMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInProgress(value: () => Boolean): Self = StObject.set(x, "isInProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsQuickScaleEnabled(value: () => Boolean): Self = StObject.set(x, "isQuickScaleEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMCurrSpan(value: js.Any): Self = StObject.set(x, "mCurrSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrSpanX(value: js.Any): Self = StObject.set(x, "mCurrSpanX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrSpanY(value: js.Any): Self = StObject.set(x, "mCurrSpanY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrTime(value: js.Any): Self = StObject.set(x, "mCurrTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapEvent(value: js.Any): Self = StObject.set(x, "mDoubleTapEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapMode(value: js.Any): Self = StObject.set(x, "mDoubleTapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEventBeforeOrAboveStartingGestureEvent(value: js.Any): Self = StObject.set(x, "mEventBeforeOrAboveStartingGestureEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFocusX(value: js.Any): Self = StObject.set(x, "mFocusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFocusY(value: js.Any): Self = StObject.set(x, "mFocusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMGestureDetector(value: js.Any): Self = StObject.set(x, "mGestureDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = StObject.set(x, "mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInProgress(value: js.Any): Self = StObject.set(x, "mInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInitialSpan(value: js.Any): Self = StObject.set(x, "mInitialSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMListener(value: js.Any): Self = StObject.set(x, "mListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMinSpan(value: js.Any): Self = StObject.set(x, "mMinSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevSpan(value: js.Any): Self = StObject.set(x, "mPrevSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevSpanX(value: js.Any): Self = StObject.set(x, "mPrevSpanX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevSpanY(value: js.Any): Self = StObject.set(x, "mPrevSpanY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPrevTime(value: js.Any): Self = StObject.set(x, "mPrevTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMQuickScaleEnabled(value: js.Any): Self = StObject.set(x, "mQuickScaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSpanSlop(value: js.Any): Self = StObject.set(x, "mSpanSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchHistoryDirection(value: js.Any): Self = StObject.set(x, "mTouchHistoryDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchHistoryLastAccepted(value: js.Any): Self = StObject.set(x, "mTouchHistoryLastAccepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchHistoryLastAcceptedTime(value: js.Any): Self = StObject.set(x, "mTouchHistoryLastAcceptedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchLower(value: js.Any): Self = StObject.set(x, "mTouchLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchMinMajor(value: js.Any): Self = StObject.set(x, "mTouchMinMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchUpper(value: js.Any): Self = StObject.set(x, "mTouchUpper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuickScaleEnabled(value: Boolean => Unit): Self = StObject.set(x, "setQuickScaleEnabled", js.Any.fromFunction1(value))
  }
  
  @js.native
  trait SimpleOnScaleGestureListener extends OnScaleGestureListener
  object SimpleOnScaleGestureListener {
    
    @scala.inline
    def apply(
      onScale: ScaleGestureDetector => Boolean,
      onScaleBegin: ScaleGestureDetector => Boolean,
      onScaleEnd: ScaleGestureDetector => Unit
    ): SimpleOnScaleGestureListener = {
      val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
      __obj.asInstanceOf[SimpleOnScaleGestureListener]
    }
  }
}
