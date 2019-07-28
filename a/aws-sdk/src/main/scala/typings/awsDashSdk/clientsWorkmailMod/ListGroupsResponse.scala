package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsResponse extends js.Object {
  /**
    * The overview of groups for an organization.
    */
  var Groups: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.Groups] = js.undefined
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
}

object ListGroupsResponse {
  @scala.inline
  def apply(Groups: Groups = null, NextToken: NextToken = null): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

