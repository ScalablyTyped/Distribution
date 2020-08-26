package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices. 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    * The current password of the Wi-Fi network.
    */
  var CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.native
  /**
    * Detailed information about a device's network profile.
    */
  var Description: js.UndefOr[NetworkProfileDescription] = js.native
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn = js.native
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NetworkProfileName] = js.native
  /**
    * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device and is used when the password of the network changes to NextPassword. 
    */
  var NextPassword: js.UndefOr[NextWiFiPassword] = js.native
  /**
    * The root certificate(s) of your authentication server that will be installed on your devices and used to trust your authentication server during EAP negotiation. 
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.native
}

object UpdateNetworkProfileRequest {
  @scala.inline
  def apply(NetworkProfileArn: Arn): UpdateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkProfileRequest]
  }
  @scala.inline
  implicit class UpdateNetworkProfileRequestOps[Self <: UpdateNetworkProfileRequest] (val x: Self) extends AnyVal {
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
    def setNetworkProfileArn(value: Arn): Self = this.set("NetworkProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorityArn: Self = this.set("CertificateAuthorityArn", js.undefined)
    @scala.inline
    def setCurrentPassword(value: CurrentWiFiPassword): Self = this.set("CurrentPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPassword: Self = this.set("CurrentPassword", js.undefined)
    @scala.inline
    def setDescription(value: NetworkProfileDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNetworkProfileName(value: NetworkProfileName): Self = this.set("NetworkProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkProfileName: Self = this.set("NetworkProfileName", js.undefined)
    @scala.inline
    def setNextPassword(value: NextWiFiPassword): Self = this.set("NextPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPassword: Self = this.set("NextPassword", js.undefined)
    @scala.inline
    def setTrustAnchorsVarargs(value: TrustAnchor*): Self = this.set("TrustAnchors", js.Array(value :_*))
    @scala.inline
    def setTrustAnchors(value: TrustAnchorList): Self = this.set("TrustAnchors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustAnchors: Self = this.set("TrustAnchors", js.undefined)
  }
  
}

