package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationSetRequest extends js.Object {
  /**
    * The name of the configuration set that you want to obtain more information about.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsPinpointemailMod.ConfigurationSetName
}

object GetConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): GetConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
  
    __obj.asInstanceOf[GetConfigurationSetRequest]
  }
}

