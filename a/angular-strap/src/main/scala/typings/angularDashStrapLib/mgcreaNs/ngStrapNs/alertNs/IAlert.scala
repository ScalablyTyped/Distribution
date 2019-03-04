package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.alertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlert extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object IAlert {
  @scala.inline
  def apply(
    $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): IAlert = {
    val __obj = js.Dynamic.literal($promise = $promise, hide = hide, show = show, toggle = toggle)
  
    __obj.asInstanceOf[IAlert]
  }
}

