package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialsGrantOptions extends js.Object {
  var audience: java.lang.String
}

object ClientCredentialsGrantOptions {
  @scala.inline
  def apply(audience: java.lang.String): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience)
  
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
}

