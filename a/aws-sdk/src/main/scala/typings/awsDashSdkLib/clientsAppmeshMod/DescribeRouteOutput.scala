package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRouteOutput extends js.Object {
  /**
    * The full description of your route.
    */
  var route: RouteData
}

object DescribeRouteOutput {
  @scala.inline
  def apply(route: RouteData): DescribeRouteOutput = {
    val __obj = js.Dynamic.literal(route = route)
  
    __obj.asInstanceOf[DescribeRouteOutput]
  }
}

