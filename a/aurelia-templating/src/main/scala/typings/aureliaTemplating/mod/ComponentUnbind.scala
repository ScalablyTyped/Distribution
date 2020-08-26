package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentUnbind extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic after the component is detached and unbound.
    */
  def unbind(): Unit = js.native
}

object ComponentUnbind {
  @scala.inline
  def apply(unbind: () => Unit): ComponentUnbind = {
    val __obj = js.Dynamic.literal(unbind = js.Any.fromFunction0(unbind))
    __obj.asInstanceOf[ComponentUnbind]
  }
  @scala.inline
  implicit class ComponentUnbindOps[Self <: ComponentUnbind] (val x: Self) extends AnyVal {
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
    def setUnbind(value: () => Unit): Self = this.set("unbind", js.Any.fromFunction0(value))
  }
  
}

