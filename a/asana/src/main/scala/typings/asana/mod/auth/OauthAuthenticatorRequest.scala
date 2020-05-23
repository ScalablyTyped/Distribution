package typings.asana.mod.auth

import typings.asana.anon.Authorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthenticatorRequest extends js.Object {
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: Authorization
}

object OauthAuthenticatorRequest {
  @scala.inline
  def apply(headers: Authorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
}

