package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteUsersResponse extends js.Object {
  /**
    * The email invitation details.
    */
  var Invites: js.UndefOr[InviteList] = js.native
}

object InviteUsersResponse {
  @scala.inline
  def apply(Invites: InviteList = null): InviteUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (Invites != null) __obj.updateDynamic("Invites")(Invites.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteUsersResponse]
  }
}

