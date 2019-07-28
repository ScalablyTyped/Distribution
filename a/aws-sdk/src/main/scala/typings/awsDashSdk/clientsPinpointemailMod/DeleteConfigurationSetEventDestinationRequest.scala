package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that contains the event destination that you want to delete.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsPinpointemailMod.ConfigurationSetName
  /**
    * The name of the event destination that you want to delete.
    */
  var EventDestinationName: typings.awsDashSdk.clientsPinpointemailMod.EventDestinationName
}

object DeleteConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestinationName: EventDestinationName): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestinationName = EventDestinationName)
  
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
}

