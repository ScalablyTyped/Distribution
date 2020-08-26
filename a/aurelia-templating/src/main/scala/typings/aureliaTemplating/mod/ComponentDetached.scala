package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDetached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
    */
  def detached(): Unit = js.native
}

object ComponentDetached {
  @scala.inline
  def apply(detached: () => Unit): ComponentDetached = {
    val __obj = js.Dynamic.literal(detached = js.Any.fromFunction0(detached))
    __obj.asInstanceOf[ComponentDetached]
  }
  @scala.inline
  implicit class ComponentDetachedOps[Self <: ComponentDetached] (val x: Self) extends AnyVal {
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
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
  }
  
}

