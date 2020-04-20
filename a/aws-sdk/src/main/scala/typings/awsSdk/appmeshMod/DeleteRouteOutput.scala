package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteOutput extends js.Object {
  /**
    * The route that was deleted.
    */
  var route: RouteData = js.native
}

object DeleteRouteOutput {
  @scala.inline
  def apply(route: RouteData): DeleteRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteOutput]
  }
}

