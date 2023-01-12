package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIDConnectConfig extends StObject {
  
  /**
    * The number of milliseconds that a token is valid after being authenticated.
    */
  var authTTL: js.UndefOr[Long] = js.undefined
  
  /**
    * The client identifier of the relying party at the OpenID identity provider. This identifier is typically obtained when the relying party is registered with the OpenID identity provider. You can specify a regular expression so that AppSync can validate against multiple client identifiers at a time.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of milliseconds that a token is valid after it's issued to a user.
    */
  var iatTTL: js.UndefOr[Long] = js.undefined
  
  /**
    * The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of iss in the ID token.
    */
  var issuer: String
}
object OpenIDConnectConfig {
  
  inline def apply(issuer: String): OpenIDConnectConfig = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIDConnectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenIDConnectConfig] (val x: Self) extends AnyVal {
    
    inline def setAuthTTL(value: Long): Self = StObject.set(x, "authTTL", value.asInstanceOf[js.Any])
    
    inline def setAuthTTLUndefined: Self = StObject.set(x, "authTTL", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setIatTTL(value: Long): Self = StObject.set(x, "iatTTL", value.asInstanceOf[js.Any])
    
    inline def setIatTTLUndefined: Self = StObject.set(x, "iatTTL", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
