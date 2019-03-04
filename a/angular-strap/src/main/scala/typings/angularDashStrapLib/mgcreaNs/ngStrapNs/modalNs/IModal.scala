package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.modalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModal extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object IModal {
  @scala.inline
  def apply(
    $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): IModal = {
    val __obj = js.Dynamic.literal($promise = $promise, hide = hide, show = show, toggle = toggle)
  
    __obj.asInstanceOf[IModal]
  }
}

