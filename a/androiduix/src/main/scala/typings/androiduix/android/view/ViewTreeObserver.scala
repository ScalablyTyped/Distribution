package typings.androiduix.android.view

import typings.androiduix.android.view.ViewTreeObserver.OnDrawListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.view.ViewTreeObserver.OnPreDrawListener
import typings.androiduix.android.view.ViewTreeObserver.OnScrollChangedListener
import typings.androiduix.android.view.ViewTreeObserver.OnTouchModeChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewTreeObserver extends StObject {
  
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
object ViewTreeObserver {
  
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
  ): ViewTreeObserver = {
    val __obj = js.Dynamic.literal(addOnDrawListener = js.Any.fromFunction1(addOnDrawListener), addOnGlobalLayoutListener = js.Any.fromFunction1(addOnGlobalLayoutListener), addOnPreDrawListener = js.Any.fromFunction1(addOnPreDrawListener), addOnScrollChangedListener = js.Any.fromFunction1(addOnScrollChangedListener), addOnTouchModeChangeListener = js.Any.fromFunction1(addOnTouchModeChangeListener), checkIsAlive = js.Any.fromFunction0(checkIsAlive), dispatchOnDraw = js.Any.fromFunction0(dispatchOnDraw), dispatchOnGlobalLayout = js.Any.fromFunction0(dispatchOnGlobalLayout), dispatchOnPreDraw = js.Any.fromFunction0(dispatchOnPreDraw), dispatchOnScrollChanged = js.Any.fromFunction0(dispatchOnScrollChanged), dispatchOnTouchModeChanged = js.Any.fromFunction1(dispatchOnTouchModeChanged), isAlive = js.Any.fromFunction0(isAlive), kill = js.Any.fromFunction0(kill), mAlive = mAlive.asInstanceOf[js.Any], mOnDrawListeners = mOnDrawListeners.asInstanceOf[js.Any], mOnGlobalLayoutListeners = mOnGlobalLayoutListeners.asInstanceOf[js.Any], mOnPreDrawListeners = mOnPreDrawListeners.asInstanceOf[js.Any], mOnScrollChangedListeners = mOnScrollChangedListeners.asInstanceOf[js.Any], mOnTouchModeChangeListeners = mOnTouchModeChangeListeners.asInstanceOf[js.Any], merge = js.Any.fromFunction1(merge), removeGlobalOnLayoutListener = js.Any.fromFunction1(removeGlobalOnLayoutListener), removeOnDrawListener = js.Any.fromFunction1(removeOnDrawListener), removeOnGlobalLayoutListener = js.Any.fromFunction1(removeOnGlobalLayoutListener), removeOnPreDrawListener = js.Any.fromFunction1(removeOnPreDrawListener), removeOnScrollChangedListener = js.Any.fromFunction1(removeOnScrollChangedListener), removeOnTouchModeChangeListener = js.Any.fromFunction1(removeOnTouchModeChangeListener))
    __obj.asInstanceOf[ViewTreeObserver]
  }
  
  @js.native
  trait OnDrawListener extends StObject {
    
    def onDraw(): js.Any = js.native
  }
  object OnDrawListener {
    
    @scala.inline
    def apply(onDraw: () => js.Any): OnDrawListener = {
      val __obj = js.Dynamic.literal(onDraw = js.Any.fromFunction0(onDraw))
      __obj.asInstanceOf[OnDrawListener]
    }
    
    @scala.inline
    implicit class OnDrawListenerMutableBuilder[Self <: OnDrawListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDraw(value: () => js.Any): Self = StObject.set(x, "onDraw", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnGlobalFocusChangeListener extends StObject {
    
    def onGlobalFocusChanged(oldFocus: View, newFocus: View): js.Any = js.native
  }
  object OnGlobalFocusChangeListener {
    
    @scala.inline
    def apply(onGlobalFocusChanged: (View, View) => js.Any): OnGlobalFocusChangeListener = {
      val __obj = js.Dynamic.literal(onGlobalFocusChanged = js.Any.fromFunction2(onGlobalFocusChanged))
      __obj.asInstanceOf[OnGlobalFocusChangeListener]
    }
    
    @scala.inline
    implicit class OnGlobalFocusChangeListenerMutableBuilder[Self <: OnGlobalFocusChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnGlobalFocusChanged(value: (View, View) => js.Any): Self = StObject.set(x, "onGlobalFocusChanged", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OnGlobalLayoutListener extends StObject {
    
    def onGlobalLayout(): js.Any = js.native
  }
  object OnGlobalLayoutListener {
    
    @scala.inline
    def apply(onGlobalLayout: () => js.Any): OnGlobalLayoutListener = {
      val __obj = js.Dynamic.literal(onGlobalLayout = js.Any.fromFunction0(onGlobalLayout))
      __obj.asInstanceOf[OnGlobalLayoutListener]
    }
    
    @scala.inline
    implicit class OnGlobalLayoutListenerMutableBuilder[Self <: OnGlobalLayoutListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnGlobalLayout(value: () => js.Any): Self = StObject.set(x, "onGlobalLayout", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnPreDrawListener extends StObject {
    
    def onPreDraw(): Boolean = js.native
  }
  object OnPreDrawListener {
    
    @scala.inline
    def apply(onPreDraw: () => Boolean): OnPreDrawListener = {
      val __obj = js.Dynamic.literal(onPreDraw = js.Any.fromFunction0(onPreDraw))
      __obj.asInstanceOf[OnPreDrawListener]
    }
    
    @scala.inline
    implicit class OnPreDrawListenerMutableBuilder[Self <: OnPreDrawListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPreDraw(value: () => Boolean): Self = StObject.set(x, "onPreDraw", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnScrollChangedListener extends StObject {
    
    def onScrollChanged(): js.Any = js.native
  }
  object OnScrollChangedListener {
    
    @scala.inline
    def apply(onScrollChanged: () => js.Any): OnScrollChangedListener = {
      val __obj = js.Dynamic.literal(onScrollChanged = js.Any.fromFunction0(onScrollChanged))
      __obj.asInstanceOf[OnScrollChangedListener]
    }
    
    @scala.inline
    implicit class OnScrollChangedListenerMutableBuilder[Self <: OnScrollChangedListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnScrollChanged(value: () => js.Any): Self = StObject.set(x, "onScrollChanged", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnTouchModeChangeListener extends StObject {
    
    def onTouchModeChanged(isInTouchMode: Boolean): js.Any = js.native
  }
  object OnTouchModeChangeListener {
    
    @scala.inline
    def apply(onTouchModeChanged: Boolean => js.Any): OnTouchModeChangeListener = {
      val __obj = js.Dynamic.literal(onTouchModeChanged = js.Any.fromFunction1(onTouchModeChanged))
      __obj.asInstanceOf[OnTouchModeChangeListener]
    }
    
    @scala.inline
    implicit class OnTouchModeChangeListenerMutableBuilder[Self <: OnTouchModeChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTouchModeChanged(value: Boolean => js.Any): Self = StObject.set(x, "onTouchModeChanged", js.Any.fromFunction1(value))
    }
  }
  
  @scala.inline
  implicit class ViewTreeObserverMutableBuilder[Self <: ViewTreeObserver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnDrawListener(value: OnDrawListener => Unit): Self = StObject.set(x, "addOnDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnGlobalLayoutListener(value: OnGlobalLayoutListener => Unit): Self = StObject.set(x, "addOnGlobalLayoutListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnPreDrawListener(value: OnPreDrawListener => Unit): Self = StObject.set(x, "addOnPreDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnScrollChangedListener(value: OnScrollChangedListener => Unit): Self = StObject.set(x, "addOnScrollChangedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddOnTouchModeChangeListener(value: OnTouchModeChangeListener => Unit): Self = StObject.set(x, "addOnTouchModeChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckIsAlive(value: () => js.Any): Self = StObject.set(x, "checkIsAlive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnDraw(value: () => Unit): Self = StObject.set(x, "dispatchOnDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnGlobalLayout(value: () => Unit): Self = StObject.set(x, "dispatchOnGlobalLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnPreDraw(value: () => Boolean): Self = StObject.set(x, "dispatchOnPreDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnScrollChanged(value: () => Unit): Self = StObject.set(x, "dispatchOnScrollChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatchOnTouchModeChanged(value: Boolean => Unit): Self = StObject.set(x, "dispatchOnTouchModeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAlive(value: () => Boolean): Self = StObject.set(x, "isAlive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKill(value: () => js.Any): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAlive(value: js.Any): Self = StObject.set(x, "mAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnDrawListeners(value: js.Any): Self = StObject.set(x, "mOnDrawListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnGlobalLayoutListeners(value: js.Any): Self = StObject.set(x, "mOnGlobalLayoutListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnPreDrawListeners(value: js.Any): Self = StObject.set(x, "mOnPreDrawListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnScrollChangedListeners(value: js.Any): Self = StObject.set(x, "mOnScrollChangedListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOnTouchModeChangeListeners(value: js.Any): Self = StObject.set(x, "mOnTouchModeChangeListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: ViewTreeObserver => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveGlobalOnLayoutListener(value: OnGlobalLayoutListener => Unit): Self = StObject.set(x, "removeGlobalOnLayoutListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnDrawListener(value: OnDrawListener => Unit): Self = StObject.set(x, "removeOnDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnGlobalLayoutListener(value: OnGlobalLayoutListener => Unit): Self = StObject.set(x, "removeOnGlobalLayoutListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnPreDrawListener(value: OnPreDrawListener => Unit): Self = StObject.set(x, "removeOnPreDrawListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnScrollChangedListener(value: OnScrollChangedListener => Unit): Self = StObject.set(x, "removeOnScrollChangedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveOnTouchModeChangeListener(value: OnTouchModeChangeListener => Unit): Self = StObject.set(x, "removeOnTouchModeChangeListener", js.Any.fromFunction1(value))
  }
}
