package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNetworkProfileRequest extends js.Object {
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices. 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  /**
    * The current password of the Wi-Fi network.
    */
  var CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.undefined
  /**
    * Detailed information about a device's network profile.
    */
  var Description: js.UndefOr[NetworkProfileDescription] = js.undefined
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn
  /**
    * The name of the network profile associated with a device.
    */
  var NetworkProfileName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NetworkProfileName] = js.undefined
  /**
    * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device and is used when the password of the network changes to NextPassword. 
    */
  var NextPassword: js.UndefOr[NextWiFiPassword] = js.undefined
  /**
    * The root certificate(s) of your authentication server that will be installed on your devices and used to trust your authentication server during EAP negotiation. 
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
}

object UpdateNetworkProfileRequest {
  @scala.inline
  def apply(
    NetworkProfileArn: Arn,
    CertificateAuthorityArn: Arn = null,
    CurrentPassword: CurrentWiFiPassword = null,
    Description: NetworkProfileDescription = null,
    NetworkProfileName: NetworkProfileName = null,
    NextPassword: NextWiFiPassword = null,
    TrustAnchors: TrustAnchorList = null
  ): UpdateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn)
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn)
    if (CurrentPassword != null) __obj.updateDynamic("CurrentPassword")(CurrentPassword)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NetworkProfileName != null) __obj.updateDynamic("NetworkProfileName")(NetworkProfileName)
    if (NextPassword != null) __obj.updateDynamic("NextPassword")(NextPassword)
    if (TrustAnchors != null) __obj.updateDynamic("TrustAnchors")(TrustAnchors)
    __obj.asInstanceOf[UpdateNetworkProfileRequest]
  }
}

