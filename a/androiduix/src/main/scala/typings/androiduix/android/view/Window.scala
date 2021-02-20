package typings.androiduix.android.view

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.Window.Callback
import typings.androiduix.android.view.animation.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def addContentView(view: View, params: LayoutParams): Unit = js.native
  
  def addFlags(flags: Double): Unit = js.native
  
  def clearFlags(flags: Double): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def findViewById(id: String): View = js.native
  
  def getAttributes(): typings.androiduix.android.view.WindowManager.LayoutParams = js.native
  
  def getCallback(): Callback = js.native
  
  def getChildWindowManager(): WindowManager = js.native
  
  def getContainer(): WindowManager = js.native
  
  def getContentParent(): ViewGroup = js.native
  
  def getContext(): Context = js.native
  
  def getCurrentFocus(): View = js.native
  
  def getDecorView(): View = js.native
  
  def getLayoutInflater(): LayoutInflater = js.native
  
  /* private */ def initAttachInfo(): js.Any = js.native
  
  /* private */ def initDecorView(): js.Any = js.native
  
  def isActive(): Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def isFloating(): Boolean = js.native
  
  /* private */ def isOutOfBounds(context: js.Any, event: js.Any): js.Any = js.native
  
  var mAttachInfo: js.Any = js.native
  
  var mCallback: js.Any = js.native
  
  var mChildWindowManager: js.Any = js.native
  
  var mCloseOnTouchOutside: js.Any = js.native
  
  var mContainer: js.Any = js.native
  
  var mContentParent: js.Any = js.native
  
  var mContext: js.Any = js.native
  
  var mDecor: js.Any = js.native
  
  var mDestroyed: js.Any = js.native
  
  var mIsActive: js.Any = js.native
  
  var mSetCloseOnTouchOutside: js.Any = js.native
  
  var mWindowAttributes: js.Any = js.native
  
  def makeActive(): Unit = js.native
  
  /* protected */ def onActive(): Unit = js.native
  
  def peekDecorView(): View = js.native
  
  def setAttributes(a: typings.androiduix.android.view.WindowManager.LayoutParams): Unit = js.native
  
  def setBackgroundColor(color: Double): Unit = js.native
  
  def setBackgroundDrawable(drawable: Drawable): Unit = js.native
  
  def setCallback(callback: Callback): Unit = js.native
  
  def setChildWindowManager(wm: WindowManager): Unit = js.native
  
  def setCloseOnTouchOutside(close: Boolean): Unit = js.native
  
  def setCloseOnTouchOutsideIfNotSet(close: Boolean): Unit = js.native
  
  def setContainer(container: WindowManager): Unit = js.native
  
  def setContentView(view: View): Unit = js.native
  def setContentView(view: View, params: LayoutParams): Unit = js.native
  
  def setDimAmount(amount: Double): Unit = js.native
  
  def setFlags(flags: Double, mask: Double): Unit = js.native
  
  def setFloating(isFloating: Boolean): Unit = js.native
  
  def setGravity(gravity: Double): Unit = js.native
  
  def setLayout(width: Double, height: Double): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def setType(`type`: Double): Unit = js.native
  
  def setWindowAnimations(enterAnimation: Animation, exitAnimation: Animation): Unit = js.native
  def setWindowAnimations(
    enterAnimation: Animation,
    exitAnimation: Animation,
    resumeAnimation: js.UndefOr[scala.Nothing],
    hideAnimation: Animation
  ): Unit = js.native
  def setWindowAnimations(enterAnimation: Animation, exitAnimation: Animation, resumeAnimation: Animation): Unit = js.native
  def setWindowAnimations(
    enterAnimation: Animation,
    exitAnimation: Animation,
    resumeAnimation: Animation,
    hideAnimation: Animation
  ): Unit = js.native
  
  def shouldCloseOnTouch(context: Context, event: MotionEvent): Boolean = js.native
  
  def superDispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  
  def superDispatchKeyEvent(event: KeyEvent): Boolean = js.native
  
  def superDispatchTouchEvent(event: MotionEvent): Boolean = js.native
  
  def takeKeyEvents(_get: Boolean): Unit = js.native
}
object Window {
  
  @js.native
  trait Callback extends StObject {
    
    def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
    
    def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
    
    def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
    
    def onAttachedToWindow(): Unit = js.native
    
    def onContentChanged(): Unit = js.native
    
    def onDetachedFromWindow(): Unit = js.native
    
    def onWindowAttributesChanged(attrs: typings.androiduix.android.view.WindowManager.LayoutParams): Unit = js.native
    
    def onWindowFocusChanged(hasFocus: Boolean): Unit = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(
      dispatchGenericMotionEvent: MotionEvent => Boolean,
      dispatchKeyEvent: KeyEvent => Boolean,
      dispatchTouchEvent: MotionEvent => Boolean,
      onAttachedToWindow: () => Unit,
      onContentChanged: () => Unit,
      onDetachedFromWindow: () => Unit,
      onWindowAttributesChanged: typings.androiduix.android.view.WindowManager.LayoutParams => Unit,
      onWindowFocusChanged: Boolean => Unit
    ): Callback = {
      val __obj = js.Dynamic.literal(dispatchGenericMotionEvent = js.Any.fromFunction1(dispatchGenericMotionEvent), dispatchKeyEvent = js.Any.fromFunction1(dispatchKeyEvent), dispatchTouchEvent = js.Any.fromFunction1(dispatchTouchEvent), onAttachedToWindow = js.Any.fromFunction0(onAttachedToWindow), onContentChanged = js.Any.fromFunction0(onContentChanged), onDetachedFromWindow = js.Any.fromFunction0(onDetachedFromWindow), onWindowAttributesChanged = js.Any.fromFunction1(onWindowAttributesChanged), onWindowFocusChanged = js.Any.fromFunction1(onWindowFocusChanged))
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatchGenericMotionEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "dispatchGenericMotionEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchKeyEvent(value: KeyEvent => Boolean): Self = StObject.set(x, "dispatchKeyEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDispatchTouchEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "dispatchTouchEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAttachedToWindow(value: () => Unit): Self = StObject.set(x, "onAttachedToWindow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnContentChanged(value: () => Unit): Self = StObject.set(x, "onContentChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDetachedFromWindow(value: () => Unit): Self = StObject.set(x, "onDetachedFromWindow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnWindowAttributesChanged(value: typings.androiduix.android.view.WindowManager.LayoutParams => Unit): Self = StObject.set(x, "onWindowAttributesChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWindowFocusChanged(value: Boolean => Unit): Self = StObject.set(x, "onWindowFocusChanged", js.Any.fromFunction1(value))
    }
  }
}
