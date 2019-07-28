package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that contains the event destination that you want to update.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName
  /**
    * The event destination object that you want to apply to the specified configuration set.
    */
  var EventDestination: typings.awsDashSdk.clientsSesMod.EventDestination
}

object UpdateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestination: EventDestination): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestination = EventDestination)
  
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
}

