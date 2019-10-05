package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvitationsCountResponse extends js.Object {
  /**
    * The number of all membership invitations sent to this Security Hub member account, not including the currently accepted invitation. 
    */
  var InvitationsCount: js.UndefOr[Integer] = js.undefined
}

object GetInvitationsCountResponse {
  @scala.inline
  def apply(InvitationsCount: Int | scala.Double = null): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    if (InvitationsCount != null) __obj.updateDynamic("InvitationsCount")(InvitationsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
}

