package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoAuthOptions extends js.Object {
  /**
    * Optional: boolean flag indicating if the data collection is enabled to support cognito advanced security features. By default, this flag is set to true.
    */
  var AdvancedSecurityDataCollectionFlag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Required: The application/user-pools Cognito web hostname,this is set at the Cognito console.
    */
  var AppWebDomain: java.lang.String
  /**
    * Required: User pool application client id.
    */
  var ClientId: java.lang.String
  /**
    * Optional: Pre-selected identity provider (this allows to automatically trigger social provider authentication flow).
    */
  var IdentityProvider: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required: Required: The redirect Uri, which will be launched after authentication as signed in.
    */
  var RedirectUriSignIn: java.lang.String
  /**
    * Required: The redirect Uri, which will be launched when signed out.
    */
  var RedirectUriSignOut: java.lang.String
  /**
    * Optional: The token scopes
    */
  var TokenScopesArray: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Optional: UserPoolId for the configured cognito userPool.
    */
  var UserPoolId: js.UndefOr[java.lang.String] = js.undefined
}

