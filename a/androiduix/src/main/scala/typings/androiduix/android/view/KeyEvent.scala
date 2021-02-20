package typings.androiduix.android.view

import typings.androiduix.android.util.SparseArray
import typings.androiduix.android.view.KeyEvent.Callback
import typings.androiduix.android.view.KeyEvent.DispatcherState
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyEvent extends StObject {
  
  var _downingKeyEventMap: js.Any = js.native
  
  def dispatch(receiver: Callback): Boolean = js.native
  def dispatch(receiver: Callback, state: js.UndefOr[scala.Nothing], target: js.Any): Boolean = js.native
  def dispatch(receiver: Callback, state: DispatcherState): Boolean = js.native
  def dispatch(receiver: Callback, state: DispatcherState, target: js.Any): Boolean = js.native
  
  def getAction(): Double = js.native
  
  def getDownTime(): Double = js.native
  
  def getEventTime(): Double = js.native
  
  def getKeyCode(): Double = js.native
  
  def getMetaState(): Double = js.native
  
  def getRepeatCount(): Double = js.native
  
  def hasModifiers(modifiers: Double): Boolean = js.native
  
  def hasNoModifiers(): Boolean = js.native
  
  def initKeyEvent(keyEvent: KeyboardEvent, action: Double): Unit = js.native
  
  def isAltPressed(): Boolean = js.native
  
  def isCanceled(): Boolean = js.native
  
  def isCtrlPressed(): Boolean = js.native
  
  def isLongPress(): Boolean = js.native
  
  def isMetaPressed(): Boolean = js.native
  
  def isShiftPressed(): Boolean = js.native
  
  def isTracking(): Boolean = js.native
  
  var mAction: js.Any = js.native
  
  var mAltKey: js.Any = js.native
  
  var mCtrlKey: js.Any = js.native
  
  var mDownTime: js.Any = js.native
  
  var mEventTime: js.Any = js.native
  
  var mFlags: Double = js.native
  
  var mIsTypingKey: Boolean = js.native
  
  var mKeyCode: js.Any = js.native
  
  var mMetaKey: js.Any = js.native
  
  var mShiftKey: js.Any = js.native
  
  def startTracking(): Unit = js.native
}
object KeyEvent {
  
  @js.native
  trait Callback extends StObject {
    
    def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
    
    def onKeyLongPress(keyCode: Double, event: KeyEvent): Boolean = js.native
    
    def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(
      onKeyDown: (Double, KeyEvent) => Boolean,
      onKeyLongPress: (Double, KeyEvent) => Boolean,
      onKeyUp: (Double, KeyEvent) => Boolean
    ): Callback = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyLongPress = js.Any.fromFunction2(onKeyLongPress), onKeyUp = js.Any.fromFunction2(onKeyUp))
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnKeyDown(value: (Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyLongPress(value: (Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyLongPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUp(value: (Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DispatcherState extends StObject {
    
    def handleUpEvent(event: KeyEvent): Unit = js.native
    
    def isTracking(event: KeyEvent): Boolean = js.native
    
    var mActiveLongPresses: SparseArray[Double] = js.native
    
    var mDownKeyCode: Double = js.native
    
    var mDownTarget: js.Any = js.native
    
    def performedLongPress(event: KeyEvent): Unit = js.native
    
    def reset(target: js.Any): Unit = js.native
    
    def startTracking(event: KeyEvent, target: js.Any): Unit = js.native
  }
  object DispatcherState {
    
    @scala.inline
    def apply(
      handleUpEvent: KeyEvent => Unit,
      isTracking: KeyEvent => Boolean,
      mActiveLongPresses: SparseArray[Double],
      mDownKeyCode: Double,
      mDownTarget: js.Any,
      performedLongPress: KeyEvent => Unit,
      reset: js.Any => Unit,
      startTracking: (KeyEvent, js.Any) => Unit
    ): DispatcherState = {
      val __obj = js.Dynamic.literal(handleUpEvent = js.Any.fromFunction1(handleUpEvent), isTracking = js.Any.fromFunction1(isTracking), mActiveLongPresses = mActiveLongPresses.asInstanceOf[js.Any], mDownKeyCode = mDownKeyCode.asInstanceOf[js.Any], mDownTarget = mDownTarget.asInstanceOf[js.Any], performedLongPress = js.Any.fromFunction1(performedLongPress), reset = js.Any.fromFunction1(reset), startTracking = js.Any.fromFunction2(startTracking))
      __obj.asInstanceOf[DispatcherState]
    }
    
    @scala.inline
    implicit class DispatcherStateMutableBuilder[Self <: DispatcherState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleUpEvent(value: KeyEvent => Unit): Self = StObject.set(x, "handleUpEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsTracking(value: KeyEvent => Boolean): Self = StObject.set(x, "isTracking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMActiveLongPresses(value: SparseArray[Double]): Self = StObject.set(x, "mActiveLongPresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDownKeyCode(value: Double): Self = StObject.set(x, "mDownKeyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDownTarget(value: js.Any): Self = StObject.set(x, "mDownTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformedLongPress(value: KeyEvent => Unit): Self = StObject.set(x, "performedLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: js.Any => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartTracking(value: (KeyEvent, js.Any) => Unit): Self = StObject.set(x, "startTracking", js.Any.fromFunction2(value))
    }
  }
}
