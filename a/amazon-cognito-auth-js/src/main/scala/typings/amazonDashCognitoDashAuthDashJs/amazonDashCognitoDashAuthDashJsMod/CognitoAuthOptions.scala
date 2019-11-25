package typings.amazonDashCognitoDashAuthDashJs.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoAuthOptions extends js.Object {
  /**
    * Optional: boolean flag indicating if the data collection is enabled to support cognito advanced security features. By default, this flag is set to true.
    */
  var AdvancedSecurityDataCollectionFlag: js.UndefOr[Boolean] = js.undefined
  /**
    * Required: The application/user-pools Cognito web hostname,this is set at the Cognito console.
    */
  var AppWebDomain: String
  /**
    * Required: User pool application client id.
    */
  var ClientId: String
  /**
    * Optional: Pre-selected identity provider (this allows to automatically trigger social provider authentication flow).
    */
  var IdentityProvider: js.UndefOr[String] = js.undefined
  /**
    * Required: Required: The redirect Uri, which will be launched after authentication as signed in.
    */
  var RedirectUriSignIn: String
  /**
    * Required: The redirect Uri, which will be launched when signed out.
    */
  var RedirectUriSignOut: String
  /**
    * Optional: The token scopes
    */
  var TokenScopesArray: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional: UserPoolId for the configured cognito userPool.
    */
  var UserPoolId: js.UndefOr[String] = js.undefined
}

object CognitoAuthOptions {
  @scala.inline
  def apply(
    AppWebDomain: String,
    ClientId: String,
    RedirectUriSignIn: String,
    RedirectUriSignOut: String,
    AdvancedSecurityDataCollectionFlag: js.UndefOr[Boolean] = js.undefined,
    IdentityProvider: String = null,
    TokenScopesArray: js.Array[String] = null,
    UserPoolId: String = null
  ): CognitoAuthOptions = {
    val __obj = js.Dynamic.literal(AppWebDomain = AppWebDomain.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], RedirectUriSignIn = RedirectUriSignIn.asInstanceOf[js.Any], RedirectUriSignOut = RedirectUriSignOut.asInstanceOf[js.Any])
    if (!js.isUndefined(AdvancedSecurityDataCollectionFlag)) __obj.updateDynamic("AdvancedSecurityDataCollectionFlag")(AdvancedSecurityDataCollectionFlag.asInstanceOf[js.Any])
    if (IdentityProvider != null) __obj.updateDynamic("IdentityProvider")(IdentityProvider.asInstanceOf[js.Any])
    if (TokenScopesArray != null) __obj.updateDynamic("TokenScopesArray")(TokenScopesArray.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoAuthOptions]
  }
}

