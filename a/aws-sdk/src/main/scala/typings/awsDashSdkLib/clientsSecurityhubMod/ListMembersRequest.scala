package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMembersRequest extends js.Object {
  /**
    * The maximum number of items that you want in the response. 
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Specifies which member accounts the response includes based on their relationship status with the master account. The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the response includes all existing member accounts. 
    */
  var OnlyAssociated: js.UndefOr[Boolean] = js.undefined
}

object ListMembersRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    OnlyAssociated: js.UndefOr[Boolean] = js.undefined
  ): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(OnlyAssociated)) __obj.updateDynamic("OnlyAssociated")(OnlyAssociated)
    __obj.asInstanceOf[ListMembersRequest]
  }
}

