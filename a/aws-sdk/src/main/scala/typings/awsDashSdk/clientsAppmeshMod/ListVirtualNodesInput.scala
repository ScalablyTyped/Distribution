package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualNodesInput extends js.Object {
  /**
    * The maximum number of results returned by ListVirtualNodes in paginated
    output. When you use this parameter, ListVirtualNodes returns only
    limit results in a single page along with a nextToken response
    element. You can see the remaining results of the initial request by sending another
    ListVirtualNodes request with the returned nextToken value.
    This value can be between 1 and 100. If you don't use this
    parameter, ListVirtualNodes returns up to 100 results and a
    nextToken value if applicable.
    */
  var limit: js.UndefOr[ListVirtualNodesLimit] = js.native
  /**
    * The name of the service mesh to list virtual nodes in.
    */
  var meshName: ResourceName = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListVirtualNodes request where limit was used and the results
    exceeded the value of that parameter. Pagination continues from the end of the previous
    results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListVirtualNodesInput {
  @scala.inline
  def apply(meshName: ResourceName, limit: Int | Double = null, nextToken: String = null): ListVirtualNodesInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualNodesInput]
  }
}

