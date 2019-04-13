package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigurationSetRequest extends js.Object {
  /**
    * The name of the configuration set that you want to delete.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsPinpointemailMod.ConfigurationSetName
}

object DeleteConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
  
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
}

