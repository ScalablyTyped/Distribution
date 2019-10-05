package typings.asana.asanaMod.auth

import typings.asana.Anon_Authorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthenticatorRequest extends js.Object {
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: Anon_Authorization
}

object OauthAuthenticatorRequest {
  @scala.inline
  def apply(headers: Anon_Authorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
}

