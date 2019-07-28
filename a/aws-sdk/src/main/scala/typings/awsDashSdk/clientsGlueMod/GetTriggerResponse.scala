package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTriggerResponse extends js.Object {
  /**
    * The requested trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Trigger] = js.undefined
}

object GetTriggerResponse {
  @scala.inline
  def apply(Trigger: Trigger = null): GetTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Trigger != null) __obj.updateDynamic("Trigger")(Trigger)
    __obj.asInstanceOf[GetTriggerResponse]
  }
}

