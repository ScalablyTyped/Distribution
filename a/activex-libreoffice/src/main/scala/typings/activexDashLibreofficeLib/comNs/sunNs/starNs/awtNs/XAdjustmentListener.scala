package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive adjustment events. */
trait XAdjustmentListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the adjustment has changed. */
  def adjustmentValueChanged(rEvent: AdjustmentEvent): scala.Unit
}

