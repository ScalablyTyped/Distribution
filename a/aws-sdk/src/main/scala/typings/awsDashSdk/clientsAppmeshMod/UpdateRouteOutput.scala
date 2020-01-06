package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRouteOutput extends js.Object {
  /**
    * A full description of the route that was updated.
    */
  var route: RouteData = js.native
}

object UpdateRouteOutput {
  @scala.inline
  def apply(route: RouteData): UpdateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRouteOutput]
  }
}

