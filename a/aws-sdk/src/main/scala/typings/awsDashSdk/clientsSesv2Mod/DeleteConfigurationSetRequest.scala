package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationSetRequest extends js.Object {
  /**
    * The name of the configuration set that you want to delete.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesv2Mod.ConfigurationSetName = js.native
}

object DeleteConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
}

