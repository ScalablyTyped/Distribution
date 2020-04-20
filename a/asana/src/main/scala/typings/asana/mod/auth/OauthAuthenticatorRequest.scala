package typings.asana.mod.auth

import typings.asana.AnonAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthenticatorRequest extends js.Object {
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: AnonAuthorization
}

object OauthAuthenticatorRequest {
  @scala.inline
  def apply(headers: AnonAuthorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
}

