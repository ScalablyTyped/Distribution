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
    dispatchGenericMotionEvent: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean],
    dispatchKeyEvent: js.Function1[androiduixLib.androidNs.viewNs.KeyEvent, scala.Boolean],
    dispatchTouchEvent: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean],
    onAttachedToWindow: js.Function0[scala.Unit],
    onContentChanged: js.Function0[scala.Unit],
    onDetachedFromWindow: js.Function0[scala.Unit],
    onWindowAttributesChanged: js.Function1[androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams, scala.Unit],
    onWindowFocusChanged: js.Function1[scala.Boolean, scala.Unit]
  ): Callback = {
    val __obj = js.Dynamic.literal(dispatchGenericMotionEvent = dispatchGenericMotionEvent, dispatchKeyEvent = dispatchKeyEvent, dispatchTouchEvent = dispatchTouchEvent, onAttachedToWindow = onAttachedToWindow, onContentChanged = onContentChanged, onDetachedFromWindow = onDetachedFromWindow, onWindowAttributesChanged = onWindowAttributesChanged, onWindowFocusChanged = onWindowFocusChanged)
  
    __obj.asInstanceOf[Callback]
  }
}

