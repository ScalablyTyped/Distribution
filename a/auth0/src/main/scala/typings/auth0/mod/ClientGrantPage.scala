package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGrantPage extends Page {
  var client_grants: js.Array[ClientGrant]
}

object ClientGrantPage {
  @scala.inline
  def apply(client_grants: js.Array[ClientGrant], length: Double, limit: Double, start: Double, total: Double): ClientGrantPage = {
    val __obj = js.Dynamic.literal(client_grants = client_grants.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGrantPage]
  }
}

