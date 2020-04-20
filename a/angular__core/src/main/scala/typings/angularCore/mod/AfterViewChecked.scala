package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterViewChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): Unit
}

object AfterViewChecked {
  @scala.inline
  def apply(ngAfterViewChecked: () => Unit): AfterViewChecked = {
    val __obj = js.Dynamic.literal(ngAfterViewChecked = js.Any.fromFunction0(ngAfterViewChecked))
    __obj.asInstanceOf[AfterViewChecked]
  }
}

