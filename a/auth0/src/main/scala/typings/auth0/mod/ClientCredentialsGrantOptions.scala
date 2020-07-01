package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialsGrantOptions extends js.Object {
  var audience: String
  var scope: js.UndefOr[String] = js.undefined
}

object ClientCredentialsGrantOptions {
  @scala.inline
  def apply(audience: String, scope: String = null): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
}

