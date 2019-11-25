package typings.asana.asanaMod.auth

import typings.asana.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticatorRequest extends js.Object {
  var auth: Anon_Password
}

object BasicAuthenticatorRequest {
  @scala.inline
  def apply(auth: Anon_Password): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
}

