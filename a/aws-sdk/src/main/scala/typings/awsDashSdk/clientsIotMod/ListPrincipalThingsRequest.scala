package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPrincipalThingsRequest extends js.Object {
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The principal.
    */
  var principal: Principal
}

object ListPrincipalThingsRequest {
  @scala.inline
  def apply(
    principal: Principal,
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListPrincipalThingsRequest = {
    val __obj = js.Dynamic.literal(principal = principal)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListPrincipalThingsRequest]
  }
}

