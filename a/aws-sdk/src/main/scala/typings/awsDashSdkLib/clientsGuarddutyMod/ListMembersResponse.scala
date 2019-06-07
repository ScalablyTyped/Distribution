package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: js.UndefOr[Members] = js.undefined
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListMembersResponse {
  @scala.inline
  def apply(Members: Members = null, NextToken: String = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMembersResponse]
  }
}

