package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDevicePolicyConfigurationRequest extends js.Object {
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[CertificateChain] = js.undefined
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object UpdateDevicePolicyConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, DeviceCaCertificate: CertificateChain = null): UpdateDevicePolicyConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
    if (DeviceCaCertificate != null) __obj.updateDynamic("DeviceCaCertificate")(DeviceCaCertificate)
    __obj.asInstanceOf[UpdateDevicePolicyConfigurationRequest]
  }
}

