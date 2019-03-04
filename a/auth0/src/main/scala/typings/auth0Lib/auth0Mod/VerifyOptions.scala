package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object VerifyOptions {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): VerifyOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[VerifyOptions]
  }
}

