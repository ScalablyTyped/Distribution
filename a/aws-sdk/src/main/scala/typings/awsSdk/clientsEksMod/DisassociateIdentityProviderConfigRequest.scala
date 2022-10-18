package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateIdentityProviderConfigRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster to disassociate an identity provider from.
    */
  var clusterName: String
  
  /**
    * An object representing an identity provider configuration.
    */
  var identityProviderConfig: IdentityProviderConfig
}
object DisassociateIdentityProviderConfigRequest {
  
  inline def apply(clusterName: String, identityProviderConfig: IdentityProviderConfig): DisassociateIdentityProviderConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], identityProviderConfig = identityProviderConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateIdentityProviderConfigRequest]
  }
  
  extension [Self <: DisassociateIdentityProviderConfigRequest](x: Self) {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfig(value: IdentityProviderConfig): Self = StObject.set(x, "identityProviderConfig", value.asInstanceOf[js.Any])
  }
}
