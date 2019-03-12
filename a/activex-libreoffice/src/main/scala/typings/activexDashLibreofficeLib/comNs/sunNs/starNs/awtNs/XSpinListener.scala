package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive spin events. */
trait XSpinListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the spin field is spun down. */
  def down(rEvent: SpinEvent): scala.Unit
  /** is invoked when the spin field is set to the lower value. */
  def first(rEvent: SpinEvent): scala.Unit
  /** is invoked when the spin field is set to the upper value. */
  def last(rEvent: SpinEvent): scala.Unit
  /** is invoked when the spin field is spun up. */
  def up(rEvent: SpinEvent): scala.Unit
}

object XSpinListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    down: SpinEvent => scala.Unit,
    first: SpinEvent => scala.Unit,
    last: SpinEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    up: SpinEvent => scala.Unit
  ): XSpinListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), down = js.Any.fromFunction1(down), first = js.Any.fromFunction1(first), last = js.Any.fromFunction1(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), up = js.Any.fromFunction1(up))
  
    __obj.asInstanceOf[XSpinListener]
  }
}

