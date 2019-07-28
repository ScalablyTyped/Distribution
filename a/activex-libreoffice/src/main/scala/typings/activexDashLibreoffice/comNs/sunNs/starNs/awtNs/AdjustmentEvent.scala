package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** adjustment event emitted by adjustable objects. */
trait AdjustmentEvent extends EventObject {
  /** contains the type of the adjustment event. */
  var Type: AdjustmentType
  /** contains the current value in the adjustment event. */
  var Value: Double
}

object AdjustmentEvent {
  @scala.inline
  def apply(Source: XInterface, Type: AdjustmentType, Value: Double): AdjustmentEvent = {
    val __obj = js.Dynamic.literal(Source = Source, Type = Type, Value = Value)
  
    __obj.asInstanceOf[AdjustmentEvent]
  }
}

