package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  var Invitations: js.UndefOr[Invitations] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(Invitations: Invitations = null, NextToken: NextToken = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

