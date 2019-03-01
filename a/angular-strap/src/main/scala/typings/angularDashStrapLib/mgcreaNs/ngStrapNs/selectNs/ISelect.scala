package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.selectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelect extends js.Object {
  def active(index: scala.Double): scala.Double
  def hide(): scala.Unit
  def select(index: scala.Double): scala.Unit
  def show(): scala.Unit
  def update(matches: js.Any): scala.Unit
}

object ISelect {
  @scala.inline
  def apply(
    active: js.Function1[scala.Double, scala.Double],
    hide: js.Function0[scala.Unit],
    select: js.Function1[scala.Double, scala.Unit],
    show: js.Function0[scala.Unit],
    update: js.Function1[js.Any, scala.Unit]
  ): ISelect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ISelect]
  }
}

