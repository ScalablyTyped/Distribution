package typings
package auth0DashAngularLib.auth0Ns.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAuth0ServiceProvider extends js.Object {
  /**
          * Configures the auth service
          * @param options Client options passed into Auth0
          */
  def init(options: IAuth0ClientOptions): scala.Unit
  /**
          * @param event Name of the event to handle.
          * @param handler Event handler
          */
  def on(event: java.lang.String, handler: js.Function1[/* repeated */js.Any, _]): scala.Unit
}

