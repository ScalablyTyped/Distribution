package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIdentityProviderConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster to associate the configuration to.
    */
  var clusterName: String
  
  /**
    * An object representing an OpenID Connect (OIDC) identity provider configuration.
    */
  var oidc: OidcIdentityProviderConfigRequest
  
  /**
    * The metadata to apply to the configuration to assist with categorization and organization. Each tag consists of a key and an optional value. You define both.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object AssociateIdentityProviderConfigRequest {
  
  inline def apply(clusterName: String, oidc: OidcIdentityProviderConfigRequest): AssociateIdentityProviderConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], oidc = oidc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIdentityProviderConfigRequest]
  }
  
  extension [Self <: AssociateIdentityProviderConfigRequest](x: Self) {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setOidc(value: OidcIdentityProviderConfigRequest): Self = StObject.set(x, "oidc", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
