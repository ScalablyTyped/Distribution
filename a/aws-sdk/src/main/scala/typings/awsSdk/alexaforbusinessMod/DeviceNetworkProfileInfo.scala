package typings.awsSdk.alexaforbusinessMod

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
  def apply(): DeviceNetworkProfileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceNetworkProfileInfo]
  }
  @scala.inline
  implicit class DeviceNetworkProfileInfoOps[Self <: DeviceNetworkProfileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateArn(value: Arn): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    @scala.inline
    def setCertificateExpirationTime(value: CertificateTime): Self = this.set("CertificateExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateExpirationTime: Self = this.set("CertificateExpirationTime", js.undefined)
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = this.set("NetworkProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkProfileArn: Self = this.set("NetworkProfileArn", js.undefined)
  }
  
}

