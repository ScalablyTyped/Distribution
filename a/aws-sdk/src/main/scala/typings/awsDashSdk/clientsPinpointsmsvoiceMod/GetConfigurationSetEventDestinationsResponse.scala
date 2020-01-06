package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsResponse extends js.Object {
  var EventDestinations: js.UndefOr[typings.awsDashSdk.clientsPinpointsmsvoiceMod.EventDestinations] = js.native
}

object GetConfigurationSetEventDestinationsResponse {
  @scala.inline
  def apply(EventDestinations: EventDestinations = null): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventDestinations != null) __obj.updateDynamic("EventDestinations")(EventDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
}

