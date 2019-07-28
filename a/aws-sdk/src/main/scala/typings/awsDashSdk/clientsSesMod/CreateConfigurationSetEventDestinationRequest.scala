package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that the event destination should be associated with.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName
  /**
    * An object that describes the AWS service that email sending event information will be published to.
    */
  var EventDestination: typings.awsDashSdk.clientsSesMod.EventDestination
}

object CreateConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestination: EventDestination): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, EventDestination = EventDestination)
  
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
}

