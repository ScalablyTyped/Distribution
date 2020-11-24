package typings.androiduix.android.view

import typings.androiduix.android.view.KeyEvent.Callback
import typings.androiduix.android.view.KeyEvent.DispatcherState
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyEvent_ extends js.Object {
  
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
