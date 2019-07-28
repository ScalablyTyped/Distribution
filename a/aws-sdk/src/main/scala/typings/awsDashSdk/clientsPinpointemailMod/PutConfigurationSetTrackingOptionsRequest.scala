package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationSetTrackingOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to add a custom tracking domain to.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsPinpointemailMod.ConfigurationSetName
  /**
    * The domain that you want to use to track open and click events.
    */
  var CustomRedirectDomain: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.CustomRedirectDomain] = js.undefined
}

object PutConfigurationSetTrackingOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, CustomRedirectDomain: CustomRedirectDomain = null): PutConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName)
    if (CustomRedirectDomain != null) __obj.updateDynamic("CustomRedirectDomain")(CustomRedirectDomain)
    __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
  }
}

