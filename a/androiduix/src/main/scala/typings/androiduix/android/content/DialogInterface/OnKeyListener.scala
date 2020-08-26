package typings.androiduix.android.content.DialogInterface

import typings.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnKeyListener extends js.Object {
  def onKey(dialog: typings.androiduix.android.content.DialogInterface, keyCode: Double, event: KeyEvent): Boolean = js.native
}

object OnKeyListener {
  @scala.inline
  def apply(onKey: (typings.androiduix.android.content.DialogInterface, Double, KeyEvent) => Boolean): OnKeyListener = {
    val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
    __obj.asInstanceOf[OnKeyListener]
  }
  @scala.inline
  implicit class OnKeyListenerOps[Self <: OnKeyListener] (val x: Self) extends AnyVal {
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
    def setOnKey(value: (typings.androiduix.android.content.DialogInterface, Double, KeyEvent) => Boolean): Self = this.set("onKey", js.Any.fromFunction3(value))
  }
  
}

