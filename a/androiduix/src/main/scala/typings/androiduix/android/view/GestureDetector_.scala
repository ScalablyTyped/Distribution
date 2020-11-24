package typings.androiduix.android.view

import typings.androiduix.android.view.GestureDetector.OnDoubleTapListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureDetector_ extends js.Object {
  
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
object GestureDetector_ {
  
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
  ): GestureDetector_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cancelTaps = js.Any.fromFunction0(cancelTaps), dispatchLongPress = js.Any.fromFunction0(dispatchLongPress), init = js.Any.fromFunction0(init), isConsideredDoubleTap = js.Any.fromFunction3(isConsideredDoubleTap), isLongpressEnabled = js.Any.fromFunction0(isLongpressEnabled), mAlwaysInBiggerTapRegion = mAlwaysInBiggerTapRegion.asInstanceOf[js.Any], mAlwaysInTapRegion = mAlwaysInTapRegion.asInstanceOf[js.Any], mCurrentDownEvent = mCurrentDownEvent.asInstanceOf[js.Any], mDeferConfirmSingleTap = mDeferConfirmSingleTap.asInstanceOf[js.Any], mDoubleTapListener = mDoubleTapListener.asInstanceOf[js.Any], mDoubleTapSlopSquare = mDoubleTapSlopSquare.asInstanceOf[js.Any], mDoubleTapTouchSlopSquare = mDoubleTapTouchSlopSquare.asInstanceOf[js.Any], mDownFocusX = mDownFocusX.asInstanceOf[js.Any], mDownFocusY = mDownFocusY.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mInLongPress = mInLongPress.asInstanceOf[js.Any], mIsDoubleTapping = mIsDoubleTapping.asInstanceOf[js.Any], mIsLongpressEnabled = mIsLongpressEnabled.asInstanceOf[js.Any], mLastFocusX = mLastFocusX.asInstanceOf[js.Any], mLastFocusY = mLastFocusY.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMaximumFlingVelocity = mMaximumFlingVelocity.asInstanceOf[js.Any], mMinimumFlingVelocity = mMinimumFlingVelocity.asInstanceOf[js.Any], mPreviousUpEvent = mPreviousUpEvent.asInstanceOf[js.Any], mStillDown = mStillDown.asInstanceOf[js.Any], mTouchSlopSquare = mTouchSlopSquare.asInstanceOf[js.Any], mVelocityTracker = mVelocityTracker.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setIsLongpressEnabled = js.Any.fromFunction1(setIsLongpressEnabled), setOnDoubleTapListener = js.Any.fromFunction1(setOnDoubleTapListener))
    __obj.asInstanceOf[GestureDetector_]
  }
  
  @scala.inline
  implicit class GestureDetector_Ops[Self <: GestureDetector_] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => js.Any): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelTaps(value: () => js.Any): Self = this.set("cancelTaps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchLongPress(value: () => js.Any): Self = this.set("dispatchLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => js.Any): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConsideredDoubleTap(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("isConsideredDoubleTap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsLongpressEnabled(value: () => Boolean): Self = this.set("isLongpressEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAlwaysInBiggerTapRegion(value: js.Any): Self = this.set("mAlwaysInBiggerTapRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAlwaysInTapRegion(value: js.Any): Self = this.set("mAlwaysInTapRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMCurrentDownEvent(value: js.Any): Self = this.set("mCurrentDownEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDeferConfirmSingleTap(value: js.Any): Self = this.set("mDeferConfirmSingleTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapListener(value: js.Any): Self = this.set("mDoubleTapListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapSlopSquare(value: js.Any): Self = this.set("mDoubleTapSlopSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapTouchSlopSquare(value: js.Any): Self = this.set("mDoubleTapTouchSlopSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDownFocusX(value: js.Any): Self = this.set("mDownFocusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDownFocusY(value: js.Any): Self = this.set("mDownFocusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = this.set("mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInLongPress(value: js.Any): Self = this.set("mInLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsDoubleTapping(value: js.Any): Self = this.set("mIsDoubleTapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIsLongpressEnabled(value: js.Any): Self = this.set("mIsLongpressEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLastFocusX(value: js.Any): Self = this.set("mLastFocusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLastFocusY(value: js.Any): Self = this.set("mLastFocusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMListener(value: js.Any): Self = this.set("mListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaximumFlingVelocity(value: js.Any): Self = this.set("mMaximumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMinimumFlingVelocity(value: js.Any): Self = this.set("mMinimumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPreviousUpEvent(value: js.Any): Self = this.set("mPreviousUpEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMStillDown(value: js.Any): Self = this.set("mStillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchSlopSquare(value: js.Any): Self = this.set("mTouchSlopSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMVelocityTracker(value: js.Any): Self = this.set("mVelocityTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = this.set("onTouchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsLongpressEnabled(value: Boolean => Unit): Self = this.set("setIsLongpressEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnDoubleTapListener(value: OnDoubleTapListener => Unit): Self = this.set("setOnDoubleTapListener", js.Any.fromFunction1(value))
  }
}
