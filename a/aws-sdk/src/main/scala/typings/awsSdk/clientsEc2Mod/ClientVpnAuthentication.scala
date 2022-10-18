package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnAuthentication extends StObject {
  
  /**
    * Information about the Active Directory, if applicable.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthentication] = js.undefined
  
  /**
    * Information about the IAM SAML identity provider, if applicable.
    */
  var FederatedAuthentication: js.UndefOr[typings.awsSdk.clientsEc2Mod.FederatedAuthentication] = js.undefined
  
  /**
    * Information about the authentication certificates, if applicable.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthentication] = js.undefined
  
  /**
    * The authentication type used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.undefined
}
object ClientVpnAuthentication {
  
  inline def apply(): ClientVpnAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthentication]
  }
  
  extension [Self <: ClientVpnAuthentication](x: Self) {
    
    inline def setActiveDirectory(value: DirectoryServiceAuthentication): Self = StObject.set(x, "ActiveDirectory", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryUndefined: Self = StObject.set(x, "ActiveDirectory", js.undefined)
    
    inline def setFederatedAuthentication(value: FederatedAuthentication): Self = StObject.set(x, "FederatedAuthentication", value.asInstanceOf[js.Any])
    
    inline def setFederatedAuthenticationUndefined: Self = StObject.set(x, "FederatedAuthentication", js.undefined)
    
    inline def setMutualAuthentication(value: CertificateAuthentication): Self = StObject.set(x, "MutualAuthentication", value.asInstanceOf[js.Any])
    
    inline def setMutualAuthenticationUndefined: Self = StObject.set(x, "MutualAuthentication", js.undefined)
    
    inline def setType(value: ClientVpnAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
