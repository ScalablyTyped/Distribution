package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsMiddleware extends DelegateMiddleware {
  var storage: SessionStorage = js.native
  var transport: js.Array[SessionTransport] = js.native
}

object SessionsMiddleware {
  @scala.inline
  def apply(
    register: Endpoint => SimpleMiddleware,
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionsMiddleware]
  }
  @scala.inline
  implicit class SessionsMiddlewareOps[Self <: SessionsMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStorage(value: SessionStorage): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportVarargs(value: SessionTransport*): Self = this.set("transport", js.Array(value :_*))
    @scala.inline
    def setTransport(value: js.Array[SessionTransport]): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
  
}

