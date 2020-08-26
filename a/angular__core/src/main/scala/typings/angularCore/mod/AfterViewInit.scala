package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterViewInit extends js.Object {
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of a component's view.
    * It is invoked only once when the view is instantiated.
    *
    */
  def ngAfterViewInit(): Unit = js.native
}

object AfterViewInit {
  @scala.inline
  def apply(ngAfterViewInit: () => Unit): AfterViewInit = {
    val __obj = js.Dynamic.literal(ngAfterViewInit = js.Any.fromFunction0(ngAfterViewInit))
    __obj.asInstanceOf[AfterViewInit]
  }
  @scala.inline
  implicit class AfterViewInitOps[Self <: AfterViewInit] (val x: Self) extends AnyVal {
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
    def setNgAfterViewInit(value: () => Unit): Self = this.set("ngAfterViewInit", js.Any.fromFunction0(value))
  }
  
}

