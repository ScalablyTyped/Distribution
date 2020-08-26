package typings.atlassianConnectJs.AP.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  def on(name: String, callback: js.Function0[Unit]): Unit = js.native
}

object Dialog {
  @scala.inline
  def apply(on: (String, js.Function0[Unit]) => Unit): Dialog = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Dialog]
  }
  @scala.inline
  implicit class DialogOps[Self <: Dialog] (val x: Self) extends AnyVal {
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
    def setOn(value: (String, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}

