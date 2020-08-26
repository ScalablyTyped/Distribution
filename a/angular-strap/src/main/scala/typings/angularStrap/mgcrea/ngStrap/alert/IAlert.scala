package typings.angularStrap.mgcrea.ngStrap.alert

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlert extends js.Object {
  @JSName("$promise")
  var $promise: IPromise[Unit] = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
  def toggle(): Unit = js.native
}

object IAlert {
  @scala.inline
  def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): IAlert = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[IAlert]
  }
  @scala.inline
  implicit class IAlertOps[Self <: IAlert] (val x: Self) extends AnyVal {
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
    def set$promise(value: IPromise[Unit]): Self = this.set("$promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

