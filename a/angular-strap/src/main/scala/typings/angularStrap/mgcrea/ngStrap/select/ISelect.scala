package typings.angularStrap.mgcrea.ngStrap.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelect extends js.Object {
  def active(index: Double): Double = js.native
  def hide(): Unit = js.native
  def select(index: Double): Unit = js.native
  def show(): Unit = js.native
  def update(matches: js.Any): Unit = js.native
}

object ISelect {
  @scala.inline
  def apply(
    active: Double => Double,
    hide: () => Unit,
    select: Double => Unit,
    show: () => Unit,
    update: js.Any => Unit
  ): ISelect = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction1(active), hide = js.Any.fromFunction0(hide), select = js.Any.fromFunction1(select), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ISelect]
  }
  @scala.inline
  implicit class ISelectOps[Self <: ISelect] (val x: Self) extends AnyVal {
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
    def setActive(value: Double => Double): Self = this.set("active", js.Any.fromFunction1(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: Double => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: js.Any => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

