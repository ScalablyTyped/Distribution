package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MaxResults] = js.undefined
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * The identifier for the organization under which the users exist.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object ListUsersRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListUsersRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsersRequest]
  }
}

