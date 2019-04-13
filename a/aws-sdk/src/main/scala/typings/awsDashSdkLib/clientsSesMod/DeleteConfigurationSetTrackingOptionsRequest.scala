package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set from which you want to delete the tracking options.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsSesMod.ConfigurationSetName
}

object DeleteConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
  
    __obj.asInstanceOf[DeleteConfigurationSetTrackingOptionsRequest]
  }
}

