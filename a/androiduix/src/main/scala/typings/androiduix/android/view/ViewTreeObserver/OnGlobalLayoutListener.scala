package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGlobalLayoutListener extends js.Object {
  def onGlobalLayout(): js.Any = js.native
}

object OnGlobalLayoutListener {
  @scala.inline
  def apply(onGlobalLayout: () => js.Any): OnGlobalLayoutListener = {
    val __obj = js.Dynamic.literal(onGlobalLayout = js.Any.fromFunction0(onGlobalLayout))
    __obj.asInstanceOf[OnGlobalLayoutListener]
  }
  @scala.inline
  implicit class OnGlobalLayoutListenerOps[Self <: OnGlobalLayoutListener] (val x: Self) extends AnyVal {
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
    def setOnGlobalLayout(value: () => js.Any): Self = this.set("onGlobalLayout", js.Any.fromFunction0(value))
  }
  
}

