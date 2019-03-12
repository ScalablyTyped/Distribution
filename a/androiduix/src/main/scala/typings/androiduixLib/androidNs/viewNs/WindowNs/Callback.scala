package typings
package androiduixLib.androidNs.viewNs.WindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def dispatchGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def dispatchKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean
  def dispatchTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def onAttachedToWindow(): scala.Unit
  def onContentChanged(): scala.Unit
  def onDetachedFromWindow(): scala.Unit
  def onWindowAttributesChanged(attrs: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams): scala.Unit
  def onWindowFocusChanged(hasFocus: scala.Boolean): scala.Unit
}

object Callback {
  @scala.inline
  def apply(
    dispatchGenericMotionEvent: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean,
    dispatchKeyEvent: androiduixLib.androidNs.viewNs.KeyEvent => scala.Boolean,
    dispatchTouchEvent: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean,
    onAttachedToWindow: () => scala.Unit,
    onContentChanged: () => scala.Unit,
    onDetachedFromWindow: () => scala.Unit,
    onWindowAttributesChanged: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams => scala.Unit,
    onWindowFocusChanged: scala.Boolean => scala.Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(dispatchGenericMotionEvent = js.Any.fromFunction1(dispatchGenericMotionEvent), dispatchKeyEvent = js.Any.fromFunction1(dispatchKeyEvent), dispatchTouchEvent = js.Any.fromFunction1(dispatchTouchEvent), onAttachedToWindow = js.Any.fromFunction0(onAttachedToWindow), onContentChanged = js.Any.fromFunction0(onContentChanged), onDetachedFromWindow = js.Any.fromFunction0(onDetachedFromWindow), onWindowAttributesChanged = js.Any.fromFunction1(onWindowAttributesChanged), onWindowFocusChanged = js.Any.fromFunction1(onWindowFocusChanged))
  
    __obj.asInstanceOf[Callback]
  }
}

