package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNetworkProfileRequest extends StObject {
  
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
  implicit class UpdateNetworkProfileRequestMutableBuilder[Self <: UpdateNetworkProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileName(value: NetworkProfileName): Self = StObject.set(x, "NetworkProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileNameUndefined: Self = StObject.set(x, "NetworkProfileName", js.undefined)
    
    @scala.inline
    def setNextPassword(value: NextWiFiPassword): Self = StObject.set(x, "NextPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPasswordUndefined: Self = StObject.set(x, "NextPassword", js.undefined)
    
    @scala.inline
    def setTrustAnchors(value: TrustAnchorList): Self = StObject.set(x, "TrustAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustAnchorsUndefined: Self = StObject.set(x, "TrustAnchors", js.undefined)
    
    @scala.inline
    def setTrustAnchorsVarargs(value: TrustAnchor*): Self = StObject.set(x, "TrustAnchors", js.Array(value :_*))
  }
}
