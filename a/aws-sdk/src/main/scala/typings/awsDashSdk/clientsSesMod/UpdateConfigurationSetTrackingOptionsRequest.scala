package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set for which you want to update the custom tracking domain.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName
  var TrackingOptions: typings.awsDashSdk.clientsSesMod.TrackingOptions
}

object UpdateConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): UpdateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName, TrackingOptions = TrackingOptions)
  
    __obj.asInstanceOf[UpdateConfigurationSetTrackingOptionsRequest]
  }
}

