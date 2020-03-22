package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Partial<auth0.auth0.CreateClientGrant>, 'scope'> */
trait UpdateClientGrant extends js.Object {
  var scope: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateClientGrant {
  @scala.inline
  def apply(scope: js.Array[String] = null): UpdateClientGrant = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClientGrant]
  }
}

