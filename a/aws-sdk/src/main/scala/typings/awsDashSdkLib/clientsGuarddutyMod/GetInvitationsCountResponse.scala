package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvitationsCountResponse extends js.Object {
  /**
    * The number of received invitations.
    */
  var InvitationsCount: js.UndefOr[__integer] = js.undefined
}

object GetInvitationsCountResponse {
  @scala.inline
  def apply(InvitationsCount: js.UndefOr[__integer] = js.undefined): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InvitationsCount)) __obj.updateDynamic("InvitationsCount")(InvitationsCount)
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
}

