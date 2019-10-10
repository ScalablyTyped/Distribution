package typings.auth0.auth0Mod

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
    val __obj = js.Dynamic.literal(code = code, redirect_uri = redirect_uri)
  
    __obj.asInstanceOf[AuthorizationCodeGrantOptions]
  }
}

