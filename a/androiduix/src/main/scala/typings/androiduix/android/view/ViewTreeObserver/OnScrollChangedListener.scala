package typings.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnScrollChangedListener extends js.Object {
  def onScrollChanged(): js.Any = js.native
}

object OnScrollChangedListener {
  @scala.inline
  def apply(onScrollChanged: () => js.Any): OnScrollChangedListener = {
    val __obj = js.Dynamic.literal(onScrollChanged = js.Any.fromFunction0(onScrollChanged))
    __obj.asInstanceOf[OnScrollChangedListener]
  }
  @scala.inline
  implicit class OnScrollChangedListenerOps[Self <: OnScrollChangedListener] (val x: Self) extends AnyVal {
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
    def setOnScrollChanged(value: () => js.Any): Self = this.set("onScrollChanged", js.Any.fromFunction0(value))
  }
  
}

