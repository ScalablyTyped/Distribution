package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMeshesInput extends js.Object {
  /**
    * The maximum number of results returned by ListMeshes in paginated output.
    When you use this parameter, ListMeshes returns only limit
    results in a single page along with a nextToken response element. You can see
    the remaining results of the initial request by sending another ListMeshes
    request with the returned nextToken value. This value can be between
    1 and 100. If you don't use this parameter,
    ListMeshes returns up to 100 results and a
    nextToken value if applicable.
    */
  var limit: js.UndefOr[ListMeshesLimit] = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListMeshes request where limit was used and the results
    exceeded the value of that parameter. Pagination continues from the end of the previous
    results that returned the nextToken value. 
    
    This token should be treated as an opaque identifier that is used only to
    retrieve the next items in a list and not for other programmatic purposes.
    
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListMeshesInput {
  @scala.inline
  def apply(limit: js.UndefOr[ListMeshesLimit] = js.undefined, nextToken: String = null): ListMeshesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMeshesInput]
  }
}

