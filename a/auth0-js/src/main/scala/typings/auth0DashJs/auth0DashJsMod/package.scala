package typings.auth0DashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0DashJsMod {
  import typings.auth0DashJs.Anon_State
  import typings.auth0DashJs.auth0DashJsStrings.consent_required
  import typings.auth0DashJs.auth0DashJsStrings.interaction_required
  import typings.auth0DashJs.auth0DashJsStrings.login_required

  type Auth0Callback[T, E] = js.Function2[/* error */ Null | E, /* result */ T, Unit]
  type Auth0ParseHashError = Auth0Error with Anon_State
  type ConsentRequiredErrorCode = consent_required
  type InteractionRequiredErrorCode = interaction_required
  type LoginRequiredErrorCode = login_required
  /* Rewritten from type alias, can be one of: 
    - typings.auth0DashJs.auth0DashJsMod.LoginRequiredErrorCode
    - typings.auth0DashJs.auth0DashJsMod.InteractionRequiredErrorCode
    - typings.auth0DashJs.auth0DashJsMod.ConsentRequiredErrorCode
    - typings.auth0DashJs.auth0DashJsStrings.account_selection_required
    - typings.auth0DashJs.auth0DashJsStrings.invalid_request_uri
    - typings.auth0DashJs.auth0DashJsStrings.invalid_request_object
    - typings.auth0DashJs.auth0DashJsStrings.request_not_supported
    - typings.auth0DashJs.auth0DashJsStrings.request_uri_not_supported
    - typings.auth0DashJs.auth0DashJsStrings.registration_not_supported
  */
  type SpecErrorCodes = _SpecErrorCodes | LoginRequiredErrorCode | InteractionRequiredErrorCode | ConsentRequiredErrorCode
}
