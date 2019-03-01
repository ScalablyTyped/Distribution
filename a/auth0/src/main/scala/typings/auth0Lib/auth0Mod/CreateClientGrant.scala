package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientGrant extends js.Object {
  /**
    * The audience.
    */
  var audience: java.lang.String
  /**
    * The identifier of the resource server.
    */
  var client_id: java.lang.String
  var scope: js.Array[java.lang.String]
}

object CreateClientGrant {
  @scala.inline
  def apply(audience: java.lang.String, client_id: java.lang.String, scope: js.Array[java.lang.String]): CreateClientGrant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audience")(audience)
    __obj.updateDynamic("client_id")(client_id)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[CreateClientGrant]
  }
}

