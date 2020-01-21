package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialsGrantOptions extends js.Object {
  var audience: String
}

object ClientCredentialsGrantOptions {
  @scala.inline
  def apply(audience: String): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
}

