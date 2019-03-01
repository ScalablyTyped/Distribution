package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** adjustment event emitted by adjustable objects. */
trait AdjustmentEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains the type of the adjustment event. */
  var Type: AdjustmentType
  /** contains the current value in the adjustment event. */
  var Value: scala.Double
}

object AdjustmentEvent {
  @scala.inline
  def apply(
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Type: AdjustmentType,
    Value: scala.Double
  ): AdjustmentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[AdjustmentEvent]
  }
}

