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
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    down: js.Function1[SpinEvent, scala.Unit],
    first: js.Function1[SpinEvent, scala.Unit],
    last: js.Function1[SpinEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    up: js.Function1[SpinEvent, scala.Unit]
  ): XSpinListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, down = down, first = first, last = last, queryInterface = queryInterface, release = release, up = up)
  
    __obj.asInstanceOf[XSpinListener]
  }
}

