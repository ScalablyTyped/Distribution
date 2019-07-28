package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEventConfigurationsRequest extends js.Object {
  /**
    * The new event configuration values.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
}

object UpdateEventConfigurationsRequest {
  @scala.inline
  def apply(eventConfigurations: EventConfigurations = null): UpdateEventConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (eventConfigurations != null) __obj.updateDynamic("eventConfigurations")(eventConfigurations)
    __obj.asInstanceOf[UpdateEventConfigurationsRequest]
  }
}

