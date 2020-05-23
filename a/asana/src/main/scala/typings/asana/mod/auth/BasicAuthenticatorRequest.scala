package typings.asana.mod.auth

import typings.asana.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticatorRequest extends js.Object {
  var auth: Password
}

object BasicAuthenticatorRequest {
  @scala.inline
  def apply(auth: Password): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
}

