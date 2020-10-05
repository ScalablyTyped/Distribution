package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterViewChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): Unit = js.native
}

object AfterViewChecked {
  @scala.inline
  def apply(ngAfterViewChecked: () => Unit): AfterViewChecked = {
    val __obj = js.Dynamic.literal(ngAfterViewChecked = js.Any.fromFunction0(ngAfterViewChecked))
    __obj.asInstanceOf[AfterViewChecked]
  }
  @scala.inline
  implicit class AfterViewCheckedOps[Self <: AfterViewChecked] (val x: Self) extends AnyVal {
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
    def setNgAfterViewChecked(value: () => Unit): Self = this.set("ngAfterViewChecked", js.Any.fromFunction0(value))
  }
  
}

