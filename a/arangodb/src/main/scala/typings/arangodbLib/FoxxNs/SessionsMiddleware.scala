package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsMiddleware extends DelegateMiddleware {
  var storage: SessionStorage
  var transport: js.Array[SessionTransport]
}

object SessionsMiddleware {
  @scala.inline
  def apply(
    register: js.Function1[Endpoint, SimpleMiddleware],
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("storage")(storage)
    __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[SessionsMiddleware]
  }
}

