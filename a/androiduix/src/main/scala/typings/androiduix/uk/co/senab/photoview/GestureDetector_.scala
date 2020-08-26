package typings.androiduix.uk.co.senab.photoview

import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.ScaleGestureDetector
import typings.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureDetector_ extends js.Object {
  var mActivePointerId: js.Any = js.native
  var mActivePointerIndex: js.Any = js.native
  var mIsDragging: js.Any = js.native
  var mLastTouchX: Double = js.native
  var mLastTouchY: Double = js.native
  var mListener: OnGestureListener = js.native
  var mMinimumVelocity: Double = js.native
  var mScaleDetector: ScaleGestureDetector = js.native
  var mTouchSlop: Double = js.native
  var mVelocityTracker: js.Any = js.native
  def getActiveX(ev: MotionEvent): Double = js.native
  def getActiveY(ev: MotionEvent): Double = js.native
  def isDragging(): Boolean = js.native
  def isScaling(): Boolean = js.native
  def onTouchEvent(ev: MotionEvent): Boolean = js.native
  def setOnGestureListener(listener: OnGestureListener): Unit = js.native
}

object GestureDetector_ {
  @scala.inline
  def apply(
    getActiveX: MotionEvent => Double,
    getActiveY: MotionEvent => Double,
    isDragging: () => Boolean,
    isScaling: () => Boolean,
    mActivePointerId: js.Any,
    mActivePointerIndex: js.Any,
    mIsDragging: js.Any,
    mLastTouchX: Double,
    mLastTouchY: Double,
    mListener: OnGestureListener,
    mMinimumVelocity: Double,
    mScaleDetector: ScaleGestureDetector,
    mTouchSlop: Double,
    mVelocityTracker: js.Any,
    onTouchEvent: MotionEvent => Boolean,
    setOnGestureListener: OnGestureListener => Unit
  ): GestureDetector_ = {
    val __obj = js.Dynamic.literal(getActiveX = js.Any.fromFunction1(getActiveX), getActiveY = js.Any.fromFunction1(getActiveY), isDragging = js.Any.fromFunction0(isDragging), isScaling = js.Any.fromFunction0(isScaling), mActivePointerId = mActivePointerId.asInstanceOf[js.Any], mActivePointerIndex = mActivePointerIndex.asInstanceOf[js.Any], mIsDragging = mIsDragging.asInstanceOf[js.Any], mLastTouchX = mLastTouchX.asInstanceOf[js.Any], mLastTouchY = mLastTouchY.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMinimumVelocity = mMinimumVelocity.asInstanceOf[js.Any], mScaleDetector = mScaleDetector.asInstanceOf[js.Any], mTouchSlop = mTouchSlop.asInstanceOf[js.Any], mVelocityTracker = mVelocityTracker.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setOnGestureListener = js.Any.fromFunction1(setOnGestureListener))
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
    def setGetActiveX(value: MotionEvent => Double): Self = this.set("getActiveX", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActiveY(value: MotionEvent => Double): Self = this.set("getActiveY", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDragging(value: () => Boolean): Self = this.set("isDragging", js.Any.fromFunction0(value))
    @scala.inline
    def setIsScaling(value: () => Boolean): Self = this.set("isScaling", js.Any.fromFunction0(value))
    @scala.inline
    def setMActivePointerId(value: js.Any): Self = this.set("mActivePointerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMActivePointerIndex(value: js.Any): Self = this.set("mActivePointerIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIsDragging(value: js.Any): Self = this.set("mIsDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setMLastTouchX(value: Double): Self = this.set("mLastTouchX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMLastTouchY(value: Double): Self = this.set("mLastTouchY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMListener(value: OnGestureListener): Self = this.set("mListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setMMinimumVelocity(value: Double): Self = this.set("mMinimumVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMScaleDetector(value: ScaleGestureDetector): Self = this.set("mScaleDetector", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTouchSlop(value: Double): Self = this.set("mTouchSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMVelocityTracker(value: js.Any): Self = this.set("mVelocityTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = this.set("onTouchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOnGestureListener(value: OnGestureListener => Unit): Self = this.set("setOnGestureListener", js.Any.fromFunction1(value))
  }
  
}

