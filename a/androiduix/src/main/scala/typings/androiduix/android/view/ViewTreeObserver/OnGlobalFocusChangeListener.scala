package typings.androiduix.android.view.ViewTreeObserver

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGlobalFocusChangeListener extends js.Object {
  def onGlobalFocusChanged(oldFocus: View, newFocus: View): js.Any = js.native
}

object OnGlobalFocusChangeListener {
  @scala.inline
  def apply(onGlobalFocusChanged: (View, View) => js.Any): OnGlobalFocusChangeListener = {
    val __obj = js.Dynamic.literal(onGlobalFocusChanged = js.Any.fromFunction2(onGlobalFocusChanged))
    __obj.asInstanceOf[OnGlobalFocusChangeListener]
  }
  @scala.inline
  implicit class OnGlobalFocusChangeListenerOps[Self <: OnGlobalFocusChangeListener] (val x: Self) extends AnyVal {
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
    def setOnGlobalFocusChanged(value: (View, View) => js.Any): Self = this.set("onGlobalFocusChanged", js.Any.fromFunction2(value))
  }
  
}

