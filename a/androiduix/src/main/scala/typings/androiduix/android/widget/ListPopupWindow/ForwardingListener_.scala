package typings.androiduix.android.widget.ListPopupWindow

import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnAttachStateChangeListener
import typings.androiduix.android.view.View.OnTouchListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingListener_
  extends OnTouchListener
     with OnAttachStateChangeListener {
  
  def getPopup(): typings.androiduix.android.widget.ListPopupWindow = js.native
  
  var mActivePointerId: js.Any = js.native
  
  var mDisallowIntercept: js.Any = js.native
  
  var mForwarding: js.Any = js.native
  
  var mScaledTouchSlop: js.Any = js.native
  
  var mSrc: js.Any = js.native
  
  var mTapTimeout: js.Any = js.native
  
  /* protected */ def onForwardingStarted(): Boolean = js.native
  
  /* protected */ def onForwardingStopped(): Boolean = js.native
  
  /* private */ def onTouchForwarded(srcEvent: js.Any): js.Any = js.native
  
  /* private */ def onTouchObserved(srcEvent: js.Any): js.Any = js.native
}
object ForwardingListener_ {
  
  @scala.inline
  def apply(
    getPopup: () => typings.androiduix.android.widget.ListPopupWindow,
    mActivePointerId: js.Any,
    mDisallowIntercept: js.Any,
    mForwarding: js.Any,
    mScaledTouchSlop: js.Any,
    mSrc: js.Any,
    mTapTimeout: js.Any,
    onForwardingStarted: () => Boolean,
    onForwardingStopped: () => Boolean,
    onTouch: (View, MotionEvent) => Unit,
    onTouchForwarded: js.Any => js.Any,
    onTouchObserved: js.Any => js.Any,
    onViewAttachedToWindow: View => js.Any,
    onViewDetachedFromWindow: View => js.Any
  ): ForwardingListener_ = {
    val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction0(getPopup), mActivePointerId = mActivePointerId.asInstanceOf[js.Any], mDisallowIntercept = mDisallowIntercept.asInstanceOf[js.Any], mForwarding = mForwarding.asInstanceOf[js.Any], mScaledTouchSlop = mScaledTouchSlop.asInstanceOf[js.Any], mSrc = mSrc.asInstanceOf[js.Any], mTapTimeout = mTapTimeout.asInstanceOf[js.Any], onForwardingStarted = js.Any.fromFunction0(onForwardingStarted), onForwardingStopped = js.Any.fromFunction0(onForwardingStopped), onTouch = js.Any.fromFunction2(onTouch), onTouchForwarded = js.Any.fromFunction1(onTouchForwarded), onTouchObserved = js.Any.fromFunction1(onTouchObserved), onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
    __obj.asInstanceOf[ForwardingListener_]
  }
  
  @scala.inline
  implicit class ForwardingListener_Ops[Self <: ForwardingListener_] (val x: Self) extends AnyVal {
    
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
    def setGetPopup(value: () => typings.androiduix.android.widget.ListPopupWindow): Self = this.set("getPopup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMActivePointerId(value: js.Any): Self = this.set("mActivePointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDisallowIntercept(value: js.Any): Self = this.set("mDisallowIntercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMForwarding(value: js.Any): Self = this.set("mForwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScaledTouchSlop(value: js.Any): Self = this.set("mScaledTouchSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSrc(value: js.Any): Self = this.set("mSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTapTimeout(value: js.Any): Self = this.set("mTapTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnForwardingStarted(value: () => Boolean): Self = this.set("onForwardingStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnForwardingStopped(value: () => Boolean): Self = this.set("onForwardingStopped", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchForwarded(value: js.Any => js.Any): Self = this.set("onTouchForwarded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchObserved(value: js.Any => js.Any): Self = this.set("onTouchObserved", js.Any.fromFunction1(value))
  }
}
