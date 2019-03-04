package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthenticatorRequest extends js.Object {
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: asanaLib.Anon_Authorization
}

object OauthAuthenticatorRequest {
  @scala.inline
  def apply(headers: asanaLib.Anon_Authorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
}

