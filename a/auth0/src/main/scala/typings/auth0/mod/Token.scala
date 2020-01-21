package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var aud: String
  var jti: String
}

object Token {
  @scala.inline
  def apply(aud: String, jti: String): Token = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Token]
  }
}

