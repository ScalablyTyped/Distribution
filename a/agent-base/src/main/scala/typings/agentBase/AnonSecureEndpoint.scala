package typings.agentBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecureEndpoint extends js.Object {
  var secureEndpoint: Boolean
}

object AnonSecureEndpoint {
  @scala.inline
  def apply(secureEndpoint: Boolean): AnonSecureEndpoint = {
    val __obj = js.Dynamic.literal(secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSecureEndpoint]
  }
}

