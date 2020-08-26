package typings.androiduix.android.widget.PopupWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDismissListener extends js.Object {
  def onDismiss(): Unit = js.native
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: () => Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[OnDismissListener]
  }
  @scala.inline
  implicit class OnDismissListenerOps[Self <: OnDismissListener] (val x: Self) extends AnyVal {
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
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
  }
  
}

