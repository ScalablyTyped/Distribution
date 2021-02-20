package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkProfile extends StObject {
  
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
  def apply(): NetworkProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProfile]
  }
  
  @scala.inline
  implicit class NetworkProfileMutableBuilder[Self <: NetworkProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setCurrentPassword(value: CurrentWiFiPassword): Self = StObject.set(x, "CurrentPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPasswordUndefined: Self = StObject.set(x, "CurrentPassword", js.undefined)
    
    @scala.inline
    def setDescription(value: NetworkProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEapMethod(value: NetworkEapMethod): Self = StObject.set(x, "EapMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEapMethodUndefined: Self = StObject.set(x, "EapMethod", js.undefined)
    
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileArnUndefined: Self = StObject.set(x, "NetworkProfileArn", js.undefined)
    
    @scala.inline
    def setNetworkProfileName(value: NetworkProfileName): Self = StObject.set(x, "NetworkProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileNameUndefined: Self = StObject.set(x, "NetworkProfileName", js.undefined)
    
    @scala.inline
    def setNextPassword(value: NextWiFiPassword): Self = StObject.set(x, "NextPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPasswordUndefined: Self = StObject.set(x, "NextPassword", js.undefined)
    
    @scala.inline
    def setSecurityType(value: NetworkSecurityType): Self = StObject.set(x, "SecurityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTypeUndefined: Self = StObject.set(x, "SecurityType", js.undefined)
    
    @scala.inline
    def setSsid(value: NetworkSsid): Self = StObject.set(x, "Ssid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsidUndefined: Self = StObject.set(x, "Ssid", js.undefined)
    
    @scala.inline
    def setTrustAnchors(value: TrustAnchorList): Self = StObject.set(x, "TrustAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustAnchorsUndefined: Self = StObject.set(x, "TrustAnchors", js.undefined)
    
    @scala.inline
    def setTrustAnchorsVarargs(value: TrustAnchor*): Self = StObject.set(x, "TrustAnchors", js.Array(value :_*))
  }
}
