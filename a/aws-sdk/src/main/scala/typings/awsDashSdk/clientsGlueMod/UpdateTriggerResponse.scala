package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTriggerResponse extends js.Object {
  /**
    * The resulting trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Trigger] = js.undefined
}

object UpdateTriggerResponse {
  @scala.inline
  def apply(Trigger: Trigger = null): UpdateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Trigger != null) __obj.updateDynamic("Trigger")(Trigger)
    __obj.asInstanceOf[UpdateTriggerResponse]
  }
}

