package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive spin events. */
trait XSpinListener extends XEventListener {
  /** is invoked when the spin field is spun down. */
  def down(rEvent: SpinEvent): Unit
  /** is invoked when the spin field is set to the lower value. */
  def first(rEvent: SpinEvent): Unit
  /** is invoked when the spin field is set to the upper value. */
  def last(rEvent: SpinEvent): Unit
  /** is invoked when the spin field is spun up. */
  def up(rEvent: SpinEvent): Unit
}

object XSpinListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    down: SpinEvent => Unit,
    first: SpinEvent => Unit,
    last: SpinEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    up: SpinEvent => Unit
  ): XSpinListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), down = js.Any.fromFunction1(down), first = js.Any.fromFunction1(first), last = js.Any.fromFunction1(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[XSpinListener]
  }
}

