package typings.antd.anon

import typings.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  def destroy(args: js.Any*): Unit = js.native
  def update(newConfig: ModalFuncProps): Unit = js.native
}

object Update {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Unit, update: ModalFuncProps => Unit): Update = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
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
    def setDestroy(value: /* repeated */ js.Any => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ModalFuncProps => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

