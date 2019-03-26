package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0DashJsMod {
  type Auth0Callback[T, E] = js.Function2[/* error */ scala.Null | E, /* result */ T, scala.Unit]
  type Auth0ParseHashError = Auth0Error with auth0DashJsLib.Anon_State
  type ConsentRequiredErrorCode = auth0DashJsLib.auth0DashJsLibStrings.consent_required
  type InteractionRequiredErrorCode = auth0DashJsLib.auth0DashJsLibStrings.interaction_required
  type LoginRequiredErrorCode = auth0DashJsLib.auth0DashJsLibStrings.login_required
  /* Rewritten from type alias, can be one of: 
    - LoginRequiredErrorCode
    - InteractionRequiredErrorCode
    - ConsentRequiredErrorCode
    - auth0DashJsLib.auth0DashJsLibStrings.account_selection_required
    - auth0DashJsLib.auth0DashJsLibStrings.invalid_request_uri
    - auth0DashJsLib.auth0DashJsLibStrings.invalid_request_object
    - auth0DashJsLib.auth0DashJsLibStrings.request_not_supported
    - auth0DashJsLib.auth0DashJsLibStrings.request_uri_not_supported
    - auth0DashJsLib.auth0DashJsLibStrings.registration_not_supported
  */
  type SpecErrorCodes = _SpecErrorCodes | LoginRequiredErrorCode | InteractionRequiredErrorCode | ConsentRequiredErrorCode
}
