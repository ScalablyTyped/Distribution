package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustmentEvent]
  }
}

