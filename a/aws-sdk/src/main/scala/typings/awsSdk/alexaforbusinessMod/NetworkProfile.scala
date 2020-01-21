package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProfile extends js.Object {
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
    * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported. 
    */
  var EapMethod: js.UndefOr[NetworkEapMethod] = js.native
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NetworkProfileName] = js.native
  /**
    * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device and is used when the password of the network changes to NextPassword. 
    */
  var NextPassword: js.UndefOr[NextWiFiPassword] = js.native
  /**
    * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
    */
  var SecurityType: js.UndefOr[NetworkSecurityType] = js.native
  /**
    * The SSID of the Wi-Fi network.
    */
  var Ssid: js.UndefOr[NetworkSsid] = js.native
  /**
    * The root certificates of your authentication server, which is installed on your devices and used to trust your authentication server during EAP negotiation.
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.native
}

object NetworkProfile {
  @scala.inline
  def apply(
    CertificateAuthorityArn: Arn = null,
    CurrentPassword: CurrentWiFiPassword = null,
    Description: NetworkProfileDescription = null,
    EapMethod: NetworkEapMethod = null,
    NetworkProfileArn: Arn = null,
    NetworkProfileName: NetworkProfileName = null,
    NextPassword: NextWiFiPassword = null,
    SecurityType: NetworkSecurityType = null,
    Ssid: NetworkSsid = null,
    TrustAnchors: TrustAnchorList = null
  ): NetworkProfile = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn.asInstanceOf[js.Any])
    if (CurrentPassword != null) __obj.updateDynamic("CurrentPassword")(CurrentPassword.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EapMethod != null) __obj.updateDynamic("EapMethod")(EapMethod.asInstanceOf[js.Any])
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn.asInstanceOf[js.Any])
    if (NetworkProfileName != null) __obj.updateDynamic("NetworkProfileName")(NetworkProfileName.asInstanceOf[js.Any])
    if (NextPassword != null) __obj.updateDynamic("NextPassword")(NextPassword.asInstanceOf[js.Any])
    if (SecurityType != null) __obj.updateDynamic("SecurityType")(SecurityType.asInstanceOf[js.Any])
    if (Ssid != null) __obj.updateDynamic("Ssid")(Ssid.asInstanceOf[js.Any])
    if (TrustAnchors != null) __obj.updateDynamic("TrustAnchors")(TrustAnchors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProfile]
  }
}

