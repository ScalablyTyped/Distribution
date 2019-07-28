package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteUsersResponse extends js.Object {
  /**
    * The invite details.
    */
  var Invites: js.UndefOr[InviteList] = js.undefined
}

object InviteUsersResponse {
  @scala.inline
  def apply(Invites: InviteList = null): InviteUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (Invites != null) __obj.updateDynamic("Invites")(Invites)
    __obj.asInstanceOf[InviteUsersResponse]
  }
}

