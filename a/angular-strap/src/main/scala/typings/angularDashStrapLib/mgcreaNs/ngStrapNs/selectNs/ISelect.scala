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
    active: scala.Double => scala.Double,
    hide: () => scala.Unit,
    select: scala.Double => scala.Unit,
    show: () => scala.Unit,
    update: js.Any => scala.Unit
  ): ISelect = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction1(active), hide = js.Any.fromFunction0(hide), select = js.Any.fromFunction1(select), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ISelect]
  }
}

