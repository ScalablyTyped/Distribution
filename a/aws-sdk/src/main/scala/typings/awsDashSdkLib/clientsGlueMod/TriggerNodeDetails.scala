package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerNodeDetails extends js.Object {
  /**
    * The information of the trigger represented by the trigger node.
    */
  var Trigger: js.UndefOr[Trigger] = js.undefined
}

object TriggerNodeDetails {
  @scala.inline
  def apply(Trigger: Trigger = null): TriggerNodeDetails = {
    val __obj = js.Dynamic.literal()
    if (Trigger != null) __obj.updateDynamic("Trigger")(Trigger)
    __obj.asInstanceOf[TriggerNodeDetails]
  }
}

