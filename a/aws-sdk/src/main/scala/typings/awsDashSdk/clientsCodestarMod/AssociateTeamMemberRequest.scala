package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateTeamMemberRequest extends js.Object {
  /**
    * A user- or system-generated token that identifies the entity that requested the team member association to the project. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The ID of the project to which you will add the IAM user.
    */
  var projectId: ProjectId
  /**
    * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in an AWS CodeStar project.
    */
  var projectRole: Role
  /**
    * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources, for example Amazon EC2 instances.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
    */
  var userArn: UserArn
}

object AssociateTeamMemberRequest {
  @scala.inline
  def apply(
    projectId: ProjectId,
    projectRole: Role,
    userArn: UserArn,
    clientRequestToken: ClientRequestToken = null,
    remoteAccessAllowed: js.UndefOr[Boolean] = js.undefined
  ): AssociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId, projectRole = projectRole, userArn = userArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed)
    __obj.asInstanceOf[AssociateTeamMemberRequest]
  }
}

