package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRouteOutput extends js.Object {
  /**
    * The route that was deleted.
    */
  var route: RouteData
}

object DeleteRouteOutput {
  @scala.inline
  def apply(route: RouteData): DeleteRouteOutput = {
    val __obj = js.Dynamic.literal(route = route)
  
    __obj.asInstanceOf[DeleteRouteOutput]
  }
}

