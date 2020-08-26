package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegateMiddleware extends js.Object {
  def register(endpoint: Endpoint): SimpleMiddleware = js.native
}

object DelegateMiddleware {
  @scala.inline
  def apply(register: Endpoint => SimpleMiddleware): DelegateMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[DelegateMiddleware]
  }
  @scala.inline
  implicit class DelegateMiddlewareOps[Self <: DelegateMiddleware] (val x: Self) extends AnyVal {
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
    def setRegister(value: Endpoint => SimpleMiddleware): Self = this.set("register", js.Any.fromFunction1(value))
  }
  
}

