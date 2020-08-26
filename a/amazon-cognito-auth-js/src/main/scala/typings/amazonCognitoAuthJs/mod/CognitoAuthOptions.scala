package typings.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoAuthOptions extends js.Object {
  /**
    * Optional: boolean flag indicating if the data collection is enabled to support cognito advanced security features. By default, this flag is set to true.
    */
  var AdvancedSecurityDataCollectionFlag: js.UndefOr[Boolean] = js.native
  /**
    * Required: The application/user-pools Cognito web hostname,this is set at the Cognito console.
    */
  var AppWebDomain: String = js.native
  /**
    * Required: User pool application client id.
    */
  var ClientId: String = js.native
  /**
    * Optional: Pre-selected identity provider (this allows to automatically trigger social provider authentication flow).
    */
  var IdentityProvider: js.UndefOr[String] = js.native
  /**
    * Required: Required: The redirect Uri, which will be launched after authentication as signed in.
    */
  var RedirectUriSignIn: String = js.native
  /**
    * Required: The redirect Uri, which will be launched when signed out.
    */
  var RedirectUriSignOut: String = js.native
  /**
    * Optional: The token scopes
    */
  var TokenScopesArray: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional: UserPoolId for the configured cognito userPool.
    */
  var UserPoolId: js.UndefOr[String] = js.native
}

object CognitoAuthOptions {
  @scala.inline
  def apply(AppWebDomain: String, ClientId: String, RedirectUriSignIn: String, RedirectUriSignOut: String): CognitoAuthOptions = {
    val __obj = js.Dynamic.literal(AppWebDomain = AppWebDomain.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], RedirectUriSignIn = RedirectUriSignIn.asInstanceOf[js.Any], RedirectUriSignOut = RedirectUriSignOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoAuthOptions]
  }
  @scala.inline
  implicit class CognitoAuthOptionsOps[Self <: CognitoAuthOptions] (val x: Self) extends AnyVal {
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
    def setAppWebDomain(value: String): Self = this.set("AppWebDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectUriSignIn(value: String): Self = this.set("RedirectUriSignIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectUriSignOut(value: String): Self = this.set("RedirectUriSignOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvancedSecurityDataCollectionFlag(value: Boolean): Self = this.set("AdvancedSecurityDataCollectionFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedSecurityDataCollectionFlag: Self = this.set("AdvancedSecurityDataCollectionFlag", js.undefined)
    @scala.inline
    def setIdentityProvider(value: String): Self = this.set("IdentityProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProvider: Self = this.set("IdentityProvider", js.undefined)
    @scala.inline
    def setTokenScopesArrayVarargs(value: String*): Self = this.set("TokenScopesArray", js.Array(value :_*))
    @scala.inline
    def setTokenScopesArray(value: js.Array[String]): Self = this.set("TokenScopesArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenScopesArray: Self = this.set("TokenScopesArray", js.undefined)
    @scala.inline
    def setUserPoolId(value: String): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
  
}

