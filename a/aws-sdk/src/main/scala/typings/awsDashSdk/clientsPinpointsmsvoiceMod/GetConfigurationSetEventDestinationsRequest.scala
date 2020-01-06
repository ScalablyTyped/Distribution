package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: __string = js.native
}

object GetConfigurationSetEventDestinationsRequest {
  @scala.inline
  def apply(ConfigurationSetName: __string): GetConfigurationSetEventDestinationsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
  }
}

