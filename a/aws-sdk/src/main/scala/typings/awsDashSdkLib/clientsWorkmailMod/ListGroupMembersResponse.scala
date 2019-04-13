package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupMembersResponse extends js.Object {
  /**
    * The members associated to the group.
    */
  var Members: js.UndefOr[Members] = js.undefined
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListGroupMembersResponse {
  @scala.inline
  def apply(Members: Members = null, NextToken: NextToken = null): ListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupMembersResponse]
  }
}

