package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTeamMemberRequest extends js.Object {
  /**
    * The ID of the project.
    */
  var projectId: ProjectId = js.native
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide.
    */
  var projectRole: js.UndefOr[Role] = js.native
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile. Even if this is set to True, the user must associate a public key with their profile before the user can access resources.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user for whom you want to change team membership attributes.
    */
  var userArn: UserArn = js.native
}

object UpdateTeamMemberRequest {
  @scala.inline
  def apply(
    projectId: ProjectId,
    userArn: UserArn,
    projectRole: Role = null,
    remoteAccessAllowed: js.UndefOr[Boolean] = js.undefined
  ): UpdateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (projectRole != null) __obj.updateDynamic("projectRole")(projectRole.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTeamMemberRequest]
  }
}

