package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.popoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopover extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.IPromise[scala.Unit]
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object IPopover {
  @scala.inline
  def apply(
    $promise: angularLib.angularMod.IPromise[scala.Unit],
    hide: () => scala.Unit,
    show: () => scala.Unit,
    toggle: () => scala.Unit
  ): IPopover = {
    val __obj = js.Dynamic.literal($promise = $promise, hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[IPopover]
  }
}

