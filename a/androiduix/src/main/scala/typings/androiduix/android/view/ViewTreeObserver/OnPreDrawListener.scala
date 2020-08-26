package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPreDrawListener extends js.Object {
  def onPreDraw(): Boolean = js.native
}

object OnPreDrawListener {
  @scala.inline
  def apply(onPreDraw: () => Boolean): OnPreDrawListener = {
    val __obj = js.Dynamic.literal(onPreDraw = js.Any.fromFunction0(onPreDraw))
    __obj.asInstanceOf[OnPreDrawListener]
  }
  @scala.inline
  implicit class OnPreDrawListenerOps[Self <: OnPreDrawListener] (val x: Self) extends AnyVal {
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
    def setOnPreDraw(value: () => Boolean): Self = this.set("onPreDraw", js.Any.fromFunction0(value))
  }
  
}

