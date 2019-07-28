package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBase extends js.Object {
  var clientId: String
}

object AuthBase {
  @scala.inline
  def apply(clientId: String): AuthBase = {
    val __obj = js.Dynamic.literal(clientId = clientId)
  
    __obj.asInstanceOf[AuthBase]
  }
}

