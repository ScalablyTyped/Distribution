package typings
package androiduixLib.androidNs.viewNs

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
  var mFlags: scala.Double = js.native
  var mIsTypingKey: scala.Boolean = js.native
  var mKeyCode: js.Any = js.native
  var mMetaKey: js.Any = js.native
  var mShiftKey: js.Any = js.native
  def dispatch(receiver: androiduixLib.androidNs.viewNs.KeyEventNs.Callback): scala.Boolean = js.native
  def dispatch(
    receiver: androiduixLib.androidNs.viewNs.KeyEventNs.Callback,
    state: androiduixLib.androidNs.viewNs.KeyEventNs.DispatcherState
  ): scala.Boolean = js.native
  def dispatch(
    receiver: androiduixLib.androidNs.viewNs.KeyEventNs.Callback,
    state: androiduixLib.androidNs.viewNs.KeyEventNs.DispatcherState,
    target: js.Any
  ): scala.Boolean = js.native
  def getAction(): scala.Double = js.native
  def getDownTime(): scala.Double = js.native
  def getEventTime(): scala.Double = js.native
  def getKeyCode(): scala.Double = js.native
  def getMetaState(): scala.Double = js.native
  def getRepeatCount(): scala.Double = js.native
  def hasModifiers(modifiers: scala.Double): scala.Boolean = js.native
  def hasNoModifiers(): scala.Boolean = js.native
  def initKeyEvent(keyEvent: stdLib.KeyboardEvent, action: scala.Double): scala.Unit = js.native
  def isAltPressed(): scala.Boolean = js.native
  def isCanceled(): scala.Boolean = js.native
  def isCtrlPressed(): scala.Boolean = js.native
  def isLongPress(): scala.Boolean = js.native
  def isMetaPressed(): scala.Boolean = js.native
  def isShiftPressed(): scala.Boolean = js.native
  def isTracking(): scala.Boolean = js.native
  def startTracking(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.KeyEvent")
@js.native
object KeyEvent extends js.Object {
  var ACTION_DOWN: scala.Double = js.native
  var ACTION_UP: scala.Double = js.native
  var FIX_MAP_KEYCODE: js.Any = js.native
  var FLAG_CANCELED: scala.Double = js.native
  var FLAG_CANCELED_LONG_PRESS: scala.Double = js.native
  var FLAG_LONG_PRESS: js.Any = js.native
  var FLAG_START_TRACKING: js.Any = js.native
  var FLAG_TRACKING: scala.Double = js.native
  var KEYCODE_AT: scala.Double = js.native
  var KEYCODE_Add: scala.Double = js.native
  var KEYCODE_And: scala.Double = js.native
  var KEYCODE_Asterisk: scala.Double = js.native
  var KEYCODE_BACK: scala.Double = js.native
  var KEYCODE_Backquote: scala.Double = js.native
  var KEYCODE_Backslash: scala.Double = js.native
  var KEYCODE_Backspace: scala.Double = js.native
  var KEYCODE_CHANGE_ANDROID_CHROME: androiduixLib.Anon_Alt = js.native
  var KEYCODE_Colon: scala.Double = js.native
  var KEYCODE_Comma: scala.Double = js.native
  var KEYCODE_DPAD_CENTER: scala.Double = js.native
  var KEYCODE_DPAD_DOWN: scala.Double = js.native
  var KEYCODE_DPAD_LEFT: scala.Double = js.native
  var KEYCODE_DPAD_RIGHT: scala.Double = js.native
  var KEYCODE_DPAD_UP: scala.Double = js.native
  var KEYCODE_Del: scala.Double = js.native
  var KEYCODE_Digit0: scala.Double = js.native
  var KEYCODE_Digit1: scala.Double = js.native
  var KEYCODE_Digit2: scala.Double = js.native
  var KEYCODE_Digit3: scala.Double = js.native
  var KEYCODE_Digit4: scala.Double = js.native
  var KEYCODE_Digit5: scala.Double = js.native
  var KEYCODE_Digit6: scala.Double = js.native
  var KEYCODE_Digit7: scala.Double = js.native
  var KEYCODE_Digit8: scala.Double = js.native
  var KEYCODE_Digit9: scala.Double = js.native
  var KEYCODE_Dollar: scala.Double = js.native
  var KEYCODE_Double_Quotation: scala.Double = js.native
  var KEYCODE_ENTER: scala.Double = js.native
  var KEYCODE_ESCAPE: scala.Double = js.native
  var KEYCODE_Equal: scala.Double = js.native
  var KEYCODE_Exclamation: scala.Double = js.native
  var KEYCODE_KeyA: scala.Double = js.native
  var KEYCODE_KeyB: scala.Double = js.native
  var KEYCODE_KeyC: scala.Double = js.native
  var KEYCODE_KeyD: scala.Double = js.native
  var KEYCODE_KeyE: scala.Double = js.native
  var KEYCODE_KeyF: scala.Double = js.native
  var KEYCODE_KeyG: scala.Double = js.native
  var KEYCODE_KeyH: scala.Double = js.native
  var KEYCODE_KeyI: scala.Double = js.native
  var KEYCODE_KeyJ: scala.Double = js.native
  var KEYCODE_KeyK: scala.Double = js.native
  var KEYCODE_KeyL: scala.Double = js.native
  var KEYCODE_KeyM: scala.Double = js.native
  var KEYCODE_KeyN: scala.Double = js.native
  var KEYCODE_KeyO: scala.Double = js.native
  var KEYCODE_KeyP: scala.Double = js.native
  var KEYCODE_KeyQ: scala.Double = js.native
  var KEYCODE_KeyR: scala.Double = js.native
  var KEYCODE_KeyS: scala.Double = js.native
  var KEYCODE_KeyT: scala.Double = js.native
  var KEYCODE_KeyU: scala.Double = js.native
  var KEYCODE_KeyV: scala.Double = js.native
  var KEYCODE_KeyW: scala.Double = js.native
  var KEYCODE_KeyX: scala.Double = js.native
  var KEYCODE_KeyY: scala.Double = js.native
  var KEYCODE_KeyZ: scala.Double = js.native
  var KEYCODE_Key_a: scala.Double = js.native
  var KEYCODE_Key_b: scala.Double = js.native
  var KEYCODE_Key_c: scala.Double = js.native
  var KEYCODE_Key_d: scala.Double = js.native
  var KEYCODE_Key_e: scala.Double = js.native
  var KEYCODE_Key_f: scala.Double = js.native
  var KEYCODE_Key_g: scala.Double = js.native
  var KEYCODE_Key_h: scala.Double = js.native
  var KEYCODE_Key_i: scala.Double = js.native
  var KEYCODE_Key_j: scala.Double = js.native
  var KEYCODE_Key_k: scala.Double = js.native
  var KEYCODE_Key_l: scala.Double = js.native
  var KEYCODE_Key_m: scala.Double = js.native
  var KEYCODE_Key_n: scala.Double = js.native
  var KEYCODE_Key_o: scala.Double = js.native
  var KEYCODE_Key_p: scala.Double = js.native
  var KEYCODE_Key_q: scala.Double = js.native
  var KEYCODE_Key_r: scala.Double = js.native
  var KEYCODE_Key_s: scala.Double = js.native
  var KEYCODE_Key_t: scala.Double = js.native
  var KEYCODE_Key_u: scala.Double = js.native
  var KEYCODE_Key_v: scala.Double = js.native
  var KEYCODE_Key_w: scala.Double = js.native
  var KEYCODE_Key_x: scala.Double = js.native
  var KEYCODE_Key_y: scala.Double = js.native
  var KEYCODE_Key_z: scala.Double = js.native
  var KEYCODE_LeftBracket: scala.Double = js.native
  var KEYCODE_Left_Brace: scala.Double = js.native
  var KEYCODE_Left_Parenthesis: scala.Double = js.native
  var KEYCODE_LessThan: scala.Double = js.native
  var KEYCODE_MENU: scala.Double = js.native
  var KEYCODE_MOVE_END: scala.Double = js.native
  var KEYCODE_MOVE_HOME: scala.Double = js.native
  var KEYCODE_Minus: scala.Double = js.native
  var KEYCODE_MoreThan: scala.Double = js.native
  var KEYCODE_Or: scala.Double = js.native
  var KEYCODE_PAGE_DOWN: scala.Double = js.native
  var KEYCODE_PAGE_UP: scala.Double = js.native
  var KEYCODE_Percent: scala.Double = js.native
  var KEYCODE_Period: scala.Double = js.native
  var KEYCODE_Power: scala.Double = js.native
  var KEYCODE_Question: scala.Double = js.native
  var KEYCODE_Quotation: scala.Double = js.native
  var KEYCODE_RightBracket: scala.Double = js.native
  var KEYCODE_Right_Brace: scala.Double = js.native
  var KEYCODE_Right_Parenthesis: scala.Double = js.native
  var KEYCODE_SPACE: scala.Double = js.native
  var KEYCODE_Semicolon: scala.Double = js.native
  var KEYCODE_Sharp: scala.Double = js.native
  var KEYCODE_Slash: scala.Double = js.native
  var KEYCODE_TAB: scala.Double = js.native
  var KEYCODE_Tilde: scala.Double = js.native
  var KEYCODE_Underline: scala.Double = js.native
  var META_ALT_ON: scala.Double = js.native
  var META_CTRL_ON: scala.Double = js.native
  var META_MASK_SHIFT: scala.Double = js.native
  var META_META_ON: scala.Double = js.native
  var META_SHIFT_ON: scala.Double = js.native
  def actionToString(action: scala.Double): java.lang.String = js.native
  def isConfirmKey(keyCode: scala.Double): scala.Boolean = js.native
  def keyCodeToString(keyCode: scala.Double): java.lang.String = js.native
  def obtain(action: scala.Double, code: scala.Double): androiduixLib.androidNs.viewNs.KeyEvent = js.native
}

