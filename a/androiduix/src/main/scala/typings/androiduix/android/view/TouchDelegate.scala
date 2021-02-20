package typings.androiduix.android.view

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchDelegate extends StObject {
  
  var mBounds: js.Any = js.native
  
  var mDelegateTargeted: js.Any = js.native
  
  var mDelegateView: js.Any = js.native
  
  var mSlop: js.Any = js.native
  
  var mSlopBounds: js.Any = js.native
  
  def onTouchEvent(event: MotionEvent): Boolean = js.native
}
object TouchDelegate {
  
  @scala.inline
  def apply(
    mBounds: js.Any,
    mDelegateTargeted: js.Any,
    mDelegateView: js.Any,
    mSlop: js.Any,
    mSlopBounds: js.Any,
    onTouchEvent: MotionEvent => Boolean
  ): TouchDelegate = {
    val __obj = js.Dynamic.literal(mBounds = mBounds.asInstanceOf[js.Any], mDelegateTargeted = mDelegateTargeted.asInstanceOf[js.Any], mDelegateView = mDelegateView.asInstanceOf[js.Any], mSlop = mSlop.asInstanceOf[js.Any], mSlopBounds = mSlopBounds.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent))
    __obj.asInstanceOf[TouchDelegate]
  }
  
  @scala.inline
  implicit class TouchDelegateMutableBuilder[Self <: TouchDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMBounds(value: js.Any): Self = StObject.set(x, "mBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDelegateTargeted(value: js.Any): Self = StObject.set(x, "mDelegateTargeted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDelegateView(value: js.Any): Self = StObject.set(x, "mDelegateView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSlop(value: js.Any): Self = StObject.set(x, "mSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSlopBounds(value: js.Any): Self = StObject.set(x, "mSlopBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction1(value))
  }
}
