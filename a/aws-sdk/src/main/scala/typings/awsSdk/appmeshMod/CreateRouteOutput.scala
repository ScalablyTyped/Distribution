package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteOutput extends js.Object {
  /**
    * The full description of your mesh following the create call.
    */
  var route: RouteData = js.native
}

object CreateRouteOutput {
  @scala.inline
  def apply(route: RouteData): CreateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteOutput]
  }
}

