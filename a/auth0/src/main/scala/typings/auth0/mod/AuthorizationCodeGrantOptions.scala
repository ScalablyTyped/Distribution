package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationCodeGrantOptions extends js.Object {
  var code: String
  var redirect_uri: String
}

object AuthorizationCodeGrantOptions {
  @scala.inline
  def apply(code: String, redirect_uri: String): AuthorizationCodeGrantOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorizationCodeGrantOptions]
  }
}

