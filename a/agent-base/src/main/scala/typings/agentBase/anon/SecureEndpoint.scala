package typings.agentBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureEndpoint extends js.Object {
  var secureEndpoint: Boolean
}

object SecureEndpoint {
  @scala.inline
  def apply(secureEndpoint: Boolean): SecureEndpoint = {
    val __obj = js.Dynamic.literal(secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureEndpoint]
  }
}

