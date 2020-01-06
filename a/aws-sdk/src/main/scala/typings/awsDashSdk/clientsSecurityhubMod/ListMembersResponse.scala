package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersResponse extends js.Object {
  /**
    * Member details returned by the operation.
    */
  var Members: js.UndefOr[MemberList] = js.native
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListMembersResponse {
  @scala.inline
  def apply(Members: MemberList = null, NextToken: NonEmptyString = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersResponse]
  }
}

