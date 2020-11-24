package typings.adalNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenResponse
  extends /* x */ StringDictionary[js.Any] {
  
  /**
    * @property {string} accessToken The returned access token.
    */
  var accessToken: String = js.native
  
  /**
    * @property {Date} [createdOn] The date on which the access token was created.
    */
  var createdOn: js.UndefOr[Date | String] = js.native
  
  /**
    * @property {any} [error] Provides information about error if any.
    */
  var error: js.UndefOr[js.Any] = js.native
  
  /**
    * @property {any} [errorDescription] Short description about error if any.
    */
  var errorDescription: js.UndefOr[js.Any] = js.native
  
  /**
    *  @property {int} expiresIn The amount of time, in seconds, for which the token is valid.
    */
  var expiresIn: Double = js.native
  
  /**
    *  @property {Date} expiresOn The Date on which the access token expires.
    */
  var expiresOn: Date | String = js.native
  
  /**
    * @property {string} [familyName] The family name of the principal represented by the access token.
    */
  var familyName: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [givenName] The given name of the principal represented by the access token.
    */
  var givenName: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [identityProvider] Identifies the identity provider that issued the access token.
    */
  var identityProvider: js.UndefOr[String] = js.native
  
  /**
    * @property {boolean}   [isUserIdDisplayable] Indicates whether the user_id property will be meaningful if displayed to a user.
    */
  var isUserIdDisplayable: js.UndefOr[Boolean] = js.native
  
  /**
    * @property {string} [oid] The object id of the user in the tenant
    */
  var oid: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [refreshToken] A refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.native
  
  /**
    * @property {string} resource The resource for which the token was requested for. Example: 'https://management.core.windows.net/'.
    */
  var resource: String = js.native
  
  /**
    * @property {string} [tenantId] The identifier of the tenant under which the access token was issued.
    */
  var tenantId: js.UndefOr[String] = js.native
  
  /**
    * @property {string} tokenType The type of token returned. Example 'Bearer'.
    */
  var tokenType: String = js.native
  
  /**
    * @property {string} [userId] An id for the user.  May be a displayable value if is_user_id_displayable is true.
    */
  var userId: js.UndefOr[String] = js.native
}
object TokenResponse {
  
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: Double,
    expiresOn: Date | String,
    resource: String,
    tokenType: String
  ): TokenResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
  
  @scala.inline
  implicit class TokenResponseOps[Self <: TokenResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresOn(value: Date | String): Self = this.set("expiresOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: Date | String): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedOn: Self = this.set("createdOn", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorDescription(value: js.Any): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDescription: Self = this.set("errorDescription", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setIdentityProvider(value: String): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityProvider: Self = this.set("identityProvider", js.undefined)
    
    @scala.inline
    def setIsUserIdDisplayable(value: Boolean): Self = this.set("isUserIdDisplayable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUserIdDisplayable: Self = this.set("isUserIdDisplayable", js.undefined)
    
    @scala.inline
    def setOid(value: String): Self = this.set("oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOid: Self = this.set("oid", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
