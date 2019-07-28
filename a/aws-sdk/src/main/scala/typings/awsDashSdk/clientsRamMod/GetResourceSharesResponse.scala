package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceSharesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the resource shares.
    */
  var resourceShares: js.UndefOr[ResourceShareList] = js.undefined
}

object GetResourceSharesResponse {
  @scala.inline
  def apply(nextToken: String = null, resourceShares: ResourceShareList = null): GetResourceSharesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceShares != null) __obj.updateDynamic("resourceShares")(resourceShares)
    __obj.asInstanceOf[GetResourceSharesResponse]
  }
}

