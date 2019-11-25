package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientGrant extends js.Object {
  /**
    * The audience.
    */
  var audience: String
  /**
    * The identifier of the resource server.
    */
  var client_id: String
  var scope: js.Array[String]
}

object CreateClientGrant {
  @scala.inline
  def apply(audience: String, client_id: String, scope: js.Array[String]): CreateClientGrant = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateClientGrant]
  }
}

