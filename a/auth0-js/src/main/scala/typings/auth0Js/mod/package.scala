package typings.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Auth0Callback[T, E] = js.Function2[/* error */ scala.Null | E, /* result */ T, scala.Unit]
  
  type ConsentRequiredErrorCode = typings.auth0Js.auth0JsStrings.consent_required
  
  type InteractionRequiredErrorCode = typings.auth0Js.auth0JsStrings.interaction_required
  
  type LoginRequiredErrorCode = typings.auth0Js.auth0JsStrings.login_required
  
  /* Rewritten from type alias, can be one of: 
    - typings.auth0Js.mod.LoginRequiredErrorCode
    - typings.auth0Js.mod.InteractionRequiredErrorCode
    - typings.auth0Js.mod.ConsentRequiredErrorCode
    - typings.auth0Js.auth0JsStrings.account_selection_required
    - typings.auth0Js.auth0JsStrings.invalid_request_uri
    - typings.auth0Js.auth0JsStrings.invalid_request_object
    - typings.auth0Js.auth0JsStrings.request_not_supported
    - typings.auth0Js.auth0JsStrings.request_uri_not_supported
    - typings.auth0Js.auth0JsStrings.registration_not_supported
  */
  type SpecErrorCodes = typings.auth0Js.mod._SpecErrorCodes | typings.auth0Js.mod.LoginRequiredErrorCode | typings.auth0Js.mod.InteractionRequiredErrorCode | typings.auth0Js.mod.ConsentRequiredErrorCode
}
