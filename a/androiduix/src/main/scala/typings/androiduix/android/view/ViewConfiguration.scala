package typings.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewConfiguration extends js.Object {
  
  var density: js.Any = js.native
  
  def getScaledDoubleTapSlop(): Double = js.native
  
  def getScaledDoubleTapTouchSlop(): Double = js.native
  
  def getScaledEdgeSlop(): Double = js.native
  
  def getScaledFadingEdgeLength(): Double = js.native
  
  def getScaledMaximumDrawingCacheSize(): Double = js.native
  
  def getScaledMaximumFlingVelocity(): Double = js.native
  
  def getScaledMinimumFlingVelocity(): Double = js.native
  
  def getScaledOverflingDistance(): Double = js.native
  
  def getScaledOverscrollDistance(): Double = js.native
  
  def getScaledPagingTouchSlop(): Double = js.native
  
  def getScaledScrollBarSize(): Double = js.native
  
  def getScaledTouchSlop(): Double = js.native
  
  def getScaledWindowTouchSlop(): Double = js.native
  
  var mDoubleTapSlop: Double = js.native
  
  var mDoubleTapTouchSlop: Double = js.native
  
  var mEdgeSlop: Double = js.native
  
  var mFadingEdgeLength: Double = js.native
  
  var mMaximumDrawingCacheSize: Double = js.native
  
  var mMaximumFlingVelocity: Double = js.native
  
  var mMinimumFlingVelocity: Double = js.native
  
  var mOverflingDistance: Double = js.native
  
  var mOverscrollDistance: Double = js.native
  
  var mPagingTouchSlop: Double = js.native
  
  var mScrollbarSize: Double = js.native
  
  var mTouchSlop: Double = js.native
  
  var mWindowTouchSlop: Double = js.native
  
  var sizeAndDensity: js.Any = js.native
}
object ViewConfiguration {
  
  @scala.inline
  def apply(
    density: js.Any,
    getScaledDoubleTapSlop: () => Double,
    getScaledDoubleTapTouchSlop: () => Double,
    getScaledEdgeSlop: () => Double,
    getScaledFadingEdgeLength: () => Double,
    getScaledMaximumDrawingCacheSize: () => Double,
    getScaledMaximumFlingVelocity: () => Double,
    getScaledMinimumFlingVelocity: () => Double,
    getScaledOverflingDistance: () => Double,
    getScaledOverscrollDistance: () => Double,
    getScaledPagingTouchSlop: () => Double,
    getScaledScrollBarSize: () => Double,
    getScaledTouchSlop: () => Double,
    getScaledWindowTouchSlop: () => Double,
    mDoubleTapSlop: Double,
    mDoubleTapTouchSlop: Double,
    mEdgeSlop: Double,
    mFadingEdgeLength: Double,
    mMaximumDrawingCacheSize: Double,
    mMaximumFlingVelocity: Double,
    mMinimumFlingVelocity: Double,
    mOverflingDistance: Double,
    mOverscrollDistance: Double,
    mPagingTouchSlop: Double,
    mScrollbarSize: Double,
    mTouchSlop: Double,
    mWindowTouchSlop: Double,
    sizeAndDensity: js.Any
  ): ViewConfiguration = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], getScaledDoubleTapSlop = js.Any.fromFunction0(getScaledDoubleTapSlop), getScaledDoubleTapTouchSlop = js.Any.fromFunction0(getScaledDoubleTapTouchSlop), getScaledEdgeSlop = js.Any.fromFunction0(getScaledEdgeSlop), getScaledFadingEdgeLength = js.Any.fromFunction0(getScaledFadingEdgeLength), getScaledMaximumDrawingCacheSize = js.Any.fromFunction0(getScaledMaximumDrawingCacheSize), getScaledMaximumFlingVelocity = js.Any.fromFunction0(getScaledMaximumFlingVelocity), getScaledMinimumFlingVelocity = js.Any.fromFunction0(getScaledMinimumFlingVelocity), getScaledOverflingDistance = js.Any.fromFunction0(getScaledOverflingDistance), getScaledOverscrollDistance = js.Any.fromFunction0(getScaledOverscrollDistance), getScaledPagingTouchSlop = js.Any.fromFunction0(getScaledPagingTouchSlop), getScaledScrollBarSize = js.Any.fromFunction0(getScaledScrollBarSize), getScaledTouchSlop = js.Any.fromFunction0(getScaledTouchSlop), getScaledWindowTouchSlop = js.Any.fromFunction0(getScaledWindowTouchSlop), mDoubleTapSlop = mDoubleTapSlop.asInstanceOf[js.Any], mDoubleTapTouchSlop = mDoubleTapTouchSlop.asInstanceOf[js.Any], mEdgeSlop = mEdgeSlop.asInstanceOf[js.Any], mFadingEdgeLength = mFadingEdgeLength.asInstanceOf[js.Any], mMaximumDrawingCacheSize = mMaximumDrawingCacheSize.asInstanceOf[js.Any], mMaximumFlingVelocity = mMaximumFlingVelocity.asInstanceOf[js.Any], mMinimumFlingVelocity = mMinimumFlingVelocity.asInstanceOf[js.Any], mOverflingDistance = mOverflingDistance.asInstanceOf[js.Any], mOverscrollDistance = mOverscrollDistance.asInstanceOf[js.Any], mPagingTouchSlop = mPagingTouchSlop.asInstanceOf[js.Any], mScrollbarSize = mScrollbarSize.asInstanceOf[js.Any], mTouchSlop = mTouchSlop.asInstanceOf[js.Any], mWindowTouchSlop = mWindowTouchSlop.asInstanceOf[js.Any], sizeAndDensity = sizeAndDensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewConfiguration]
  }
  
  @scala.inline
  implicit class ViewConfigurationOps[Self <: ViewConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDensity(value: js.Any): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetScaledDoubleTapSlop(value: () => Double): Self = this.set("getScaledDoubleTapSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledDoubleTapTouchSlop(value: () => Double): Self = this.set("getScaledDoubleTapTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledEdgeSlop(value: () => Double): Self = this.set("getScaledEdgeSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledFadingEdgeLength(value: () => Double): Self = this.set("getScaledFadingEdgeLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledMaximumDrawingCacheSize(value: () => Double): Self = this.set("getScaledMaximumDrawingCacheSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledMaximumFlingVelocity(value: () => Double): Self = this.set("getScaledMaximumFlingVelocity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledMinimumFlingVelocity(value: () => Double): Self = this.set("getScaledMinimumFlingVelocity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledOverflingDistance(value: () => Double): Self = this.set("getScaledOverflingDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledOverscrollDistance(value: () => Double): Self = this.set("getScaledOverscrollDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledPagingTouchSlop(value: () => Double): Self = this.set("getScaledPagingTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledScrollBarSize(value: () => Double): Self = this.set("getScaledScrollBarSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledTouchSlop(value: () => Double): Self = this.set("getScaledTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledWindowTouchSlop(value: () => Double): Self = this.set("getScaledWindowTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMDoubleTapSlop(value: Double): Self = this.set("mDoubleTapSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapTouchSlop(value: Double): Self = this.set("mDoubleTapTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEdgeSlop(value: Double): Self = this.set("mEdgeSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFadingEdgeLength(value: Double): Self = this.set("mFadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaximumDrawingCacheSize(value: Double): Self = this.set("mMaximumDrawingCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaximumFlingVelocity(value: Double): Self = this.set("mMaximumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMinimumFlingVelocity(value: Double): Self = this.set("mMinimumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOverflingDistance(value: Double): Self = this.set("mOverflingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOverscrollDistance(value: Double): Self = this.set("mOverscrollDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPagingTouchSlop(value: Double): Self = this.set("mPagingTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScrollbarSize(value: Double): Self = this.set("mScrollbarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchSlop(value: Double): Self = this.set("mTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMWindowTouchSlop(value: Double): Self = this.set("mWindowTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeAndDensity(value: js.Any): Self = this.set("sizeAndDensity", value.asInstanceOf[js.Any])
  }
}
