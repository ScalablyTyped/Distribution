package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupMembersResponse extends js.Object {
  /**
    * The members associated to the group.
    */
  var Members: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.Members] = js.native
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.native
}

object ListGroupMembersResponse {
  @scala.inline
  def apply(Members: Members = null, NextToken: NextToken = null): ListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembersResponse]
  }
}

