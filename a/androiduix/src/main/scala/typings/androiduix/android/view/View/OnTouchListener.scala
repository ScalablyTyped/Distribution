package typings.androiduix.android.view.View

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnTouchListener extends js.Object {
  def onTouch(v: typings.androiduix.android.view.View, event: MotionEvent): Unit = js.native
}

object OnTouchListener {
  @scala.inline
  def apply(onTouch: (typings.androiduix.android.view.View, MotionEvent) => Unit): OnTouchListener = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction2(onTouch))
    __obj.asInstanceOf[OnTouchListener]
  }
  @scala.inline
  implicit class OnTouchListenerOps[Self <: OnTouchListener] (val x: Self) extends AnyVal {
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
    def setOnTouch(value: (typings.androiduix.android.view.View, MotionEvent) => Unit): Self = this.set("onTouch", js.Any.fromFunction2(value))
  }
  
}

