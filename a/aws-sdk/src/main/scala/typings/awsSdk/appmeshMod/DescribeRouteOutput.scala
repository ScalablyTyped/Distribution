package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRouteOutput extends js.Object {
  /**
    * The full description of your route.
    */
  var route: RouteData = js.native
}

object DescribeRouteOutput {
  @scala.inline
  def apply(route: RouteData): DescribeRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRouteOutput]
  }
}

