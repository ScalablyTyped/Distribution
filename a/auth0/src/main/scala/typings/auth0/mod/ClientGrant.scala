package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<auth0.auth0.CreateClientGrant> & {  id ? :string} */
trait ClientGrant extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  /**
    * The id of the client grant.
    */
  var id: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[js.Array[String]] = js.undefined
}

object ClientGrant {
  @scala.inline
  def apply(
    audience: String = null,
    client_id: String = null,
    id: String = null,
    scope: js.Array[String] = null
  ): ClientGrant = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGrant]
  }
}

