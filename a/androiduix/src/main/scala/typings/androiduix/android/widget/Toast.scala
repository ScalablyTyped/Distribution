package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.View
import typings.androiduix.android.view.Window
import typings.androiduix.android.view.WindowManager
import typings.androiduix.android.widget.Toast.TN
import typings.androiduix.java_.lang.Runnable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toast extends StObject {
  
  def cancel(): Unit = js.native
  
  def getDuration(): Double = js.native
  
  def getGravity(): Double = js.native
  
  def getView(): View = js.native
  
  def getXOffset(): Double = js.native
  
  def getYOffset(): Double = js.native
  
  var mContext: Context = js.native
  
  var mDelayHide: js.Any = js.native
  
  var mDuration: Double = js.native
  
  var mHandler: js.Any = js.native
  
  var mNextView: View = js.native
  
  var mTN: TN = js.native
  
  def setDuration(duration: Double): Unit = js.native
  
  def setGravity(gravity: Double, xOffset: Double, yOffset: Double): Unit = js.native
  
  def setText(s: String): Unit = js.native
  
  def setView(view: View): Unit = js.native
  
  def show(): Unit = js.native
}
object Toast {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    getDuration: () => Double,
    getGravity: () => Double,
    getView: () => View,
    getXOffset: () => Double,
    getYOffset: () => Double,
    mContext: Context,
    mDelayHide: js.Any,
    mDuration: Double,
    mHandler: js.Any,
    mNextView: View,
    mTN: TN,
    setDuration: Double => Unit,
    setGravity: (Double, Double, Double) => Unit,
    setText: String => Unit,
    setView: View => Unit,
    show: () => Unit
  ): Toast = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getDuration = js.Any.fromFunction0(getDuration), getGravity = js.Any.fromFunction0(getGravity), getView = js.Any.fromFunction0(getView), getXOffset = js.Any.fromFunction0(getXOffset), getYOffset = js.Any.fromFunction0(getYOffset), mContext = mContext.asInstanceOf[js.Any], mDelayHide = mDelayHide.asInstanceOf[js.Any], mDuration = mDuration.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mNextView = mNextView.asInstanceOf[js.Any], mTN = mTN.asInstanceOf[js.Any], setDuration = js.Any.fromFunction1(setDuration), setGravity = js.Any.fromFunction3(setGravity), setText = js.Any.fromFunction1(setText), setView = js.Any.fromFunction1(setView), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Toast]
  }
  
  @js.native
  trait TN extends StObject {
    
    def handleHide(): Unit = js.native
    
    def handleShow(): Unit = js.native
    
    def hide(): Unit = js.native
    
    var mGravity: Double = js.native
    
    var mHandler: Handler = js.native
    
    var mHide: Runnable = js.native
    
    var mNextView: View = js.native
    
    var mShow: Runnable = js.native
    
    var mView: View = js.native
    
    var mWM: WindowManager = js.native
    
    var mWindow: Window = js.native
    
    var mX: Double = js.native
    
    var mY: Double = js.native
    
    def show(): Unit = js.native
  }
  object TN {
    
    @scala.inline
    def apply(
      handleHide: () => Unit,
      handleShow: () => Unit,
      hide: () => Unit,
      mGravity: Double,
      mHandler: Handler,
      mHide: Runnable,
      mNextView: View,
      mShow: Runnable,
      mView: View,
      mWM: WindowManager,
      mWindow: Window,
      mX: Double,
      mY: Double,
      show: () => Unit
    ): TN = {
      val __obj = js.Dynamic.literal(handleHide = js.Any.fromFunction0(handleHide), handleShow = js.Any.fromFunction0(handleShow), hide = js.Any.fromFunction0(hide), mGravity = mGravity.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHide = mHide.asInstanceOf[js.Any], mNextView = mNextView.asInstanceOf[js.Any], mShow = mShow.asInstanceOf[js.Any], mView = mView.asInstanceOf[js.Any], mWM = mWM.asInstanceOf[js.Any], mWindow = mWindow.asInstanceOf[js.Any], mX = mX.asInstanceOf[js.Any], mY = mY.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[TN]
    }
    
    @scala.inline
    implicit class TNMutableBuilder[Self <: TN] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleHide(value: () => Unit): Self = StObject.set(x, "handleHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleShow(value: () => Unit): Self = StObject.set(x, "handleShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMGravity(value: Double): Self = StObject.set(x, "mGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMHandler(value: Handler): Self = StObject.set(x, "mHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMHide(value: Runnable): Self = StObject.set(x, "mHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNextView(value: View): Self = StObject.set(x, "mNextView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMShow(value: Runnable): Self = StObject.set(x, "mShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMView(value: View): Self = StObject.set(x, "mView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMWM(value: WindowManager): Self = StObject.set(x, "mWM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMWindow(value: Window): Self = StObject.set(x, "mWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMX(value: Double): Self = StObject.set(x, "mX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMY(value: Double): Self = StObject.set(x, "mY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @scala.inline
  implicit class ToastMutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGravity(value: () => Double): Self = StObject.set(x, "getGravity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetView(value: () => View): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetXOffset(value: () => Double): Self = StObject.set(x, "getXOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYOffset(value: () => Double): Self = StObject.set(x, "getYOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMContext(value: Context): Self = StObject.set(x, "mContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDelayHide(value: js.Any): Self = StObject.set(x, "mDelayHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDuration(value: Double): Self = StObject.set(x, "mDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = StObject.set(x, "mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNextView(value: View): Self = StObject.set(x, "mNextView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTN(value: TN): Self = StObject.set(x, "mTN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGravity(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setGravity", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetView(value: View => Unit): Self = StObject.set(x, "setView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
