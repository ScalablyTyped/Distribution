package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: TcpRouteAction = js.native
  var timeout: js.UndefOr[TcpTimeout] = js.native
}

object TcpRoute {
  @scala.inline
  def apply(action: TcpRouteAction, timeout: TcpTimeout = null): TcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpRoute]
  }
}

