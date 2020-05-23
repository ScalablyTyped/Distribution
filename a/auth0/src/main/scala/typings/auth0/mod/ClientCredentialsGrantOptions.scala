package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialsGrantOptions extends js.Object {
  var audience: String
  var scope: String
}

object ClientCredentialsGrantOptions {
  @scala.inline
  def apply(audience: String, scope: String): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
}

