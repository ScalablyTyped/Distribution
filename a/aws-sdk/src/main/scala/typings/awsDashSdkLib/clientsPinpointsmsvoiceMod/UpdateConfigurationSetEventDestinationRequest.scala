package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: __string
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
  /**
    * EventDestinationName
    */
  var EventDestinationName: __string
}

object UpdateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: __string,
    EventDestinationName: __string,
    EventDestination: EventDestinationDefinition = null
  ): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestinationName = EventDestinationName)
    if (EventDestination != null) __obj.updateDynamic("EventDestination")(EventDestination)
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
}

