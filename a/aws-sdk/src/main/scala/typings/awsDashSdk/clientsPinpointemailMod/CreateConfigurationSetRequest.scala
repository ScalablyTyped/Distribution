package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetRequest extends js.Object {
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsPinpointemailMod.ConfigurationSetName = js.native
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.DeliveryOptions] = js.native
  /**
    * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.ReputationOptions] = js.native
  /**
    * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.SendingOptions] = js.native
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.TrackingOptions] = js.native
}

object CreateConfigurationSetRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    DeliveryOptions: DeliveryOptions = null,
    ReputationOptions: ReputationOptions = null,
    SendingOptions: SendingOptions = null,
    Tags: TagList = null,
    TrackingOptions: TrackingOptions = null
  ): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (DeliveryOptions != null) __obj.updateDynamic("DeliveryOptions")(DeliveryOptions.asInstanceOf[js.Any])
    if (ReputationOptions != null) __obj.updateDynamic("ReputationOptions")(ReputationOptions.asInstanceOf[js.Any])
    if (SendingOptions != null) __obj.updateDynamic("SendingOptions")(SendingOptions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrackingOptions != null) __obj.updateDynamic("TrackingOptions")(TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
}

