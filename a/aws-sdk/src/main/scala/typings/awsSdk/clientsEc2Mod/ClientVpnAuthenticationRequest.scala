package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnAuthenticationRequest extends StObject {
  
  /**
    * Information about the Active Directory to be used, if applicable. You must provide this information if Type is directory-service-authentication.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthenticationRequest] = js.undefined
  
  /**
    * Information about the IAM SAML identity provider to be used, if applicable. You must provide this information if Type is federated-authentication.
    */
  var FederatedAuthentication: js.UndefOr[FederatedAuthenticationRequest] = js.undefined
  
  /**
    * Information about the authentication certificates to be used, if applicable. You must provide this information if Type is certificate-authentication.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthenticationRequest] = js.undefined
  
  /**
    * The type of client authentication to be used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.undefined
}
object ClientVpnAuthenticationRequest {
  
  inline def apply(): ClientVpnAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthenticationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientVpnAuthenticationRequest] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectory(value: DirectoryServiceAuthenticationRequest): Self = StObject.set(x, "ActiveDirectory", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryUndefined: Self = StObject.set(x, "ActiveDirectory", js.undefined)
    
    inline def setFederatedAuthentication(value: FederatedAuthenticationRequest): Self = StObject.set(x, "FederatedAuthentication", value.asInstanceOf[js.Any])
    
    inline def setFederatedAuthenticationUndefined: Self = StObject.set(x, "FederatedAuthentication", js.undefined)
    
    inline def setMutualAuthentication(value: CertificateAuthenticationRequest): Self = StObject.set(x, "MutualAuthentication", value.asInstanceOf[js.Any])
    
    inline def setMutualAuthenticationUndefined: Self = StObject.set(x, "MutualAuthentication", js.undefined)
    
    inline def setType(value: ClientVpnAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
