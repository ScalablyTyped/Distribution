package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMember extends js.Object {
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide. 
    */
  var projectRole: Role
  /**
    * Whether the user is allowed to remotely access project resources using an SSH public/private key pair.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn
}

object TeamMember {
  @scala.inline
  def apply(
    projectRole: Role,
    userArn: UserArn,
    remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  ): TeamMember = {
    val __obj = js.Dynamic.literal(projectRole = projectRole, userArn = userArn)
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed)
    __obj.asInstanceOf[TeamMember]
  }
}

