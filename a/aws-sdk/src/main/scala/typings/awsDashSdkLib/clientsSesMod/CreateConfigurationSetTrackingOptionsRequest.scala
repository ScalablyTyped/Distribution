package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that the tracking options should be associated with.
    */
  var ConfigurationSetName: awsDashSdkLib.clientsSesMod.ConfigurationSetName
  var TrackingOptions: awsDashSdkLib.clientsSesMod.TrackingOptions
}

object CreateConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): CreateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, TrackingOptions = TrackingOptions)
  
    __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
  }
}

