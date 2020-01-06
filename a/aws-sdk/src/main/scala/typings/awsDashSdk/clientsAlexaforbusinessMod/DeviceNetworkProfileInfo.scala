package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceNetworkProfileInfo extends js.Object {
  /**
    * The ARN of the certificate associated with a device.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * The time (in epoch) when the certificate expires.
    */
  var CertificateExpirationTime: js.UndefOr[CertificateTime] = js.native
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
}

object DeviceNetworkProfileInfo {
  @scala.inline
  def apply(
    CertificateArn: Arn = null,
    CertificateExpirationTime: CertificateTime = null,
    NetworkProfileArn: Arn = null
  ): DeviceNetworkProfileInfo = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CertificateExpirationTime != null) __obj.updateDynamic("CertificateExpirationTime")(CertificateExpirationTime.asInstanceOf[js.Any])
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceNetworkProfileInfo]
  }
}

