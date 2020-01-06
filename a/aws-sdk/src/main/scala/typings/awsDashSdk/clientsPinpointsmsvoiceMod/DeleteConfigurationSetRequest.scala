package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationSetRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: __string = js.native
}

object DeleteConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: __string): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
}

