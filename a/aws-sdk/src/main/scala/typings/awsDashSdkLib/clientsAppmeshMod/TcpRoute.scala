package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpRoute extends js.Object {
  /**
    * The action to take if a match is determined.
    */
  var action: TcpRouteAction
}

object TcpRoute {
  @scala.inline
  def apply(action: TcpRouteAction): TcpRoute = {
    val __obj = js.Dynamic.literal(action = action)
  
    __obj.asInstanceOf[TcpRoute]
  }
}

