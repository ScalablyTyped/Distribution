package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVirtualRoutersInput extends js.Object {
  /**
    * The maximum number of results returned by ListVirtualRouters in paginated
    output. When you use this parameter, ListVirtualRouters returns only
    limit results in a single page along with a nextToken response
    element. You can see the remaining results of the initial request by sending another
    ListVirtualRouters request with the returned nextToken value.
    This value can be between 1 and 100. If you don't use this
    parameter, ListVirtualRouters returns up to 100 results and
    a nextToken value if applicable.
    */
  var limit: js.UndefOr[ListVirtualRoutersLimit] = js.undefined
  /**
    * The name of the service mesh to list virtual routers in.
    */
  var meshName: ResourceName
  /**
    * The nextToken value returned from a previous paginated
    ListVirtualRouters request where limit was used and the
    results exceeded the value of that parameter. Pagination continues from the end of the
    previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListVirtualRoutersInput {
  @scala.inline
  def apply(meshName: ResourceName, limit: Int | Double = null, nextToken: String = null): ListVirtualRoutersInput = {
    val __obj = js.Dynamic.literal(meshName = meshName)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListVirtualRoutersInput]
  }
}

