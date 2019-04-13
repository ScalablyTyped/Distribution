package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRouteTableResult extends js.Object {
  /**
    * Information about the route table.
    */
  var RouteTable: js.UndefOr[RouteTable] = js.undefined
}

object CreateRouteTableResult {
  @scala.inline
  def apply(RouteTable: RouteTable = null): CreateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (RouteTable != null) __obj.updateDynamic("RouteTable")(RouteTable)
    __obj.asInstanceOf[CreateRouteTableResult]
  }
}

