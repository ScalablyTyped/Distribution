package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientParams extends js.Object {
  var client_id: String
}

object ClientParams {
  @scala.inline
  def apply(client_id: String): ClientParams = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientParams]
  }
}

