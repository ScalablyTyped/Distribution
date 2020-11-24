package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkProfileData extends js.Object {
  
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  
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
    * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
    */
  var SecurityType: js.UndefOr[NetworkSecurityType] = js.native
  
  /**
    * The SSID of the Wi-Fi network.
    */
  var Ssid: js.UndefOr[NetworkSsid] = js.native
}
object NetworkProfileData {
  
  @scala.inline
  def apply(): NetworkProfileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProfileData]
  }
  
  @scala.inline
  implicit class NetworkProfileDataOps[Self <: NetworkProfileData] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthorityArn: Self = this.set("CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setDescription(value: NetworkProfileDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEapMethod(value: NetworkEapMethod): Self = this.set("EapMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEapMethod: Self = this.set("EapMethod", js.undefined)
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = this.set("NetworkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfileArn: Self = this.set("NetworkProfileArn", js.undefined)
    
    @scala.inline
    def setNetworkProfileName(value: NetworkProfileName): Self = this.set("NetworkProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfileName: Self = this.set("NetworkProfileName", js.undefined)
    
    @scala.inline
    def setSecurityType(value: NetworkSecurityType): Self = this.set("SecurityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityType: Self = this.set("SecurityType", js.undefined)
    
    @scala.inline
    def setSsid(value: NetworkSsid): Self = this.set("Ssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsid: Self = this.set("Ssid", js.undefined)
  }
}
