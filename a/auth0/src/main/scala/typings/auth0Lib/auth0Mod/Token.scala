package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var aud: java.lang.String
  var jti: java.lang.String
}

object Token {
  @scala.inline
  def apply(aud: java.lang.String, jti: java.lang.String): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aud")(aud)
    __obj.updateDynamic("jti")(jti)
    __obj.asInstanceOf[Token]
  }
}

