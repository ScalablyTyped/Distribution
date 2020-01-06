package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTeamMemberResult extends js.Object {
  /**
    * The project role granted to the user.
    */
  var projectRole: js.UndefOr[Role] = js.native
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
    */
  var userArn: js.UndefOr[UserArn] = js.native
}

object UpdateTeamMemberResult {
  @scala.inline
  def apply(
    projectRole: Role = null,
    remoteAccessAllowed: js.UndefOr[Boolean] = js.undefined,
    userArn: UserArn = null
  ): UpdateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    if (projectRole != null) __obj.updateDynamic("projectRole")(projectRole.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTeamMemberResult]
  }
}

