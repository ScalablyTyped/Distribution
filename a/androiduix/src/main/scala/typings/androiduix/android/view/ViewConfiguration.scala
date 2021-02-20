package typings.androiduix.android.view

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewConfiguration extends StObject {
  
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
  implicit class ViewConfigurationMutableBuilder[Self <: ViewConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDensity(value: js.Any): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetScaledDoubleTapSlop(value: () => Double): Self = StObject.set(x, "getScaledDoubleTapSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledDoubleTapTouchSlop(value: () => Double): Self = StObject.set(x, "getScaledDoubleTapTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledEdgeSlop(value: () => Double): Self = StObject.set(x, "getScaledEdgeSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledFadingEdgeLength(value: () => Double): Self = StObject.set(x, "getScaledFadingEdgeLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledMaximumDrawingCacheSize(value: () => Double): Self = StObject.set(x, "getScaledMaximumDrawingCacheSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledMaximumFlingVelocity(value: () => Double): Self = StObject.set(x, "getScaledMaximumFlingVelocity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledMinimumFlingVelocity(value: () => Double): Self = StObject.set(x, "getScaledMinimumFlingVelocity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledOverflingDistance(value: () => Double): Self = StObject.set(x, "getScaledOverflingDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledOverscrollDistance(value: () => Double): Self = StObject.set(x, "getScaledOverscrollDistance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledPagingTouchSlop(value: () => Double): Self = StObject.set(x, "getScaledPagingTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledScrollBarSize(value: () => Double): Self = StObject.set(x, "getScaledScrollBarSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledTouchSlop(value: () => Double): Self = StObject.set(x, "getScaledTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaledWindowTouchSlop(value: () => Double): Self = StObject.set(x, "getScaledWindowTouchSlop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMDoubleTapSlop(value: Double): Self = StObject.set(x, "mDoubleTapSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDoubleTapTouchSlop(value: Double): Self = StObject.set(x, "mDoubleTapTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEdgeSlop(value: Double): Self = StObject.set(x, "mEdgeSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFadingEdgeLength(value: Double): Self = StObject.set(x, "mFadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaximumDrawingCacheSize(value: Double): Self = StObject.set(x, "mMaximumDrawingCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMaximumFlingVelocity(value: Double): Self = StObject.set(x, "mMaximumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMinimumFlingVelocity(value: Double): Self = StObject.set(x, "mMinimumFlingVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOverflingDistance(value: Double): Self = StObject.set(x, "mOverflingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOverscrollDistance(value: Double): Self = StObject.set(x, "mOverscrollDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPagingTouchSlop(value: Double): Self = StObject.set(x, "mPagingTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScrollbarSize(value: Double): Self = StObject.set(x, "mScrollbarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchSlop(value: Double): Self = StObject.set(x, "mTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMWindowTouchSlop(value: Double): Self = StObject.set(x, "mWindowTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeAndDensity(value: js.Any): Self = StObject.set(x, "sizeAndDensity", value.asInstanceOf[js.Any])
  }
}
