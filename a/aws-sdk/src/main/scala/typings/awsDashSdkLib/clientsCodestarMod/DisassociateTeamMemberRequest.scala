package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateTeamMemberRequest extends js.Object {
  /**
    * The ID of the AWS CodeStar project from which you want to remove a team member.
    */
  var projectId: ProjectId
  /**
    * The Amazon Resource Name (ARN) of the IAM user or group whom you want to remove from the project.
    */
  var userArn: UserArn
}

object DisassociateTeamMemberRequest {
  @scala.inline
  def apply(projectId: ProjectId, userArn: UserArn): DisassociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId, userArn = userArn)
  
    __obj.asInstanceOf[DisassociateTeamMemberRequest]
  }
}

