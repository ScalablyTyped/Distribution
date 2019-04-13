package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationSetEventDestinationsResponse extends js.Object {
  /**
    * An array that includes all of the events destinations that have been configured for the configuration set.
    */
  var EventDestinations: js.UndefOr[EventDestinations] = js.undefined
}

object GetConfigurationSetEventDestinationsResponse {
  @scala.inline
  def apply(EventDestinations: EventDestinations = null): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventDestinations != null) __obj.updateDynamic("EventDestinations")(EventDestinations)
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
}

