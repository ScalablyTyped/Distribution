package typings.agGrid.floatingFilterWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilterWrapper[M] extends js.Object {
  def onParentModelChanged(parentModel: M): Unit = js.native
}

object IFloatingFilterWrapper {
  @scala.inline
  def apply[M](onParentModelChanged: M => Unit): IFloatingFilterWrapper[M] = {
    val __obj = js.Dynamic.literal(onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
    __obj.asInstanceOf[IFloatingFilterWrapper[M]]
  }
  @scala.inline
  implicit class IFloatingFilterWrapperOps[Self <: IFloatingFilterWrapper[_], M] (val x: Self with IFloatingFilterWrapper[M]) extends AnyVal {
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
    def setOnParentModelChanged(value: M => Unit): Self = this.set("onParentModelChanged", js.Any.fromFunction1(value))
  }
  
}

