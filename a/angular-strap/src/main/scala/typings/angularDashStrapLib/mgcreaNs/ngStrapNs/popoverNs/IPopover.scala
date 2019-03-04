package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.popoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopover extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object IPopover {
  @scala.inline
  def apply(
    $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): IPopover = {
    val __obj = js.Dynamic.literal($promise = $promise, hide = hide, show = show, toggle = toggle)
  
    __obj.asInstanceOf[IPopover]
  }
}

