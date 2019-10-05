package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsRequest extends js.Object {
  /**
    * The maximum number of items that you want in the response. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  /**
    * Paginates results. On your first call to the ListInvitations operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous response to continue listing data. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.undefined
}

object ListInvitationsRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInvitationsRequest]
  }
}

