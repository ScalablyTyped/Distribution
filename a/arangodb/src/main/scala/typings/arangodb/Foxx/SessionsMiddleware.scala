package typings.arangodb.Foxx

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
    register: Endpoint => SimpleMiddleware,
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), storage = storage, transport = transport)
  
    __obj.asInstanceOf[SessionsMiddleware]
  }
}

