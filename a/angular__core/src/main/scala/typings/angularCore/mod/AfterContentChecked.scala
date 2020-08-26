package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterContentChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed checking all of the directive's
    * content.
    */
  def ngAfterContentChecked(): Unit = js.native
}

object AfterContentChecked {
  @scala.inline
  def apply(ngAfterContentChecked: () => Unit): AfterContentChecked = {
    val __obj = js.Dynamic.literal(ngAfterContentChecked = js.Any.fromFunction0(ngAfterContentChecked))
    __obj.asInstanceOf[AfterContentChecked]
  }
  @scala.inline
  implicit class AfterContentCheckedOps[Self <: AfterContentChecked] (val x: Self) extends AnyVal {
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
    def setNgAfterContentChecked(value: () => Unit): Self = this.set("ngAfterContentChecked", js.Any.fromFunction0(value))
  }
  
}

