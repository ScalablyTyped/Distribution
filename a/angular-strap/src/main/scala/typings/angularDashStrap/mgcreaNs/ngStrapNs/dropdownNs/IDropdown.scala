package typings.angularDashStrap.mgcreaNs.ngStrapNs.dropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdown extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def show(): Unit
}

object IDropdown {
  @scala.inline
  def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit): IDropdown = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[IDropdown]
  }
}

