package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolversResponse extends js.Object {
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The Resolver objects.
    */
  var resolvers: js.UndefOr[Resolvers] = js.undefined
}

object ListResolversResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, resolvers: Resolvers = null): ListResolversResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[ListResolversResponse]
  }
}

