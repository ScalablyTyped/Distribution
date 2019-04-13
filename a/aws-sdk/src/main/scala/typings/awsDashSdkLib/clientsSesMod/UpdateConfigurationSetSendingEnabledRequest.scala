package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationSetSendingEnabledRequest extends js.Object {
  /**
    * The name of the configuration set that you want to update.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsSesMod.ConfigurationSetName
  /**
    * Describes whether email sending is enabled or disabled for the configuration set. 
    */
  var Enabled: awsDashSdkLib.clientsSesMod.Enabled
}

object UpdateConfigurationSetSendingEnabledRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, Enabled: Enabled): UpdateConfigurationSetSendingEnabledRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, Enabled = Enabled)
  
    __obj.asInstanceOf[UpdateConfigurationSetSendingEnabledRequest]
  }
}

