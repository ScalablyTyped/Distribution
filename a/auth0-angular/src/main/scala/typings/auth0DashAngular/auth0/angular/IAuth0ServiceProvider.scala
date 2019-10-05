package typings.auth0DashAngular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuth0ServiceProvider extends js.Object {
  /**
    * Configures the auth service
    * @param options Client options passed into Auth0
    */
  def init(options: IAuth0ClientOptions): Unit
  /**
    * @param event Name of the event to handle.
    * @param handler Event handler
    */
  def on(event: String, handler: js.Function1[/* repeated */ js.Any, _]): Unit
}

object IAuth0ServiceProvider {
  @scala.inline
  def apply(init: IAuth0ClientOptions => Unit, on: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): IAuth0ServiceProvider = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[IAuth0ServiceProvider]
  }
}

