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

