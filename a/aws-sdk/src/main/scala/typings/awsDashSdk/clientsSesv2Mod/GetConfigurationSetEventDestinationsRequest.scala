package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsRequest extends js.Object {
  /**
    * The name of the configuration set that contains the event destination.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesv2Mod.ConfigurationSetName = js.native
}

object GetConfigurationSetEventDestinationsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): GetConfigurationSetEventDestinationsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
  }
}

