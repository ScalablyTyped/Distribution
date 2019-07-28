package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDevicePolicyConfigurationResponse extends js.Object {
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[Certificate] = js.undefined
}

object DescribeDevicePolicyConfigurationResponse {
  @scala.inline
  def apply(DeviceCaCertificate: Certificate = null): DescribeDevicePolicyConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceCaCertificate != null) __obj.updateDynamic("DeviceCaCertificate")(DeviceCaCertificate)
    __obj.asInstanceOf[DescribeDevicePolicyConfigurationResponse]
  }
}

