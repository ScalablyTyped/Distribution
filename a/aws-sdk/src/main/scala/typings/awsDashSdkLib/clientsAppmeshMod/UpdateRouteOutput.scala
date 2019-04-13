package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRouteOutput extends js.Object {
  /**
    * A full description of the route that was updated.
    */
  var route: RouteData
}

object UpdateRouteOutput {
  @scala.inline
  def apply(route: RouteData): UpdateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route)
  
    __obj.asInstanceOf[UpdateRouteOutput]
  }
}

