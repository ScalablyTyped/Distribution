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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatchGenericMotionEvent")(dispatchGenericMotionEvent)
    __obj.updateDynamic("dispatchKeyEvent")(dispatchKeyEvent)
    __obj.updateDynamic("dispatchTouchEvent")(dispatchTouchEvent)
    __obj.updateDynamic("onAttachedToWindow")(onAttachedToWindow)
    __obj.updateDynamic("onContentChanged")(onContentChanged)
    __obj.updateDynamic("onDetachedFromWindow")(onDetachedFromWindow)
    __obj.updateDynamic("onWindowAttributesChanged")(onWindowAttributesChanged)
    __obj.updateDynamic("onWindowFocusChanged")(onWindowFocusChanged)
    __obj.asInstanceOf[Callback]
  }
}

