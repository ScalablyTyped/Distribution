package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  /**
    * A list of invitation descriptions.
    */
  var Invitations: js.UndefOr[Invitations] = js.undefined
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(Invitations: Invitations = null, NextToken: String = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

