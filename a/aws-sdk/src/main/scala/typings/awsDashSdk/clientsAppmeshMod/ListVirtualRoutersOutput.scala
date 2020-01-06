package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualRoutersOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListVirtualRouters
    request. When the results of a ListVirtualRouters request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of existing virtual routers for the specified service mesh.
    */
  var virtualRouters: VirtualRouterList = js.native
}

object ListVirtualRoutersOutput {
  @scala.inline
  def apply(virtualRouters: VirtualRouterList, nextToken: String = null): ListVirtualRoutersOutput = {
    val __obj = js.Dynamic.literal(virtualRouters = virtualRouters.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualRoutersOutput]
  }
}

