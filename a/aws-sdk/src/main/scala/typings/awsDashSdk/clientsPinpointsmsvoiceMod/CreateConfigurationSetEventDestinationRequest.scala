package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: __string
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
  /**
    * A name that identifies the event destination.
    */
  var EventDestinationName: js.UndefOr[NonEmptyString] = js.undefined
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: __string,
    EventDestination: EventDestinationDefinition = null,
    EventDestinationName: NonEmptyString = null
  ): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
    if (EventDestination != null) __obj.updateDynamic("EventDestination")(EventDestination)
    if (EventDestinationName != null) __obj.updateDynamic("EventDestinationName")(EventDestinationName)
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
}

