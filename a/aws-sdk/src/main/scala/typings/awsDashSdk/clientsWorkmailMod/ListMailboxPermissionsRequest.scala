package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMailboxPermissionsRequest extends js.Object {
  /**
    * The identifier of the user, group, or resource for which to list mailbox permissions.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MaxResults] = js.undefined
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * The identifier of the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object ListMailboxPermissionsRequest {
  @scala.inline
  def apply(
    EntityId: WorkMailIdentifier,
    OrganizationId: OrganizationId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListMailboxPermissionsRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId, OrganizationId = OrganizationId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMailboxPermissionsRequest]
  }
}

