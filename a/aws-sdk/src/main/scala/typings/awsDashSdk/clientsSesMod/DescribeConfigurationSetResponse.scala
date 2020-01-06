package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationSetResponse extends js.Object {
  /**
    * The configuration set object associated with the specified configuration set.
    */
  var ConfigurationSet: js.UndefOr[typings.awsDashSdk.clientsSesMod.ConfigurationSet] = js.native
  var DeliveryOptions: js.UndefOr[typings.awsDashSdk.clientsSesMod.DeliveryOptions] = js.native
  /**
    * A list of event destinations associated with the configuration set. 
    */
  var EventDestinations: js.UndefOr[typings.awsDashSdk.clientsSesMod.EventDestinations] = js.native
  /**
    * An object that represents the reputation settings for the configuration set. 
    */
  var ReputationOptions: js.UndefOr[typings.awsDashSdk.clientsSesMod.ReputationOptions] = js.native
  /**
    * The name of the custom open and click tracking domain associated with the configuration set.
    */
  var TrackingOptions: js.UndefOr[typings.awsDashSdk.clientsSesMod.TrackingOptions] = js.native
}

object DescribeConfigurationSetResponse {
  @scala.inline
  def apply(
    ConfigurationSet: ConfigurationSet = null,
    DeliveryOptions: DeliveryOptions = null,
    EventDestinations: EventDestinations = null,
    ReputationOptions: ReputationOptions = null,
    TrackingOptions: TrackingOptions = null
  ): DescribeConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet.asInstanceOf[js.Any])
    if (DeliveryOptions != null) __obj.updateDynamic("DeliveryOptions")(DeliveryOptions.asInstanceOf[js.Any])
    if (EventDestinations != null) __obj.updateDynamic("EventDestinations")(EventDestinations.asInstanceOf[js.Any])
    if (ReputationOptions != null) __obj.updateDynamic("ReputationOptions")(ReputationOptions.asInstanceOf[js.Any])
    if (TrackingOptions != null) __obj.updateDynamic("TrackingOptions")(TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationSetResponse]
  }
}

