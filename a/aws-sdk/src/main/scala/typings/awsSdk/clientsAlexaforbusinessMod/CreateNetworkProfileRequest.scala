package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkProfileRequest extends StObject {
  
  /**
    * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to issue certificates to the devices. 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  
  var ClientRequestToken: typings.awsSdk.clientsAlexaforbusinessMod.ClientRequestToken
  
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
  var NetworkProfileName: typings.awsSdk.clientsAlexaforbusinessMod.NetworkProfileName
  
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
    * The tags to be added to the specified resource. Do not provide system tags. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The root certificates of your authentication server that is installed on your devices and used to trust your authentication server during EAP negotiation. 
    */
  var TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
}
object CreateNetworkProfileRequest {
  
  inline def apply(
    ClientRequestToken: ClientRequestToken,
    NetworkProfileName: NetworkProfileName,
    SecurityType: NetworkSecurityType,
    Ssid: NetworkSsid
  ): CreateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], NetworkProfileName = NetworkProfileName.asInstanceOf[js.Any], SecurityType = SecurityType.asInstanceOf[js.Any], Ssid = Ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkProfileRequest]
  }
  
  extension [Self <: CreateNetworkProfileRequest](x: Self) {
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setCurrentPassword(value: CurrentWiFiPassword): Self = StObject.set(x, "CurrentPassword", value.asInstanceOf[js.Any])
    
    inline def setCurrentPasswordUndefined: Self = StObject.set(x, "CurrentPassword", js.undefined)
    
    inline def setDescription(value: NetworkProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEapMethod(value: NetworkEapMethod): Self = StObject.set(x, "EapMethod", value.asInstanceOf[js.Any])
    
    inline def setEapMethodUndefined: Self = StObject.set(x, "EapMethod", js.undefined)
    
    inline def setNetworkProfileName(value: NetworkProfileName): Self = StObject.set(x, "NetworkProfileName", value.asInstanceOf[js.Any])
    
    inline def setNextPassword(value: NextWiFiPassword): Self = StObject.set(x, "NextPassword", value.asInstanceOf[js.Any])
    
    inline def setNextPasswordUndefined: Self = StObject.set(x, "NextPassword", js.undefined)
    
    inline def setSecurityType(value: NetworkSecurityType): Self = StObject.set(x, "SecurityType", value.asInstanceOf[js.Any])
    
    inline def setSsid(value: NetworkSsid): Self = StObject.set(x, "Ssid", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrustAnchors(value: TrustAnchorList): Self = StObject.set(x, "TrustAnchors", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorsUndefined: Self = StObject.set(x, "TrustAnchors", js.undefined)
    
    inline def setTrustAnchorsVarargs(value: TrustAnchor*): Self = StObject.set(x, "TrustAnchors", js.Array(value*))
  }
}
