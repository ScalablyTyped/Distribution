package typings.androiduix.androidNs.viewNs

import typings.androiduix.Anon_Alt
import typings.androiduix.androidNs.viewNs.KeyEventNs.Callback
import typings.androiduix.androidNs.viewNs.KeyEventNs.DispatcherState
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.KeyEvent")
@js.native
class KeyEvent () extends js.Object {
  var _downingKeyEventMap: js.Any = js.native
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
  def dispatch(receiver: Callback): Boolean = js.native
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
  def startTracking(): Unit = js.native
}

/* static members */
@JSGlobal("android.view.KeyEvent")
@js.native
object KeyEvent extends js.Object {
  var ACTION_DOWN: Double = js.native
  var ACTION_UP: Double = js.native
  var FIX_MAP_KEYCODE: js.Any = js.native
  var FLAG_CANCELED: Double = js.native
  var FLAG_CANCELED_LONG_PRESS: Double = js.native
  var FLAG_LONG_PRESS: js.Any = js.native
  var FLAG_START_TRACKING: js.Any = js.native
  var FLAG_TRACKING: Double = js.native
  var KEYCODE_AT: Double = js.native
  var KEYCODE_Add: Double = js.native
  var KEYCODE_And: Double = js.native
  var KEYCODE_Asterisk: Double = js.native
  var KEYCODE_BACK: Double = js.native
  var KEYCODE_Backquote: Double = js.native
  var KEYCODE_Backslash: Double = js.native
  var KEYCODE_Backspace: Double = js.native
  var KEYCODE_CHANGE_ANDROID_CHROME: Anon_Alt = js.native
  var KEYCODE_Colon: Double = js.native
  var KEYCODE_Comma: Double = js.native
  var KEYCODE_DPAD_CENTER: Double = js.native
  var KEYCODE_DPAD_DOWN: Double = js.native
  var KEYCODE_DPAD_LEFT: Double = js.native
  var KEYCODE_DPAD_RIGHT: Double = js.native
  var KEYCODE_DPAD_UP: Double = js.native
  var KEYCODE_Del: Double = js.native
  var KEYCODE_Digit0: Double = js.native
  var KEYCODE_Digit1: Double = js.native
  var KEYCODE_Digit2: Double = js.native
  var KEYCODE_Digit3: Double = js.native
  var KEYCODE_Digit4: Double = js.native
  var KEYCODE_Digit5: Double = js.native
  var KEYCODE_Digit6: Double = js.native
  var KEYCODE_Digit7: Double = js.native
  var KEYCODE_Digit8: Double = js.native
  var KEYCODE_Digit9: Double = js.native
  var KEYCODE_Dollar: Double = js.native
  var KEYCODE_Double_Quotation: Double = js.native
  var KEYCODE_ENTER: Double = js.native
  var KEYCODE_ESCAPE: Double = js.native
  var KEYCODE_Equal: Double = js.native
  var KEYCODE_Exclamation: Double = js.native
  var KEYCODE_KeyA: Double = js.native
  var KEYCODE_KeyB: Double = js.native
  var KEYCODE_KeyC: Double = js.native
  var KEYCODE_KeyD: Double = js.native
  var KEYCODE_KeyE: Double = js.native
  var KEYCODE_KeyF: Double = js.native
  var KEYCODE_KeyG: Double = js.native
  var KEYCODE_KeyH: Double = js.native
  var KEYCODE_KeyI: Double = js.native
  var KEYCODE_KeyJ: Double = js.native
  var KEYCODE_KeyK: Double = js.native
  var KEYCODE_KeyL: Double = js.native
  var KEYCODE_KeyM: Double = js.native
  var KEYCODE_KeyN: Double = js.native
  var KEYCODE_KeyO: Double = js.native
  var KEYCODE_KeyP: Double = js.native
  var KEYCODE_KeyQ: Double = js.native
  var KEYCODE_KeyR: Double = js.native
  var KEYCODE_KeyS: Double = js.native
  var KEYCODE_KeyT: Double = js.native
  var KEYCODE_KeyU: Double = js.native
  var KEYCODE_KeyV: Double = js.native
  var KEYCODE_KeyW: Double = js.native
  var KEYCODE_KeyX: Double = js.native
  var KEYCODE_KeyY: Double = js.native
  var KEYCODE_KeyZ: Double = js.native
  var KEYCODE_Key_a: Double = js.native
  var KEYCODE_Key_b: Double = js.native
  var KEYCODE_Key_c: Double = js.native
  var KEYCODE_Key_d: Double = js.native
  var KEYCODE_Key_e: Double = js.native
  var KEYCODE_Key_f: Double = js.native
  var KEYCODE_Key_g: Double = js.native
  var KEYCODE_Key_h: Double = js.native
  var KEYCODE_Key_i: Double = js.native
  var KEYCODE_Key_j: Double = js.native
  var KEYCODE_Key_k: Double = js.native
  var KEYCODE_Key_l: Double = js.native
  var KEYCODE_Key_m: Double = js.native
  var KEYCODE_Key_n: Double = js.native
  var KEYCODE_Key_o: Double = js.native
  var KEYCODE_Key_p: Double = js.native
  var KEYCODE_Key_q: Double = js.native
  var KEYCODE_Key_r: Double = js.native
  var KEYCODE_Key_s: Double = js.native
  var KEYCODE_Key_t: Double = js.native
  var KEYCODE_Key_u: Double = js.native
  var KEYCODE_Key_v: Double = js.native
  var KEYCODE_Key_w: Double = js.native
  var KEYCODE_Key_x: Double = js.native
  var KEYCODE_Key_y: Double = js.native
  var KEYCODE_Key_z: Double = js.native
  var KEYCODE_LeftBracket: Double = js.native
  var KEYCODE_Left_Brace: Double = js.native
  var KEYCODE_Left_Parenthesis: Double = js.native
  var KEYCODE_LessThan: Double = js.native
  var KEYCODE_MENU: Double = js.native
  var KEYCODE_MOVE_END: Double = js.native
  var KEYCODE_MOVE_HOME: Double = js.native
  var KEYCODE_Minus: Double = js.native
  var KEYCODE_MoreThan: Double = js.native
  var KEYCODE_Or: Double = js.native
  var KEYCODE_PAGE_DOWN: Double = js.native
  var KEYCODE_PAGE_UP: Double = js.native
  var KEYCODE_Percent: Double = js.native
  var KEYCODE_Period: Double = js.native
  var KEYCODE_Power: Double = js.native
  var KEYCODE_Question: Double = js.native
  var KEYCODE_Quotation: Double = js.native
  var KEYCODE_RightBracket: Double = js.native
  var KEYCODE_Right_Brace: Double = js.native
  var KEYCODE_Right_Parenthesis: Double = js.native
  var KEYCODE_SPACE: Double = js.native
  var KEYCODE_Semicolon: Double = js.native
  var KEYCODE_Sharp: Double = js.native
  var KEYCODE_Slash: Double = js.native
  var KEYCODE_TAB: Double = js.native
  var KEYCODE_Tilde: Double = js.native
  var KEYCODE_Underline: Double = js.native
  var META_ALT_ON: Double = js.native
  var META_CTRL_ON: Double = js.native
  var META_MASK_SHIFT: Double = js.native
  var META_META_ON: Double = js.native
  var META_SHIFT_ON: Double = js.native
  def actionToString(action: Double): String = js.native
  def isConfirmKey(keyCode: Double): Boolean = js.native
  def keyCodeToString(keyCode: Double): String = js.native
  def obtain(action: Double, code: Double): KeyEvent = js.native
}

