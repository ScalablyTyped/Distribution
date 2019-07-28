package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices. 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  var ClientRequestToken: typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken
  /**
    * The current password of the Wi-Fi network.
    */
  var CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.undefined
  /**
    * Detailed information about a device's network profile.
    */
  var Description: js.UndefOr[NetworkProfileDescription] = js.undefined
  /**
    * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
    */
  var EapMethod: js.UndefOr[NetworkEapMethod] = js.undefined
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: typings.awsDashSdk.clientsAlexaforbusinessMod.NetworkProfileName
  /**
    * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device and is used when the password of the network changes to NextPassword. 
    */
  var NextPassword: js.UndefOr[NextWiFiPassword] = js.undefined
  /**
    * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
    */
  var SecurityType: NetworkSecurityType
  /**
    * The SSID of the Wi-Fi network.
    */
  var Ssid: NetworkSsid
  /**
    * The root certificates of your authentication server that is installed on your devices and used to trust your authentication server during EAP negotiation. 
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
}

object CreateNetworkProfileRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    NetworkProfileName: NetworkProfileName,
    SecurityType: NetworkSecurityType,
    Ssid: NetworkSsid,
    CertificateAuthorityArn: Arn = null,
    CurrentPassword: CurrentWiFiPassword = null,
    Description: NetworkProfileDescription = null,
    EapMethod: NetworkEapMethod = null,
    NextPassword: NextWiFiPassword = null,
    TrustAnchors: TrustAnchorList = null
  ): CreateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken, NetworkProfileName = NetworkProfileName, SecurityType = SecurityType.asInstanceOf[js.Any], Ssid = Ssid)
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn)
    if (CurrentPassword != null) __obj.updateDynamic("CurrentPassword")(CurrentPassword)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EapMethod != null) __obj.updateDynamic("EapMethod")(EapMethod.asInstanceOf[js.Any])
    if (NextPassword != null) __obj.updateDynamic("NextPassword")(NextPassword)
    if (TrustAnchors != null) __obj.updateDynamic("TrustAnchors")(TrustAnchors)
    __obj.asInstanceOf[CreateNetworkProfileRequest]
  }
}

