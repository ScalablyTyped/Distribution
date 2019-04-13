package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMembersResponse extends js.Object {
  var Members: js.UndefOr[Members] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListMembersResponse {
  @scala.inline
  def apply(Members: Members = null, NextToken: NextToken = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMembersResponse]
  }
}

