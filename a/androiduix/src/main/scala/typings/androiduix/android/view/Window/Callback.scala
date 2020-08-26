package typings.androiduix.android.view.Window

import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.WindowManager.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  def onAttachedToWindow(): Unit = js.native
  def onContentChanged(): Unit = js.native
  def onDetachedFromWindow(): Unit = js.native
  def onWindowAttributesChanged(attrs: LayoutParams): Unit = js.native
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
    onWindowAttributesChanged: LayoutParams => Unit,
    onWindowFocusChanged: Boolean => Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(dispatchGenericMotionEvent = js.Any.fromFunction1(dispatchGenericMotionEvent), dispatchKeyEvent = js.Any.fromFunction1(dispatchKeyEvent), dispatchTouchEvent = js.Any.fromFunction1(dispatchTouchEvent), onAttachedToWindow = js.Any.fromFunction0(onAttachedToWindow), onContentChanged = js.Any.fromFunction0(onContentChanged), onDetachedFromWindow = js.Any.fromFunction0(onDetachedFromWindow), onWindowAttributesChanged = js.Any.fromFunction1(onWindowAttributesChanged), onWindowFocusChanged = js.Any.fromFunction1(onWindowFocusChanged))
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispatchGenericMotionEvent(value: MotionEvent => Boolean): Self = this.set("dispatchGenericMotionEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setDispatchKeyEvent(value: KeyEvent => Boolean): Self = this.set("dispatchKeyEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setDispatchTouchEvent(value: MotionEvent => Boolean): Self = this.set("dispatchTouchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setOnAttachedToWindow(value: () => Unit): Self = this.set("onAttachedToWindow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnContentChanged(value: () => Unit): Self = this.set("onContentChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDetachedFromWindow(value: () => Unit): Self = this.set("onDetachedFromWindow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnWindowAttributesChanged(value: LayoutParams => Unit): Self = this.set("onWindowAttributesChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setOnWindowFocusChanged(value: Boolean => Unit): Self = this.set("onWindowFocusChanged", js.Any.fromFunction1(value))
  }
  
}

