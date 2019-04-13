package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that you want to add an event destination to.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsPinpointemailMod.ConfigurationSetName
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition
  /**
    * A name that identifies the event destination within the configuration set.
    */
  var EventDestinationName: awsDashSdkLib.clientsPinpointemailMod.EventDestinationName
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestination = EventDestination, EventDestinationName = EventDestinationName)
  
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
}

