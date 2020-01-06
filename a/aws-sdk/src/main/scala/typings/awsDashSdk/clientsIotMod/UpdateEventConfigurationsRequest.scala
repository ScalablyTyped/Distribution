package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventConfigurationsRequest extends js.Object {
  /**
    * The new event configuration values.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.native
}

object UpdateEventConfigurationsRequest {
  @scala.inline
  def apply(eventConfigurations: EventConfigurations = null): UpdateEventConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (eventConfigurations != null) __obj.updateDynamic("eventConfigurations")(eventConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventConfigurationsRequest]
  }
}

