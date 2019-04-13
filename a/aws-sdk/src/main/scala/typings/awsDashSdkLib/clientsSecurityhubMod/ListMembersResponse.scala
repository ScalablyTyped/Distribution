package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMembersResponse extends js.Object {
  /**
    * Member details returned by the operation.
    */
  var Members: js.UndefOr[MemberList] = js.undefined
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
}

object ListMembersResponse {
  @scala.inline
  def apply(Members: MemberList = null, NextToken: NonEmptyString = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMembersResponse]
  }
}

