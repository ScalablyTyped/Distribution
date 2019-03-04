package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticatorRequest extends js.Object {
  var auth: asanaLib.Anon_Password
}

object BasicAuthenticatorRequest {
  @scala.inline
  def apply(auth: asanaLib.Anon_Password): BasicAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(auth = auth)
  
    __obj.asInstanceOf[BasicAuthenticatorRequest]
  }
}

