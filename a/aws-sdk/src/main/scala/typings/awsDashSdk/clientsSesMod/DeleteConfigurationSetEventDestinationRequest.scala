package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set from which to delete the event destination.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName
  /**
    * The name of the event destination to delete.
    */
  var EventDestinationName: typings.awsDashSdk.clientsSesMod.EventDestinationName
}

object DeleteConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestinationName: EventDestinationName): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestinationName = EventDestinationName)
  
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
}

