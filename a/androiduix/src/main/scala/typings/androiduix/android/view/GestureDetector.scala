package typings.androiduix.android.view

import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.GestureDetector.OnDoubleTapListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureDetector extends StObject {
  
  /* private */ def cancel(): js.Any = js.native
  
  /* private */ def cancelTaps(): js.Any = js.native
  
  /* private */ def dispatchLongPress(): js.Any = js.native
  
  /* private */ def init(): js.Any = js.native
  
  /* private */ def isConsideredDoubleTap(firstDown: js.Any, firstUp: js.Any, secondDown: js.Any): js.Any = js.native
  
  def isLongpressEnabled(): Boolean = js.native
  
  var mAlwaysInBiggerTapRegion: js.Any = js.native
  
  var mAlwaysInTapRegion: js.Any = js.native
  
  var mCurrentDownEvent: js.Any = js.native
  
  var mDeferConfirmSingleTap: js.Any = js.native
  
  var mDoubleTapListener: js.Any = js.native
  
  var mDoubleTapSlopSquare: js.Any = js.native
  
  var mDoubleTapTouchSlopSquare: js.Any = js.native
  
  var mDownFocusX: js.Any = js.native
  
  var mDownFocusY: js.Any = js.native
  
  var mHandler: js.Any = js.native
  
  var mInLongPress: js.Any = js.native
  
  var mIsDoubleTapping: js.Any = js.native
  
  var mIsLongpressEnabled: js.Any = js.native
  
  var mLastFocusX: js.Any = js.native
  
  var mLastFocusY: js.Any = js.native
  
  var mListener: js.Any = js.native
  
  var mMaximumFlingVelocity: js.Any = js.native
  
  var mMinimumFlingVelocity: js.Any = js.native
  
  var mPreviousUpEvent: js.Any = js.native
  
  var mStillDown: js.Any = js.native
  
  var mTouchSlopSquare: js.Any = js.native
  
  var mVelocityTracker: js.Any = js.native
  
  def onTouchEvent(ev: MotionEvent): Boolean = js.native
  
  def setIsLongpressEnabled(isLongpressEnabled: Boolean): Unit = js.native
  
  def setOnDoubleTapListener(onDoubleTapListener: OnDoubleTapListener): Unit = js.native
}
object GestureDetector {
  
  @scala.inline
  def apply(
    cancel: () => js.Any,
    cancelTaps: () => js.Any,
    dispatchLongPress: () => js.Any,
    init: () => js.Any,
    isConsideredDoubleTap: (js.Any, js.Any, js.Any) => js.Any,
    isLongpressEnabled: () => Boolean,
    mAlwaysInBiggerTapRegion: js.Any,
    mAlwaysInTapRegion: js.Any,
    mCurrentDownEvent: js.Any,
    mDeferConfirmSingleTap: js.Any,
    mDoubleTapListener: js.Any,
    mDoubleTapSlopSquare: js.Any,
    mDoubleTapTouchSlopSquare: js.Any,
    mDownFocusX: js.Any,
    mDownFocusY: js.Any,
    mHandler: js.Any,
    mInLongPress: js.Any,
    mIsDoubleTapping: js.Any,
    mIsLongpressEnabled: js.Any,
    mLastFocusX: js.Any,
    mLastFocusY: js.Any,
    mListener: js.Any,
    mMaximumFlingVelocity: js.Any,
    mMinimumFlingVelocity: js.Any,
    mPreviousUpEvent: js.Any,
    mStillDown: js.Any,
    mTouchSlopSquare: js.Any,
    mVelocityTracker: js.Any,
    onTouchEvent: MotionEvent => Boolean,
    setIsLongpressEnabled: Boolean => Unit,
    setOnDoubleTapListener: OnDoubleTapListener => Unit
  ): GestureDetector = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cancelTaps = js.Any.fromFunction0(cancelTaps), dispatchLongPress = js.Any.fromFunction0(dispatchLongPress), init = js.Any.fromFunction0(init), isConsideredDoubleTap = js.Any.fromFunction3(isConsideredDoubleTap), isLongpressEnabled = js.Any.fromFunction0(isLongpressEnabled), mAlwaysInBiggerTapRegion = mAlwaysInBiggerTapRegion.asInstanceOf[js.Any], mAlwaysInTapRegion = mAlwaysInTapRegion.asInstanceOf[js.Any], mCurrentDownEvent = mCurrentDownEvent.asInstanceOf[js.Any], mDeferConfirmSingleTap = mDeferConfirmSingleTap.asInstanceOf[js.Any], mDoubleTapListener = mDoubleTapListener.asInstanceOf[js.Any], mDoubleTapSlopSquare = mDoubleTapSlopSquare.asInstanceOf[js.Any], mDoubleTapTouchSlopSquare = mDoubleTapTouchSlopSquare.asInstanceOf[js.Any], mDownFocusX = mDownFocusX.asInstanceOf[js.Any], mDownFocusY = mDownFocusY.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mInLongPress = mInLongPress.asInstanceOf[js.Any], mIsDoubleTapping = mIsDoubleTapping.asInstanceOf[js.Any], mIsLongpressEnabled = mIsLongpressEnabled.asInstanceOf[js.Any], mLastFocusX = mLastFocusX.asInstanceOf[js.Any], mLastFocusY = mLastFocusY.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMaximumFlingVelocity = mMaximumFlingVelocity.asInstanceOf[js.Any], mMinimumFlingVelocity = mMinimumFlingVelocity.asInstanceOf[js.Any], mPreviousUpEvent = mPreviousUpEvent.asInstanceOf[js.Any], mStillDown = mStillDown.asInstanceOf[js.Any], mTouchSlopSquare = mTouchSlopSquare.asInstanceOf[js.Any], mVelocityTracker = mVelocityTracker.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setIsLongpressEnabled = js.Any.fromFunction1(setIsLongpressEnabled), setOnDoubleTapListener = js.Any.fromFunction1(setOnDoubleTapListener))
    __obj.asInstanceOf[GestureDetector]
  }
  
  @scala.inline
  implicit class GestureDetectorMutableBuilder[Self <: GestureDetector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => js.Any): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelTaps(value: () => js.Any): Self = StObject.set(x, "cancelTaps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchLongPress(value: () => js.Any): Self = StObject.set(x, "dispatchLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConsideredDoubleTap(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "isConsideredDoubleTap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsLongpressEnabled(value: () => Boolean): Self = StObject.set(x, "isLongpressEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAlwaysInBiggerTapRegion(value: js.Any): Self = StObject.set(x, "mAlwaysInBiggerTapRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAlwaysInTapRegion(value: js.Any): Self = StObject.set(x, "mAlwaysInTapRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrentDownEvent(value: js.Any): Self = StObject.set(x, "mCurrentDownEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDeferConfirmSingleTap(value: js.Any): Self = StObject.set(x, "mDeferConfirmSingleTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapListener(value: js.Any): Self = StObject.set(x, "mDoubleTapListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapSlopSquare(value: js.Any): Self = StObject.set(x, "mDoubleTapSlopSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapTouchSlopSquare(value: js.Any): Self = StObject.set(x, "mDoubleTapTouchSlopSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDownFocusX(value: js.Any): Self = StObject.set(x, "mDownFocusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDownFocusY(value: js.Any): Self = StObject.set(x, "mDownFocusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = StObject.set(x, "mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInLongPress(value: js.Any): Self = StObject.set(x, "mInLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsDoubleTapping(value: js.Any): Self = StObject.set(x, "mIsDoubleTapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsLongpressEnabled(value: js.Any): Self = StObject.set(x, "mIsLongpressEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLastFocusX(value: js.Any): Self = StObject.set(x, "mLastFocusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLastFocusY(value: js.Any): Self = StObject.set(x, "mLastFocusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMListener(value: js.Any): Self = StObject.set(x, "mListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaximumFlingVelocity(value: js.Any): Self = StObject.set(x, "mMaximumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMinimumFlingVelocity(value: js.Any): Self = StObject.set(x, "mMinimumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPreviousUpEvent(value: js.Any): Self = StObject.set(x, "mPreviousUpEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMStillDown(value: js.Any): Self = StObject.set(x, "mStillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchSlopSquare(value: js.Any): Self = StObject.set(x, "mTouchSlopSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMVelocityTracker(value: js.Any): Self = StObject.set(x, "mVelocityTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsLongpressEnabled(value: Boolean => Unit): Self = StObject.set(x, "setIsLongpressEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnDoubleTapListener(value: OnDoubleTapListener => Unit): Self = StObject.set(x, "setOnDoubleTapListener", js.Any.fromFunction1(value))
  }
  
  @js.native
  trait GestureHandler extends Handler {
    
    var _GestureDetector_this: GestureDetector = js.native
  }
  
  @js.native
  trait OnDoubleTapListener extends StObject {
    
    def onDoubleTap(e: MotionEvent): Boolean = js.native
    
    def onDoubleTapEvent(e: MotionEvent): Boolean = js.native
    
    def onSingleTapConfirmed(e: MotionEvent): Boolean = js.native
  }
  object OnDoubleTapListener {
    
    @scala.inline
    def apply(
      onDoubleTap: MotionEvent => Boolean,
      onDoubleTapEvent: MotionEvent => Boolean,
      onSingleTapConfirmed: MotionEvent => Boolean
    ): OnDoubleTapListener = {
      val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed))
      __obj.asInstanceOf[OnDoubleTapListener]
    }
    
    @scala.inline
    implicit class OnDoubleTapListenerMutableBuilder[Self <: OnDoubleTapListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDoubleTap(value: MotionEvent => Boolean): Self = StObject.set(x, "onDoubleTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleTapEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "onDoubleTapEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSingleTapConfirmed(value: MotionEvent => Boolean): Self = StObject.set(x, "onSingleTapConfirmed", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnGestureListener extends StObject {
    
    def onDown(e: MotionEvent): Boolean = js.native
    
    def onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Double, velocityY: Double): Boolean = js.native
    
    def onLongPress(e: MotionEvent): Unit = js.native
    
    def onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Double, distanceY: Double): Boolean = js.native
    
    def onShowPress(e: MotionEvent): Unit = js.native
    
    def onSingleTapUp(e: MotionEvent): Boolean = js.native
  }
  object OnGestureListener {
    
    @scala.inline
    def apply(
      onDown: MotionEvent => Boolean,
      onFling: (MotionEvent, MotionEvent, Double, Double) => Boolean,
      onLongPress: MotionEvent => Unit,
      onScroll: (MotionEvent, MotionEvent, Double, Double) => Boolean,
      onShowPress: MotionEvent => Unit,
      onSingleTapUp: MotionEvent => Boolean
    ): OnGestureListener = {
      val __obj = js.Dynamic.literal(onDown = js.Any.fromFunction1(onDown), onFling = js.Any.fromFunction4(onFling), onLongPress = js.Any.fromFunction1(onLongPress), onScroll = js.Any.fromFunction4(onScroll), onShowPress = js.Any.fromFunction1(onShowPress), onSingleTapUp = js.Any.fromFunction1(onSingleTapUp))
      __obj.asInstanceOf[OnGestureListener]
    }
    
    @scala.inline
    implicit class OnGestureListenerMutableBuilder[Self <: OnGestureListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDown(value: MotionEvent => Boolean): Self = StObject.set(x, "onDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFling(value: (MotionEvent, MotionEvent, Double, Double) => Boolean): Self = StObject.set(x, "onFling", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnLongPress(value: MotionEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScroll(value: (MotionEvent, MotionEvent, Double, Double) => Boolean): Self = StObject.set(x, "onScroll", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnShowPress(value: MotionEvent => Unit): Self = StObject.set(x, "onShowPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSingleTapUp(value: MotionEvent => Boolean): Self = StObject.set(x, "onSingleTapUp", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SimpleOnGestureListener
    extends OnGestureListener
       with OnDoubleTapListener
  object SimpleOnGestureListener {
    
    @scala.inline
    def apply(
      onDoubleTap: MotionEvent => Boolean,
      onDoubleTapEvent: MotionEvent => Boolean,
      onDown: MotionEvent => Boolean,
      onFling: (MotionEvent, MotionEvent, Double, Double) => Boolean,
      onLongPress: MotionEvent => Unit,
      onScroll: (MotionEvent, MotionEvent, Double, Double) => Boolean,
      onShowPress: MotionEvent => Unit,
      onSingleTapConfirmed: MotionEvent => Boolean,
      onSingleTapUp: MotionEvent => Boolean
    ): SimpleOnGestureListener = {
      val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onDown = js.Any.fromFunction1(onDown), onFling = js.Any.fromFunction4(onFling), onLongPress = js.Any.fromFunction1(onLongPress), onScroll = js.Any.fromFunction4(onScroll), onShowPress = js.Any.fromFunction1(onShowPress), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed), onSingleTapUp = js.Any.fromFunction1(onSingleTapUp))
      __obj.asInstanceOf[SimpleOnGestureListener]
    }
  }
}
