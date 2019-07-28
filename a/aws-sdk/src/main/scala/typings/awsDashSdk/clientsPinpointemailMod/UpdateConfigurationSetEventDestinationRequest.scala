package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that contains the event destination that you want to modify.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsPinpointemailMod.ConfigurationSetName
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition
  /**
    * The name of the event destination that you want to modify.
    */
  var EventDestinationName: typings.awsDashSdk.clientsPinpointemailMod.EventDestinationName
}

object UpdateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestination = EventDestination, EventDestinationName = EventDestinationName)
  
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
}

