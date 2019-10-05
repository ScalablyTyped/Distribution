package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTeamMemberResult extends js.Object {
  /**
    * The project role granted to the user.
    */
  var projectRole: js.UndefOr[Role] = js.undefined
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
    */
  var userArn: js.UndefOr[UserArn] = js.undefined
}

object UpdateTeamMemberResult {
  @scala.inline
  def apply(
    projectRole: Role = null,
    remoteAccessAllowed: js.UndefOr[Boolean] = js.undefined,
    userArn: UserArn = null
  ): UpdateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    if (projectRole != null) __obj.updateDynamic("projectRole")(projectRole)
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed)
    if (userArn != null) __obj.updateDynamic("userArn")(userArn)
    __obj.asInstanceOf[UpdateTeamMemberResult]
  }
}

