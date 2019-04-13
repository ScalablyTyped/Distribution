package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRoutesInput extends js.Object {
  /**
    * The maximum number of results returned by ListRoutes in paginated output.
    When you use this parameter, ListRoutes returns only limit
    results in a single page along with a nextToken response element. You can see the
    remaining results of the initial request by sending another
    ListRoutes request with the returned nextToken value. This
    value can be between 1 and 100. If you don't use this parameter,
    ListRoutes returns up to 100 results and a
    nextToken value if applicable.
    */
  var limit: js.UndefOr[ListRoutesLimit] = js.undefined
  /**
    * The name of the service mesh to list routes in.
    */
  var meshName: ResourceName
  /**
    * The nextToken value returned from a previous paginated
    ListRoutes request where limit was used and the
    results exceeded the value of that parameter. Pagination continues from the end of the
    previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the virtual router to list routes in.
    */
  var virtualRouterName: ResourceName
}

object ListRoutesInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    virtualRouterName: ResourceName,
    limit: js.UndefOr[ListRoutesLimit] = js.undefined,
    nextToken: String = null
  ): ListRoutesInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualRouterName = virtualRouterName)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListRoutesInput]
  }
}

