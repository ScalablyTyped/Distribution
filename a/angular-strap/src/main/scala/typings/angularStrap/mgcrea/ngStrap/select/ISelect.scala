package typings.angularStrap.mgcrea.ngStrap.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelect extends js.Object {
  def active(index: Double): Double
  def hide(): Unit
  def select(index: Double): Unit
  def show(): Unit
  def update(matches: js.Any): Unit
}

object ISelect {
  @scala.inline
  def apply(
    active: Double => Double,
    hide: () => Unit,
    select: Double => Unit,
    show: () => Unit,
    update: js.Any => Unit
  ): ISelect = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction1(active), hide = js.Any.fromFunction0(hide), select = js.Any.fromFunction1(select), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ISelect]
  }
}

