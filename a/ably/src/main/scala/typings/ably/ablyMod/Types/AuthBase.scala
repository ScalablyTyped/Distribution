package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBase extends js.Object {
  var clientId: String
}

object AuthBase {
  @scala.inline
  def apply(clientId: String): AuthBase = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthBase]
  }
}

