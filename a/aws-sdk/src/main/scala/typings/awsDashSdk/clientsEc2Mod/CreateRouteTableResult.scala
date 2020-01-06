package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteTableResult extends js.Object {
  /**
    * Information about the route table.
    */
  var RouteTable: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.RouteTable] = js.native
}

object CreateRouteTableResult {
  @scala.inline
  def apply(RouteTable: RouteTable = null): CreateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (RouteTable != null) __obj.updateDynamic("RouteTable")(RouteTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteTableResult]
  }
}

