package typings.asana.mod.auth

import typings.asana.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticatorRequest extends js.Object {
  var auth: AnonPassword
}

object BasicAuthenticatorRequest {
  @scala.inline
  def apply(auth: AnonPassword): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
}

