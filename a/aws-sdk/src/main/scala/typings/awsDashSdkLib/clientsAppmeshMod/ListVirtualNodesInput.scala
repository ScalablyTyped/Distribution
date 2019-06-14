package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined
  /**
    * The name of the service mesh to list virtual nodes in.
    */
  var meshName: ResourceName
  /**
    * The nextToken value returned from a previous paginated
    ListVirtualNodes request where limit was used and the results
    exceeded the value of that parameter. Pagination continues from the end of the previous
    results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListVirtualNodesInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined,
    nextToken: String = null
  ): ListVirtualNodesInput = {
    val __obj = js.Dynamic.literal(meshName = meshName)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListVirtualNodesInput]
  }
}

