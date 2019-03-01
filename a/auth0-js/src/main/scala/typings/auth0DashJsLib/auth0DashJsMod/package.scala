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
  type SpecErrorCodes = _SpecErrorCodes | LoginRequiredErrorCode | InteractionRequiredErrorCode | ConsentRequiredErrorCode
}
