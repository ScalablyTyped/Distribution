package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRemoteAccessSessionConfiguration extends js.Object {
  /**
    * The billing method for the remote access session.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  /**
    * An array of Amazon Resource Names (ARNs) included in the VPC endpoint configuration.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
}

object CreateRemoteAccessSessionConfiguration {
  @scala.inline
  def apply(billingMethod: BillingMethod = null, vpceConfigurationArns: AmazonResourceNames = null): CreateRemoteAccessSessionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (vpceConfigurationArns != null) __obj.updateDynamic("vpceConfigurationArns")(vpceConfigurationArns)
    __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
  }
}

