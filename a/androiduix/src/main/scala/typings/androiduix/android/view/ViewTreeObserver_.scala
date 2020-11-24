package typings.androiduix.android.view

import typings.androiduix.android.view.ViewTreeObserver.OnDrawListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.view.ViewTreeObserver.OnPreDrawListener
import typings.androiduix.android.view.ViewTreeObserver.OnScrollChangedListener
import typings.androiduix.android.view.ViewTreeObserver.OnTouchModeChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewTreeObserver_ extends js.Object {
  
  def addOnDrawListener(listener: OnDrawListener): Unit = js.native
  
  def addOnGlobalLayoutListener(listener: OnGlobalLayoutListener): Unit = js.native
  
  def addOnPreDrawListener(listener: OnPreDrawListener): Unit = js.native
  
  def addOnScrollChangedListener(listener: OnScrollChangedListener): Unit = js.native
  
  def addOnTouchModeChangeListener(listener: OnTouchModeChangeListener): Unit = js.native
  
  /* private */ def checkIsAlive(): js.Any = js.native
  
  def dispatchOnDraw(): Unit = js.native
  
  def dispatchOnGlobalLayout(): Unit = js.native
  
  def dispatchOnPreDraw(): Boolean = js.native
  
  def dispatchOnScrollChanged(): Unit = js.native
  
  def dispatchOnTouchModeChanged(inTouchMode: Boolean): Unit = js.native
  
  def isAlive(): Boolean = js.native
  
  /* private */ def kill(): js.Any = js.native
  
  var mAlive: js.Any = js.native
  
  var mOnDrawListeners: js.Any = js.native
  
  var mOnGlobalLayoutListeners: js.Any = js.native
  
  var mOnPreDrawListeners: js.Any = js.native
  
  var mOnScrollChangedListeners: js.Any = js.native
  
  var mOnTouchModeChangeListeners: js.Any = js.native
  
  def merge(observer: ViewTreeObserver): Unit = js.native
  
  def removeGlobalOnLayoutListener(victim: OnGlobalLayoutListener): Unit = js.native
  
  def removeOnDrawListener(victim: OnDrawListener): Unit = js.native
  
  def removeOnGlobalLayoutListener(victim: OnGlobalLayoutListener): Unit = js.native
  
  def removeOnPreDrawListener(victim: OnPreDrawListener): Unit = js.native
  
  def removeOnScrollChangedListener(victim: OnScrollChangedListener): Unit = js.native
  
  def removeOnTouchModeChangeListener(victim: OnTouchModeChangeListener): Unit = js.native
}
object ViewTreeObserver_ {
  
  @scala.inline
  def apply(
    addOnDrawListener: OnDrawListener => Unit,
    addOnGlobalLayoutListener: OnGlobalLayoutListener => Unit,
    addOnPreDrawListener: OnPreDrawListener => Unit,
    addOnScrollChangedListener: OnScrollChangedListener => Unit,
    addOnTouchModeChangeListener: OnTouchModeChangeListener => Unit,
    checkIsAlive: () => js.Any,
    dispatchOnDraw: () => Unit,
    dispatchOnGlobalLayout: () => Unit,
    dispatchOnPreDraw: () => Boolean,
    dispatchOnScrollChanged: () => Unit,
    dispatchOnTouchModeChanged: Boolean => Unit,
    isAlive: () => Boolean,
    kill: () => js.Any,
    mAlive: js.Any,
    mOnDrawListeners: js.Any,
    mOnGlobalLayoutListeners: js.Any,
    mOnPreDrawListeners: js.Any,
    mOnScrollChangedListeners: js.Any,
    mOnTouchModeChangeListeners: js.Any,
    merge: ViewTreeObserver => Unit,
    removeGlobalOnLayoutListener: OnGlobalLayoutListener => Unit,
    removeOnDrawListener: OnDrawListener => Unit,
    removeOnGlobalLayoutListener: OnGlobalLayoutListener => Unit,
    removeOnPreDrawListener: OnPreDrawListener => Unit,
    removeOnScrollChangedListener: OnScrollChangedListener => Unit,
    removeOnTouchModeChangeListener: OnTouchModeChangeListener => Unit
  ): ViewTreeObserver_ = {
    val __obj = js.Dynamic.literal(addOnDrawListener = js.Any.fromFunction1(addOnDrawListener), addOnGlobalLayoutListener = js.Any.fromFunction1(addOnGlobalLayoutListener), addOnPreDrawListener = js.Any.fromFunction1(addOnPreDrawListener), addOnScrollChangedListener = js.Any.fromFunction1(addOnScrollChangedListener), addOnTouchModeChangeListener = js.Any.fromFunction1(addOnTouchModeChangeListener), checkIsAlive = js.Any.fromFunction0(checkIsAlive), dispatchOnDraw = js.Any.fromFunction0(dispatchOnDraw), dispatchOnGlobalLayout = js.Any.fromFunction0(dispatchOnGlobalLayout), dispatchOnPreDraw = js.Any.fromFunction0(dispatchOnPreDraw), dispatchOnScrollChanged = js.Any.fromFunction0(dispatchOnScrollChanged), dispatchOnTouchModeChanged = js.Any.fromFunction1(dispatchOnTouchModeChanged), isAlive = js.Any.fromFunction0(isAlive), kill = js.Any.fromFunction0(kill), mAlive = mAlive.asInstanceOf[js.Any], mOnDrawListeners = mOnDrawListeners.asInstanceOf[js.Any], mOnGlobalLayoutListeners = mOnGlobalLayoutListeners.asInstanceOf[js.Any], mOnPreDrawListeners = mOnPreDrawListeners.asInstanceOf[js.Any], mOnScrollChangedListeners = mOnScrollChangedListeners.asInstanceOf[js.Any], mOnTouchModeChangeListeners = mOnTouchModeChangeListeners.asInstanceOf[js.Any], merge = js.Any.fromFunction1(merge), removeGlobalOnLayoutListener = js.Any.fromFunction1(removeGlobalOnLayoutListener), removeOnDrawListener = js.Any.fromFunction1(removeOnDrawListener), removeOnGlobalLayoutListener = js.Any.fromFunction1(removeOnGlobalLayoutListener), removeOnPreDrawListener = js.Any.fromFunction1(removeOnPreDrawListener), removeOnScrollChangedListener = js.Any.fromFunction1(removeOnScrollChangedListener), removeOnTouchModeChangeListener = js.Any.fromFunction1(removeOnTouchModeChangeListener))
    __obj.asInstanceOf[ViewTreeObserver_]
  }
  
  @scala.inline
  implicit class ViewTreeObserver_Ops[Self <: ViewTreeObserver_] (val x: Self) extends AnyVal {
    
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
    def setAddOnDrawListener(value: OnDrawListener => Unit): Self = this.set("addOnDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnGlobalLayoutListener(value: OnGlobalLayoutListener => Unit): Self = this.set("addOnGlobalLayoutListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnPreDrawListener(value: OnPreDrawListener => Unit): Self = this.set("addOnPreDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnScrollChangedListener(value: OnScrollChangedListener => Unit): Self = this.set("addOnScrollChangedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnTouchModeChangeListener(value: OnTouchModeChangeListener => Unit): Self = this.set("addOnTouchModeChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckIsAlive(value: () => js.Any): Self = this.set("checkIsAlive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnDraw(value: () => Unit): Self = this.set("dispatchOnDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnGlobalLayout(value: () => Unit): Self = this.set("dispatchOnGlobalLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnPreDraw(value: () => Boolean): Self = this.set("dispatchOnPreDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnScrollChanged(value: () => Unit): Self = this.set("dispatchOnScrollChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnTouchModeChanged(value: Boolean => Unit): Self = this.set("dispatchOnTouchModeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAlive(value: () => Boolean): Self = this.set("isAlive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKill(value: () => js.Any): Self = this.set("kill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAlive(value: js.Any): Self = this.set("mAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnDrawListeners(value: js.Any): Self = this.set("mOnDrawListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnGlobalLayoutListeners(value: js.Any): Self = this.set("mOnGlobalLayoutListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnPreDrawListeners(value: js.Any): Self = this.set("mOnPreDrawListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnScrollChangedListeners(value: js.Any): Self = this.set("mOnScrollChangedListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnTouchModeChangeListeners(value: js.Any): Self = this.set("mOnTouchModeChangeListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: ViewTreeObserver => Unit): Self = this.set("merge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveGlobalOnLayoutListener(value: OnGlobalLayoutListener => Unit): Self = this.set("removeGlobalOnLayoutListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnDrawListener(value: OnDrawListener => Unit): Self = this.set("removeOnDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnGlobalLayoutListener(value: OnGlobalLayoutListener => Unit): Self = this.set("removeOnGlobalLayoutListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnPreDrawListener(value: OnPreDrawListener => Unit): Self = this.set("removeOnPreDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnScrollChangedListener(value: OnScrollChangedListener => Unit): Self = this.set("removeOnScrollChangedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnTouchModeChangeListener(value: OnTouchModeChangeListener => Unit): Self = this.set("removeOnTouchModeChangeListener", js.Any.fromFunction1(value))
  }
}
