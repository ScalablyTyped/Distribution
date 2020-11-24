package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenIDConnectConfig extends js.Object {
  
  /**
    * The number of milliseconds a token is valid after being authenticated.
    */
  var authTTL: js.UndefOr[Long] = js.native
  
  /**
    * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The number of milliseconds a token is valid after being issued to a user.
    */
  var iatTTL: js.UndefOr[Long] = js.native
  
  /**
    * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of iss in the ID token.
    */
  var issuer: String = js.native
}
object OpenIDConnectConfig {
  
  @scala.inline
  def apply(issuer: String): OpenIDConnectConfig = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIDConnectConfig]
  }
  
  @scala.inline
  implicit class OpenIDConnectConfigOps[Self <: OpenIDConnectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTTL(value: Long): Self = this.set("authTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTTL: Self = this.set("authTTL", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setIatTTL(value: Long): Self = this.set("iatTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIatTTL: Self = this.set("iatTTL", js.undefined)
  }
}
