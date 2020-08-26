package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterContentInit extends js.Object {
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of all of the directive's
    * content.
    * It is invoked only once when the directive is instantiated.
    */
  def ngAfterContentInit(): Unit = js.native
}

object AfterContentInit {
  @scala.inline
  def apply(ngAfterContentInit: () => Unit): AfterContentInit = {
    val __obj = js.Dynamic.literal(ngAfterContentInit = js.Any.fromFunction0(ngAfterContentInit))
    __obj.asInstanceOf[AfterContentInit]
  }
  @scala.inline
  implicit class AfterContentInitOps[Self <: AfterContentInit] (val x: Self) extends AnyVal {
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
    def setNgAfterContentInit(value: () => Unit): Self = this.set("ngAfterContentInit", js.Any.fromFunction0(value))
  }
  
}

