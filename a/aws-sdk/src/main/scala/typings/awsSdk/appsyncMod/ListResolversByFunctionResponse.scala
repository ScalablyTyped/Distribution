package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolversByFunctionResponse extends js.Object {
  /**
    * An identifier that can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of resolvers.
    */
  var resolvers: js.UndefOr[Resolvers] = js.native
}

object ListResolversByFunctionResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, resolvers: Resolvers = null): ListResolversByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResolversByFunctionResponse]
  }
}

