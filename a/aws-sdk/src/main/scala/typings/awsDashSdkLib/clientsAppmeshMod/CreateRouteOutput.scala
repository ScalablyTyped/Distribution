package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRouteOutput extends js.Object {
  /**
    * The full description of your mesh following the create call.
    */
  var route: RouteData
}

object CreateRouteOutput {
  @scala.inline
  def apply(route: RouteData): CreateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route)
  
    __obj.asInstanceOf[CreateRouteOutput]
  }
}

