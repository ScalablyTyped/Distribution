package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that the tracking options should be associated with.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesMod.ConfigurationSetName = js.native
  var TrackingOptions: typings.awsDashSdk.clientsSesMod.TrackingOptions = js.native
}

object CreateConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): CreateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateConfigurationSetTrackingOptionsRequest]
  }
}

