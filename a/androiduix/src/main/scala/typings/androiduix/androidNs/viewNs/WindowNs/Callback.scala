package typings.androiduix.androidNs.viewNs.WindowNs

import typings.androiduix.androidNs.viewNs.KeyEvent
import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.viewNs.WindowManagerNs.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def dispatchGenericMotionEvent(event: MotionEvent): Boolean
  def dispatchKeyEvent(event: KeyEvent): Boolean
  def dispatchTouchEvent(event: MotionEvent): Boolean
  def onAttachedToWindow(): Unit
  def onContentChanged(): Unit
  def onDetachedFromWindow(): Unit
  def onWindowAttributesChanged(attrs: LayoutParams): Unit
  def onWindowFocusChanged(hasFocus: Boolean): Unit
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
    onWindowAttributesChanged: LayoutParams => Unit,
    onWindowFocusChanged: Boolean => Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(dispatchGenericMotionEvent = js.Any.fromFunction1(dispatchGenericMotionEvent), dispatchKeyEvent = js.Any.fromFunction1(dispatchKeyEvent), dispatchTouchEvent = js.Any.fromFunction1(dispatchTouchEvent), onAttachedToWindow = js.Any.fromFunction0(onAttachedToWindow), onContentChanged = js.Any.fromFunction0(onContentChanged), onDetachedFromWindow = js.Any.fromFunction0(onDetachedFromWindow), onWindowAttributesChanged = js.Any.fromFunction1(onWindowAttributesChanged), onWindowFocusChanged = js.Any.fromFunction1(onWindowFocusChanged))
  
    __obj.asInstanceOf[Callback]
  }
}

