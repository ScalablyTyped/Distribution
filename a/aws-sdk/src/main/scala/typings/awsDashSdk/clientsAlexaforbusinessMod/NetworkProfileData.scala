package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkProfileData extends js.Object {
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  /**
    * Detailed information about a device's network profile.
    */
  var Description: js.UndefOr[NetworkProfileDescription] = js.undefined
  /**
    * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
    */
  var EapMethod: js.UndefOr[NetworkEapMethod] = js.undefined
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NetworkProfileName] = js.undefined
  /**
    * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
    */
  var SecurityType: js.UndefOr[NetworkSecurityType] = js.undefined
  /**
    * The SSID of the Wi-Fi network.
    */
  var Ssid: js.UndefOr[NetworkSsid] = js.undefined
}

object NetworkProfileData {
  @scala.inline
  def apply(
    CertificateAuthorityArn: Arn = null,
    Description: NetworkProfileDescription = null,
    EapMethod: NetworkEapMethod = null,
    NetworkProfileArn: Arn = null,
    NetworkProfileName: NetworkProfileName = null,
    SecurityType: NetworkSecurityType = null,
    Ssid: NetworkSsid = null
  ): NetworkProfileData = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EapMethod != null) __obj.updateDynamic("EapMethod")(EapMethod.asInstanceOf[js.Any])
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn)
    if (NetworkProfileName != null) __obj.updateDynamic("NetworkProfileName")(NetworkProfileName)
    if (SecurityType != null) __obj.updateDynamic("SecurityType")(SecurityType.asInstanceOf[js.Any])
    if (Ssid != null) __obj.updateDynamic("Ssid")(Ssid)
    __obj.asInstanceOf[NetworkProfileData]
  }
}

