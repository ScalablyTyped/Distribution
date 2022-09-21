package typings.auth0.mod

import typings.auth0.anon.Description
import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import typings.auth0.auth0Strings.access_token
import typings.auth0.auth0Strings.access_token_authz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServer extends StObject {
  
  /**
    * Allows issuance of refresh tokens for this entity.
    */
  var allow_offline_access: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the enforcement of the authorization policies.
    */
  var enforce_policies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the resource server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the resource server.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * A friendly name for the resource server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var scopes: js.UndefOr[js.Array[Description]] = js.undefined
  
  /**
    * The algorithm used to sign tokens.
    */
  var signing_alg: js.UndefOr[HS256 | RS256] = js.undefined
  
  /**
    * The secret used to sign tokens when using symmetric algorithms.
    */
  var signing_secret: js.UndefOr[String] = js.undefined
  
  /**
    * Flag this entity as capable of skipping consent.
    */
  var skip_consent_for_verifiable_first_party_clients: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The dialect for the access token.
    */
  var token_dialect: js.UndefOr[access_token | access_token_authz] = js.undefined
  
  /**
    * The amount of time (in seconds) that the token will be valid after being issued.
    */
  var token_lifetime: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time (in seconds) that the token will be valid after being issued from browser based flows. Value cannot be larger than token_lifetime..
    */
  var token_lifetime_for_web: js.UndefOr[Double] = js.undefined
}
object ResourceServer {
  
  inline def apply(): ResourceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServer]
  }
  
  extension [Self <: ResourceServer](x: Self) {
    
    inline def setAllow_offline_access(value: Boolean): Self = StObject.set(x, "allow_offline_access", value.asInstanceOf[js.Any])
    
    inline def setAllow_offline_accessUndefined: Self = StObject.set(x, "allow_offline_access", js.undefined)
    
    inline def setEnforce_policies(value: Boolean): Self = StObject.set(x, "enforce_policies", value.asInstanceOf[js.Any])
    
    inline def setEnforce_policiesUndefined: Self = StObject.set(x, "enforce_policies", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScopes(value: js.Array[Description]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: Description*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setSigning_alg(value: HS256 | RS256): Self = StObject.set(x, "signing_alg", value.asInstanceOf[js.Any])
    
    inline def setSigning_algUndefined: Self = StObject.set(x, "signing_alg", js.undefined)
    
    inline def setSigning_secret(value: String): Self = StObject.set(x, "signing_secret", value.asInstanceOf[js.Any])
    
    inline def setSigning_secretUndefined: Self = StObject.set(x, "signing_secret", js.undefined)
    
    inline def setSkip_consent_for_verifiable_first_party_clients(value: Boolean): Self = StObject.set(x, "skip_consent_for_verifiable_first_party_clients", value.asInstanceOf[js.Any])
    
    inline def setSkip_consent_for_verifiable_first_party_clientsUndefined: Self = StObject.set(x, "skip_consent_for_verifiable_first_party_clients", js.undefined)
    
    inline def setToken_dialect(value: access_token | access_token_authz): Self = StObject.set(x, "token_dialect", value.asInstanceOf[js.Any])
    
    inline def setToken_dialectUndefined: Self = StObject.set(x, "token_dialect", js.undefined)
    
    inline def setToken_lifetime(value: Double): Self = StObject.set(x, "token_lifetime", value.asInstanceOf[js.Any])
    
    inline def setToken_lifetimeUndefined: Self = StObject.set(x, "token_lifetime", js.undefined)
    
    inline def setToken_lifetime_for_web(value: Double): Self = StObject.set(x, "token_lifetime_for_web", value.asInstanceOf[js.Any])
    
    inline def setToken_lifetime_for_webUndefined: Self = StObject.set(x, "token_lifetime_for_web", js.undefined)
  }
}
