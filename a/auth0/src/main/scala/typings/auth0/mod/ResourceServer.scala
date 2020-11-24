package typings.auth0.mod

import typings.auth0.anon.Description
import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import typings.auth0.auth0Strings.access_token
import typings.auth0.auth0Strings.access_token_authz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceServer extends js.Object {
  
  /**
    * Allows issuance of refresh tokens for this entity.
    */
  var allow_offline_access: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables the enforcement of the authorization policies.
    */
  var enforce_policies: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the resource server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the resource server.
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * A friendly name for the resource server.
    */
  var name: js.UndefOr[String] = js.native
  
  var scopes: js.UndefOr[js.Array[Description]] = js.native
  
  /**
    * The algorithm used to sign tokens.
    */
  var signing_alg: js.UndefOr[HS256 | RS256] = js.native
  
  /**
    * The secret used to sign tokens when using symmetric algorithms.
    */
  var signing_secret: js.UndefOr[String] = js.native
  
  /**
    * Flag this entity as capable of skipping consent.
    */
  var skip_consent_for_verifiable_first_party_clients: js.UndefOr[Boolean] = js.native
  
  /**
    * The dialect for the access token.
    */
  var token_dialect: js.UndefOr[access_token | access_token_authz] = js.native
  
  /**
    * The amount of time (in seconds) that the token will be valid after being issued.
    */
  var token_lifetime: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time (in seconds) that the token will be valid after being issued from browser based flows. Value cannot be larger than token_lifetime..
    */
  var token_lifetime_for_web: js.UndefOr[Double] = js.native
}
object ResourceServer {
  
  @scala.inline
  def apply(): ResourceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServer]
  }
  
  @scala.inline
  implicit class ResourceServerOps[Self <: ResourceServer] (val x: Self) extends AnyVal {
    
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
    def setAllow_offline_access(value: Boolean): Self = this.set("allow_offline_access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_offline_access: Self = this.set("allow_offline_access", js.undefined)
    
    @scala.inline
    def setEnforce_policies(value: Boolean): Self = this.set("enforce_policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce_policies: Self = this.set("enforce_policies", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: Description*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[Description]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setSigning_alg(value: HS256 | RS256): Self = this.set("signing_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigning_alg: Self = this.set("signing_alg", js.undefined)
    
    @scala.inline
    def setSigning_secret(value: String): Self = this.set("signing_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigning_secret: Self = this.set("signing_secret", js.undefined)
    
    @scala.inline
    def setSkip_consent_for_verifiable_first_party_clients(value: Boolean): Self = this.set("skip_consent_for_verifiable_first_party_clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip_consent_for_verifiable_first_party_clients: Self = this.set("skip_consent_for_verifiable_first_party_clients", js.undefined)
    
    @scala.inline
    def setToken_dialect(value: access_token | access_token_authz): Self = this.set("token_dialect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_dialect: Self = this.set("token_dialect", js.undefined)
    
    @scala.inline
    def setToken_lifetime(value: Double): Self = this.set("token_lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_lifetime: Self = this.set("token_lifetime", js.undefined)
    
    @scala.inline
    def setToken_lifetime_for_web(value: Double): Self = this.set("token_lifetime_for_web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_lifetime_for_web: Self = this.set("token_lifetime_for_web", js.undefined)
  }
}
