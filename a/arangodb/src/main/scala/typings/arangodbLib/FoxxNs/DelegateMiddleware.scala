package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegateMiddleware extends js.Object {
  def register(endpoint: Endpoint): SimpleMiddleware
}

object DelegateMiddleware {
  @scala.inline
  def apply(register: Endpoint => SimpleMiddleware): DelegateMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[DelegateMiddleware]
  }
}

