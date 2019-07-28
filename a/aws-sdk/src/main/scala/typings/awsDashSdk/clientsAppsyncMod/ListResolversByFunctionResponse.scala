package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolversByFunctionResponse extends js.Object {
  /**
    * An identifier that can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The list of resolvers.
    */
  var resolvers: js.UndefOr[Resolvers] = js.undefined
}

object ListResolversByFunctionResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, resolvers: Resolvers = null): ListResolversByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[ListResolversByFunctionResponse]
  }
}

