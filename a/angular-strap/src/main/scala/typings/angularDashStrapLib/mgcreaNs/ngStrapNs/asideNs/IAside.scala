package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.asideNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAside extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object IAside {
  @scala.inline
  def apply(
    $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): IAside = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$promise")($promise)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[IAside]
  }
}

